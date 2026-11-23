package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.wi0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class b3 implements wi0 {
    public final /* synthetic */ z3 a;

    public b3(z3 z3Var) {
        this.a = z3Var;
    }

    @Override // org.telegram.ui.Components.wi0
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        di.a8 a8Var = new di.a8(this, p0Var, view, 2);
        if (z10) {
            a8Var.run();
        } else {
            this.a.l0(a8Var);
        }
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean l() {
        return true;
    }

    @Override // org.telegram.ui.Components.wi0
    public final boolean n() {
        ((w8) this.a.A1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void q(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
