package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h50 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.u70 {
    public final /* synthetic */ n50 a;

    public /* synthetic */ h50(n50 n50Var) {
        this.a = n50Var;
    }

    @Override // org.telegram.ui.Components.u70
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        k60 k60Var = this.a.b;
        ChatObject.Call call = k60Var.a1;
        AccountInstance accountInstance = k60Var.d;
        if (call == null) {
            return;
        }
        boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
        TLObject user = z13 ? accountInstance.getMessagesController().getUser(Long.valueOf(inputPeer.user_id)) : inputPeer instanceof TLRPC.TL_inputPeerChat ? accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.chat_id)) : accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.channel_id));
        if (!k60Var.a1.isScheduled()) {
            if (VoIPService.getSharedInstance() == null || !z10) {
                return;
            }
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            k60Var.B0 = user;
            return;
        }
        k60Var.k1().k(0L, 37, user, k60Var.Z0, null, null);
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            k60Var.A0 = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        } else if (z13) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            k60Var.A0 = tL_peerUser;
            tL_peerUser.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            k60Var.A0 = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        }
        k60Var.Y0 = inputPeer;
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(k60Var.i1());
        if (chatFull != null) {
            chatFull.groupcall_default_join_as = k60Var.A0;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                chatFull.flags |= 32768;
            } else {
                chatFull.flags |= 67108864;
            }
        }
        TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
        savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(k60Var.Z0);
        savedefaultgroupcalljoinas.join_as = inputPeer;
        accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new ai.t7(8));
        k60Var.I1();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        n50 n50Var = this.a;
        k60 k60Var = n50Var.b;
        ChatObject.Call call = k60Var.a1;
        AccountInstance accountInstance = k60Var.d;
        if (call.isScheduled()) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(k60Var.i1());
            if (chatFull != null) {
                chatFull.flags &= -2097153;
                chatFull.call = null;
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(k60Var.i1()), Long.valueOf(k60Var.a1.call.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            discardgroupcall.call = k60Var.a1.getInputGroupCall();
            accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new m(n50Var, 8));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        k60Var.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }
}
