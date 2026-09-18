package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class z4 implements pk0 {
    public final /* synthetic */ f6 a;

    public z4(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        a3.k0 k0Var = new a3.k0(this, o0Var, view, 1);
        if (z10) {
            k0Var.run();
        } else {
            this.a.n0(k0Var);
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public final boolean k() {
        ((ac) this.a.Q1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean r() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
