package hi;

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
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class m extends Drawable {
    public final Paint a;
    public final Paint b;
    public final l c;
    public final l d;
    public boolean e;
    public final org.telegram.ui.Components.c6 f;
    public final Path g;
    public final int h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public float o;

    public m(int i7) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        l lVar = new l(this, 0);
        this.c = lVar;
        l lVar2 = new l(this, 1);
        this.d = lVar2;
        this.e = false;
        k kVar = new k(this, 0);
        lr lrVar = lr.h;
        this.f = new org.telegram.ui.Components.c6(kVar, 350L, lrVar, 0);
        this.g = new Path();
        this.i = 21.0f;
        this.h = i7;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        lVar.n(0.3f, 250L, lrVar);
        lVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        lVar.w(org.telegram.messenger.g0.N(12.0f));
        lVar.b = 17;
        lVar2.n(0.3f, 250L, lrVar);
        lVar2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        lVar2.w(org.telegram.messenger.g0.N(12.0f));
        lVar2.b = 17;
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
        l lVar = this.c;
        lVar.setBounds(rect);
        lVar.C = (int) (Color.alpha(this.l) * f10);
        lVar.draw(canvas);
        if (d > 0.0f) {
            Path path = this.g;
            path.rewind();
            path.addCircle(this.n, this.o + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(11.33f) * d, Path.Direction.CW);
            canvas.clipPath(path);
            l lVar2 = this.d;
            lVar2.setBounds(rect);
            lVar2.C = (int) (f10 * 255.0f);
            lVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z10) {
        if (this.m != z10) {
            this.m = z10;
            this.a.setXfermode(z10 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
            this.c.a.setXfermode(z10 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        }
    }

    public final void c(float f10) {
        this.d.w(org.telegram.messenger.g0.N(f10));
        this.c.w(org.telegram.messenger.g0.N(f10));
    }

    public final void d(int i7, boolean z10, boolean z11) {
        this.c.t("" + i7, z11, true);
        this.d.t("" + i7, z11, true);
        this.e = z10;
        if (!z11) {
            this.f.f(z10, true);
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
