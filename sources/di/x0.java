package di;

import c8.ia;
import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ x0(g1 g1Var, int i7) {
        this.a = i7;
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
                qs.f(g1Var.e).k(qs.G2, Long.valueOf(g1Var.w.id));
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
                if (g1Var2.E != null) {
                    org.telegram.messenger.p5 p5Var = Utilities.e;
                    NativeInstance nativeInstance = g1Var2.E;
                    Objects.requireNonNull(nativeInstance);
                    p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance, 3));
                    g1Var2.M.clear();
                    g1Var2.E = null;
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
                if (g1Var3.E != null) {
                    org.telegram.messenger.p5 p5Var2 = Utilities.e;
                    NativeInstance nativeInstance2 = g1Var3.E;
                    Objects.requireNonNull(nativeInstance2);
                    p5Var2.c(new org.telegram.messenger.voip.p0(nativeInstance2, 3));
                    g1Var3.M.clear();
                    g1Var3.E = null;
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
                    ia.b(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ai.i(g1Var4, 10));
                    break;
                }
                break;
        }
    }
}
