package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.fl0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class p3 implements fl0 {
    public final /* synthetic */ p4 a;

    public p3(p4 p4Var) {
        this.a = p4Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean l() {
        ((q9) this.a.Q1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void m(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        a3.l0 l0Var = new a3.l0(this, i1Var, view, 19);
        if (z10) {
            l0Var.run();
        } else {
            this.a.m0(l0Var);
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void s(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
