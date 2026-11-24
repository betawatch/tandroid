// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aw4 extends ela {
    public final /* synthetic */ fw4 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw4(fw4 fw4Var, Context context) {
        super(context, null);
        this.m0 = fw4Var;
    }

    @Override // ela
    public final boolean O() {
        return false;
    }

    @Override // ela
    public final boolean P() {
        return false;
    }

    @Override // ela
    public final void T(Drawable drawable) {
        if (drawable instanceof ah7) {
            ((ah7) drawable).o();
        }
        fw4 fw4Var = this.m0;
        fw4Var.n1.a = fw4Var.m1.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.M) {
            return super.drawChild(canvas, view, j);
        }
        fw4 fw4Var = this.m0;
        iz4 iz4Var = fw4Var.n1.a;
        if (iz4Var instanceof jz4) {
            ((jz4) iz4Var).b(getWidth(), getHeight());
        }
        fw4Var.n1.e(0.0f, 0.0f, getWidth(), getHeight(), canvas);
        return false;
    }

    @Override // ela
    public final Drawable getNewDrawable() {
        Drawable drawable = this.m0.x1;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.m0.D0();
    }
}
