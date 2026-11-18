package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.bb0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class a1 extends au0 {
    public final /* synthetic */ g1 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(g1 g1Var, Context context) {
        super(context, null);
        this.g0 = g1Var;
    }

    @Override // org.telegram.ui.Components.au0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.au0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.au0
    public final void T(Drawable drawable) {
        if (drawable instanceof bb0) {
            ((bb0) drawable).p();
        }
        g1 g1Var = this.g0;
        g1Var.o1.a = g1Var.n1.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.M) {
            return super.drawChild(canvas, view, j3);
        }
        g1 g1Var = this.g0;
        ui.a aVar = g1Var.o1.a;
        if (aVar instanceof ui.b) {
            ((ui.b) aVar).b(getWidth(), getHeight());
        }
        g1Var.o1.o(0.0f, 0.0f, getWidth(), getHeight(), canvas);
        return false;
    }

    @Override // org.telegram.ui.Components.au0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.g0.y1;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.au0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.g0.J0();
    }
}
