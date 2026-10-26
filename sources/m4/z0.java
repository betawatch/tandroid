package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ z0(j1 j1Var, w wVar, p1 p1Var, f0 f0Var, int i10, int i11, h1 h1Var) {
        this.d = j1Var;
        this.e = wVar;
        this.f = p1Var;
        this.h = f0Var;
        this.b = i10;
        this.c = i11;
        this.n = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j1 j1Var = (j1) this.d;
                w wVar = (w) this.e;
                p1 p1Var = (p1) this.f;
                f0 f0Var = (f0) this.h;
                h1 h1Var = (h1) this.n;
                com.google.firebase.messaging.q qVar = j1Var.b;
                if (qVar.u(wVar)) {
                    int i10 = this.b;
                    if (p1Var == null) {
                        if (!qVar.w(wVar, this.c)) {
                            j1.P0(f0Var, wVar, i10, new t1(-4));
                            break;
                        }
                    } else if (!qVar.x(wVar, p1Var)) {
                        j1.P0(f0Var, wVar, i10, new t1(-4));
                        break;
                    }
                    h1Var.c(f0Var, wVar, i10);
                    break;
                }
                break;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f, this.b, this.c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.n);
                break;
        }
    }

    public /* synthetic */ z0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f = stickerSet;
        this.b = i10;
        this.c = i11;
        this.h = tL_messages_stickerSet;
        this.n = runnable;
    }
}
