package fi;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class l extends Drawable {
    public final Paint a;
    public final Paint b;
    public final k c;
    public final k d;
    public boolean e;
    public final org.telegram.ui.Components.w5 f;
    public final Path g;
    public final int h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public float o;

    public l(int i7) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        k kVar = new k(this, 0);
        this.c = kVar;
        k kVar2 = new k(this, 1);
        this.d = kVar2;
        this.e = false;
        di.s7 s7Var = new di.s7(this, 13);
        xq xqVar = xq.h;
        this.f = new org.telegram.ui.Components.w5(s7Var, 350L, xqVar, 0);
        this.g = new Path();
        this.i = 21.0f;
        this.h = i7;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        kVar.n(0.3f, 250L, xqVar);
        kVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar.w(org.telegram.messenger.g0.N(12.0f));
        kVar.b = 17;
        kVar2.n(0.3f, 250L, xqVar);
        kVar2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar2.w(org.telegram.messenger.g0.N(12.0f));
        kVar2.b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f10) {
        float N = org.telegram.messenger.g0.N(this.i) / 2.0f;
        float d = this.f.d(this.e);
        if (d > 0.0f) {
            Paint paint = this.b;
            paint.setAlpha((int) (f10 * 255.0f * d));
            canvas.drawCircle(this.n, this.o, org.telegram.messenger.g0.N(11.33f) * d, paint);
        }
        Paint paint2 = this.a;
        paint2.setAlpha((int) ((1.0f - d) * Color.alpha(this.l) * f10));
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = this.n;
        float f12 = this.o;
        rectF.set(f11 - N, f12 - N, f11 + N, f12 + N);
        canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
        int i7 = this.h;
        float f13 = ((i7 + 1) * 1.5f) + (i7 * 1.0f);
        float f14 = (1.0f / f13) * 180.0f;
        float f15 = (1.5f / f13) * 180.0f;
        int i10 = 0;
        float f16 = f15;
        while (i10 < i7) {
            float f17 = f14;
            canvas.drawArc(org.telegram.messenger.g0.P, f16 + 270.0f, f17, false, paint2);
            f16 = f17 + f15 + f16;
            i10++;
            f14 = f17;
        }
        canvas.save();
        canvas.translate(this.j + 0.0f, this.k);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set((int) (this.n - org.telegram.messenger.g0.L(20.0f)), (int) (this.o - org.telegram.messenger.g0.L(20.0f)), (int) (this.n + org.telegram.messenger.g0.L(20.0f)), (int) (this.o + org.telegram.messenger.g0.L(20.0f)));
        k kVar = this.c;
        kVar.setBounds(rect);
        kVar.B = (int) (Color.alpha(this.l) * f10);
        kVar.draw(canvas);
        if (d > 0.0f) {
            Path path = this.g;
            path.rewind();
            path.addCircle(this.n, this.o + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(11.33f) * d, Path.Direction.CW);
            canvas.clipPath(path);
            k kVar2 = this.d;
            kVar2.setBounds(rect);
            kVar2.B = (int) (f10 * 255.0f);
            kVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z9) {
        if (this.m != z9) {
            this.m = z9;
            this.a.setXfermode(z9 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
            this.c.a.setXfermode(z9 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        }
    }

    public final void c(float f10) {
        this.d.w(org.telegram.messenger.g0.N(f10));
        this.c.w(org.telegram.messenger.g0.N(f10));
    }

    public final void d(int i7, boolean z9, boolean z10) {
        this.c.t("" + i7, z10, true);
        this.d.t("" + i7, z10, true);
        this.e = z9;
        if (!z10) {
            this.f.f(z9, true);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i7, int i10, int i11) {
        this.l = i7;
        this.a.setColor(i7);
        this.c.u(i7);
        this.d.u(i11);
        this.b.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.n = getBounds().centerX();
        this.o = getBounds().centerY();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.n = getBounds().centerX();
        this.o = getBounds().centerY();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
