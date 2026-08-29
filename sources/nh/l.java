package nh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class l extends Drawable {
    public final Paint a;
    public final Paint b;
    public final k c;
    public final k d;
    public boolean e;
    public final org.telegram.ui.Components.d6 f;
    public final Path g;
    public final int h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public float o;

    public l(int i10) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        k kVar = new k(this, 0);
        this.c = kVar;
        k kVar2 = new k(this, 1);
        this.d = kVar2;
        this.e = false;
        lh.m5 m5Var = new lh.m5(this, 17);
        jr jrVar = jr.h;
        this.f = new org.telegram.ui.Components.d6(m5Var, 350L, jrVar, 0);
        this.g = new Path();
        this.i = 21.0f;
        this.h = i10;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        kVar.k(0.3f, 250L, jrVar);
        kVar.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar.t(AndroidUtilities.dpf2(12.0f));
        kVar.b = 17;
        kVar2.k(0.3f, 250L, jrVar);
        kVar2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar2.t(AndroidUtilities.dpf2(12.0f));
        kVar2.b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f9) {
        float dpf2 = AndroidUtilities.dpf2(this.i) / 2.0f;
        float e10 = this.f.e(this.e);
        if (e10 > 0.0f) {
            Paint paint = this.b;
            paint.setAlpha((int) (f9 * 255.0f * e10));
            canvas.drawCircle(this.n, this.o, AndroidUtilities.dpf2(11.33f) * e10, paint);
        }
        Paint paint2 = this.a;
        paint2.setAlpha((int) ((1.0f - e10) * Color.alpha(this.l) * f9));
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = this.n;
        float f11 = this.o;
        rectF.set(f10 - dpf2, f11 - dpf2, f10 + dpf2, f11 + dpf2);
        canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
        int i10 = this.h;
        float f12 = ((i10 + 1) * 1.5f) + (i10 * 1.0f);
        float f13 = (1.0f / f12) * 180.0f;
        float f14 = (1.5f / f12) * 180.0f;
        float f15 = f14;
        int i11 = 0;
        while (i11 < i10) {
            float f16 = f13;
            canvas.drawArc(AndroidUtilities.rectTmp, f15 + 270.0f, f16, false, paint2);
            f15 = f16 + f14 + f15;
            i11++;
            f13 = f16;
        }
        canvas.save();
        canvas.translate(this.j + 0.0f, this.k);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) (this.n - AndroidUtilities.dp(20.0f)), (int) (this.o - AndroidUtilities.dp(20.0f)), (int) (this.n + AndroidUtilities.dp(20.0f)), (int) (this.o + AndroidUtilities.dp(20.0f)));
        k kVar = this.c;
        kVar.setBounds(rect);
        kVar.w = (int) (Color.alpha(this.l) * f9);
        kVar.draw(canvas);
        if (e10 > 0.0f) {
            Path path = this.g;
            path.rewind();
            path.addCircle(this.n, this.o + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * e10, Path.Direction.CW);
            canvas.clipPath(path);
            k kVar2 = this.d;
            kVar2.setBounds(rect);
            kVar2.w = (int) (f9 * 255.0f);
            kVar2.draw(canvas);
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

    public final void c(float f9) {
        this.d.t(AndroidUtilities.dpf2(f9));
        this.c.t(AndroidUtilities.dpf2(f9));
    }

    public final void d(int i10, boolean z10, boolean z11) {
        this.c.q("" + i10, z11, true);
        this.d.q("" + i10, z11, true);
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

    public final void e(int i10, int i11, int i12) {
        this.l = i10;
        this.a.setColor(i10);
        this.c.r(i10);
        this.d.r(i12);
        this.b.setColor(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
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
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.n = getBounds().centerX();
        this.o = getBounds().centerY();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
