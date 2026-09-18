package ci;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class c4 extends View implements x2 {
    public final org.telegram.ui.Components.m6 a;

    public c4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(true, true, true, false);
        this.a = m6Var;
        m6Var.k(0.35f, 300L, qr.h);
        m6Var.r(-1);
        m6Var.t(AndroidUtilities.dp(14.0f));
        m6Var.p(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        m6Var.b = 1;
        m6Var.setCallback(this);
        m6Var.G = AndroidUtilities.displaySize.x;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.m6 m6Var = this.a;
        m6Var.setBounds(0, 0, width, height);
        m6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.a.G = getMeasuredWidth();
    }

    @Override // ci.x2
    public void setInvert(float f7) {
        this.a.r(i0.a.d(f7, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
