package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class wl0 extends Drawable {
    public long a;
    public boolean b;
    public Paint c;
    public float d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public org.telegram.ui.Cells.t1 j;
    public float k;
    public int l;
    public int m;
    public org.telegram.ui.ActionBar.f6 n;

    public final void a() {
        if (this.b) {
            return;
        }
        this.a = System.currentTimeMillis();
        this.b = true;
        this.j.invalidate();
    }

    public final void b() {
        if (this.b) {
            this.b = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.c;
        paint.setColor(i0.a.d(this.k, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ic, this.n), this.l));
        int i10 = this.m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.a;
            this.a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = j3;
            float f10 = ((f7 / 300.0f) * this.g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.e;
            this.e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.i) + this.f;
            this.f = f12;
            if (f12 > 1.0f) {
                this.i = -1;
                this.f = 1.0f;
            } else if (f12 < 0.0f) {
                this.i = 1;
                this.f = 0.0f;
            }
            this.j.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.m = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
