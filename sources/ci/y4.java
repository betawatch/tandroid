package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.oa0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ y4(FrameLayout frameLayout, boolean z10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.b;
                q5 q5Var = q6Var.w1;
                if (hVar == q6Var.C1) {
                    q6Var.C1 = null;
                    if (!this.c) {
                        q5Var.setVisibility(8);
                        pg.t0.e(q6Var.F1).g();
                        q5Var.getAdapter().l();
                        break;
                    }
                }
                break;
            case 1:
                q6 q6Var2 = (q6) this.b;
                qg.w1 w1Var = q6Var2.m1;
                if (hVar == q6Var2.v1) {
                    q6Var2.v1 = null;
                    if (!this.c) {
                        w1Var.setVisibility(8);
                    }
                    w1Var.setMaskProvider(null);
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
