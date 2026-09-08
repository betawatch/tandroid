package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class g50 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.u70 {
    public final /* synthetic */ m50 a;

    public /* synthetic */ g50(m50 m50Var) {
        this.a = m50Var;
    }

    @Override // org.telegram.ui.Components.u70
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        j60 j60Var = this.a.b;
        ChatObject.Call call = j60Var.a1;
        AccountInstance accountInstance = j60Var.d;
        if (call == null) {
            return;
        }
        boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
        TLObject user = z13 ? accountInstance.getMessagesController().getUser(Long.valueOf(inputPeer.user_id)) : inputPeer instanceof TLRPC.TL_inputPeerChat ? accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.chat_id)) : accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.channel_id));
        if (!j60Var.a1.isScheduled()) {
            if (VoIPService.getSharedInstance() == null || !z10) {
                return;
            }
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            j60Var.B0 = user;
            return;
        }
        j60Var.k1().k(0L, 37, user, j60Var.Z0, null, null);
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            j60Var.A0 = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        } else if (z13) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            j60Var.A0 = tL_peerUser;
            tL_peerUser.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            j60Var.A0 = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        }
        j60Var.Y0 = inputPeer;
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j60Var.i1());
        if (chatFull != null) {
            chatFull.groupcall_default_join_as = j60Var.A0;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                chatFull.flags |= 32768;
            } else {
                chatFull.flags |= 67108864;
            }
        }
        TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
        savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(j60Var.Z0);
        savedefaultgroupcalljoinas.join_as = inputPeer;
        accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new bi.c7(8));
        j60Var.I1();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        m50 m50Var = this.a;
        j60 j60Var = m50Var.b;
        ChatObject.Call call = j60Var.a1;
        AccountInstance accountInstance = j60Var.d;
        if (call.isScheduled()) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j60Var.i1());
            if (chatFull != null) {
                chatFull.flags &= -2097153;
                chatFull.call = null;
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(j60Var.i1()), Long.valueOf(j60Var.a1.call.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            discardgroupcall.call = j60Var.a1.getInputGroupCall();
            accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new m(m50Var, 8));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        j60Var.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }
}
