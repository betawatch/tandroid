package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c50 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.x70 {
    public final /* synthetic */ i50 a;

    public /* synthetic */ c50(i50 i50Var) {
        this.a = i50Var;
    }

    @Override // org.telegram.ui.Components.x70
    public void a(TLRPC.InputPeer inputPeer, boolean z4, boolean z10, boolean z11) {
        e60 e60Var = this.a.b;
        ChatObject.Call call = e60Var.X0;
        AccountInstance accountInstance = e60Var.d;
        if (call == null) {
            return;
        }
        boolean z12 = inputPeer instanceof TLRPC.TL_inputPeerUser;
        TLObject user = z12 ? accountInstance.getMessagesController().getUser(Long.valueOf(inputPeer.user_id)) : inputPeer instanceof TLRPC.TL_inputPeerChat ? accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.chat_id)) : accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.channel_id));
        if (!e60Var.X0.isScheduled()) {
            if (VoIPService.getSharedInstance() == null || !z4) {
                return;
            }
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            e60Var.y0 = user;
            return;
        }
        e60Var.k1().k(0L, 37, user, e60Var.W0, null, null);
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            e60Var.x0 = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        } else if (z12) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            e60Var.x0 = tL_peerUser;
            tL_peerUser.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            e60Var.x0 = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        }
        e60Var.V0 = inputPeer;
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(e60Var.i1());
        if (chatFull != null) {
            chatFull.groupcall_default_join_as = e60Var.x0;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                chatFull.flags |= 32768;
            } else {
                chatFull.flags |= 67108864;
            }
        }
        TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
        savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(e60Var.W0);
        savedefaultgroupcalljoinas.join_as = inputPeer;
        accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new nh.p5(4));
        e60Var.I1();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        i50 i50Var = this.a;
        e60 e60Var = i50Var.b;
        ChatObject.Call call = e60Var.X0;
        AccountInstance accountInstance = e60Var.d;
        if (call.isScheduled()) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(e60Var.i1());
            if (chatFull != null) {
                chatFull.flags &= -2097153;
                chatFull.call = null;
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(e60Var.i1()), Long.valueOf(e60Var.X0.call.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            discardgroupcall.call = e60Var.X0.getInputGroupCall();
            accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new o(i50Var, 8));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        e60Var.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }
}
