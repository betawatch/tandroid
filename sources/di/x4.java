package di;

import android.widget.FrameLayout;
import org.telegram.ui.Components.ob0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ x4(FrameLayout frameLayout, boolean z10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                o6 o6Var = (o6) this.b;
                p5 p5Var = o6Var.w1;
                if (hVar == o6Var.C1) {
                    o6Var.C1 = null;
                    if (!this.c) {
                        p5Var.setVisibility(8);
                        qg.s0.e(o6Var.F1).g();
                        p5Var.getAdapter().l();
                        break;
                    }
                }
                break;
            case 1:
                o6 o6Var2 = (o6) this.b;
                rg.v1 v1Var = o6Var2.m1;
                if (hVar == o6Var2.v1) {
                    o6Var2.v1 = null;
                    if (!this.c) {
                        v1Var.setVisibility(8);
                    }
                    v1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                ob0 ob0Var = (ob0) this.b;
                if (!z10) {
                    ob0Var.K = null;
                    boolean z11 = this.c;
                    ob0Var.setVisibility(z11 ? 8 : 0);
                    if (ob0Var.N && z11) {
                        ob0Var.N = false;
                        ob0Var.b.setLayoutManager(ob0Var.getNeededLayoutManager());
                        ob0Var.I = true;
                        ob0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
