package mh;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.h20;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class u4 extends View {
    public float B;
    public final Camera C;
    public final h20 D;
    public final RectF E;
    public p4 a;
    public p4 b;
    public p4 c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public o4 s;
    public o4 v;
    public o4 w;
    public float x;
    public float y;

    public u4(Context context) {
        super(context);
        this.C = new Camera();
        this.D = new h20();
        this.E = new RectF();
    }

    public final void a(Canvas canvas, o4 o4Var, float f10, float f11, float f12, int[] iArr, int[] iArr2, int[] iArr3) {
        if (o4Var != null) {
            Matrix matrix = o4Var.d;
            Paint paint = o4Var.c;
            if (paint == null) {
                return;
            }
            float f13 = (f10 - 0.5f) / 1.5f;
            float clamp01 = Utilities.clamp01(1.0f - Math.abs(f13));
            float max = Math.max(0.8f * f11, AndroidUtilities.dp(180.0f));
            float f14 = (f11 / 2.0f) - ((f13 * max) * 1.8f);
            float min = Math.min(AndroidUtilities.dp(176.0f), f12) / 2.0f;
            float f15 = f14 - max;
            float f16 = f14 + max;
            canvas.saveLayerAlpha(f15, 0.0f, f16, f12, 255, 31);
            matrix.reset();
            matrix.postTranslate(f14, min);
            o4Var.e.setLocalMatrix(matrix);
            paint.setAlpha((int) (clamp01 * 255.0f));
            canvas.drawRect(f15, 0.0f, f16, f12, paint);
            canvas.save();
            float dp = AndroidUtilities.dp(90.0f);
            RectF rectF = this.E;
            rectF.set(f15, 0.0f, f15 + dp, f12);
            h20 h20Var = this.D;
            h20Var.b(canvas, rectF, 0, 1.0f);
            rectF.set(f16 - dp, 0.0f, f16, f12);
            h20Var.b(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            for (int i10 = 0; i10 < iArr.length; i10++) {
                float width = (getWidth() / (iArr.length - 1)) * i10;
                iArr[i10] = org.telegram.ui.ActionBar.k6.v(iArr[i10], org.telegram.ui.ActionBar.k6.l1(clamp01 * ((width < f15 || width > f16) ? 0.0f : Math.min(Utilities.clamp01((width - f15) / max), Utilities.clamp01(1.0f - ((width - (f16 - max)) / max)))), o4Var.g));
            }
            for (int i11 = 0; i11 < iArr2.length; i11++) {
                float width2 = (getWidth() / (iArr2.length - 1)) * i11;
                iArr2[i11] = org.telegram.ui.ActionBar.k6.v(iArr2[i11], org.telegram.ui.ActionBar.k6.l1(clamp01 * ((width2 < f15 || width2 > f16) ? 0.0f : Math.min(Utilities.clamp01((width2 - f15) / max), Utilities.clamp01(1.0f - ((width2 - (f16 - max)) / max)))), o4Var.f));
            }
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                float width3 = (getWidth() / (iArr2.length - 1)) * i12;
                iArr3[i12] = org.telegram.ui.ActionBar.k6.v(iArr3[i12], org.telegram.ui.ActionBar.k6.l1(clamp01 * ((width3 < f15 || width3 > f16) ? 0.0f : Math.min(Utilities.clamp01((width3 - f15) / max), Utilities.clamp01(1.0f - ((width3 - (f16 - max)) / max)))), o4Var.h));
            }
        }
    }

    public final void b(Canvas canvas, p4 p4Var, float f10, boolean z4) {
        if (p4Var == null) {
            return;
        }
        ImageReceiver imageReceiver = p4Var.d;
        float f11 = f10;
        if (z4) {
            f11 = Math.max(0.5f, f11);
        }
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageWidth = imageReceiver.getImageWidth();
        float imageHeight = imageReceiver.getImageHeight();
        float alpha = imageReceiver.getAlpha();
        float f12 = (f11 - 0.5f) / 1.5f;
        float clamp01 = Utilities.clamp01(1.0f - Math.abs(f12));
        float width = (getWidth() / 2.0f) - (AndroidUtilities.dp(220.0f) * f12);
        float dp = AndroidUtilities.dp(80.0f);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, clamp01);
        float dp2 = AndroidUtilities.dp(160.0f);
        canvas.save();
        float f13 = ((dp2 / 2.0f) * f12) + width;
        canvas.translate(f13, dp);
        Camera camera = this.C;
        camera.save();
        camera.rotateY(f12 * (-30.0f));
        camera.applyToCanvas(canvas);
        camera.restore();
        canvas.translate(-f13, -dp);
        float f14 = dp2 * lerp;
        float f15 = f14 / 2.0f;
        imageReceiver.setImageCoords(width - f15, dp - f15, f14, f14);
        imageReceiver.setAlpha(clamp01);
        imageReceiver.draw(canvas);
        imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
        imageReceiver.setAlpha(alpha);
        canvas.restore();
    }

    public final void c() {
        boolean z4 = (this.a == null && this.b == null && this.c == null && this.s == null && this.v == null && this.w == null) ? false : true;
        this.c = null;
        this.b = null;
        this.a = null;
        this.f = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.r = false;
        this.n = false;
        this.h = false;
        this.w = null;
        this.v = null;
        this.s = null;
        this.B = 0.0f;
        this.y = 0.0f;
        this.x = 0.0f;
        if (z4) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b(canvas, this.a, this.d, this.h);
        b(canvas, this.b, this.e, this.n);
        b(canvas, this.c, this.f, this.r);
    }
}
