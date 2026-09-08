package di;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class c4 extends View implements x2 {
    public final org.telegram.ui.Components.p6 a;

    public c4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, true, true, false);
        this.a = p6Var;
        p6Var.k(0.35f, 300L, pr.h);
        p6Var.r(-1);
        p6Var.t(AndroidUtilities.dp(14.0f));
        p6Var.p(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        p6Var.b = 1;
        p6Var.setCallback(this);
        p6Var.G = AndroidUtilities.displaySize.x;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.p6 p6Var = this.a;
        p6Var.setBounds(0, 0, width, height);
        p6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.a.G = getMeasuredWidth();
    }

    @Override // di.x2
    public void setInvert(float f7) {
        this.a.r(i0.a.d(f7, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
