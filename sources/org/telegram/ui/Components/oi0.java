package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class oi0 extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public final Paint c;
    public final RectF d;
    public int e;
    public long f;
    public float g;
    public boolean h;
    public boolean i;

    public oi0(Context context) {
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new RectF();
        this.e = 0;
        this.a = context.getResources().getDrawable(R.drawable.outline_shield_plain_24).mutate();
        this.b = context.getResources().getDrawable(R.drawable.outline_shield_check).mutate();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.ui.b.u(2, bounds.centerX(), drawable), org.telegram.ui.b.f(2, bounds.centerY(), drawable), org.telegram.ui.b.A(2, bounds.centerX(), drawable), org.telegram.ui.b.y(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z4, boolean z10, boolean z11) {
        this.i = z4;
        this.h = z10;
        this.f = SystemClock.elapsedRealtime();
        if (!z11) {
            this.g = this.h ? 1.0f : 0.0f;
        }
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        boolean z4;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f;
        this.f = elapsedRealtime;
        boolean z10 = this.i;
        Drawable drawable = this.a;
        if (!z10) {
            a(drawable);
            drawable.draw(canvas);
        } else if (!this.h || this.g != 1.0f) {
            a(drawable);
            drawable.draw(canvas);
            int i10 = (int) ((1.0f - this.g) * 255.0f);
            Paint paint = this.c;
            paint.setAlpha(i10);
            this.e += (int) ((360 * j10) / 1000.0f);
            int width = getBounds().width();
            int height = getBounds().height();
            int dp = AndroidUtilities.dp(4.0f);
            RectF rectF = this.d;
            rectF.set((width / 2) - dp, (height / 2) - dp, r0 + dp + dp, r4 + dp + dp);
            canvas2 = canvas;
            canvas2.drawArc(rectF, this.e - 90, 90.0f, false, paint);
            invalidateSelf();
            if (this.i && (this.h || this.g != 0.0f)) {
                int i11 = (int) (this.g * 255.0f);
                Drawable drawable2 = this.b;
                drawable2.setAlpha(i11);
                a(drawable2);
                drawable2.draw(canvas2);
            }
            z4 = this.h;
            if (z4) {
                float f10 = this.g;
                if (f10 != 1.0f) {
                    float f11 = (j10 / 300.0f) + f10;
                    this.g = f11;
                    if (f11 > 1.0f) {
                        this.g = 1.0f;
                    }
                    invalidateSelf();
                    return;
                }
            }
            if (z4) {
                float f12 = this.g;
                if (f12 != 0.0f) {
                    float f13 = f12 - (j10 / 300.0f);
                    this.g = f13;
                    if (f13 < 0.0f) {
                        this.g = 0.0f;
                    }
                    invalidateSelf();
                    return;
                }
                return;
            }
            return;
        }
        canvas2 = canvas;
        if (this.i) {
            int i112 = (int) (this.g * 255.0f);
            Drawable drawable22 = this.b;
            drawable22.setAlpha(i112);
            a(drawable22);
            drawable22.draw(canvas2);
        }
        z4 = this.h;
        if (z4) {
        }
        if (z4) {
        }
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
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }
}
