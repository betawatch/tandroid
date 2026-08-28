package kh;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v3 extends View implements r2 {
    public final org.telegram.ui.Components.i6 a;

    public v3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, true, false);
        this.a = i6Var;
        i6Var.k(0.35f, 300L, gr.h);
        i6Var.r(-1);
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.p(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        i6Var.b = 1;
        i6Var.setCallback(this);
        i6Var.G = AndroidUtilities.displaySize.x;
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.a.G = getMeasuredWidth();
    }

    @Override // kh.r2
    public void setInvert(float f10) {
        this.a.r(i0.a.d(f10, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
