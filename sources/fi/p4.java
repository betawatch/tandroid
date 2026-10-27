package fi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.hb0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                sg.u1 u1Var = e6Var2.b1;
                if (hVar == e6Var2.k1) {
                    e6Var2.k1 = null;
                    if (!this.c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                hb0 hb0Var = (hb0) this.b;
                if (!z10) {
                    hb0Var.K = null;
                    boolean z11 = this.c;
                    hb0Var.setVisibility(z11 ? 8 : 0);
                    if (hb0Var.N && z11) {
                        hb0Var.N = false;
                        hb0Var.b.setLayoutManager(hb0Var.getNeededLayoutManager());
                        hb0Var.I = true;
                        hb0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
