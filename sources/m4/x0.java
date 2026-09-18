package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ x0(g1 g1Var, r rVar, m1 m1Var, a0 a0Var, int i10, int i11, f1 f1Var) {
        this.d = g1Var;
        this.e = rVar;
        this.f = m1Var;
        this.h = a0Var;
        this.b = i10;
        this.c = i11;
        this.n = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.d;
                r rVar = (r) this.e;
                m1 m1Var = (m1) this.f;
                a0 a0Var = (a0) this.h;
                f1 f1Var = (f1) this.n;
                ni.f fVar = g1Var.b;
                if (fVar.A(rVar)) {
                    int i10 = this.b;
                    if (m1Var == null) {
                        if (!fVar.C(rVar, this.c)) {
                            g1.O0(a0Var, rVar, i10, new q1(-4));
                            break;
                        }
                    } else if (!fVar.D(rVar, m1Var)) {
                        g1.O0(a0Var, rVar, i10, new q1(-4));
                        break;
                    }
                    f1Var.h(a0Var, rVar, i10);
                    break;
                }
                break;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f, this.b, this.c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.n);
                break;
        }
    }

    public /* synthetic */ x0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f = stickerSet;
        this.b = i10;
        this.c = i11;
        this.h = tL_messages_stickerSet;
        this.n = runnable;
    }
}
