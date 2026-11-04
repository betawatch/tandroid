package gi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.c90;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d4 implements q1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d4(FrameLayout frameLayout, boolean z10, int i3) {
        this.a = i3;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // q1.c
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                m5 m5Var = (m5) this.b;
                u4 u4Var = m5Var.g1;
                if (gVar == m5Var.m1) {
                    m5Var.m1 = null;
                    if (!this.c) {
                        u4Var.setVisibility(8);
                        tg.k0.e(m5Var.p1).g();
                        u4Var.getAdapter().f();
                        break;
                    }
                }
                break;
            case 1:
                m5 m5Var2 = (m5) this.b;
                ug.i1 i1Var = m5Var2.W0;
                if (gVar == m5Var2.f1) {
                    m5Var2.f1 = null;
                    if (!this.c) {
                        i1Var.setVisibility(8);
                    }
                    i1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                c90 c90Var = (c90) this.b;
                if (!z10) {
                    c90Var.L = null;
                    boolean z11 = this.c;
                    c90Var.setVisibility(z11 ? 8 : 0);
                    if (c90Var.O && z11) {
                        c90Var.O = false;
                        c90Var.b.setLayoutManager(c90Var.getNeededLayoutManager());
                        c90Var.J = true;
                        c90Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
