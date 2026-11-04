package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cd0 extends View {
    public Paint a;
    public Paint b;
    public int c;
    public int d;
    public float e;
    public boolean f;
    public int h;
    public int n;
    public bd0 r;

    public final void a(int i3, boolean z10) {
        bd0 bd0Var;
        int i10 = this.h;
        if (i3 < i10) {
            i3 = i10;
        } else {
            int i11 = this.n;
            if (i3 > i11) {
                i3 = i11;
            }
        }
        this.e = (i3 - i10) / (this.n - i10);
        invalidate();
        if (!z10 || (bd0Var = this.r) == null) {
            return;
        }
        bd0Var.m(((Integer) getTag()).intValue(), getProgress());
    }

    public int getProgress() {
        return (int) ((this.e * (this.n - r0)) + this.h);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.b;
        int measuredHeight = getMeasuredHeight();
        int i3 = this.c;
        int i10 = (measuredHeight - i3) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i3) * this.e);
        float f10 = i3 / 2;
        canvas.drawRect(f10, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - r9, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), this.a);
        if (this.h == 0) {
            canvas.drawRect(f10, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), measuredWidth, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        } else if (this.e > 0.5f) {
            canvas.drawRect((getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(1.0f), (getMeasuredHeight() - i3) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + i3) / 2, paint);
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), measuredWidth, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        } else {
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - i3) / 2, org.telegram.messenger.g0.L(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + i3) / 2, paint);
            canvas.drawRect(measuredWidth, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() / 2, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        }
        canvas.drawCircle(measuredWidth + r9, r9 + i10, f10, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3 = this.c;
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i3) * this.e);
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i3) / 2;
                if (measuredWidth - measuredHeight <= x10 && x10 <= i3 + measuredWidth + measuredHeight && y9 >= 0.0f && y9 <= getMeasuredHeight()) {
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
                this.e = (f10 >= 0.0f ? f10 > ((float) (getMeasuredWidth() - i3)) ? getMeasuredWidth() - i3 : f10 : 0.0f) / (getMeasuredWidth() - i3);
                bd0 bd0Var = this.r;
                if (bd0Var != null) {
                    bd0Var.m(((Integer) getTag()).intValue(), getProgress());
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(bd0 bd0Var) {
        this.r = bd0Var;
    }

    public void setProgress(int i3) {
        a(i3, true);
    }
}
