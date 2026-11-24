// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k61 extends View implements tjb {
    public Paint a;
    public Paint b;
    public float c;
    public lm d;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, gl.L(3.0f), gl.L(3.0f), this.b);
        rectF.set(0.0f, 0.0f, this.d.e(false, this.c) * getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, gl.L(3.0f), gl.L(3.0f), this.a);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            Paint paint = this.a;
            int i = bkb.M6;
            paint.setColor(bkb.w0(null, i, false));
            this.b.setColor(bkb.p1(0.2f, bkb.w0(null, i, false)));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
