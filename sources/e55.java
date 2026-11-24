// default package

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class e55 extends l95 {
    public final /* synthetic */ h75 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e55(h75 h75Var, LaunchActivity launchActivity, r65 r65Var, a55 a55Var, ArrayList arrayList, fc2 fc2Var, h75 h75Var2) {
        super(launchActivity, r65Var, a55Var, arrayList, fc2Var, h75Var2);
        this.R0 = h75Var;
    }

    @Override // l95, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.R0.O4) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // l95
    public final void g(boolean z) {
        h75 h75Var = this.R0;
        c65 c65Var = h75Var.H1;
        r65 r65Var = h75Var.J1;
        n75 n75Var = h75Var.h4;
        e55 e55Var = h75Var.T3;
        a55 a55Var = h75Var.e4;
        h75Var.l2 = z;
        if (h75.v5) {
            if (z || !e55Var.b) {
                return;
            }
            h75Var.g4.H(h75Var.f4, false, true);
            return;
        }
        if (z) {
            h75Var.c2[0].d(1, false);
            e55Var.L0[0].d(2, false);
            if (!e55Var.b) {
                r65Var.setVisibility(0);
                c65Var.setVisibility(0);
            }
            h75Var.L1(true, false);
            h75Var.o1.requestLayout();
            if (a55Var.getVisibility() != 0) {
                a55Var.setVisibility(0);
                n75Var.F(a55Var, true);
                n75Var.G(a55Var, false);
            } else {
                n75Var.F(a55Var, true);
                h75Var.D0(true);
            }
        } else {
            if (e55Var.b) {
                c65Var.setVisibility(8);
                r65Var.setVisibility(8);
            } else {
                a55Var.setVisibility(8);
                n75Var.F(a55Var, false);
            }
            if (a55Var.getVisibility() == 0) {
                for (int i = 0; i < a55Var.getChildCount(); i++) {
                    View childAt = a55Var.getChildAt(i);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((m75) childAt).setProgressToFullscreen(e55Var.c);
                }
            }
        }
        h75Var.A4.setVisibility(z ? 0 : 8);
        if (h75Var.l2) {
            return;
        }
        h75Var.D0(true);
    }

    @Override // l95
    public final void j() {
        invalidate();
        h75 h75Var = this.R0;
        float f = h75Var.N3;
        e55 e55Var = h75Var.T3;
        h75Var.H0 = gl.R0(Math.max(f, e55Var == null ? 0.0f : e55Var.c), 1.0f, bkb.w0(null, bkb.Zg, false), bkb.w0(null, bkb.Wg, false));
        h75Var.b.invalidate();
        h75Var.u1(h75Var.N3);
    }
}
