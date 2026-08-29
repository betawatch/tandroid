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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bi0 extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public final Paint c;
    public final RectF d;
    public int e;
    public long f;
    public float g;
    public boolean h;
    public boolean i;

    public bi0(Context context) {
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
        drawable.setBounds(org.telegram.ui.b.v(2, bounds.centerX(), drawable), org.telegram.ui.b.f(2, bounds.centerY(), drawable), org.telegram.ui.b.A(2, bounds.centerX(), drawable), org.telegram.ui.b.y(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        this.i = z10;
        this.h = z11;
        this.f = SystemClock.elapsedRealtime();
        if (!z12) {
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
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f;
        this.f = elapsedRealtime;
        boolean z11 = this.i;
        Drawable drawable = this.a;
        if (!z11) {
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
            z10 = this.h;
            if (z10) {
                float f9 = this.g;
                if (f9 != 1.0f) {
                    float f10 = (j10 / 300.0f) + f9;
                    this.g = f10;
                    if (f10 > 1.0f) {
                        this.g = 1.0f;
                    }
                    invalidateSelf();
                    return;
                }
            }
            if (z10) {
                float f11 = this.g;
                if (f11 != 0.0f) {
                    float f12 = f11 - (j10 / 300.0f);
                    this.g = f12;
                    if (f12 < 0.0f) {
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
        z10 = this.h;
        if (z10) {
        }
        if (z10) {
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
