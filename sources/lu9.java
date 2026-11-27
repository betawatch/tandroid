// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class lu9 extends Drawable {
    public int a = jn7.d4;
    public final /* synthetic */ f66 b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ wb2 d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ Bitmap f;
    public final /* synthetic */ RectF g;
    public final /* synthetic */ Paint h;
    public final /* synthetic */ Paint i;
    public final /* synthetic */ StaticLayout j;

    public lu9(f66 f66Var, int[] iArr, wb2 wb2Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.b = f66Var;
        this.c = iArr;
        this.d = wb2Var;
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
        RectF rectF = hl.P;
        rectF.set(getBounds());
        float f = rectF.left;
        CornerPathEffect cornerPathEffect = f66.w;
        rectF.left = f - (hl.L(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.a, 31);
        int[] iArr = this.c;
        canvas.translate(iArr[0], iArr[1]);
        f66 f66Var = this.b;
        wb2 wb2Var = this.d;
        if (wb2Var == null || !wb2Var.L0()) {
            canvas.drawPath(f66Var, this.i);
        } else {
            t37 t37Var = wb2Var.L6;
            if (t37Var == null || t37Var.c == null) {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], wb2Var.getPaddingTop() + iArr2[1]);
                wb2Var.M0(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - wb2Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            } else {
                canvas.save();
                wb2Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -wb2Var.L6.r);
                canvas.drawPaint(wb2Var.L6.c);
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
        canvas.clipPath(f66Var);
        this.j.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
