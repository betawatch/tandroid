package fi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.gb0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ p4(FrameLayout frameLayout, boolean z10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.b;
                f5 f5Var = e6Var.l1;
                if (hVar == e6Var.r1) {
                    e6Var.r1 = null;
                    if (!this.c) {
                        f5Var.setVisibility(8);
                        rg.s0.e(e6Var.u1).g();
                        f5Var.getAdapter().l();
                        break;
                    }
                }
                break;
            case 1:
                e6 e6Var2 = (e6) this.b;
                sg.v1 v1Var = e6Var2.b1;
                if (hVar == e6Var2.k1) {
                    e6Var2.k1 = null;
                    if (!this.c) {
                        v1Var.setVisibility(8);
                    }
                    v1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                gb0 gb0Var = (gb0) this.b;
                if (!z10) {
                    gb0Var.K = null;
                    boolean z11 = this.c;
                    gb0Var.setVisibility(z11 ? 8 : 0);
                    if (gb0Var.N && z11) {
                        gb0Var.N = false;
                        gb0Var.b.setLayoutManager(gb0Var.getNeededLayoutManager());
                        gb0Var.I = true;
                        gb0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
