package nh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ok0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class h3 implements ok0 {
    public final /* synthetic */ d4 a;

    public h3(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void i(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        lh.p6 p6Var = new lh.p6(this, q0Var, view, 2);
        if (z4) {
            p6Var.run();
        } else {
            this.a.n0(p6Var);
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean j() {
        ((z8) this.a.N1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
