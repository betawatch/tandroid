package fi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k3 extends View implements o2 {
    public final org.telegram.ui.Components.h6 a;

    public k3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(true, true, true);
        this.a = h6Var;
        h6Var.n(0.35f, 300L, wq.h);
        h6Var.u(-1);
        h6Var.w(org.telegram.messenger.g0.L(14.0f));
        h6Var.s(org.telegram.messenger.g0.L(1.4f), org.telegram.messenger.g0.L(0.4f), 1275068416);
        h6Var.b = 1;
        h6Var.setCallback(this);
        h6Var.M = org.telegram.messenger.g0.q.x;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.h6 h6Var = this.a;
        h6Var.setBounds(0, 0, width, height);
        h6Var.draw(canvas);
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
