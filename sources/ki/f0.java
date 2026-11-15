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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.u5;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class f0 extends Drawable {
    public final ImageView a;
    public final Paint b;
    public final RectF c;
    public final long d;
    public final Drawable e;
    public boolean f;
    public float g;
    public boolean h;
    public final u5 i;
    public final u5 j;
    public final u5 k;
    public ch0 l;

    public f0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new RectF();
        this.h = false;
        kg.j1 j1Var = new kg.j1(this, 3);
        er erVar = er.h;
        this.i = new u5(j1Var, 320L, erVar, 0);
        this.j = new u5(new kg.j1(this, 3), 320L, erVar, 0);
        this.k = new u5(new kg.j1(this, 3), 320L, erVar, 0);
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
        ch0 ch0Var;
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
            drawable.setBounds(org.telegram.ui.Cells.y0.A(2, centerX, drawable), org.telegram.ui.Cells.y0.y(2, centerY, drawable), org.telegram.ui.Cells.y0.w(2, centerX, drawable), org.telegram.ui.Cells.y0.h(2, centerY, drawable));
            drawable.setAlpha((int) (f13 * 255.0f));
            drawable.draw(canvas2);
            float L = org.telegram.messenger.g0.L(14.0f);
            int r12 = j6.r1(0.2f * f13, -1);
            Paint paint = this.b;
            paint.setColor(r12);
            canvas2.drawCircle(f15, f16, L, paint);
            float f17 = f13 * 1.0f;
            paint.setColor(j6.r1(f17, -1));
            float f18 = f15 - L;
            f11 = 255.0f;
            float f19 = f16 - L;
            float f20 = f15 + L;
            float f21 = f16 + L;
            RectF rectF = this.c;
            rectF.set(f18, f19, f20, f21);
            float d2 = this.i.d(this.f);
            paint.setColor(j6.r1((1.0f - d2) * f13 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.d;
            canvas2.drawArc(rectF, (-(((((currentTimeMillis - j3) % 600) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = ((System.currentTimeMillis() - j3) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            int i7 = 0;
            while (i7 < 4) {
                x1.a aVar = lp.h;
                float f22 = f12;
                aVar.getInterpolation((currentTimeMillis2 - (i7 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (r10 + 667)) / 667.0f) * 250.0f;
                i7++;
                f12 = f22;
                c10 = c10;
            }
            f10 = f12;
            paint.setColor(j6.r1(f17, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.j.e(false, this.g)) * (-360.0f) * d2, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f10 = 0.0f;
            f11 = 255.0f;
        }
        if (d <= f10 || (ch0Var = this.l) == null) {
            return;
        }
        int i10 = ch0Var.b / 2;
        int i11 = ch0Var.c / 2;
        ch0Var.setBounds(centerX - i10, centerY - i11, i10 + centerX, i11 + centerY);
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
