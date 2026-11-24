// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class g46 extends jia {
    public final i46 N0;
    public final Paint O0;
    public m46 P0;

    public g46(Context context) {
        super(context);
        this.N0 = new i46(this);
        this.O0 = new Paint(1);
    }

    private int getLinkColor() {
        return bm2.o(getTextColor(), (int) (Color.alpha(getTextColor()) * 0.1175f));
    }

    @Override // jia, android.view.View
    public void onDraw(Canvas canvas) {
        if (isClickable()) {
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight());
            int linkColor = getLinkColor();
            Paint paint = this.O0;
            paint.setColor(linkColor);
            canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint);
        }
        super.onDraw(canvas);
        if (isClickable() && this.N0.g(canvas)) {
            invalidate();
        }
    }

    @Override // jia, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return super.onTouchEvent(motionEvent);
        }
        i46 i46Var = this.N0;
        if (i46Var != null) {
            if (motionEvent.getAction() == 0) {
                m46 m46Var = new m46(null, null, motionEvent.getX(), motionEvent.getY(), 0);
                m46Var.d(getLinkColor());
                this.P0 = m46Var;
                i46Var.a(m46Var, null);
                b46 b = this.P0.b();
                b.e(null, 0, 0.0f, 0.0f);
                b.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                gl.e3(new kz5(this, m46Var, (byte) 5), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                i46Var.e(true);
                if (this.P0 != null) {
                    performClick();
                }
                this.P0 = null;
                return true;
            }
            if (motionEvent.getAction() == 3) {
                i46Var.e(true);
                this.P0 = null;
                return true;
            }
        }
        return this.P0 != null || super.onTouchEvent(motionEvent);
    }
}
