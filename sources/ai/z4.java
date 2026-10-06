package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.rk0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
