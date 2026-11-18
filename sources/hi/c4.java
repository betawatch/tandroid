package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.t90;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c4 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c4(FrameLayout frameLayout, boolean z10, int i7) {
        this.a = i7;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                l5 l5Var = (l5) this.b;
                s4 s4Var = l5Var.g1;
                if (gVar == l5Var.m1) {
                    l5Var.m1 = null;
                    if (!this.c) {
                        s4Var.setVisibility(8);
                        sg.k0.e(l5Var.p1).g();
                        s4Var.getAdapter().f();
                        break;
                    }
                }
                break;
            case 1:
                l5 l5Var2 = (l5) this.b;
                tg.j1 j1Var = l5Var2.W0;
                if (gVar == l5Var2.f1) {
                    l5Var2.f1 = null;
                    if (!this.c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                t90 t90Var = (t90) this.b;
                if (!z10) {
                    t90Var.L = null;
                    boolean z11 = this.c;
                    t90Var.setVisibility(z11 ? 8 : 0);
                    if (t90Var.O && z11) {
                        t90Var.O = false;
                        t90Var.b.setLayoutManager(t90Var.getNeededLayoutManager());
                        t90Var.J = true;
                        t90Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
