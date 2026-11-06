package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class cm0 extends Drawable {
    public static final /* synthetic */ int j = 0;
    public float a = org.telegram.messenger.g0.N(10.6665f);
    public final boolean b;
    public Paint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path g;
    public final Path h;
    public final org.telegram.ui.Components.g5 i;

    public cm0(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        this.g = new Path();
        this.h = new Path();
        this.b = i11 != i7;
        paint.setColor(i7);
        paint2.setColor(i10);
        paint3.setColor(i11);
        this.i = null;
        d();
    }

    public static cm0 a(int i7, int i10) {
        if (i10 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.k6.r8;
            return new cm0(org.telegram.ui.ActionBar.k6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.k6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.k6.x0(null, iArr[i10], false));
        }
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(i7).q4;
        return b(gpVar != null ? gpVar.d(i10) : null, false);
    }

    public static cm0 b(org.telegram.messenger.fp fpVar, boolean z9) {
        if (fpVar == null) {
            return new cm0(0, 0, 0);
        }
        return new cm0(fpVar.f(), (!z9 || fpVar.o(org.telegram.ui.ActionBar.k6.I.q())) ? fpVar.g() : fpVar.f(), z9 ? fpVar.f() : fpVar.i());
    }

    public static cm0 c(int i7, int i10) {
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(i7).r4;
        return b(gpVar == null ? null : gpVar.d(i10), true);
    }

    public final void d() {
        Path path = this.h;
        path.rewind();
        float f10 = this.a;
        path.addCircle(f10, f10, f10, Path.Direction.CW);
        Path path2 = this.g;
        path2.rewind();
        path2.moveTo(this.a * 2.0f, 0.0f);
        float f11 = this.a;
        path2.lineTo(f11 * 2.0f, f11 * 2.0f);
        path2.lineTo(0.0f, this.a * 2.0f);
        path2.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.a, getBounds().centerY() - this.a);
        Paint paint = this.c;
        if (paint != null) {
            float f10 = this.a;
            canvas.drawCircle(f10, f10, f10, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.g, this.e);
        if (this.b) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(this.a - org.telegram.messenger.g0.L(3.66f), this.a - org.telegram.messenger.g0.L(3.66f), this.a + org.telegram.messenger.g0.L(3.66f), this.a + org.telegram.messenger.g0.L(3.66f));
            float f11 = this.a;
            canvas.rotate(45.0f, f11, f11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.f);
        }
        canvas.restore();
        org.telegram.ui.Components.g5 g5Var = this.i;
        if (g5Var != null) {
            int L = org.telegram.messenger.g0.L(14.0f) / 2;
            g5Var.setBounds(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            g5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.g5 g5Var = this.i;
        if (view != null) {
            if (g5Var != null) {
                g5Var.l(view);
            }
            view.addOnAttachStateChangeListener(new e5(this, 4));
        } else if (g5Var != null) {
            g5Var.b();
            g5Var.l(null);
        }
    }

    public final void f(float f10, int i7) {
        if (this.c == null) {
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.c.setStrokeWidth(f10);
        this.c.setColor(i7);
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

    public cm0(int i7, int i10, int i11, long j3) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        this.g = new Path();
        this.h = new Path();
        this.b = i11 != i7;
        paint.setColor(i7);
        paint2.setColor(i10);
        paint3.setColor(i11);
        d();
        org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(14.0f), null);
        this.i = g5Var;
        g5Var.j(j3, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
