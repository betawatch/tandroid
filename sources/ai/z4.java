package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.rk0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class z4 implements rk0 {
    public final /* synthetic */ e6 a;

    public z4(e6 e6Var) {
        this.a = e6Var;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean B() {
        return true;
    }

    @Override // org.telegram.ui.Components.rk0
    public final boolean E() {
        ((ac) this.a.Q1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean K() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public final void i(View view, zg.m0 m0Var, boolean z10, boolean z11) {
        a3.k0 k0Var = new a3.k0(this, m0Var, view, 1);
        if (z10) {
            k0Var.run();
        } else {
            this.a.n0(k0Var);
        }
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ void I() {
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ void H(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
