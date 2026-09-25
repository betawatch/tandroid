package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ s0(a1 a1Var, r rVar, g1 g1Var, a0 a0Var, int i10, int i11, z0 z0Var) {
        this.d = a1Var;
        this.e = rVar;
        this.f = g1Var;
        this.h = a0Var;
        this.b = i10;
        this.c = i11;
        this.n = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a1 a1Var = (a1) this.d;
                r rVar = (r) this.e;
                g1 g1Var = (g1) this.f;
                a0 a0Var = (a0) this.h;
                z0 z0Var = (z0) this.n;
                oi.f fVar = a1Var.b;
                if (fVar.A(rVar)) {
                    int i10 = this.b;
                    if (g1Var == null) {
                        if (!fVar.C(rVar, this.c)) {
                            a1.O0(a0Var, rVar, i10, new k1(-4));
                            break;
                        }
                    } else if (!fVar.D(rVar, g1Var)) {
                        a1.O0(a0Var, rVar, i10, new k1(-4));
                        break;
                    }
                    z0Var.h(a0Var, rVar, i10);
                    break;
                }
                break;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f, this.b, this.c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.n);
                break;
        }
    }

    public /* synthetic */ s0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f = stickerSet;
        this.b = i10;
        this.c = i11;
        this.h = tL_messages_stickerSet;
        this.n = runnable;
    }
}
