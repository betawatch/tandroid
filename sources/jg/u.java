package jg;

import android.widget.FrameLayout;
import org.telegram.ui.Components.y90;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ u(FrameLayout frameLayout, boolean z10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.b;
                a2 a2Var = r0Var.e1;
                if (jVar == r0Var.o1) {
                    r0Var.o1 = null;
                    if (!this.c) {
                        a2Var.setVisibility(8);
                    }
                    a2Var.setMaskProvider(null);
                    break;
                }
                break;
            case 1:
                r0 r0Var2 = (r0) this.b;
                m0 m0Var = r0Var2.p1;
                if (jVar == r0Var2.v1) {
                    r0Var2.v1 = null;
                    if (!this.c) {
                        m0Var.setVisibility(8);
                        ig.s0.e(r0Var2.y1).g();
                        m0Var.getAdapter().f();
                        break;
                    }
                }
                break;
            default:
                y90 y90Var = (y90) this.b;
                if (!z10) {
                    y90Var.K = null;
                    boolean z11 = this.c;
                    y90Var.setVisibility(z11 ? 8 : 0);
                    if (y90Var.N && z11) {
                        y90Var.N = false;
                        y90Var.b.setLayoutManager(y90Var.getNeededLayoutManager());
                        y90Var.I = true;
                        y90Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
