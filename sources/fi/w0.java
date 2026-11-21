package fi;

import c8.na;
import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ w0(c1 c1Var, int i7) {
        this.a = i7;
        this.b = c1Var;
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
                c1 c1Var = this.b;
                ks.f(c1Var.e).k(ks.G2, Long.valueOf(c1Var.w.id));
                c1Var.u(true);
                break;
            case 4:
                this.b.w();
                break;
            case 5:
                this.b.t(true);
                break;
            case 6:
                c1 c1Var2 = this.b;
                if (c1Var2.F != null) {
                    org.telegram.messenger.q5 q5Var = Utilities.e;
                    NativeInstance nativeInstance = c1Var2.F;
                    Objects.requireNonNull(nativeInstance);
                    q5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                    c1Var2.N.clear();
                    c1Var2.F = null;
                }
                c1Var2.k();
                break;
            case 7:
                this.b.t(true);
                break;
            case 8:
                this.b.t(true);
                break;
            case 9:
                c1 c1Var3 = this.b;
                if (c1Var3.F != null) {
                    org.telegram.messenger.q5 q5Var2 = Utilities.e;
                    NativeInstance nativeInstance2 = c1Var3.F;
                    Objects.requireNonNull(nativeInstance2);
                    q5Var2.c(new org.telegram.messenger.voip.q0(nativeInstance2, 3));
                    c1Var3.N.clear();
                    c1Var3.F = null;
                }
                c1Var3.k();
                break;
            case 10:
                this.b.p();
                break;
            case 11:
                this.b.q();
                break;
            default:
                c1 c1Var4 = this.b;
                if (!c1Var4.n) {
                    na.b(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ai.h0(c1Var4, 15));
                    break;
                }
                break;
        }
    }
}
