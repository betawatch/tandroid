package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ y0(h1 h1Var, r rVar, n1 n1Var, b0 b0Var, int i10, int i11, g1 g1Var) {
        this.d = h1Var;
        this.e = rVar;
        this.f = n1Var;
        this.h = b0Var;
        this.b = i10;
        this.c = i11;
        this.n = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h1 h1Var = (h1) this.d;
                r rVar = (r) this.e;
                n1 n1Var = (n1) this.f;
                b0 b0Var = (b0) this.h;
                g1 g1Var = (g1) this.n;
                ki.f fVar = h1Var.b;
                if (fVar.z(rVar)) {
                    int i10 = this.b;
                    if (n1Var == null) {
                        if (!fVar.B(rVar, this.c)) {
                            h1.O0(b0Var, rVar, i10, new r1(-4));
                            break;
                        }
                    } else if (!fVar.C(rVar, n1Var)) {
                        h1.O0(b0Var, rVar, i10, new r1(-4));
                        break;
                    }
                    g1Var.i(b0Var, rVar, i10);
                    break;
                }
                break;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f, this.b, this.c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.n);
                break;
        }
    }

    public /* synthetic */ y0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f = stickerSet;
        this.b = i10;
        this.c = i11;
        this.h = tL_messages_stickerSet;
        this.n = runnable;
    }
}
