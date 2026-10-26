package fi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class t3 extends View implements p2 {
    public final org.telegram.ui.Components.r6 a;

    public t3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(true, true, true);
        this.a = r6Var;
        r6Var.n(0.35f, 300L, ds.h);
        r6Var.u(-1);
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.s(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        r6Var.b = 1;
        r6Var.setCallback(this);
        r6Var.M = AndroidUtilities.displaySize.x;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.r6 r6Var = this.a;
        r6Var.setBounds(0, 0, width, height);
        r6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.a.M = getMeasuredWidth();
    }

    @Override // fi.p2
    public void setInvert(float f7) {
        this.a.u(i0.a.f(f7, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
