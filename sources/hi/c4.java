package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.i90;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
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
                m5 m5Var = (m5) this.b;
                u4 u4Var = m5Var.g1;
                if (gVar == m5Var.m1) {
                    m5Var.m1 = null;
                    if (!this.c) {
                        u4Var.setVisibility(8);
                        sg.k0.e(m5Var.p1).g();
                        u4Var.getAdapter().f();
                        break;
                    }
                }
                break;
            case 1:
                m5 m5Var2 = (m5) this.b;
                tg.j1 j1Var = m5Var2.W0;
                if (gVar == m5Var2.f1) {
                    m5Var2.f1 = null;
                    if (!this.c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                i90 i90Var = (i90) this.b;
                if (!z10) {
                    i90Var.L = null;
                    boolean z11 = this.c;
                    i90Var.setVisibility(z11 ? 8 : 0);
                    if (i90Var.O && z11) {
                        i90Var.O = false;
                        i90Var.b.setLayoutManager(i90Var.getNeededLayoutManager());
                        i90Var.J = true;
                        i90Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
