package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.ya0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                        pg.u0.e(r6Var.F1).g();
                        r5Var.getAdapter().l();
                        break;
                    }
                }
                break;
            case 1:
                r6 r6Var2 = (r6) this.b;
                qg.u1 u1Var = r6Var2.m1;
                if (hVar == r6Var2.v1) {
                    r6Var2.v1 = null;
                    if (!this.c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                ya0 ya0Var = (ya0) this.b;
                if (!z10) {
                    ya0Var.K = null;
                    boolean z11 = this.c;
                    ya0Var.setVisibility(z11 ? 8 : 0);
                    if (ya0Var.N && z11) {
                        ya0Var.N = false;
                        ya0Var.b.setLayoutManager(ya0Var.getNeededLayoutManager());
                        ya0Var.I = true;
                        ya0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
