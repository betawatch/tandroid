package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ t0(b1 b1Var, r rVar, h1 h1Var, b0 b0Var, int i10, int i11, a1 a1Var) {
        this.d = b1Var;
        this.e = rVar;
        this.f = h1Var;
        this.h = b0Var;
        this.b = i10;
        this.c = i11;
        this.n = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.d;
                r rVar = (r) this.e;
                h1 h1Var = (h1) this.f;
                b0 b0Var = (b0) this.h;
                a1 a1Var = (a1) this.n;
                oi.f fVar = b1Var.b;
                if (fVar.A(rVar)) {
                    int i10 = this.b;
                    if (h1Var == null) {
                        if (!fVar.C(rVar, this.c)) {
                            b1.N0(b0Var, rVar, i10, new l1(-4));
                            break;
                        }
                    } else if (!fVar.D(rVar, h1Var)) {
                        b1.N0(b0Var, rVar, i10, new l1(-4));
                        break;
                    }
                    a1Var.h(b0Var, rVar, i10);
                    break;
                }
                break;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f, this.b, this.c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.n);
                break;
        }
    }

    public /* synthetic */ t0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f = stickerSet;
        this.b = i10;
        this.c = i11;
        this.h = tL_messages_stickerSet;
        this.n = runnable;
    }
}
