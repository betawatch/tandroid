package ci;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class a4 extends View implements v2 {
    public final org.telegram.ui.Components.q6 a;

    public a4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(true, true, true);
        this.a = q6Var;
        q6Var.n(0.35f, 300L, hs.h);
        q6Var.u(-1);
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.s(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        q6Var.b = 1;
        q6Var.setCallback(this);
        q6Var.M = AndroidUtilities.displaySize.x;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.q6 q6Var = this.a;
        q6Var.setBounds(0, 0, width, height);
        q6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.a.M = getMeasuredWidth();
    }

    @Override // ci.v2
    public void setInvert(float f7) {
        this.a.u(i0.a.d(f7, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
