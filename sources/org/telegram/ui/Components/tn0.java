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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tn0 extends Drawable {
    public final boolean a;
    public final Runnable b;
    public final Paint c = new Paint(1);
    public final Paint d;
    public mi0 e;
    public final Path f;
    public final nz0 g;
    public final Path h;
    public final Path i;
    public boolean j;
    public int k;
    public final y5 l;
    public final y5 m;
    public final y5 n;
    public final y5 o;
    public final sn0 p;
    public boolean q;
    public final RectF r;
    public final RectF s;
    public float t;
    public long u;
    public float v;
    public boolean w;
    public final ib0 x;

    public tn0(Runnable runnable, boolean z10) {
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f = path;
        this.g = new nz0(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.i = path3;
        this.k = 1;
        this.r = new RectF();
        this.s = new RectF();
        this.x = new ib0(this, 27);
        this.b = runnable;
        this.a = z10;
        gr grVar = gr.h;
        y5 y5Var = new y5(runnable, 360L, grVar, 0);
        this.l = y5Var;
        y5Var.d(0.0f, true);
        this.m = new y5(runnable, 320L, grVar, 0);
        this.n = new y5(runnable, 200L, grVar, 0);
        y5 y5Var2 = new y5(runnable, 360L, grVar, 0);
        this.o = y5Var2;
        y5Var2.d(0.0f, true);
        sn0 sn0Var = new sn0(runnable);
        this.p = sn0Var;
        sn0Var.v = 0.3f;
        sn0Var.u = 0.4f;
        sn0Var.r = 650L;
        sn0Var.t = 1.6f;
        sn0Var.s = grVar;
        sn0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        sn0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        sn0Var.r(-1);
        sn0Var.b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : true;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        return this.j || this.l.c > 0.0f;
    }

    public final void b(boolean z10) {
        this.j = z10;
        this.b.run();
        mi0 mi0Var = this.e;
        if (mi0Var == null || !this.q) {
            return;
        }
        if (z10) {
            mi0Var.F(false);
        } else {
            mi0Var.stop();
        }
    }

    public final void c(float f10, boolean z10) {
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f10)) {
            sn0 sn0Var = this.p;
            sn0Var.b();
            sn0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z10, true);
            this.v = f10;
        }
        int i9 = f10 > 0.0f ? 1 : -1;
        this.k = i9;
        if (!z10) {
            this.m.d(i9, true);
        }
        this.b.run();
        if (!this.q || Math.abs(f10) <= 3.0f || this.w) {
            return;
        }
        this.w = true;
        AndroidUtilities.runOnUIThread(this.x, 2500L);
        MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float d = this.p.d() + AndroidUtilities.dp(46.0f);
        float e10 = this.l.e(this.j);
        float d9 = this.m.d(this.k, false);
        if (e10 <= 0.0f) {
            return;
        }
        float d10 = this.n.d(Math.abs(this.v), false);
        long currentTimeMillis = System.currentTimeMillis();
        float min = Math.min(0.016f, (currentTimeMillis - this.u) / 1000.0f);
        this.u = currentTimeMillis;
        this.t = (Math.min(d10, 4.0f) * 1.5f * min) + this.t;
        this.b.run();
        float f10 = d / 2.0f;
        this.r.set(bounds.centerX() - f10, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f10, AndroidUtilities.dp(37.0f) + bounds.top);
        canvas.save();
        float f11 = e10 * 0.4f;
        float f12 = 0.6f + f11;
        if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
            f12 *= 0.75f;
            if (this.a) {
                canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
            }
        }
        canvas.scale(f12, f12, this.r.centerX(), this.r.top);
        canvas.translate(0.0f, (1.0f - e10) * (-AndroidUtilities.dp(15.0f)));
        canvas.clipRect(this.r);
        this.c.setColor(org.telegram.ui.ActionBar.f6.l1(f11, -16777216));
        RectF rectF = this.r;
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.r.height() / 2.0f, this.c);
        this.p.m(this.r);
        canvas.save();
        float f13 = -d9;
        canvas.translate(((this.r.centerX() - f10) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * AndroidUtilities.dp(30.0f)), this.r.centerY());
        this.d.setColor(org.telegram.ui.ActionBar.f6.l1(((((((float) Math.sin(this.t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * e10, -1));
        canvas.drawPath(this.h, this.d);
        canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
        this.d.setColor(org.telegram.ui.ActionBar.f6.l1(((((((float) Math.sin((this.t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * e10, -1));
        canvas.drawPath(this.h, this.d);
        canvas.restore();
        canvas.save();
        canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d9, 0.0f);
        sn0 sn0Var = this.p;
        sn0Var.w = (int) (e10 * 255.0f);
        sn0Var.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(((1.0f - Math.max(0.0f, d9)) * AndroidUtilities.dp(30.0f)) + ((this.r.centerX() + f10) - AndroidUtilities.dp(30.0f)), this.r.centerY());
        this.d.setColor(org.telegram.ui.ActionBar.f6.l1(((((((float) Math.sin(this.t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d9) * e10, -1));
        canvas.drawPath(this.i, this.d);
        canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
        this.d.setColor(org.telegram.ui.ActionBar.f6.l1(((((((float) Math.sin((this.t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d9) * e10, -1));
        canvas.drawPath(this.i, this.d);
        canvas.restore();
        canvas.restore();
        float e11 = this.o.e(this.q && this.j);
        if (e11 > 0.0f) {
            if (this.e == null) {
                mi0 mi0Var = new mi0(R.raw.seek_speed_hint, "" + R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                this.e = mi0Var;
                mi0Var.H(true);
                this.e.setCallback(new eg.a(this, 7));
                this.e.I(1);
                this.e.start();
            }
            float dp = this.g.c + AndroidUtilities.dp(54.0f);
            float dp2 = AndroidUtilities.dp(32.0f);
            RectF rectF2 = this.s;
            float f14 = dp / 2.0f;
            float centerX = bounds.centerX() - f14;
            RectF rectF3 = this.r;
            float height = (rectF3.height() * e10) + rectF3.top + AndroidUtilities.dp(11.0f);
            float centerX2 = bounds.centerX() + f14;
            RectF rectF4 = this.r;
            rectF2.set(centerX, height, centerX2, (rectF4.height() * e10) + rectF4.top + AndroidUtilities.dp(11.0f) + dp2);
            canvas.save();
            float f15 = (0.25f * e11) + 0.75f;
            canvas.scale(f15, f15, this.s.centerX(), this.s.top);
            this.c.setColor(org.telegram.ui.ActionBar.f6.l1(e11 * 0.4f, -16777216));
            canvas.save();
            canvas.translate(this.s.centerX(), this.s.top);
            canvas.drawPath(this.f, this.c);
            canvas.restore();
            canvas.drawRoundRect(this.s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.c);
            this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.s.left), ((int) this.s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.s.centerY()));
            this.e.setAlpha((int) (255.0f * e11));
            if (!this.e.h0) {
                this.e.F(true);
            }
            this.e.draw(canvas);
            this.g.c(this.s.left + AndroidUtilities.dp(39.0f), this.s.centerY(), e11, -1, canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
