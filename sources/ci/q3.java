package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.bl0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class q3 implements bl0 {
    public final /* synthetic */ q4 a;

    public q3(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Components.bl0
    public final boolean k() {
        ((r9) this.a.Q1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public final void l(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        a3.l0 l0Var = new a3.l0(this, i1Var, view, 19);
        if (z10) {
            l0Var.run();
        } else {
            this.a.n0(l0Var);
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ boolean r() {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
