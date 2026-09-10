package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class za0 extends Drawable {
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
        float f7 = (i10 - centerX) * (i10 - centerX);
        int i11 = bounds.top;
        this.g = (float) Math.ceil(Math.sqrt(com.google.android.gms.internal.vision.e2.z(i11, centerY, i11 - centerY, f7)));
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
        float f7;
        org.telegram.ui.Cells.t1 t1Var;
        Paint paint = this.a;
        float f10 = this.d;
        if (f10 == 1.0f) {
            Rect bounds = getBounds();
            Paint paint2 = this.b;
            if (paint2 != null) {
                paint = paint2;
            }
            canvas.drawRect(bounds, paint);
        } else if (f10 != 0.0f) {
            float interpolation = this.e ? wr.h.getInterpolation(f10) : 1.0f - wr.h.getInterpolation(1.0f - f10);
            Rect bounds2 = getBounds();
            float centerX = bounds2.centerX();
            float centerY = bounds2.centerY();
            float f11 = this.j;
            if (f11 >= 0.0f) {
                f7 = this.k;
            }
            f11 = this.h;
            if (f11 >= 0.0f) {
                f7 = this.i;
            }
            f7 = centerY;
            f11 = centerX;
            float f12 = 1.0f - interpolation;
            float z10 = com.google.android.gms.internal.vision.e2.z(f11, centerX, f12, centerX);
            float z11 = com.google.android.gms.internal.vision.e2.z(f7, centerY, f12, centerY);
            float f13 = this.g * interpolation;
            Paint paint3 = this.b;
            if (paint3 != null) {
                paint = paint3;
            }
            canvas.drawCircle(z10, z11, f13, paint);
        }
        if (!this.f) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.c;
        if (j3 > 20) {
            j3 = 17;
        }
        this.c = elapsedRealtime;
        if (this.e) {
            float f14 = (j3 / 240.0f) + this.d;
            this.d = f14;
            if (f14 >= 1.0f) {
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
        float f15 = this.d - (j3 / 240.0f);
        this.d = f15;
        if (f15 <= 0.0f) {
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
