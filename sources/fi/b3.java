package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.wi0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class b3 implements wi0 {
    public final /* synthetic */ z3 a;

    public b3(z3 z3Var) {
        this.a = z3Var;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        di.a8 a8Var = new di.a8(this, p0Var, view, 2);
        if (z10) {
            a8Var.run();
        } else {
            this.a.l0(a8Var);
        }
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // org.telegram.ui.Components.wi0
    public final boolean q() {
        ((w8) this.a.A1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void z() {
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
