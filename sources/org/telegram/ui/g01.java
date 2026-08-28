package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g01 extends Drawable implements org.telegram.ui.ActionBar.g5 {
    public final org.telegram.ui.Components.i6 a;
    public final Paint b;
    public int c;
    public float d;
    public float e;
    public final org.telegram.ui.Cells.l0 f;
    public org.telegram.ui.Cells.w0 h;

    public g01(String str) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.d = 1.0f;
        this.e = 1.0f;
        this.f = new org.telegram.ui.Cells.l0(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.a = i6Var;
        i6Var.setCallback(new mr(1, this));
        i6Var.q(str, true, true);
        i6Var.t(AndroidUtilities.dp(11.0f));
        i6Var.b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i9) {
        Paint paint = this.b;
        if (paint.getColor() != i9) {
            paint.setColor(i9);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10 = this.d * this.e;
        if (f10 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        canvas.save();
        float a2 = this.f.a(0.1f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Paint paint = this.b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        paint.setAlpha(alpha);
        int i9 = this.c;
        org.telegram.ui.Components.i6 i6Var = this.a;
        i6Var.r(i9);
        i6Var.w = (int) (f10 * 255.0f);
        i6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        i6Var.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return (int) (this.d * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(17.33f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.a.d + AndroidUtilities.dp(11.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.d = i9 / 255.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
