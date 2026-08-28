package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l40 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.e70 {
    public final /* synthetic */ r40 a;

    public /* synthetic */ l40(r40 r40Var) {
        this.a = r40Var;
    }

    @Override // org.telegram.ui.Components.e70
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        o50 o50Var = this.a.b;
        ChatObject.Call call = o50Var.W0;
        AccountInstance accountInstance = o50Var.d;
        if (call == null) {
            return;
        }
        boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
        TLObject user = z13 ? accountInstance.getMessagesController().getUser(Long.valueOf(inputPeer.user_id)) : inputPeer instanceof TLRPC.TL_inputPeerChat ? accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.chat_id)) : accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.channel_id));
        if (!o50Var.W0.isScheduled()) {
            if (VoIPService.getSharedInstance() == null || !z10) {
                return;
            }
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            o50Var.x0 = user;
            return;
        }
        o50Var.k1().k(0L, 37, user, o50Var.V0, null, null);
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            o50Var.w0 = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        } else if (z13) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            o50Var.w0 = tL_peerUser;
            tL_peerUser.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            o50Var.w0 = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        }
        o50Var.U0 = inputPeer;
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(o50Var.i1());
        if (chatFull != null) {
            chatFull.groupcall_default_join_as = o50Var.w0;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                chatFull.flags |= 32768;
            } else {
                chatFull.flags |= 67108864;
            }
        }
        TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
        savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(o50Var.V0);
        savedefaultgroupcalljoinas.join_as = inputPeer;
        accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new ih.q5(5));
        o50Var.I1();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        r40 r40Var = this.a;
        o50 o50Var = r40Var.b;
        ChatObject.Call call = o50Var.W0;
        AccountInstance accountInstance = o50Var.d;
        if (call.isScheduled()) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(o50Var.i1());
            if (chatFull != null) {
                chatFull.flags &= -2097153;
                chatFull.call = null;
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(o50Var.i1()), Long.valueOf(o50Var.W0.call.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            discardgroupcall.call = o50Var.W0.getInputGroupCall();
            accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new m(r40Var, 8));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        o50Var.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }
}
