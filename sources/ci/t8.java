package ci;

import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.dl0;
import org.telegram.ui.le0;
import org.telegram.ui.rn;
import org.telegram.ui.xe0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t8(Object obj, Object obj2, boolean z10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new u8((v8) this.c, (int[]) this.d, tLObject, this.b, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new u8(this.c, tLObject, this.d, this.b, 2));
                break;
            case 2:
                kg.v1 v1Var = (kg.v1) this.c;
                String str = (String) this.d;
                a0.h hVar = v1Var.h;
                ArrayList arrayList = v1Var.g;
                int i3 = v1Var.m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    v1Var.n = str.toLowerCase();
                    hp.s1(i3).Y3(tL_channels_channelParticipants.users, false);
                    hp.s1(i3).S3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e10 = h10.i(i3).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        long C1 = zi.C1(channelParticipant.peer);
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
                org.telegram.messenger.g0.h3(new gi.q1(this.c, (Object) tL_error, tLObject, this.d, this.b, 5));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new rn((mv0) this.c, tLObject, this.b, (org.telegram.ui.ActionBar.s1) this.d));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new gi.q1(this.c, (Object) tL_error, tLObject, this.d, this.b, 11));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new rn(this.c, tLObject, this.d, this.b, 8));
                break;
            case 7:
                xe0 xe0Var = (xe0) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i11);
                                org.telegram.messenger.g0.h3(new le0(xe0Var, tL_chatInviteExported, tL_error, tLObject, this.b, 0));
                                break;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                org.telegram.messenger.g0.h3(new le0(xe0Var, tL_chatInviteExported, tL_error, tLObject, this.b, 0));
            default:
                org.telegram.messenger.g0.h3(new gi.q1((dl0) this.c, tL_error, this.b, tLObject, (String) this.d));
                break;
        }
    }

    public /* synthetic */ t8(Object obj, boolean z10, Object obj2, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
