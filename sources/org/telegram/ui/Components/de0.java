package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class de0 extends View {
    public Paint a;
    public Paint b;
    public int c;
    public int d;
    public float e;
    public boolean f;
    public int h;
    public int n;
    public ce0 r;

    public final void a(int i9, boolean z10) {
        ce0 ce0Var;
        int i10 = this.h;
        if (i9 < i10) {
            i9 = i10;
        } else {
            int i11 = this.n;
            if (i9 > i11) {
                i9 = i11;
            }
        }
        this.e = (i9 - i10) / (this.n - i10);
        invalidate();
        if (!z10 || (ce0Var = this.r) == null) {
            return;
        }
        ce0Var.l(((Integer) getTag()).intValue(), getProgress());
    }

    public int getProgress() {
        return (int) ((this.e * (this.n - r0)) + this.h);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.b;
        int measuredHeight = getMeasuredHeight();
        int i9 = this.c;
        int i10 = (measuredHeight - i9) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i9) * this.e);
        float f10 = i9 / 2;
        canvas.drawRect(f10, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() - r9, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), this.a);
        if (this.h == 0) {
            canvas.drawRect(f10, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        } else if (this.e > 0.5f) {
            canvas.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() - i9) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + i9) / 2, paint);
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        } else {
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - i9) / 2, AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + i9) / 2, paint);
            canvas.drawRect(measuredWidth, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        }
        canvas.drawCircle(measuredWidth + r9, r9 + i10, f10, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i9 = this.c;
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i9) * this.e);
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i9) / 2;
                if (measuredWidth - measuredHeight <= x10 && x10 <= i9 + measuredWidth + measuredHeight && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                    this.f = true;
                    this.d = (int) (x10 - measuredWidth);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.f) {
                    this.f = false;
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 2 && this.f) {
                float f10 = (int) (x10 - this.d);
                this.e = (f10 >= 0.0f ? f10 > ((float) (getMeasuredWidth() - i9)) ? getMeasuredWidth() - i9 : f10 : 0.0f) / (getMeasuredWidth() - i9);
                ce0 ce0Var = this.r;
                if (ce0Var != null) {
                    ce0Var.l(((Integer) getTag()).intValue(), getProgress());
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(ce0 ce0Var) {
        this.r = ce0Var;
    }

    public void setProgress(int i9) {
        a(i9, true);
    }
}
