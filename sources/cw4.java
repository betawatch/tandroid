// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cw4 extends wma {
    public final /* synthetic */ hw4 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw4(hw4 hw4Var, Context context) {
        super(context, null);
        this.g0 = hw4Var;
    }

    @Override // wma
    public final boolean O() {
        return false;
    }

    @Override // wma
    public final boolean P() {
        return false;
    }

    @Override // wma
    public final void T(Drawable drawable) {
        if (drawable instanceof ih7) {
            ((ih7) drawable).o();
        }
        hw4 hw4Var = this.g0;
        hw4Var.n1.a = hw4Var.m1.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.M) {
            return super.drawChild(canvas, view, j);
        }
        hw4 hw4Var = this.g0;
        mz4 mz4Var = hw4Var.n1.a;
        if (mz4Var instanceof nz4) {
            ((nz4) mz4Var).b(getWidth(), getHeight());
        }
        hw4Var.n1.e(0.0f, 0.0f, getWidth(), getHeight(), canvas);
        return false;
    }

    @Override // wma
    public final Drawable getNewDrawable() {
        Drawable drawable = this.g0.x1;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.g0.E0();
    }
}
