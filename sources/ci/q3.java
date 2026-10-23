package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.cl0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class q3 implements cl0 {
    public final /* synthetic */ q4 a;

    public q3(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.cl0
    public final boolean m() {
        ((r9) this.a.Q1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.cl0
    public final void o(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        a3.l0 l0Var = new a3.l0(this, i1Var, view, 19);
        if (z10) {
            l0Var.run();
        } else {
            this.a.n0(l0Var);
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ void q(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
