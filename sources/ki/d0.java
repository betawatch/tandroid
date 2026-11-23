package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.up;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class d0 extends Drawable {
    public final ImageView a;
    public final Paint b;
    public final RectF c;
    public final long d;
    public final Drawable e;
    public boolean f;
    public float g;
    public boolean h;
    public final d6 i;
    public final d6 j;
    public final d6 k;
    public oh0 l;

    public d0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new RectF();
        this.h = false;
        kg.i0 i0Var = new kg.i0(this, 7);
        nr nrVar = nr.h;
        this.i = new d6(i0Var, 320L, nrVar, 0);
        this.j = new d6(new kg.i0(this, 7), 320L, nrVar, 0);
        this.k = new d6(new kg.i0(this, 7), 320L, nrVar, 0);
        this.a = imageView;
        this.d = System.currentTimeMillis();
        this.e = i5.c.g(context, R.drawable.search_files_filled);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        oh0 oh0Var;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float d = this.k.d(this.h);
        float f12 = 0.0f;
        char c10 = 2;
        if (d < 1.0f) {
            float f13 = 1.0f - d;
            float f14 = (0.4f * f13) + 0.6f;
            canvas2.save();
            float f15 = centerX;
            float f16 = centerY;
            canvas2.scale(f14, f14, f15, f16);
            Drawable drawable = this.e;
            drawable.setBounds(org.telegram.ui.Cells.c0.C(2, centerX, drawable), org.telegram.ui.Cells.c0.A(2, centerY, drawable), org.telegram.ui.Cells.c0.y(2, centerX, drawable), org.telegram.ui.Cells.c0.j(2, centerY, drawable));
            drawable.setAlpha((int) (f13 * 255.0f));
            drawable.draw(canvas2);
            float L = org.telegram.messenger.g0.L(14.0f);
            int r12 = m6.r1(0.2f * f13, -1);
            Paint paint = this.b;
            paint.setColor(r12);
            canvas2.drawCircle(f15, f16, L, paint);
            float f17 = f13 * 1.0f;
            paint.setColor(m6.r1(f17, -1));
            float f18 = f15 - L;
            f11 = 255.0f;
            float f19 = f16 - L;
            float f20 = f15 + L;
            float f21 = f16 + L;
            RectF rectF = this.c;
            rectF.set(f18, f19, f20, f21);
            float d2 = this.i.d(this.f);
            paint.setColor(m6.r1((1.0f - d2) * f13 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.d;
            canvas2.drawArc(rectF, (-(((((currentTimeMillis - j3) % 600) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = ((System.currentTimeMillis() - j3) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            int i7 = 0;
            while (i7 < 4) {
                x1.a aVar = up.h;
                float f22 = f12;
                aVar.getInterpolation((currentTimeMillis2 - (i7 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (r10 + 667)) / 667.0f) * 250.0f;
                i7++;
                f12 = f22;
                c10 = c10;
            }
            f10 = f12;
            paint.setColor(m6.r1(f17, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.j.e(false, this.g)) * (-360.0f) * d2, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f10 = 0.0f;
            f11 = 255.0f;
        }
        if (d <= f10 || (oh0Var = this.l) == null) {
            return;
        }
        int i10 = oh0Var.b / 2;
        int i11 = oh0Var.c / 2;
        oh0Var.setBounds(centerX - i10, centerY - i11, i10 + centerX, i11 + centerY);
        this.l.setAlpha((int) (d * f11));
        this.l.draw(canvas2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(40.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(40.0f);
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
