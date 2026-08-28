package kh;

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
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l extends Drawable {
    public final Paint a;
    public final Paint b;
    public final k c;
    public final k d;
    public boolean e;
    public final org.telegram.ui.Components.y5 f;
    public final Path g;
    public final int h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public float o;

    public l(int i9) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        k kVar = new k(this, 0);
        this.c = kVar;
        k kVar2 = new k(this, 1);
        this.d = kVar2;
        this.e = false;
        ih.g gVar = new ih.g(this, 26);
        gr grVar = gr.h;
        this.f = new org.telegram.ui.Components.y5(gVar, 350L, grVar, 0);
        this.g = new Path();
        this.i = 21.0f;
        this.h = i9;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        kVar.k(0.3f, 250L, grVar);
        kVar.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar.t(AndroidUtilities.dpf2(12.0f));
        kVar.b = 17;
        kVar2.k(0.3f, 250L, grVar);
        kVar2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar2.t(AndroidUtilities.dpf2(12.0f));
        kVar2.b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f10) {
        float dpf2 = AndroidUtilities.dpf2(this.i) / 2.0f;
        float e10 = this.f.e(this.e);
        if (e10 > 0.0f) {
            Paint paint = this.b;
            paint.setAlpha((int) (f10 * 255.0f * e10));
            canvas.drawCircle(this.n, this.o, AndroidUtilities.dpf2(11.33f) * e10, paint);
        }
        Paint paint2 = this.a;
        paint2.setAlpha((int) ((1.0f - e10) * Color.alpha(this.l) * f10));
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = this.n;
        float f12 = this.o;
        rectF.set(f11 - dpf2, f12 - dpf2, f11 + dpf2, f12 + dpf2);
        canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
        int i9 = this.h;
        float f13 = ((i9 + 1) * 1.5f) + (i9 * 1.0f);
        float f14 = (1.0f / f13) * 180.0f;
        float f15 = (1.5f / f13) * 180.0f;
        float f16 = f15;
        int i10 = 0;
        while (i10 < i9) {
            float f17 = f14;
            canvas.drawArc(AndroidUtilities.rectTmp, f16 + 270.0f, f17, false, paint2);
            f16 = f17 + f15 + f16;
            i10++;
            f14 = f17;
        }
        canvas.save();
        canvas.translate(this.j + 0.0f, this.k);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) (this.n - AndroidUtilities.dp(20.0f)), (int) (this.o - AndroidUtilities.dp(20.0f)), (int) (this.n + AndroidUtilities.dp(20.0f)), (int) (this.o + AndroidUtilities.dp(20.0f)));
        k kVar = this.c;
        kVar.setBounds(rect);
        kVar.w = (int) (Color.alpha(this.l) * f10);
        kVar.draw(canvas);
        if (e10 > 0.0f) {
            Path path = this.g;
            path.rewind();
            path.addCircle(this.n, this.o + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * e10, Path.Direction.CW);
            canvas.clipPath(path);
            k kVar2 = this.d;
            kVar2.setBounds(rect);
            kVar2.w = (int) (f10 * 255.0f);
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

    public final void c(float f10) {
        this.d.t(AndroidUtilities.dpf2(f10));
        this.c.t(AndroidUtilities.dpf2(f10));
    }

    public final void d(int i9, boolean z10, boolean z11) {
        this.c.q("" + i9, z11, true);
        this.d.q("" + i9, z11, true);
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

    public final void e(int i9, int i10, int i11) {
        this.l = i9;
        this.a.setColor(i9);
        this.c.r(i9);
        this.d.r(i11);
        this.b.setColor(i10);
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
    public final void setBounds(int i9, int i10, int i11, int i12) {
        super.setBounds(i9, i10, i11, i12);
        this.n = getBounds().centerX();
        this.o = getBounds().centerY();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
