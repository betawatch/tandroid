package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Locale;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rn0 extends Drawable {
    public final boolean a;
    public final Runnable b;
    public final Paint c = new Paint(1);
    public final Paint d;
    public bi0 e;
    public final Path f;
    public final qz0 g;
    public final Path h;
    public final Path i;
    public boolean j;
    public int k;
    public final t5 l;
    public final t5 m;
    public final t5 n;
    public final t5 o;
    public final org.telegram.ui.ActionBar.u0 p;
    public boolean q;
    public final RectF r;
    public final RectF s;
    public float t;
    public long u;
    public float v;
    public boolean w;
    public final eb0 x;

    public rn0(Runnable runnable, boolean z10) {
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f = path;
        this.g = new qz0(org.telegram.messenger.cd.L0(2131745698, null), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.i = path3;
        this.k = 1;
        this.r = new RectF();
        this.s = new RectF();
        this.x = new eb0(this, 29);
        this.b = runnable;
        this.a = z10;
        gr grVar = gr.h;
        t5 t5Var = new t5(runnable, 360L, grVar, 0);
        this.l = t5Var;
        t5Var.e(true, 0.0f);
        this.m = new t5(runnable, 320L, grVar, 0);
        this.n = new t5(runnable, 200L, grVar, 0);
        t5 t5Var2 = new t5(runnable, 360L, grVar, 0);
        this.o = t5Var2;
        t5Var2.e(true, 0.0f);
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(runnable);
        this.p = u0Var;
        u0Var.A = 0.3f;
        u0Var.m(0.4f, 650L, 1.6f, grVar);
        u0Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        u0Var.w(org.telegram.messenger.i0.L(16.0f));
        c(false, 2.0f);
        u0Var.u(-1);
        u0Var.b = 17;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(1.66f)));
        path2.moveTo(org.telegram.messenger.i0.L(8.66f), -org.telegram.messenger.i0.L(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(org.telegram.messenger.i0.L(8.66f), org.telegram.messenger.i0.L(6.33f));
        path2.close();
        path3.moveTo(0.0f, -org.telegram.messenger.i0.L(6.33f));
        path3.lineTo(org.telegram.messenger.i0.L(8.66f), 0.0f);
        path3.lineTo(0.0f, org.telegram.messenger.i0.L(6.33f));
        path3.close();
        this.q = (z10 || org.telegram.messenger.vp.d1().getBoolean("seekSpeedHintShowed", false)) ? false : true;
        path.moveTo(-org.telegram.messenger.i0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.i0.L(6.33f));
        path.lineTo(org.telegram.messenger.i0.L(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        return this.j || this.l.c > 0.0f;
    }

    public final void b(boolean z10) {
        this.j = z10;
        this.b.run();
        bi0 bi0Var = this.e;
        if (bi0Var == null || !this.q) {
            return;
        }
        if (z10) {
            bi0Var.H(false);
        } else {
            bi0Var.stop();
        }
    }

    public final void c(boolean z10, float f7) {
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            org.telegram.ui.ActionBar.u0 u0Var = this.p;
            u0Var.a();
            u0Var.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        int i10 = f7 > 0.0f ? 1 : -1;
        this.k = i10;
        if (!z10) {
            this.m.e(true, i10);
        }
        this.b.run();
        if (!this.q || Math.abs(f7) <= 3.0f || this.w) {
            return;
        }
        this.w = true;
        org.telegram.messenger.i0.h3(this.x, 2500L);
        org.telegram.messenger.vp.d1().edit().putBoolean("seekSpeedHintShowed", true).apply();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float c10 = this.p.c() + org.telegram.messenger.i0.L(46.0f);
        float d = this.l.d(this.j);
        float e = this.m.e(false, this.k);
        if (d <= 0.0f) {
            return;
        }
        float e7 = this.n.e(false, Math.abs(this.v));
        long currentTimeMillis = System.currentTimeMillis();
        float min = Math.min(0.016f, (currentTimeMillis - this.u) / 1000.0f);
        this.u = currentTimeMillis;
        this.t = (Math.min(e7, 4.0f) * 1.5f * min) + this.t;
        this.b.run();
        float f7 = c10 / 2.0f;
        this.r.set(bounds.centerX() - f7, org.telegram.messenger.i0.L(9.0f) + bounds.top, bounds.centerX() + f7, org.telegram.messenger.i0.L(37.0f) + bounds.top);
        canvas.save();
        float f10 = d * 0.4f;
        float f11 = 0.6f + f10;
        if (bounds.width() < org.telegram.messenger.i0.q.x * 0.7f) {
            f11 *= 0.75f;
            if (this.a) {
                canvas.translate(-org.telegram.messenger.i0.L(45.0f), 0.0f);
            }
        }
        canvas.scale(f11, f11, this.r.centerX(), this.r.top);
        canvas.translate(0.0f, (1.0f - d) * (-org.telegram.messenger.i0.L(15.0f)));
        canvas.clipRect(this.r);
        this.c.setColor(org.telegram.ui.ActionBar.t6.r1(f10, -16777216));
        RectF rectF = this.r;
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.r.height() / 2.0f, this.c);
        this.p.p(this.r);
        canvas.save();
        float f12 = -e;
        canvas.translate(((this.r.centerX() - f7) + org.telegram.messenger.i0.L(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * org.telegram.messenger.i0.L(30.0f)), this.r.centerY());
        this.d.setColor(org.telegram.ui.ActionBar.t6.r1(((((((float) Math.sin(this.t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * d, -1));
        canvas.drawPath(this.h, this.d);
        canvas.translate(org.telegram.messenger.i0.L(10.66f), 0.0f);
        this.d.setColor(org.telegram.ui.ActionBar.t6.r1(((((((float) Math.sin((this.t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * d, -1));
        canvas.drawPath(this.h, this.d);
        canvas.restore();
        canvas.save();
        canvas.translate(((-org.telegram.messenger.i0.L(28.0f)) / 2.0f) * e, 0.0f);
        org.telegram.ui.ActionBar.u0 u0Var = this.p;
        u0Var.B = (int) (d * 255.0f);
        u0Var.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(((1.0f - Math.max(0.0f, e)) * org.telegram.messenger.i0.L(30.0f)) + ((this.r.centerX() + f7) - org.telegram.messenger.i0.L(30.0f)), this.r.centerY());
        this.d.setColor(org.telegram.ui.ActionBar.t6.r1(((((((float) Math.sin(this.t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e) * d, -1));
        canvas.drawPath(this.i, this.d);
        canvas.translate(org.telegram.messenger.i0.L(10.66f), 0.0f);
        this.d.setColor(org.telegram.ui.ActionBar.t6.r1(((((((float) Math.sin((this.t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e) * d, -1));
        canvas.drawPath(this.i, this.d);
        canvas.restore();
        canvas.restore();
        float d10 = this.o.d(this.q && this.j);
        if (d10 > 0.0f) {
            if (this.e == null) {
                bi0 bi0Var = new bi0(R.raw.seek_speed_hint, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
                this.e = bi0Var;
                bi0Var.J(true);
                this.e.setCallback(new bi.s0(this, 3));
                this.e.K(1);
                this.e.start();
            }
            float L = this.g.c + org.telegram.messenger.i0.L(54.0f);
            float L2 = org.telegram.messenger.i0.L(32.0f);
            RectF rectF2 = this.s;
            float f13 = L / 2.0f;
            float centerX = bounds.centerX() - f13;
            RectF rectF3 = this.r;
            float height = (rectF3.height() * d) + rectF3.top + org.telegram.messenger.i0.L(11.0f);
            float centerX2 = bounds.centerX() + f13;
            RectF rectF4 = this.r;
            rectF2.set(centerX, height, centerX2, (rectF4.height() * d) + rectF4.top + org.telegram.messenger.i0.L(11.0f) + L2);
            canvas.save();
            float f14 = (0.25f * d10) + 0.75f;
            canvas.scale(f14, f14, this.s.centerX(), this.s.top);
            this.c.setColor(org.telegram.ui.ActionBar.t6.r1(d10 * 0.4f, -16777216));
            canvas.save();
            canvas.translate(this.s.centerX(), this.s.top);
            canvas.drawPath(this.f, this.c);
            canvas.restore();
            canvas.drawRoundRect(this.s, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.c);
            this.e.setBounds(org.telegram.messenger.i0.L(11.0f) + ((int) this.s.left), ((int) this.s.centerY()) - (org.telegram.messenger.i0.L(24.0f) / 2), org.telegram.messenger.i0.L(35.0f) + ((int) this.s.left), (org.telegram.messenger.i0.L(24.0f) / 2) + ((int) this.s.centerY()));
            this.e.setAlpha((int) (255.0f * d10));
            if (!this.e.k0) {
                this.e.H(true);
            }
            this.e.draw(canvas);
            this.g.c(this.s.left + org.telegram.messenger.i0.L(39.0f), this.s.centerY(), d10, -1, canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
