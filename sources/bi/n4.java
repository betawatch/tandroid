package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.fl0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class n4 implements fl0 {
    public final /* synthetic */ q5 a;

    public n4(q5 q5Var) {
        this.a = q5Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean n() {
        ((jb) this.a.Q1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void r(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        a3.l0 l0Var = new a3.l0(this, i1Var, view, 4);
        if (z10) {
            l0Var.run();
        } else {
            this.a.n0(l0Var);
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void y() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void w(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
