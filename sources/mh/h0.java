package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h0 extends Drawable {
    public final ImageView a;
    public final Paint b;
    public final RectF c;
    public final long d;
    public final Drawable e;
    public boolean f;
    public float g;
    public boolean h;
    public final y5 i;
    public final y5 j;
    public final y5 k;
    public mi0 l;

    public h0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new RectF();
        this.h = false;
        kh.f1 f1Var = new kh.f1(this, 23);
        gr grVar = gr.h;
        this.i = new y5(f1Var, 320L, grVar, 0);
        this.j = new y5(new kh.f1(this, 23), 320L, grVar, 0);
        this.k = new y5(new kh.f1(this, 23), 320L, grVar, 0);
        this.a = imageView;
        this.d = System.currentTimeMillis();
        this.e = context.getResources().getDrawable(R.drawable.search_files_filled).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        mi0 mi0Var;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float e10 = this.k.e(this.h);
        if (e10 < 1.0f) {
            float f12 = 1.0f - e10;
            float f13 = (0.4f * f12) + 0.6f;
            canvas2.save();
            float f14 = centerX;
            float f15 = centerY;
            canvas2.scale(f13, f13, f14, f15);
            Drawable drawable = this.e;
            drawable.setBounds(ll.x(2, centerX, drawable), ll.e(2, centerY, drawable), ll.B(2, centerX, drawable), ll.z(2, centerY, drawable));
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.draw(canvas2);
            float dp = AndroidUtilities.dp(14.0f);
            int l1 = f6.l1(0.2f * f12, -1);
            Paint paint = this.b;
            paint.setColor(l1);
            canvas2.drawCircle(f14, f15, dp, paint);
            float f16 = f12 * 1.0f;
            paint.setColor(f6.l1(f16, -1));
            float f17 = f14 - dp;
            f10 = 255.0f;
            float f18 = f15 - dp;
            float f19 = f14 + dp;
            float f20 = f15 + dp;
            RectF rectF = this.c;
            rectF.set(f17, f18, f19, f20);
            float e11 = this.i.e(this.f);
            paint.setColor(f6.l1((1.0f - e11) * f12 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.d;
            canvas2.drawArc(rectF, (-(((((currentTimeMillis - j10) % 600) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = ((System.currentTimeMillis() - j10) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            for (int i9 = 0; i9 < 4; i9++) {
                u1.a aVar = jp.h;
                aVar.getInterpolation((currentTimeMillis2 - (i9 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (r10 + 667)) / 667.0f) * 250.0f;
            }
            f11 = 0.0f;
            paint.setColor(f6.l1(f16, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.j.d(this.g, false)) * (-360.0f) * e11, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (e10 <= f11 || (mi0Var = this.l) == null) {
            return;
        }
        int i10 = mi0Var.b / 2;
        int i11 = mi0Var.c / 2;
        mi0Var.setBounds(centerX - i10, centerY - i11, i10 + centerX, i11 + centerY);
        this.l.setAlpha((int) (e10 * f10));
        this.l.draw(canvas2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(40.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(40.0f);
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
