package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class z4 implements pk0 {
    public final /* synthetic */ e6 a;

    public z4(e6 e6Var) {
        this.a = e6Var;
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
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
