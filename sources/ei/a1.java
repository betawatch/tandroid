package ei;

import b8.nf;
import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ a1(g1 g1Var, int i3) {
        this.a = i3;
        this.b = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                this.b.q();
                break;
            case 2:
                this.b.t(true);
                break;
            case 3:
                g1 g1Var = this.b;
                hs.f(g1Var.e).k(hs.G2, Long.valueOf(g1Var.w.id));
                g1Var.u(true);
                break;
            case 4:
                this.b.w();
                break;
            case 5:
                this.b.t(true);
                break;
            case 6:
                g1 g1Var2 = this.b;
                if (g1Var2.F != null) {
                    org.telegram.messenger.p5 p5Var = Utilities.e;
                    NativeInstance nativeInstance = g1Var2.F;
                    Objects.requireNonNull(nativeInstance);
                    p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance, 3));
                    g1Var2.N.clear();
                    g1Var2.F = null;
                }
                g1Var2.k();
                break;
            case 7:
                this.b.t(true);
                break;
            case 8:
                this.b.t(true);
                break;
            case 9:
                g1 g1Var3 = this.b;
                if (g1Var3.F != null) {
                    org.telegram.messenger.p5 p5Var2 = Utilities.e;
                    NativeInstance nativeInstance2 = g1Var3.F;
                    Objects.requireNonNull(nativeInstance2);
                    p5Var2.c(new org.telegram.messenger.voip.p0(nativeInstance2, 3));
                    g1Var3.N.clear();
                    g1Var3.F = null;
                }
                g1Var3.k();
                break;
            case 10:
                this.b.p();
                break;
            case 11:
                this.b.q();
                break;
            default:
                g1 g1Var4 = this.b;
                if (!g1Var4.n) {
                    nf.b(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ai.v2(g1Var4, 14));
                    break;
                }
                break;
        }
    }
}
