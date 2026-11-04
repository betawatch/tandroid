package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.qt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c1 extends qt0 {
    public final /* synthetic */ i1 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(i1 i1Var, Context context) {
        super(context, null);
        this.g0 = i1Var;
    }

    @Override // org.telegram.ui.Components.qt0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.qt0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.qt0
    public final void T(Drawable drawable) {
        if (drawable instanceof la0) {
            ((la0) drawable).p();
        }
        i1 i1Var = this.g0;
        i1Var.l1.a = i1Var.k1.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.M) {
            return super.drawChild(canvas, view, j10);
        }
        i1 i1Var = this.g0;
        si.a aVar = i1Var.l1.a;
        if (aVar instanceof si.b) {
            ((si.b) aVar).b(getWidth(), getHeight());
        }
        i1Var.l1.l(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.qt0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.g0.v1;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.g0.I0();
    }
}
