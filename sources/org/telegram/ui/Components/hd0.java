package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class hd0 extends View {
    public Paint a;
    public Paint b;
    public int c;
    public int d;
    public float e;
    public boolean f;
    public int h;
    public int n;
    public gd0 r;

    public final void a(int i7, boolean z9) {
        gd0 gd0Var;
        int i10 = this.h;
        if (i7 < i10) {
            i7 = i10;
        } else {
            int i11 = this.n;
            if (i7 > i11) {
                i7 = i11;
            }
        }
        this.e = (i7 - i10) / (this.n - i10);
        invalidate();
        if (!z9 || (gd0Var = this.r) == null) {
            return;
        }
        gd0Var.l(((Integer) getTag()).intValue(), getProgress());
    }

    public int getProgress() {
        return (int) ((this.e * (this.n - r0)) + this.h);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.b;
        int measuredHeight = getMeasuredHeight();
        int i7 = this.c;
        int i10 = (measuredHeight - i7) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i7) * this.e);
        float f10 = i7 / 2;
        canvas.drawRect(f10, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - r9, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), this.a);
        if (this.h == 0) {
            canvas.drawRect(f10, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), measuredWidth, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        } else if (this.e > 0.5f) {
            canvas.drawRect((getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(1.0f), (getMeasuredHeight() - i7) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + i7) / 2, paint);
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), measuredWidth, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        } else {
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - i7) / 2, org.telegram.messenger.g0.L(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + i7) / 2, paint);
            canvas.drawRect(measuredWidth, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() / 2, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        }
        canvas.drawCircle(measuredWidth + r9, r9 + i10, f10, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7 = this.c;
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i7) * this.e);
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i7) / 2;
                if (measuredWidth - measuredHeight <= x10 && x10 <= i7 + measuredWidth + measuredHeight && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
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
                this.e = (f10 >= 0.0f ? f10 > ((float) (getMeasuredWidth() - i7)) ? getMeasuredWidth() - i7 : f10 : 0.0f) / (getMeasuredWidth() - i7);
                gd0 gd0Var = this.r;
                if (gd0Var != null) {
                    gd0Var.l(((Integer) getTag()).intValue(), getProgress());
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(gd0 gd0Var) {
        this.r = gd0Var;
    }

    public void setProgress(int i7) {
        a(i7, true);
    }
}
