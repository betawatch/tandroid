// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class eg5 extends View implements qk4 {
    public final ho a;

    public eg5(Activity activity) {
        super(activity);
        ho hoVar = new ho(true, true, true);
        this.a = hoVar;
        hoVar.n(0.35f, 300L, d53.h);
        hoVar.u(-1);
        hoVar.w(gm.L(14.0f));
        hoVar.s(gm.L(1.4f), gm.L(0.4f), 1275068416);
        hoVar.b = 1;
        hoVar.setCallback(this);
        hoVar.N = gm.q.x;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        ho hoVar = this.a;
        hoVar.setBounds(0, 0, width, height);
        hoVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.N = getMeasuredWidth();
    }

    @Override // qk4
    public void setInvert(float f) {
        this.a.u(on2.f(f, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
