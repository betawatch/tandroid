package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class dm0 extends mw0 {
    public float d;
    public final Paint f;
    public boolean a = false;
    public long b = 0;
    public boolean c = false;
    public int e = 1;

    public dm0(boolean z4) {
        if (z4) {
            this.f = new Paint(1);
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public final void b(int i10) {
        Paint paint = this.f;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public final void c(boolean z4) {
        this.a = z4;
    }

    @Override // org.telegram.ui.Components.mw0
    public final void d() {
        this.b = System.currentTimeMillis();
        this.c = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.c2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.a ? 8.0f : 9.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.b;
            this.b = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f10 = this.d;
            int i10 = this.e;
            float f11 = ((i10 * j10) / 400.0f) + f10;
            this.d = f11;
            if (i10 > 0 && f11 >= 1.0f) {
                this.e = -1;
                this.d = 1.0f;
            } else if (i10 < 0 && f11 <= 0.0f) {
                this.e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public final void e() {
        this.c = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(10.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
