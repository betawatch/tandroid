// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class ge5 extends View implements li4 {
    public final gn a;

    public ge5(Context context) {
        super(context);
        gn gnVar = new gn(true, true, true);
        this.a = gnVar;
        gnVar.n(0.35f, 300L, s33.h);
        gnVar.u(-1);
        gnVar.w(gl.L(14.0f));
        gnVar.s(gl.L(1.4f), gl.L(0.4f), 1275068416);
        gnVar.b = 1;
        gnVar.setCallback(this);
        gnVar.N = gl.q.x;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        gn gnVar = this.a;
        gnVar.setBounds(0, 0, width, height);
        gnVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.N = getMeasuredWidth();
    }

    @Override // li4
    public void setInvert(float f) {
        this.a.u(bm2.f(f, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
