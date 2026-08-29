package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.yb0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q0 extends hv0 {
    public final /* synthetic */ v0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(v0 v0Var, Context context) {
        super(context, null);
        this.s0 = v0Var;
    }

    @Override // org.telegram.ui.Components.hv0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.hv0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.hv0
    public final void U(Drawable drawable) {
        if (drawable instanceof yb0) {
            ((yb0) drawable).p();
        }
        v0 v0Var = this.s0;
        v0Var.d.a = v0Var.c.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.H) {
            return super.drawChild(canvas, view, j10);
        }
        v0 v0Var = this.s0;
        qg.a aVar = v0Var.d.a;
        if (aVar instanceof qg.b) {
            ((qg.b) aVar).b(getWidth(), getHeight());
        }
        v0Var.d.E0(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.hv0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.s0.y;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.hv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.s0.o();
    }
}
