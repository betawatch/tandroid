package hi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class i3 extends View implements m2 {
    public final org.telegram.ui.Components.n6 a;

    public i3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, true);
        this.a = n6Var;
        n6Var.n(0.35f, 300L, nr.h);
        n6Var.u(-1);
        n6Var.w(org.telegram.messenger.g0.L(14.0f));
        n6Var.s(org.telegram.messenger.g0.L(1.4f), org.telegram.messenger.g0.L(0.4f), 1275068416);
        n6Var.b = 1;
        n6Var.setCallback(this);
        n6Var.N = org.telegram.messenger.g0.q.x;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.n6 n6Var = this.a;
        n6Var.setBounds(0, 0, width, height);
        n6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.a.N = getMeasuredWidth();
    }

    @Override // hi.m2
    public void setInvert(float f10) {
        this.a.u(i0.a.f(f10, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
