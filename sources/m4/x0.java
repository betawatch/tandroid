package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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

    public /* synthetic */ x0(i1 i1Var, v vVar, o1 o1Var, e0 e0Var, int i10, int i11, g1 g1Var) {
        this.d = i1Var;
        this.e = vVar;
        this.f = o1Var;
        this.h = e0Var;
        this.b = i10;
        this.c = i11;
        this.n = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i1 i1Var = (i1) this.d;
                v vVar = (v) this.e;
                o1 o1Var = (o1) this.f;
                e0 e0Var = (e0) this.h;
                g1 g1Var = (g1) this.n;
                pi.e eVar = i1Var.b;
                if (eVar.t(vVar)) {
                    int i10 = this.b;
                    if (o1Var == null) {
                        if (!eVar.v(vVar, this.c)) {
                            i1.P0(e0Var, vVar, i10, new s1(-4));
                            break;
                        }
                    } else if (!eVar.w(vVar, o1Var)) {
                        i1.P0(e0Var, vVar, i10, new s1(-4));
                        break;
                    }
                    g1Var.c(e0Var, vVar, i10);
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
