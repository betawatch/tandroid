package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.va0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                va0 va0Var = (va0) this.b;
                if (!z10) {
                    va0Var.K = null;
                    boolean z11 = this.c;
                    va0Var.setVisibility(z11 ? 8 : 0);
                    if (va0Var.N && z11) {
                        va0Var.N = false;
                        va0Var.b.setLayoutManager(va0Var.getNeededLayoutManager());
                        va0Var.I = true;
                        va0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
