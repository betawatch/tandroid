package gh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fe;
import org.telegram.ui.hh0;
import org.telegram.ui.o50;
import org.telegram.ui.ug0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class m7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m7(Object obj, Object obj2, boolean z10, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bg.d((n7) this.c, (int[]) this.d, tLObject, this.b, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new bg.d((kh.u1) this.c, tLObject, (String) this.d, this.b, 3));
                break;
            case 2:
                of.v1 v1Var = (of.v1) this.c;
                String str = (String) this.d;
                a0.h hVar = v1Var.h;
                ArrayList arrayList = v1Var.g;
                int i9 = v1Var.m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    v1Var.n = str.toLowerCase();
                    MessagesController.getInstance(i9).putUsers(tL_channels_channelParticipants.users, false);
                    MessagesController.getInstance(i9).putChats(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long clientUserId = UserConfig.getInstance(i9).getClientUserId();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
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
            case 3:
                AndroidUtilities.runOnUIThread(new bg.m((fe) this.c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.b, 12));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new bg.d((rw0) this.c, tLObject, this.b, (org.telegram.ui.ActionBar.c2) this.d, 17));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new bg.m(this.c, tL_error, tLObject, (String) this.d, this.b, 18));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new bg.d((o50) this.c, tLObject, (TLRPC.ChatFull) this.d, this.b, 19));
                break;
            case 7:
                hh0 hh0Var = (hh0) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i11);
                                AndroidUtilities.runOnUIThread(new ug0(hh0Var, tL_chatInviteExported, tL_error, tLObject, this.b, 0));
                                break;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new ug0(hh0Var, tL_chatInviteExported, tL_error, tLObject, this.b, 0));
            default:
                AndroidUtilities.runOnUIThread(new bg.m(this.c, (TLObject) tL_error, this.b, tLObject, (String) this.d, 20));
                break;
        }
    }

    public /* synthetic */ m7(Object obj, boolean z10, Object obj2, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
