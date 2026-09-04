package di;

import android.widget.FrameLayout;
import org.telegram.ui.Components.oa0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class z4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ z4(FrameLayout frameLayout, boolean z10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.b;
                r5 r5Var = q6Var.w1;
                if (hVar == q6Var.C1) {
                    q6Var.C1 = null;
                    if (!this.c) {
                        r5Var.setVisibility(8);
                        qg.s0.e(q6Var.F1).g();
                        r5Var.getAdapter().l();
                        break;
                    }
                }
                break;
            case 1:
                q6 q6Var2 = (q6) this.b;
                rg.v1 v1Var = q6Var2.m1;
                if (hVar == q6Var2.v1) {
                    q6Var2.v1 = null;
                    if (!this.c) {
                        v1Var.setVisibility(8);
                    }
                    v1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                oa0 oa0Var = (oa0) this.b;
                if (!z10) {
                    oa0Var.K = null;
                    boolean z11 = this.c;
                    oa0Var.setVisibility(z11 ? 8 : 0);
                    if (oa0Var.N && z11) {
                        oa0Var.N = false;
                        oa0Var.b.setLayoutManager(oa0Var.getNeededLayoutManager());
                        oa0Var.I = true;
                        oa0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
