package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ra0 extends Drawable {
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
    public org.telegram.ui.Cells.t1 m;

    public final void a() {
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        int i10 = bounds.left;
        float f10 = (i10 - centerX) * (i10 - centerX);
        int i11 = bounds.top;
        this.g = (float) Math.ceil(Math.sqrt(e2.c.w(i11, centerY, i11 - centerY, f10)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0049, code lost:
    
        if (r7 >= 0.0f) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0056, code lost:
    
        if (r7 >= 0.0f) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f10;
        org.telegram.ui.Cells.t1 t1Var;
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
            float interpolation = this.e ? nr.h.getInterpolation(f11) : 1.0f - nr.h.getInterpolation(1.0f - f11);
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
            float w10 = e2.c.w(f12, centerX, f13, centerX);
            float w11 = e2.c.w(f10, centerY, f13, centerY);
            float f14 = this.g * interpolation;
            Paint paint3 = this.b;
            if (paint3 != null) {
                paint = paint3;
            }
            canvas.drawCircle(w10, w11, f14, paint);
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
            t1Var = this.m;
            if (t1Var == null) {
                t1Var.invalidate();
                if (t1Var.getParent() != null) {
                    ((ViewGroup) t1Var.getParent()).invalidate();
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
        t1Var = this.m;
        if (t1Var == null) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
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
