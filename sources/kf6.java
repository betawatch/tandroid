// default package

import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kf6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pj4 b;
    public final /* synthetic */ af6 c;

    public /* synthetic */ kf6(byte b, pj4 pj4Var, af6 af6Var) {
        this.a = b;
        this.b = pj4Var;
        this.c = af6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        af6 af6Var = this.c;
        pj4 pj4Var = this.b;
        switch (b) {
            case 0:
                int i = af6.G;
                af6Var.a();
                gl.e3(new kf6((byte) 1, pj4Var, af6Var), 150L);
                break;
            default:
                lf6 lf6Var = (lf6) pj4Var.b;
                lf6Var.h(null);
                RadialProgressView radialProgressView = lf6Var.h0.O.d;
                RadialProgressView radialProgressView2 = af6Var.h.d;
                radialProgressView.getClass();
                radialProgressView.a = radialProgressView2.a;
                radialProgressView.b = radialProgressView2.b;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.K = radialProgressView2.K;
                radialProgressView.c = radialProgressView2.c;
                radialProgressView.n = radialProgressView2.n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.b(85L);
                break;
        }
    }
}
