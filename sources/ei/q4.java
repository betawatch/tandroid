package ei;

import android.widget.FrameLayout;
import org.telegram.ui.Components.jb0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ q4(FrameLayout frameLayout, boolean z10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                g5 g5Var = f6Var.w1;
                if (hVar == f6Var.C1) {
                    f6Var.C1 = null;
                    if (!this.c) {
                        g5Var.setVisibility(8);
                        qg.u0.e(f6Var.F1).g();
                        g5Var.getAdapter().l();
                        break;
                    }
                }
                break;
            case 1:
                f6 f6Var2 = (f6) this.b;
                rg.u1 u1Var = f6Var2.m1;
                if (hVar == f6Var2.v1) {
                    f6Var2.v1 = null;
                    if (!this.c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                jb0 jb0Var = (jb0) this.b;
                if (!z10) {
                    jb0Var.K = null;
                    boolean z11 = this.c;
                    jb0Var.setVisibility(z11 ? 8 : 0);
                    if (jb0Var.N && z11) {
                        jb0Var.N = false;
                        jb0Var.b.setLayoutManager(jb0Var.getNeededLayoutManager());
                        jb0Var.I = true;
                        jb0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
