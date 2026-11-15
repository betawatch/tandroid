package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.st0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a1 extends st0 {
    public final /* synthetic */ f1 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(f1 f1Var, Context context) {
        super(context, null);
        this.g0 = f1Var;
    }

    @Override // org.telegram.ui.Components.st0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.st0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.st0
    public final void T(Drawable drawable) {
        if (drawable instanceof ra0) {
            ((ra0) drawable).p();
        }
        f1 f1Var = this.g0;
        f1Var.o1.a = f1Var.n1.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.M) {
            return super.drawChild(canvas, view, j3);
        }
        f1 f1Var = this.g0;
        ui.a aVar = f1Var.o1.a;
        if (aVar instanceof ui.b) {
            ((ui.b) aVar).b(getWidth(), getHeight());
        }
        f1Var.o1.b0(0.0f, 0.0f, getWidth(), getHeight(), canvas);
        return false;
    }

    @Override // org.telegram.ui.Components.st0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.g0.y1;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.g0.I0();
    }
}
