package fi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.g90;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g4 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ g4(FrameLayout frameLayout, boolean z9, int i7) {
        this.a = i7;
        this.b = frameLayout;
        this.c = z9;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) this.b;
                w4 w4Var = o5Var.f1;
                if (gVar == o5Var.l1) {
                    o5Var.l1 = null;
                    if (!this.c) {
                        w4Var.setVisibility(8);
                        sg.l0.e(o5Var.o1).g();
                        w4Var.getAdapter().f();
                        break;
                    }
                }
                break;
            case 1:
                o5 o5Var2 = (o5) this.b;
                tg.j1 j1Var = o5Var2.V0;
                if (gVar == o5Var2.e1) {
                    o5Var2.e1 = null;
                    if (!this.c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                g90 g90Var = (g90) this.b;
                if (!z9) {
                    g90Var.K = null;
                    boolean z10 = this.c;
                    g90Var.setVisibility(z10 ? 8 : 0);
                    if (g90Var.N && z10) {
                        g90Var.N = false;
                        g90Var.b.setLayoutManager(g90Var.getNeededLayoutManager());
                        g90Var.I = true;
                        g90Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
