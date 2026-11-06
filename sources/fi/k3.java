package fi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k3 extends View implements o2 {
    public final org.telegram.ui.Components.i6 a;

    public k3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, true);
        this.a = i6Var;
        i6Var.n(0.35f, 300L, xq.h);
        i6Var.u(-1);
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.s(org.telegram.messenger.g0.L(1.4f), org.telegram.messenger.g0.L(0.4f), 1275068416);
        i6Var.b = 1;
        i6Var.setCallback(this);
        i6Var.M = org.telegram.messenger.g0.q.x;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.i6 i6Var = this.a;
        i6Var.setBounds(0, 0, width, height);
        i6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.a.M = getMeasuredWidth();
    }

    @Override // fi.o2
    public void setInvert(float f10) {
        this.a.u(i0.a.f(f10, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
