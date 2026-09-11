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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ko0 extends Drawable {
    public final boolean a;
    public final Runnable b;
    public final Paint c = new Paint(1);
    public final Paint d;
    public xi0 e;
    public final Path f;
    public final f01 g;
    public final Path h;
    public final Path i;
    public boolean j;
    public int k;
    public final e6 l;
    public final e6 m;
    public final e6 n;
    public final e6 o;
    public final jo0 p;
    public boolean q;
    public final RectF r;
    public final RectF s;
    public float t;
    public long u;
    public float v;
    public boolean w;
    public final cc0 x;

    public ko0(Runnable runnable, boolean z10) {
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f = path;
        this.g = new f01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.i = path3;
        this.k = 1;
        this.r = new RectF();
        this.s = new RectF();
        this.x = new cc0(this, 27);
        this.b = runnable;
        this.a = z10;
        pr prVar = pr.h;
        e6 e6Var = new e6(runnable, 360L, prVar, 0);
        this.l = e6Var;
        e6Var.d(0.0f, true);
        this.m = new e6(runnable, 320L, prVar, 0);
        this.n = new e6(runnable, 200L, prVar, 0);
        e6 e6Var2 = new e6(runnable, 360L, prVar, 0);
        this.o = e6Var2;
        e6Var2.d(0.0f, true);
        jo0 jo0Var = new jo0(runnable);
        this.p = jo0Var;
        jo0Var.v = 0.3f;
        jo0Var.u = 0.4f;
        jo0Var.r = 650L;
        jo0Var.t = 1.6f;
        jo0Var.s = prVar;
        jo0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        jo0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        jo0Var.r(-1);
        jo0Var.b = 17;
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
        xi0 xi0Var = this.e;
        if (xi0Var == null || !this.q) {
            return;
        }
        if (z10) {
            xi0Var.F(false);
        } else {
            xi0Var.stop();
        }
    }

    public final void c(float f7, boolean z10) {
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            jo0 jo0Var = this.p;
            jo0Var.b();
            jo0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
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
        float d = this.p.d() + AndroidUtilities.dp(46.0f);
        float e7 = this.l.e(this.j);
        float d10 = this.m.d(this.k, false);
        if (e7 <= 0.0f) {
            return;
        }
        float d11 = this.n.d(Math.abs(this.v), false);
        long currentTimeMillis = System.currentTimeMillis();
        float min = Math.min(0.016f, (currentTimeMillis - this.u) / 1000.0f);
        this.u = currentTimeMillis;
        this.t = (Math.min(d11, 4.0f) * 1.5f * min) + this.t;
        this.b.run();
        float f7 = d / 2.0f;
        this.r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
        canvas.save();
        float f10 = e7 * 0.4f;
        float f11 = 0.6f + f10;
        if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
            f11 *= 0.75f;
            if (this.a) {
                canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
            }
        }
        canvas.scale(f11, f11, this.r.centerX(), this.r.top);
        canvas.translate(0.0f, (1.0f - e7) * (-AndroidUtilities.dp(15.0f)));
        canvas.clipRect(this.r);
        this.c.setColor(org.telegram.ui.ActionBar.j6.l1(f10, -16777216));
        RectF rectF = this.r;
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.r.height() / 2.0f, this.c);
        this.p.m(this.r);
        canvas.save();
        float f12 = -d10;
        canvas.translate(((this.r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.r.centerY());
        this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
        canvas.drawPath(this.h, this.d);
        canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
        this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
        canvas.drawPath(this.h, this.d);
        canvas.restore();
        canvas.save();
        canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
        jo0 jo0Var = this.p;
        jo0Var.w = (int) (e7 * 255.0f);
        jo0Var.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.r.centerY());
        this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e7, -1));
        canvas.drawPath(this.i, this.d);
        canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
        this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e7, -1));
        canvas.drawPath(this.i, this.d);
        canvas.restore();
        canvas.restore();
        float e10 = this.o.e(this.q && this.j);
        if (e10 > 0.0f) {
            if (this.e == null) {
                xi0 xi0Var = new xi0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                this.e = xi0Var;
                xi0Var.H(true);
                this.e.setCallback(new ah.g1(this, 4));
                this.e.I(1);
                this.e.start();
            }
            float dp = this.g.c + AndroidUtilities.dp(54.0f);
            float dp2 = AndroidUtilities.dp(32.0f);
            RectF rectF2 = this.s;
            float f13 = dp / 2.0f;
            float centerX = bounds.centerX() - f13;
            RectF rectF3 = this.r;
            float height = (rectF3.height() * e7) + rectF3.top + AndroidUtilities.dp(11.0f);
            float centerX2 = bounds.centerX() + f13;
            RectF rectF4 = this.r;
            rectF2.set(centerX, height, centerX2, (rectF4.height() * e7) + rectF4.top + AndroidUtilities.dp(11.0f) + dp2);
            canvas.save();
            float f14 = (0.25f * e10) + 0.75f;
            canvas.scale(f14, f14, this.s.centerX(), this.s.top);
            this.c.setColor(org.telegram.ui.ActionBar.j6.l1(e10 * 0.4f, -16777216));
            canvas.save();
            canvas.translate(this.s.centerX(), this.s.top);
            canvas.drawPath(this.f, this.c);
            canvas.restore();
            canvas.drawRoundRect(this.s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.c);
            this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.s.left), ((int) this.s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.s.centerY()));
            this.e.setAlpha((int) (255.0f * e10));
            if (!this.e.l0) {
                this.e.F(true);
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
