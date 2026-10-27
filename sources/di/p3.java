package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.fl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p3 implements fl0 {
    public final /* synthetic */ q4 a;

    public p3(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean i() {
        ((p9) this.a.F1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        a3.l0 l0Var = new a3.l0(this, x0Var, view, 21);
        if (z10) {
            l0Var.run();
        } else {
            this.a.l0(l0Var);
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
