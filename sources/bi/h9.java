package bi;

import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ h9(ea eaVar, TLObject tLObject, long j3, long j10, boolean z9) {
        this.e = eaVar;
        this.f = tLObject;
        this.b = j3;
        this.d = j10;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i7 = this.a;
        TLObject tLObject = this.f;
        Object obj = this.e;
        switch (i7) {
            case 0:
                ea eaVar = (ea) obj;
                int i10 = eaVar.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.b;
                    long j10 = this.d;
                    if (j3 == 0) {
                        TLRPC.UserFull b22 = qp.s1(i10).b2(j10);
                        if (b22 != null && (peerSettings = b22.settings) != null) {
                            peerSettings.flags &= -16385;
                            peerSettings.charge_paid_message_stars = 0L;
                        }
                        qp.s1(i10).d7.edit().putLong(a8.p0.o(j10, "dialog_bar_paying_"), 0L).apply();
                        qp.s1(i10).a3(qp.s1(i10).a2(Long.valueOf(j10)), qp.s1(i10).M0(Long.valueOf(-j10)), true);
                        org.telegram.messenger.g5.r(i10).D(true);
                        qs.f(i10).k(qs.N3, Long.valueOf(j10));
                        break;
                    } else {
                        eaVar.a0(-j3, j10, this.c);
                        break;
                    }
                }
                break;
            default:
                ((yr) obj).getMessagesController().B3(this.b, this.c, (TLRPC.InputPeer) tLObject, this.d);
                break;
        }
    }

    public /* synthetic */ h9(yr yrVar, long j3, boolean z9, TLRPC.InputPeer inputPeer, long j10) {
        this.e = yrVar;
        this.b = j3;
        this.c = z9;
        this.f = inputPeer;
        this.d = j10;
    }
}
