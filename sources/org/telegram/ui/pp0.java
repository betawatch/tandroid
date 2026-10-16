package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class pp0 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ yp0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp0(yp0 yp0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.W2 = yp0Var;
        this.V2 = i10;
    }

    @Override // org.telegram.ui.Components.mm0
    public final Integer W0(int i10) {
        yp0 yp0Var = this.W2;
        if ((i10 < yp0Var.b0 || i10 >= yp0Var.c0) && (i10 < yp0Var.d0 || i10 >= yp0Var.e0)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yp0 yp0Var = this.W2;
        if (!yp0Var.G || yp0Var.E == null || yp0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(yp0Var.E.getLeft() + yp0Var.F.getLeft(), yp0Var.F.getTop());
        yp0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        yp0 yp0Var = this.W2;
        eq0 eq0Var = yp0Var.p0;
        yp0Var.h();
        if (yp0Var.K != null) {
            if (yp0Var.J == null || !yp0Var.c()) {
                return;
            }
            yp0Var.J.g(false);
            return;
        }
        zh.f5 f5Var = this.V2 == 1 ? eq0Var.c : eq0Var.b;
        if (f5Var == null || !yp0Var.c()) {
            return;
        }
        f5Var.a();
    }
}
