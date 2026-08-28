package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u0 extends xu0 {
    public final /* synthetic */ z0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(z0 z0Var, Context context) {
        super(context, null);
        this.s0 = z0Var;
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.xu0
    public final void U(Drawable drawable) {
        if (drawable instanceof jb0) {
            ((jb0) drawable).p();
        }
        z0 z0Var = this.s0;
        z0Var.d.a = z0Var.c.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.H) {
            return super.drawChild(canvas, view, j10);
        }
        z0 z0Var = this.s0;
        ng.a aVar = z0Var.d.a;
        if (aVar instanceof ng.b) {
            ((ng.b) aVar).b(getWidth(), getHeight());
        }
        z0Var.d.T0(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.xu0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.s0.y;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.s0.o();
    }
}
