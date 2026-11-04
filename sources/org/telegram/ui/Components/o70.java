package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class o70 extends org.telegram.ui.ActionBar.k5 {
    public final m2.p0 N0;
    public final Paint O0;
    public t70 P0;

    public o70(Context context) {
        super(context);
        this.N0 = new m2.p0(this);
        this.O0 = new Paint(1);
    }

    private int getLinkColor() {
        return i0.a.o(getTextColor(), (int) (Color.alpha(getTextColor()) * 0.1175f));
    }

    @Override // org.telegram.ui.ActionBar.k5, android.view.View
    public void onDraw(Canvas canvas) {
        if (isClickable()) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight());
            int linkColor = getLinkColor();
            Paint paint = this.O0;
            paint.setColor(linkColor);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
        }
        super.onDraw(canvas);
        if (isClickable() && this.N0.h(canvas)) {
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.k5, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return super.onTouchEvent(motionEvent);
        }
        m2.p0 p0Var = this.N0;
        if (p0Var != null) {
            if (motionEvent.getAction() == 0) {
                t70 t70Var = new t70(null, null, motionEvent.getX(), motionEvent.getY(), 0);
                t70Var.d(getLinkColor());
                this.P0 = t70Var;
                p0Var.b(t70Var, null);
                n70 b10 = this.P0.b();
                b10.e(null, 0, 0.0f, 0.0f);
                b10.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                org.telegram.messenger.g0.i3(new j50(2, this, t70Var), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                p0Var.f(true);
                if (this.P0 != null) {
                    performClick();
                }
                this.P0 = null;
                return true;
            }
            if (motionEvent.getAction() == 3) {
                p0Var.f(true);
                this.P0 = null;
                return true;
            }
        }
        return this.P0 != null || super.onTouchEvent(motionEvent);
    }
}
