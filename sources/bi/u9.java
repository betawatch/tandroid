package bi;

import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.cf0;
import org.telegram.ui.hl0;
import org.telegram.ui.qe0;
import org.telegram.ui.vn;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u9(Object obj, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z9;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new aa.d0((v9) this.c, (int[]) this.d, tLObject, this.b, 1));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new aa.d0((fi.r1) this.c, tLObject, (String) this.d, this.b, 3));
                break;
            case 2:
                jg.z1 z1Var = (jg.z1) this.c;
                String str = (String) this.d;
                a0.h hVar = z1Var.h;
                ArrayList arrayList = z1Var.g;
                int i7 = z1Var.m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    z1Var.n = str.toLowerCase();
                    qp.s1(i7).Y3(tL_channels_channelParticipants.users, false);
                    qp.s1(i7).S3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e10 = p10.i(i7).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        long C1 = ij.C1(channelParticipant.peer);
                        if (this.b || C1 != e10) {
                            hVar.k(channelParticipant, C1);
                        } else {
                            arrayList.remove(channelParticipant);
                        }
                    }
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new fi.q1(this.c, (Object) tL_error, tLObject, this.d, this.b, 5));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new vn((nv0) this.c, tLObject, this.b, (org.telegram.ui.ActionBar.u1) this.d));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new fi.q1(this.c, (Object) tL_error, tLObject, this.d, this.b, 11));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new vn(this.c, tLObject, this.d, this.b, 8));
                break;
            case 7:
                cf0 cf0Var = (cf0) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i11);
                                org.telegram.messenger.g0.h3(new qe0(cf0Var, tL_chatInviteExported, tL_error, tLObject, this.b, 0));
                                break;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                org.telegram.messenger.g0.h3(new qe0(cf0Var, tL_chatInviteExported, tL_error, tLObject, this.b, 0));
            default:
                org.telegram.messenger.g0.h3(new fi.q1((hl0) this.c, tL_error, this.b, tLObject, (String) this.d));
                break;
        }
    }

    public /* synthetic */ u9(Object obj, boolean z9, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
        this.d = obj2;
    }
}
