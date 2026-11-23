package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.s90;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ l4(FrameLayout frameLayout, boolean z10, int i7) {
        this.a = i7;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                v5 v5Var = (v5) this.b;
                d5 d5Var = v5Var.g1;
                if (gVar == v5Var.m1) {
                    v5Var.m1 = null;
                    if (!this.c) {
                        d5Var.setVisibility(8);
                        sg.j0.e(v5Var.p1).g();
                        d5Var.getAdapter().f();
                        break;
                    }
                }
                break;
            case 1:
                v5 v5Var2 = (v5) this.b;
                tg.o1 o1Var = v5Var2.W0;
                if (gVar == v5Var2.f1) {
                    v5Var2.f1 = null;
                    if (!this.c) {
                        o1Var.setVisibility(8);
                    }
                    o1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                s90 s90Var = (s90) this.b;
                if (!z10) {
                    s90Var.L = null;
                    boolean z11 = this.c;
                    s90Var.setVisibility(z11 ? 8 : 0);
                    if (s90Var.O && z11) {
                        s90Var.O = false;
                        s90Var.b.setLayoutManager(s90Var.getNeededLayoutManager());
                        s90Var.J = true;
                        s90Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
