// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class hg5 extends View implements qk4 {
    public final hn a;

    public hg5(Activity activity) {
        super(activity);
        hn hnVar = new hn(true, true, true);
        this.a = hnVar;
        hnVar.n(0.35f, 300L, k43.h);
        hnVar.u(-1);
        hnVar.w(hl.L(14.0f));
        hnVar.s(hl.L(1.4f), hl.L(0.4f), 1275068416);
        hnVar.b = 1;
        hnVar.setCallback(this);
        hnVar.N = hl.q.x;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        hn hnVar = this.a;
        hnVar.setBounds(0, 0, width, height);
        hnVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.N = getMeasuredWidth();
    }

    @Override // qk4
    public void setInvert(float f) {
        this.a.u(vm2.f(f, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
