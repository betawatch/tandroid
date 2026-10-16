package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class y90 extends org.telegram.ui.ActionBar.h5 {
    public final aa0 M0;
    public final Paint N0;
    public ea0 O0;

    public y90(Context context) {
        super(context);
        this.M0 = new aa0(this);
        this.N0 = new Paint(1);
    }

    private int getLinkColor() {
        return i0.a.k(getTextColor(), (int) (Color.alpha(getTextColor()) * 0.1175f));
    }

    @Override // org.telegram.ui.ActionBar.h5, android.view.View
    public final void onDraw(Canvas canvas) {
        if (isClickable()) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight());
            int linkColor = getLinkColor();
            Paint paint = this.N0;
            paint.setColor(linkColor);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        }
        super.onDraw(canvas);
        if (isClickable() && this.M0.f(canvas)) {
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.h5, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return super.onTouchEvent(motionEvent);
        }
        aa0 aa0Var = this.M0;
        if (aa0Var != null) {
            if (motionEvent.getAction() == 0) {
                ea0 ea0Var = new ea0(null, null, motionEvent.getX(), motionEvent.getY(), 0);
                ea0Var.d(getLinkColor());
                this.O0 = ea0Var;
                aa0Var.a(ea0Var, null);
                x90 b10 = this.O0.b();
                b10.e(null, 0, 0.0f, 0.0f);
                b10.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                AndroidUtilities.runOnUIThread(new g90(1, this, ea0Var), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                aa0Var.d(true);
                if (this.O0 != null) {
                    performClick();
                }
                this.O0 = null;
                return true;
            }
            if (motionEvent.getAction() == 3) {
                aa0Var.d(true);
                this.O0 = null;
                return true;
            }
        }
        return this.O0 != null || super.onTouchEvent(motionEvent);
    }
}
