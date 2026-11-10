package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ik0 extends Drawable {
    public int a = org.telegram.messenger.qs.e4;
    public final /* synthetic */ r70 b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ org.telegram.ui.Cells.q1 d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ Bitmap f;
    public final /* synthetic */ RectF g;
    public final /* synthetic */ Paint h;
    public final /* synthetic */ Paint i;
    public final /* synthetic */ StaticLayout j;

    public ik0(r70 r70Var, int[] iArr, org.telegram.ui.Cells.q1 q1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.b = r70Var;
        this.c = iArr;
        this.d = q1Var;
        this.e = iArr2;
        this.f = bitmap;
        this.g = rectF;
        this.h = paint;
        this.i = paint2;
        this.j = staticLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.a <= 0) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = r70.w;
        rectF.left = f10 - (org.telegram.messenger.g0.L(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.a, 31);
        int[] iArr = this.c;
        canvas.translate(iArr[0], iArr[1]);
        r70 r70Var = this.b;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        if (q1Var == null || !q1Var.L0()) {
            canvas.drawPath(r70Var, this.i);
        } else {
            org.telegram.ui.ActionBar.u4 u4Var = q1Var.K6;
            if (u4Var == null || u4Var.c == null) {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], q1Var.getPaddingTop() + iArr2[1]);
                q1Var.M0(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - q1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            } else {
                canvas.save();
                q1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -q1Var.K6.r);
                canvas.drawPaint(q1Var.K6.c);
                canvas.restore();
            }
            Bitmap bitmap = this.f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        }
        canvas.clipPath(r70Var);
        this.j.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.a = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
