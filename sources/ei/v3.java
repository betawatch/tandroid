package ei;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class v3 extends View implements r2 {
    public final org.telegram.ui.Components.p6 a;

    public v3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, true, true);
        this.a = p6Var;
        p6Var.n(0.35f, 300L, bs.h);
        p6Var.u(-1);
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.s(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        p6Var.b = 1;
        p6Var.setCallback(this);
        p6Var.M = AndroidUtilities.displaySize.x;
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
        this.a.M = getMeasuredWidth();
    }

    @Override // ei.r2
    public void setInvert(float f7) {
        this.a.u(i0.a.f(f7, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
