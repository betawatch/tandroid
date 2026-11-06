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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class qm0 extends Drawable {
    public final boolean a;
    public final Runnable b;
    public final Paint c = new Paint(1);
    public final Paint d;
    public zg0 e;
    public final Path f;
    public final ly0 g;
    public final Path h;
    public final Path i;
    public boolean j;
    public int k;
    public final w5 l;
    public final w5 m;
    public final w5 n;
    public final w5 o;
    public final fi.k p;
    public boolean q;
    public final RectF r;
    public final RectF s;
    public float t;
    public long u;
    public float v;
    public boolean w;
    public final ob0 x;

    public qm0(Runnable runnable, boolean z9) {
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f = path;
        this.g = new ly0(org.telegram.messenger.hd.M0(2131745682, null), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.i = path3;
        this.k = 1;
        this.r = new RectF();
        this.s = new RectF();
        this.x = new ob0(this, 24);
        this.b = runnable;
        this.a = z9;
        xq xqVar = xq.h;
        w5 w5Var = new w5(runnable, 360L, xqVar, 0);
        this.l = w5Var;
        w5Var.e(true, 0.0f);
        this.m = new w5(runnable, 320L, xqVar, 0);
        this.n = new w5(runnable, 200L, xqVar, 0);
        w5 w5Var2 = new w5(runnable, 360L, xqVar, 0);
        this.o = w5Var2;
        w5Var2.e(true, 0.0f);
        fi.k kVar = new fi.k(runnable);
        this.p = kVar;
        kVar.A = 0.3f;
        kVar.m(0.4f, 650L, 1.6f, xqVar);
        kVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar.w(org.telegram.messenger.g0.L(16.0f));
        c(false, 2.0f);
        kVar.u(-1);
        kVar.b = 17;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(1.66f)));
        path2.moveTo(org.telegram.messenger.g0.L(8.66f), -org.telegram.messenger.g0.L(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(6.33f));
        path2.close();
        path3.moveTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path3.lineTo(org.telegram.messenger.g0.L(8.66f), 0.0f);
        path3.lineTo(0.0f, org.telegram.messenger.g0.L(6.33f));
        path3.close();
        this.q = (z9 || org.telegram.messenger.qp.e1().getBoolean("seekSpeedHintShowed", false)) ? false : true;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        return this.j || this.l.c > 0.0f;
    }

    public final void b(boolean z9) {
        this.j = z9;
        this.b.run();
        zg0 zg0Var = this.e;
        if (zg0Var == null || !this.q) {
            return;
        }
        if (z9) {
            zg0Var.H(false);
        } else {
            zg0Var.stop();
        }
    }

    public final void c(boolean z9, float f10) {
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f10)) {
            fi.k kVar = this.p;
            kVar.a();
            kVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z9, true);
            this.v = f10;
        }
        int i7 = f10 > 0.0f ? 1 : -1;
        this.k = i7;
        if (!z9) {
            this.m.e(true, i7);
        }
        this.b.run();
        if (!this.q || Math.abs(f10) <= 3.0f || this.w) {
            return;
        }
        this.w = true;
        org.telegram.messenger.g0.i3(this.x, 2500L);
        org.telegram.messenger.qp.e1().edit().putBoolean("seekSpeedHintShowed", true).apply();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float c10 = this.p.c() + org.telegram.messenger.g0.L(46.0f);
        float d = this.l.d(this.j);
        float e10 = this.m.e(false, this.k);
        if (d <= 0.0f) {
            return;
        }
        float e11 = this.n.e(false, Math.abs(this.v));
        long currentTimeMillis = System.currentTimeMillis();
        float min = Math.min(0.016f, (currentTimeMillis - this.u) / 1000.0f);
        this.u = currentTimeMillis;
        this.t = (Math.min(e11, 4.0f) * 1.5f * min) + this.t;
        this.b.run();
        float f10 = c10 / 2.0f;
        this.r.set(bounds.centerX() - f10, org.telegram.messenger.g0.L(9.0f) + bounds.top, bounds.centerX() + f10, org.telegram.messenger.g0.L(37.0f) + bounds.top);
        canvas.save();
        float f11 = d * 0.4f;
        float f12 = 0.6f + f11;
        if (bounds.width() < org.telegram.messenger.g0.q.x * 0.7f) {
            f12 *= 0.75f;
            if (this.a) {
                canvas.translate(-org.telegram.messenger.g0.L(45.0f), 0.0f);
            }
        }
        canvas.scale(f12, f12, this.r.centerX(), this.r.top);
        canvas.translate(0.0f, (1.0f - d) * (-org.telegram.messenger.g0.L(15.0f)));
        canvas.clipRect(this.r);
        this.c.setColor(org.telegram.ui.ActionBar.k6.r1(f11, -16777216));
        RectF rectF = this.r;
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.r.height() / 2.0f, this.c);
        this.p.p(this.r);
        canvas.save();
        float f13 = -e10;
        canvas.translate(((this.r.centerX() - f10) + org.telegram.messenger.g0.L(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * org.telegram.messenger.g0.L(30.0f)), this.r.centerY());
        this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin(this.t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
        canvas.drawPath(this.h, this.d);
        canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
        this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin((this.t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
        canvas.drawPath(this.h, this.d);
        canvas.restore();
        canvas.save();
        canvas.translate(((-org.telegram.messenger.g0.L(28.0f)) / 2.0f) * e10, 0.0f);
        fi.k kVar = this.p;
        kVar.B = (int) (d * 255.0f);
        kVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(((1.0f - Math.max(0.0f, e10)) * org.telegram.messenger.g0.L(30.0f)) + ((this.r.centerX() + f10) - org.telegram.messenger.g0.L(30.0f)), this.r.centerY());
        this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin(this.t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
        canvas.drawPath(this.i, this.d);
        canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
        this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin((this.t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
        canvas.drawPath(this.i, this.d);
        canvas.restore();
        canvas.restore();
        float d2 = this.o.d(this.q && this.j);
        if (d2 > 0.0f) {
            if (this.e == null) {
                zg0 zg0Var = new zg0(R.raw.seek_speed_hint, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
                this.e = zg0Var;
                zg0Var.J(true);
                this.e.setCallback(new a5.b(this, 7));
                this.e.K(1);
                this.e.start();
            }
            float L = this.g.c + org.telegram.messenger.g0.L(54.0f);
            float L2 = org.telegram.messenger.g0.L(32.0f);
            RectF rectF2 = this.s;
            float f14 = L / 2.0f;
            float centerX = bounds.centerX() - f14;
            RectF rectF3 = this.r;
            float height = (rectF3.height() * d) + rectF3.top + org.telegram.messenger.g0.L(11.0f);
            float centerX2 = bounds.centerX() + f14;
            RectF rectF4 = this.r;
            rectF2.set(centerX, height, centerX2, (rectF4.height() * d) + rectF4.top + org.telegram.messenger.g0.L(11.0f) + L2);
            canvas.save();
            float f15 = (0.25f * d2) + 0.75f;
            canvas.scale(f15, f15, this.s.centerX(), this.s.top);
            this.c.setColor(org.telegram.ui.ActionBar.k6.r1(d2 * 0.4f, -16777216));
            canvas.save();
            canvas.translate(this.s.centerX(), this.s.top);
            canvas.drawPath(this.f, this.c);
            canvas.restore();
            canvas.drawRoundRect(this.s, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.c);
            this.e.setBounds(org.telegram.messenger.g0.L(11.0f) + ((int) this.s.left), ((int) this.s.centerY()) - (org.telegram.messenger.g0.L(24.0f) / 2), org.telegram.messenger.g0.L(35.0f) + ((int) this.s.left), (org.telegram.messenger.g0.L(24.0f) / 2) + ((int) this.s.centerY()));
            this.e.setAlpha((int) (255.0f * d2));
            if (!this.e.k0) {
                this.e.H(true);
            }
            this.e.draw(canvas);
            this.g.c(this.s.left + org.telegram.messenger.g0.L(39.0f), this.s.centerY(), d2, -1, canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
