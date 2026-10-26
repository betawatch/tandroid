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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qp0 extends Drawable {
    public final boolean a;
    public final Runnable b;
    public final Paint c = new Paint(1);
    public final Paint d;
    public xj0 e;
    public final Path f;
    public final q11 g;
    public final Path h;
    public final Path i;
    public boolean j;
    public int k;
    public final h6 l;
    public final h6 m;
    public final h6 n;
    public final h6 o;
    public final fi.k p;
    public boolean q;
    public final RectF r;
    public final RectF s;
    public float t;
    public long u;
    public float v;
    public boolean w;
    public final mp0 x;

    public qp0(Runnable runnable, boolean z10) {
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f = path;
        this.g = new q11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.i = path3;
        this.k = 1;
        this.r = new RectF();
        this.s = new RectF();
        this.x = new mp0(this, 1);
        this.b = runnable;
        this.a = z10;
        ds dsVar = ds.h;
        h6 h6Var = new h6(runnable, 360L, dsVar, 0);
        this.l = h6Var;
        h6Var.d(0.0f, true);
        this.m = new h6(runnable, 320L, dsVar, 0);
        this.n = new h6(runnable, 200L, dsVar, 0);
        h6 h6Var2 = new h6(runnable, 360L, dsVar, 0);
        this.o = h6Var2;
        h6Var2.d(0.0f, true);
        fi.k kVar = new fi.k(runnable);
        this.p = kVar;
        kVar.A = 0.3f;
        kVar.m(0.4f, 650L, 1.6f, dsVar);
        kVar.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar.w(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        kVar.u(-1);
        kVar.b = 17;
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
        xj0 xj0Var = this.e;
        if (xj0Var == null || !this.q) {
            return;
        }
        if (z10) {
            xj0Var.H(false);
        } else {
            xj0Var.stop();
        }
    }

    public final void c(float f7, boolean z10) {
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            fi.k kVar = this.p;
            kVar.a();
            kVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        int i10 = f7 > 0.0f ? 1 : -1;
        this.k = i10;
        if (!z10) {
            this.m.d(i10, true);
        }
        this.b.run();
        if (!this.q || Math.abs(f7) <= 3.0f || this.w) {
            return;
        }
        this.w = true;
        AndroidUtilities.runOnUIThread(this.x, 2500L);
        MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float c10 = this.p.c() + AndroidUtilities.dp(46.0f);
        float e = this.l.e(this.j);
        float d = this.m.d(this.k, false);
        if (e <= 0.0f) {
            return;
        }
        float d10 = this.n.d(Math.abs(this.v), false);
        long currentTimeMillis = System.currentTimeMillis();
        float min = Math.min(0.016f, (currentTimeMillis - this.u) / 1000.0f);
        this.u = currentTimeMillis;
        this.t = (Math.min(d10, 4.0f) * 1.5f * min) + this.t;
        this.b.run();
        float f7 = c10 / 2.0f;
        this.r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
        canvas.save();
        float f10 = e * 0.4f;
        float f11 = 0.6f + f10;
        if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
            f11 *= 0.75f;
            if (this.a) {
                canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
            }
        }
        canvas.scale(f11, f11, this.r.centerX(), this.r.top);
        canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
        canvas.clipRect(this.r);
        this.c.setColor(org.telegram.ui.ActionBar.y6.o1(f10, -16777216));
        RectF rectF = this.r;
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.r.height() / 2.0f, this.c);
        this.p.p(this.r);
        canvas.save();
        float f12 = -d;
        canvas.translate(((this.r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.r.centerY());
        this.d.setColor(org.telegram.ui.ActionBar.y6.o1(((((((float) Math.sin(this.t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
        canvas.drawPath(this.h, this.d);
        canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
        this.d.setColor(org.telegram.ui.ActionBar.y6.o1(((((((float) Math.sin((this.t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
        canvas.drawPath(this.h, this.d);
        canvas.restore();
        canvas.save();
        canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d, 0.0f);
        fi.k kVar = this.p;
        kVar.B = (int) (e * 255.0f);
        kVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(((1.0f - Math.max(0.0f, d)) * AndroidUtilities.dp(30.0f)) + ((this.r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.r.centerY());
        this.d.setColor(org.telegram.ui.ActionBar.y6.o1(((((((float) Math.sin(this.t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e, -1));
        canvas.drawPath(this.i, this.d);
        canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
        this.d.setColor(org.telegram.ui.ActionBar.y6.o1(((((((float) Math.sin((this.t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e, -1));
        canvas.drawPath(this.i, this.d);
        canvas.restore();
        canvas.restore();
        float e10 = this.o.e(this.q && this.j);
        if (e10 > 0.0f) {
            if (this.e == null) {
                xj0 xj0Var = new xj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                this.e = xj0Var;
                xj0Var.J(true);
                this.e.setCallback(new bh.u0(this, 6));
                this.e.K(1);
                this.e.start();
            }
            float dp = this.g.c + AndroidUtilities.dp(54.0f);
            float dp2 = AndroidUtilities.dp(32.0f);
            RectF rectF2 = this.s;
            float f13 = dp / 2.0f;
            float centerX = bounds.centerX() - f13;
            RectF rectF3 = this.r;
            float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
            float centerX2 = bounds.centerX() + f13;
            RectF rectF4 = this.r;
            rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + dp2);
            canvas.save();
            float f14 = (0.25f * e10) + 0.75f;
            canvas.scale(f14, f14, this.s.centerX(), this.s.top);
            this.c.setColor(org.telegram.ui.ActionBar.y6.o1(e10 * 0.4f, -16777216));
            canvas.save();
            canvas.translate(this.s.centerX(), this.s.top);
            canvas.drawPath(this.f, this.c);
            canvas.restore();
            canvas.drawRoundRect(this.s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.c);
            this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.s.left), ((int) this.s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.s.centerY()));
            this.e.setAlpha((int) (255.0f * e10));
            if (!this.e.k0) {
                this.e.H(true);
            }
            this.e.draw(canvas);
            this.g.c(this.s.left + AndroidUtilities.dp(39.0f), this.s.centerY(), e10, -1, canvas);
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
