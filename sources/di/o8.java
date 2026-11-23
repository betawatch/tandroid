package di;

import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ff0;
import org.telegram.ui.ow;
import org.telegram.ui.te0;
import org.telegram.ui.xd;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o8(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new aa.c0((p8) this.c, (int[]) this.d, tLObject, this.b, 1));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new aa.c0((hi.r1) this.c, tLObject, (String) this.d, this.b, 3));
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
                    np.u1(i7).f4(tL_channels_channelParticipants.users, false);
                    np.u1(i7).Z3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e10 = k10.i(i7).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        long B1 = gj.B1(channelParticipant.peer);
                        if (this.b || B1 != e10) {
                            hVar.k(channelParticipant, B1);
                        } else {
                            arrayList.remove(channelParticipant);
                        }
                    }
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.g3(new ai.i((xd) this.c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.b, 6));
                break;
            case 4:
                org.telegram.messenger.g0.g3(new yn((zv0) this.c, tLObject, this.b, (org.telegram.ui.ActionBar.t1) this.d));
                break;
            case 5:
                org.telegram.messenger.g0.g3(new ai.i((ow) this.c, tL_error, tLObject, (String) this.d, this.b));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new yn(this.c, tLObject, this.d, this.b, 8));
                break;
            case 7:
                ff0 ff0Var = (ff0) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i11);
                                org.telegram.messenger.g0.g3(new te0(ff0Var, tL_chatInviteExported, tL_error, tLObject, this.b, 0));
                                break;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                org.telegram.messenger.g0.g3(new te0(ff0Var, tL_chatInviteExported, tL_error, tLObject, this.b, 0));
            default:
                org.telegram.messenger.g0.g3(new ai.i(this.c, (TLObject) tL_error, this.b, tLObject, (String) this.d, 14));
                break;
        }
    }

    public /* synthetic */ o8(Object obj, boolean z10, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
