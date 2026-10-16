package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.fl0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class n4 implements fl0 {
    public final /* synthetic */ q5 a;

    public n4(q5 q5Var) {
        this.a = q5Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean m() {
        ((jb) this.a.Q1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void n(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        a3.l0 l0Var = new a3.l0(this, i1Var, view, 4);
        if (z10) {
            l0Var.run();
        } else {
            this.a.n0(l0Var);
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void y() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
