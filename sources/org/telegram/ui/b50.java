package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b50 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.y70 {
    public final /* synthetic */ h50 a;

    public /* synthetic */ b50(h50 h50Var) {
        this.a = h50Var;
    }

    @Override // org.telegram.ui.Components.y70
    public void a(TLRPC.InputPeer inputPeer, boolean z4, boolean z10, boolean z11) {
        d60 d60Var = this.a.b;
        ChatObject.Call call = d60Var.X0;
        AccountInstance accountInstance = d60Var.d;
        if (call == null) {
            return;
        }
        boolean z12 = inputPeer instanceof TLRPC.TL_inputPeerUser;
        TLObject user = z12 ? accountInstance.getMessagesController().getUser(Long.valueOf(inputPeer.user_id)) : inputPeer instanceof TLRPC.TL_inputPeerChat ? accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.chat_id)) : accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.channel_id));
        if (!d60Var.X0.isScheduled()) {
            if (VoIPService.getSharedInstance() == null || !z4) {
                return;
            }
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            d60Var.y0 = user;
            return;
        }
        d60Var.k1().k(0L, 37, user, d60Var.W0, null, null);
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            d60Var.x0 = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        } else if (z12) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            d60Var.x0 = tL_peerUser;
            tL_peerUser.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            d60Var.x0 = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        }
        d60Var.V0 = inputPeer;
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(d60Var.i1());
        if (chatFull != null) {
            chatFull.groupcall_default_join_as = d60Var.x0;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                chatFull.flags |= 32768;
            } else {
                chatFull.flags |= 67108864;
            }
        }
        TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
        savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(d60Var.W0);
        savedefaultgroupcalljoinas.join_as = inputPeer;
        accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new oh.p5(4));
        d60Var.I1();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        h50 h50Var = this.a;
        d60 d60Var = h50Var.b;
        ChatObject.Call call = d60Var.X0;
        AccountInstance accountInstance = d60Var.d;
        if (call.isScheduled()) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(d60Var.i1());
            if (chatFull != null) {
                chatFull.flags &= -2097153;
                chatFull.call = null;
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(d60Var.i1()), Long.valueOf(d60Var.X0.call.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            discardgroupcall.call = d60Var.X0.getInputGroupCall();
            accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new o(h50Var, 8));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        d60Var.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }
}
