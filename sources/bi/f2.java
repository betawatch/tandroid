package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.j60;
import org.telegram.ui.mh0;
import org.telegram.ui.zh0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f2(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g2((h2) this.d, tLObject, (String) this.b, this.c, 0));
                break;
            case 1:
                fg.d2 d2Var = (fg.d2) this.d;
                String str = (String) this.b;
                a0.i iVar = d2Var.h;
                ArrayList arrayList = d2Var.g;
                int i10 = d2Var.m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    d2Var.n = str.toLowerCase();
                    MessagesController.getInstance(i10).putUsers(tL_channels_channelParticipants.users, false);
                    MessagesController.getInstance(i10).putChats(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    iVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                        long peerId = MessageObject.getPeerId(channelParticipant.peer);
                        if (this.c || peerId != clientUserId) {
                            iVar.k(channelParticipant, peerId);
                        } else {
                            arrayList.remove(channelParticipant);
                        }
                    }
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new e2(this.d, (Object) tL_error, tLObject, this.b, this.c, 13));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new g2((wx0) this.d, tLObject, this.c, (org.telegram.ui.ActionBar.d2) this.b, 19));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new e2(this.d, (Object) tL_error, tLObject, this.b, this.c, 19));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new g2((j60) this.d, tLObject, (TLRPC.ChatFull) this.b, this.c, 21));
                break;
            case 6:
                zh0 zh0Var = (zh0) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i12 = 0; i12 < tL_messages_exportedChatInvites.invites.size(); i12++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i12)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i12);
                                AndroidUtilities.runOnUIThread(new mh0(zh0Var, tL_chatInviteExported, tL_error, tLObject, this.c, 0));
                                break;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                AndroidUtilities.runOnUIThread(new mh0(zh0Var, tL_chatInviteExported, tL_error, tLObject, this.c, 0));
            case 7:
                AndroidUtilities.runOnUIThread(new e2((NotificationCenter.NotificationCenterDelegate) this.d, (TLObject) tL_error, this.c, tLObject, this.b, 21));
                break;
            default:
                AndroidUtilities.runOnUIThread(new xh.m5((xh.n5) this.d, (int[]) this.b, tLObject, this.c));
                break;
        }
    }

    public /* synthetic */ f2(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = z10;
        this.b = obj2;
    }
}
