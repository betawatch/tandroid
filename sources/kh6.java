// default package

import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kh6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k44 b;
    public final /* synthetic */ bh6 c;

    public /* synthetic */ kh6(byte b, k44 k44Var, bh6 bh6Var) {
        this.a = b;
        this.b = k44Var;
        this.c = bh6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bh6 bh6Var = this.c;
        k44 k44Var = this.b;
        switch (b) {
            case 0:
                int i = bh6.G;
                bh6Var.a();
                gm.d3(new kh6((byte) 1, k44Var, bh6Var), 150L);
                break;
            default:
                lh6 lh6Var = (lh6) k44Var.b;
                lh6Var.h(null);
                RadialProgressView radialProgressView = lh6Var.h0.O.d;
                RadialProgressView radialProgressView2 = bh6Var.h.d;
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
