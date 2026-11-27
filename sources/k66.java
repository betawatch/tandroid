// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class k66 extends ema {
    public final m66 N0;
    public final Paint O0;
    public q66 P0;

    public k66(Context context) {
        super(context);
        this.N0 = new m66(this);
        this.O0 = new Paint(1);
    }

    private int getLinkColor() {
        return vm2.o(getTextColor(), (int) (Color.alpha(getTextColor()) * 0.1175f));
    }

    @Override // ema, android.view.View
    public void onDraw(Canvas canvas) {
        if (isClickable()) {
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight());
            int linkColor = getLinkColor();
            Paint paint = this.O0;
            paint.setColor(linkColor);
            canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint);
        }
        super.onDraw(canvas);
        if (isClickable() && this.N0.g(canvas)) {
            invalidate();
        }
    }

    @Override // ema, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return super.onTouchEvent(motionEvent);
        }
        m66 m66Var = this.N0;
        if (m66Var != null) {
            if (motionEvent.getAction() == 0) {
                q66 q66Var = new q66(null, null, motionEvent.getX(), motionEvent.getY(), 0);
                q66Var.d(getLinkColor());
                this.P0 = q66Var;
                m66Var.a(q66Var, null);
                f66 b = this.P0.b();
                b.e(null, 0, 0.0f, 0.0f);
                b.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                hl.d3(new z56(this, q66Var, (byte) 2), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                m66Var.e(true);
                if (this.P0 != null) {
                    performClick();
                }
                this.P0 = null;
                return true;
            }
            if (motionEvent.getAction() == 3) {
                m66Var.e(true);
                this.P0 = null;
                return true;
            }
        }
        return this.P0 != null || super.onTouchEvent(motionEvent);
    }
}
