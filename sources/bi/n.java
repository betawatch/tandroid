package bi;

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
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class n extends Drawable {
    public final Paint a;
    public final Paint b;
    public final m c;
    public final m d;
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

    public n(int i10) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        m mVar = new m(this, 0);
        this.c = mVar;
        m mVar2 = new m(this, 1);
        this.d = mVar2;
        this.e = false;
        a3.d dVar = new a3.d(this, 12);
        wr wrVar = wr.h;
        this.f = new org.telegram.ui.Components.d6(dVar, 350L, wrVar, 0);
        this.g = new Path();
        this.i = 21.0f;
        this.h = i10;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        mVar.k(0.3f, 250L, wrVar);
        mVar.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        mVar.t(AndroidUtilities.dpf2(12.0f));
        mVar.b = 17;
        mVar2.k(0.3f, 250L, wrVar);
        mVar2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        mVar2.t(AndroidUtilities.dpf2(12.0f));
        mVar2.b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f7) {
        float dpf2 = AndroidUtilities.dpf2(this.i) / 2.0f;
        float e = this.f.e(this.e);
        if (e > 0.0f) {
            Paint paint = this.b;
            paint.setAlpha((int) (f7 * 255.0f * e));
            canvas.drawCircle(this.n, this.o, AndroidUtilities.dpf2(11.33f) * e, paint);
        }
        Paint paint2 = this.a;
        paint2.setAlpha((int) ((1.0f - e) * Color.alpha(this.l) * f7));
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
        m mVar = this.c;
        mVar.setBounds(rect);
        mVar.w = (int) (Color.alpha(this.l) * f7);
        mVar.draw(canvas);
        if (e > 0.0f) {
            Path path = this.g;
            path.rewind();
            path.addCircle(this.n, this.o + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * e, Path.Direction.CW);
            canvas.clipPath(path);
            m mVar2 = this.d;
            mVar2.setBounds(rect);
            mVar2.w = (int) (f7 * 255.0f);
            mVar2.draw(canvas);
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

    public final void c(float f7) {
        this.d.t(AndroidUtilities.dpf2(f7));
        this.c.t(AndroidUtilities.dpf2(f7));
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
