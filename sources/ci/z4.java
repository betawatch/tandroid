package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.na0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                r6 r6Var = (r6) this.b;
                r5 r5Var = r6Var.w1;
                if (hVar == r6Var.C1) {
                    r6Var.C1 = null;
                    if (!this.c) {
                        r5Var.setVisibility(8);
                        pg.s0.e(r6Var.F1).g();
                        r5Var.getAdapter().l();
                        break;
                    }
                }
                break;
            case 1:
                r6 r6Var2 = (r6) this.b;
                qg.w1 w1Var = r6Var2.m1;
                if (hVar == r6Var2.v1) {
                    r6Var2.v1 = null;
                    if (!this.c) {
                        w1Var.setVisibility(8);
                    }
                    w1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                na0 na0Var = (na0) this.b;
                if (!z10) {
                    na0Var.K = null;
                    boolean z11 = this.c;
                    na0Var.setVisibility(z11 ? 8 : 0);
                    if (na0Var.N && z11) {
                        na0Var.N = false;
                        na0Var.b.setLayoutManager(na0Var.getNeededLayoutManager());
                        na0Var.I = true;
                        na0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
