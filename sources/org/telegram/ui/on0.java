package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class on0 extends Drawable {
    public static final /* synthetic */ int j = 0;
    public float a = org.telegram.messenger.i0.N(10.6665f);
    public final boolean b;
    public Paint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path g;
    public final Path h;
    public final org.telegram.ui.Components.d5 i;

    public on0(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        this.g = new Path();
        this.h = new Path();
        this.b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        this.i = null;
        d();
    }

    public static on0 a(int i10, int i11) {
        if (i11 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.t6.r8;
            return new on0(org.telegram.ui.ActionBar.t6.x0(null, iArr[i11], false), org.telegram.ui.ActionBar.t6.x0(null, iArr[i11], false), org.telegram.ui.ActionBar.t6.x0(null, iArr[i11], false));
        }
        org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(i10).r4;
        return b(lpVar != null ? lpVar.d(i11) : null, false);
    }

    public static on0 b(org.telegram.messenger.kp kpVar, boolean z10) {
        if (kpVar == null) {
            return new on0(0, 0, 0);
        }
        return new on0(kpVar.f(), (!z10 || kpVar.o(org.telegram.ui.ActionBar.t6.I.q())) ? kpVar.g() : kpVar.f(), z10 ? kpVar.f() : kpVar.i());
    }

    public static on0 c(int i10, int i11) {
        org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(i10).s4;
        return b(lpVar == null ? null : lpVar.d(i11), true);
    }

    public final void d() {
        Path path = this.h;
        path.rewind();
        float f7 = this.a;
        path.addCircle(f7, f7, f7, Path.Direction.CW);
        Path path2 = this.g;
        path2.rewind();
        path2.moveTo(this.a * 2.0f, 0.0f);
        float f10 = this.a;
        path2.lineTo(f10 * 2.0f, f10 * 2.0f);
        path2.lineTo(0.0f, this.a * 2.0f);
        path2.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.a, getBounds().centerY() - this.a);
        Paint paint = this.c;
        if (paint != null) {
            float f7 = this.a;
            canvas.drawCircle(f7, f7, f7, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.g, this.e);
        if (this.b) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(this.a - org.telegram.messenger.i0.L(3.66f), this.a - org.telegram.messenger.i0.L(3.66f), this.a + org.telegram.messenger.i0.L(3.66f), this.a + org.telegram.messenger.i0.L(3.66f));
            float f10 = this.a;
            canvas.rotate(45.0f, f10, f10);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.33f), org.telegram.messenger.i0.L(2.33f), this.f);
        }
        canvas.restore();
        org.telegram.ui.Components.d5 d5Var = this.i;
        if (d5Var != null) {
            int L = org.telegram.messenger.i0.L(14.0f) / 2;
            d5Var.setBounds(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            d5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.d5 d5Var = this.i;
        if (view != null) {
            if (d5Var != null) {
                d5Var.l(view);
            }
            view.addOnAttachStateChangeListener(new d5(this, 4));
        } else if (d5Var != null) {
            d5Var.b();
            d5Var.l(null);
        }
    }

    public final void f(float f7, int i10) {
        if (this.c == null) {
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.c.setStrokeWidth(f7);
        this.c.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) (this.a * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.a * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public on0(int i10, int i11, int i12, long j10) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        this.g = new Path();
        this.h = new Path();
        this.b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        d();
        org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(14.0f), null);
        this.i = d5Var;
        d5Var.j(j10, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
