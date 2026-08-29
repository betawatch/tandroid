package jh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.de;
import org.telegram.ui.hh0;
import org.telegram.ui.r50;
import org.telegram.ui.ug0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j7(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ag.w0((k7) this.c, (int[]) this.d, tLObject, this.b, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ag.w0((nh.r1) this.c, tLObject, (String) this.d, this.b, 4));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new eg.j((de) this.c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.b, 12));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ag.w0((cx0) this.c, tLObject, this.b, (org.telegram.ui.ActionBar.c2) this.d, 17));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new eg.j(this.c, tL_error, tLObject, (String) this.d, this.b, 18));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ag.w0((r50) this.c, tLObject, (TLRPC.ChatFull) this.d, this.b, 19));
                break;
            case 6:
                hh0 hh0Var = (hh0) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i10);
                                AndroidUtilities.runOnUIThread(new ug0(hh0Var, tL_chatInviteExported, tL_error, tLObject, this.b, 0));
                                break;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new ug0(hh0Var, tL_chatInviteExported, tL_error, tLObject, this.b, 0));
            case 7:
                AndroidUtilities.runOnUIThread(new eg.j(this.c, (TLObject) tL_error, this.b, tLObject, (String) this.d, 20));
                break;
            default:
                rf.k1 k1Var = (rf.k1) this.c;
                String str = (String) this.d;
                a0.h hVar = k1Var.h;
                ArrayList arrayList = k1Var.g;
                int i11 = k1Var.m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    k1Var.n = str.toLowerCase();
                    MessagesController.getInstance(i11).putUsers(tL_channels_channelParticipants.users, false);
                    MessagesController.getInstance(i11).putChats(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long clientUserId = UserConfig.getInstance(i11).getClientUserId();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i12);
                        long peerId = MessageObject.getPeerId(channelParticipant.peer);
                        if (this.b || peerId != clientUserId) {
                            hVar.k(channelParticipant, peerId);
                        } else {
                            arrayList.remove(channelParticipant);
                        }
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j7(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
