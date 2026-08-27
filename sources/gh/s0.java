package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s0 extends zu0 {
    public final /* synthetic */ x0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(x0 x0Var, Context context) {
        super(context, null);
        this.s0 = x0Var;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void U(Drawable drawable) {
        if (drawable instanceof nb0) {
            ((nb0) drawable).p();
        }
        x0 x0Var = this.s0;
        x0Var.d.a = x0Var.c.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.H) {
            return super.drawChild(canvas, view, j10);
        }
        x0 x0Var = this.s0;
        og.a aVar = x0Var.d.a;
        if (aVar instanceof og.b) {
            ((og.b) aVar).b(getWidth(), getHeight());
        }
        x0Var.d.T0(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.zu0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.s0.y;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.zu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.s0.p();
    }
}
