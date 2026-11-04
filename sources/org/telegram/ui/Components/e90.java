package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e90 extends Drawable {
    public Paint a;
    public Paint b;
    public long c;
    public float d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public long l;
    public org.telegram.ui.Cells.q1 m;

    public final void a() {
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        int i3 = bounds.left;
        float f10 = (i3 - centerX) * (i3 - centerX);
        int i10 = bounds.top;
        this.g = (float) Math.ceil(Math.sqrt(com.google.android.recaptcha.internal.a.y(i10, centerY, i10 - centerY, f10)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0049, code lost:
    
        if (r7 >= 0.0f) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0056, code lost:
    
        if (r7 >= 0.0f) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f10;
        org.telegram.ui.Cells.q1 q1Var;
        Paint paint = this.a;
        float f11 = this.d;
        if (f11 == 1.0f) {
            Rect bounds = getBounds();
            Paint paint2 = this.b;
            if (paint2 != null) {
                paint = paint2;
            }
            canvas.drawRect(bounds, paint);
        } else if (f11 != 0.0f) {
            float interpolation = this.e ? xq.h.getInterpolation(f11) : 1.0f - xq.h.getInterpolation(1.0f - f11);
            Rect bounds2 = getBounds();
            float centerX = bounds2.centerX();
            float centerY = bounds2.centerY();
            float f12 = this.j;
            if (f12 >= 0.0f) {
                f10 = this.k;
            }
            f12 = this.h;
            if (f12 >= 0.0f) {
                f10 = this.i;
            }
            f10 = centerY;
            f12 = centerX;
            float f13 = 1.0f - interpolation;
            float y9 = com.google.android.recaptcha.internal.a.y(f12, centerX, f13, centerX);
            float y10 = com.google.android.recaptcha.internal.a.y(f10, centerY, f13, centerY);
            float f14 = this.g * interpolation;
            Paint paint3 = this.b;
            if (paint3 != null) {
                paint = paint3;
            }
            canvas.drawCircle(y9, y10, f14, paint);
        }
        if (!this.f) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.c;
        if (j10 > 20) {
            j10 = 17;
        }
        this.c = elapsedRealtime;
        if (this.e) {
            float f15 = (j10 / 240.0f) + this.d;
            this.d = f15;
            if (f15 >= 1.0f) {
                this.d = 1.0f;
                this.h = -1.0f;
                this.i = -1.0f;
                this.j = -1.0f;
                this.k = -1.0f;
                this.f = false;
            }
            q1Var = this.m;
            if (q1Var == null) {
                q1Var.invalidate();
                if (q1Var.getParent() != null) {
                    ((ViewGroup) q1Var.getParent()).invalidate();
                    return;
                }
                return;
            }
            return;
        }
        float f16 = this.d - (j10 / 240.0f);
        this.d = f16;
        if (f16 <= 0.0f) {
            this.d = 0.0f;
            this.h = -1.0f;
            this.i = -1.0f;
            this.j = -1.0f;
            this.k = -1.0f;
            this.f = false;
        }
        q1Var = this.m;
        if (q1Var == null) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.a.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i3, int i10, int i11, int i12) {
        super.setBounds(i3, i10, i11, i12);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
