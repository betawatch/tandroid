package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.v90;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b4 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ b4(FrameLayout frameLayout, boolean z10, int i7) {
        this.a = i7;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                k5 k5Var = (k5) this.b;
                s4 s4Var = k5Var.g1;
                if (gVar == k5Var.m1) {
                    k5Var.m1 = null;
                    if (!this.c) {
                        s4Var.setVisibility(8);
                        sg.k0.e(k5Var.p1).g();
                        s4Var.getAdapter().f();
                        break;
                    }
                }
                break;
            case 1:
                k5 k5Var2 = (k5) this.b;
                tg.k1 k1Var = k5Var2.W0;
                if (gVar == k5Var2.f1) {
                    k5Var2.f1 = null;
                    if (!this.c) {
                        k1Var.setVisibility(8);
                    }
                    k1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                v90 v90Var = (v90) this.b;
                if (!z10) {
                    v90Var.L = null;
                    boolean z11 = this.c;
                    v90Var.setVisibility(z11 ? 8 : 0);
                    if (v90Var.O && z11) {
                        v90Var.O = false;
                        v90Var.b.setLayoutManager(v90Var.getNeededLayoutManager());
                        v90Var.J = true;
                        v90Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
