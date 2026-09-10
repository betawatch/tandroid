package bi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.xa0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class u5 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ u5(FrameLayout frameLayout, boolean z10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.b;
                p6 p6Var = r7Var.w1;
                if (hVar == r7Var.C1) {
                    r7Var.C1 = null;
                    if (!this.c) {
                        p6Var.setVisibility(8);
                        og.x0.e(r7Var.F1).g();
                        p6Var.getAdapter().l();
                        break;
                    }
                }
                break;
            case 1:
                r7 r7Var2 = (r7) this.b;
                pg.t1 t1Var = r7Var2.m1;
                if (hVar == r7Var2.v1) {
                    r7Var2.v1 = null;
                    if (!this.c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                xa0 xa0Var = (xa0) this.b;
                if (!z10) {
                    xa0Var.K = null;
                    boolean z11 = this.c;
                    xa0Var.setVisibility(z11 ? 8 : 0);
                    if (xa0Var.N && z11) {
                        xa0Var.N = false;
                        xa0Var.b.setLayoutManager(xa0Var.getNeededLayoutManager());
                        xa0Var.I = true;
                        xa0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
