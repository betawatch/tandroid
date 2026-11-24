// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jp1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kp1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ t09 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ h19 n;

    public /* synthetic */ jp1(kp1 kp1Var, int i, boolean z, t09 t09Var, float f, float f2, h19 h19Var, byte b) {
        this.a = b;
        this.b = kp1Var;
        this.c = i;
        this.d = z;
        this.e = t09Var;
        this.f = f;
        this.h = f2;
        this.n = h19Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                gl.e3(new jp1(this.b, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 1), 50L);
                break;
            default:
                mu1 mu1Var = this.b.s;
                hf0 C6 = mu1Var.C6(this.c, true);
                if (this.d) {
                    i = ((d) mu1Var).currentAccount;
                    d19.d(mu1Var, this.e, C6, null, this.f, this.h, this.n, i, 1);
                    d19.f();
                    break;
                }
                break;
        }
    }
}
