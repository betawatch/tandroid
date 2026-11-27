// default package

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class g75 extends mb5 {
    public final /* synthetic */ j95 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g75(j95 j95Var, LaunchActivity launchActivity, t85 t85Var, c75 c75Var, ArrayList arrayList, vc2 vc2Var, j95 j95Var2) {
        super(launchActivity, t85Var, c75Var, arrayList, vc2Var, j95Var2);
        this.R0 = j95Var;
    }

    @Override // mb5, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.R0.O4) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // mb5
    public final void g(boolean z) {
        j95 j95Var = this.R0;
        e85 e85Var = j95Var.H1;
        t85 t85Var = j95Var.J1;
        p95 p95Var = j95Var.h4;
        g75 g75Var = j95Var.T3;
        c75 c75Var = j95Var.e4;
        j95Var.l2 = z;
        if (j95.v5) {
            if (z || !g75Var.b) {
                return;
            }
            j95Var.g4.H(j95Var.f4, false, true);
            return;
        }
        if (z) {
            j95Var.c2[0].d(1, false);
            g75Var.L0[0].d(2, false);
            if (!g75Var.b) {
                t85Var.setVisibility(0);
                e85Var.setVisibility(0);
            }
            j95Var.M1(true, false);
            j95Var.o1.requestLayout();
            if (c75Var.getVisibility() != 0) {
                c75Var.setVisibility(0);
                p95Var.F(c75Var, true);
                p95Var.G(c75Var, false);
            } else {
                p95Var.F(c75Var, true);
                j95Var.E0(true);
            }
        } else {
            if (g75Var.b) {
                e85Var.setVisibility(8);
                t85Var.setVisibility(8);
            } else {
                c75Var.setVisibility(8);
                p95Var.F(c75Var, false);
            }
            if (c75Var.getVisibility() == 0) {
                for (int i = 0; i < c75Var.getChildCount(); i++) {
                    View childAt = c75Var.getChildAt(i);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((o95) childAt).setProgressToFullscreen(g75Var.c);
                }
            }
        }
        j95Var.A4.setVisibility(z ? 0 : 8);
        if (j95Var.l2) {
            return;
        }
        j95Var.E0(true);
    }

    @Override // mb5
    public final void j() {
        invalidate();
        j95 j95Var = this.R0;
        float f = j95Var.N3;
        g75 g75Var = j95Var.T3;
        j95Var.H0 = hl.R0(Math.max(f, g75Var == null ? 0.0f : g75Var.c), 1.0f, aob.w0(null, aob.ah, false), aob.w0(null, aob.Xg, false));
        j95Var.b.invalidate();
        j95Var.v1(j95Var.N3);
    }
}
