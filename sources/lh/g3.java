package lh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g3 implements ek0 {
    public final /* synthetic */ d4 a;

    public g3(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        l3.m mVar = new l3.m(this, q0Var, view, 2);
        if (z10) {
            mVar.run();
        } else {
            this.a.n0(mVar);
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean w() {
        ((z8) this.a.M1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
    }
}
