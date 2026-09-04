package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ w0(f1 f1Var, r rVar, l1 l1Var, a0 a0Var, int i10, int i11, e1 e1Var) {
        this.d = f1Var;
        this.e = rVar;
        this.f = l1Var;
        this.h = a0Var;
        this.b = i10;
        this.c = i11;
        this.n = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f1 f1Var = (f1) this.d;
                r rVar = (r) this.e;
                l1 l1Var = (l1) this.f;
                a0 a0Var = (a0) this.h;
                e1 e1Var = (e1) this.n;
                fg.f fVar = f1Var.b;
                if (fVar.B(rVar)) {
                    int i10 = this.b;
                    if (l1Var == null) {
                        if (!fVar.D(rVar, this.c)) {
                            f1.O0(a0Var, rVar, i10, new p1(-4));
                            break;
                        }
                    } else if (!fVar.E(rVar, l1Var)) {
                        f1.O0(a0Var, rVar, i10, new p1(-4));
                        break;
                    }
                    e1Var.h(a0Var, rVar, i10);
                    break;
                }
                break;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f, this.b, this.c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.n);
                break;
        }
    }

    public /* synthetic */ w0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f = stickerSet;
        this.b = i10;
        this.c = i11;
        this.h = tL_messages_stickerSet;
        this.n = runnable;
    }
}
