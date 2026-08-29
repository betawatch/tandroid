package jh;

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
import org.telegram.ui.u10;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class v4 extends View {
    public float A;
    public final Camera B;
    public final u10 C;
    public final RectF D;
    public q4 a;
    public q4 b;
    public q4 c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public p4 s;
    public p4 v;
    public p4 w;
    public float x;
    public float y;

    public v4(Context context) {
        super(context);
        this.B = new Camera();
        this.C = new u10();
        this.D = new RectF();
    }

    public final void a(Canvas canvas, p4 p4Var, float f9, float f10, float f11, int[] iArr, int[] iArr2, int[] iArr3) {
        if (p4Var != null) {
            Matrix matrix = p4Var.d;
            Paint paint = p4Var.c;
            if (paint == null) {
                return;
            }
            float f12 = (f9 - 0.5f) / 1.5f;
            float clamp01 = Utilities.clamp01(1.0f - Math.abs(f12));
            float max = Math.max(0.8f * f10, AndroidUtilities.dp(180.0f));
            float f13 = (f10 / 2.0f) - ((f12 * max) * 1.8f);
            float min = Math.min(AndroidUtilities.dp(176.0f), f11) / 2.0f;
            float f14 = f13 - max;
            float f15 = f13 + max;
            canvas.saveLayerAlpha(f14, 0.0f, f15, f11, 255, 31);
            matrix.reset();
            matrix.postTranslate(f13, min);
            p4Var.e.setLocalMatrix(matrix);
            paint.setAlpha((int) (clamp01 * 255.0f));
            canvas.drawRect(f14, 0.0f, f15, f11, paint);
            canvas.save();
            float dp = AndroidUtilities.dp(90.0f);
            RectF rectF = this.D;
            rectF.set(f14, 0.0f, f14 + dp, f11);
            u10 u10Var = this.C;
            u10Var.b(canvas, rectF, 0, 1.0f);
            rectF.set(f15 - dp, 0.0f, f15, f11);
            u10Var.b(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            for (int i10 = 0; i10 < iArr.length; i10++) {
                float width = (getWidth() / (iArr.length - 1)) * i10;
                iArr[i10] = org.telegram.ui.ActionBar.g6.v(iArr[i10], org.telegram.ui.ActionBar.g6.l1(clamp01 * ((width < f14 || width > f15) ? 0.0f : Math.min(Utilities.clamp01((width - f14) / max), Utilities.clamp01(1.0f - ((width - (f15 - max)) / max)))), p4Var.g));
            }
            for (int i11 = 0; i11 < iArr2.length; i11++) {
                float width2 = (getWidth() / (iArr2.length - 1)) * i11;
                iArr2[i11] = org.telegram.ui.ActionBar.g6.v(iArr2[i11], org.telegram.ui.ActionBar.g6.l1(clamp01 * ((width2 < f14 || width2 > f15) ? 0.0f : Math.min(Utilities.clamp01((width2 - f14) / max), Utilities.clamp01(1.0f - ((width2 - (f15 - max)) / max)))), p4Var.f));
            }
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                float width3 = (getWidth() / (iArr2.length - 1)) * i12;
                iArr3[i12] = org.telegram.ui.ActionBar.g6.v(iArr3[i12], org.telegram.ui.ActionBar.g6.l1(clamp01 * ((width3 < f14 || width3 > f15) ? 0.0f : Math.min(Utilities.clamp01((width3 - f14) / max), Utilities.clamp01(1.0f - ((width3 - (f15 - max)) / max)))), p4Var.h));
            }
        }
    }

    public final void b(Canvas canvas, q4 q4Var, float f9, boolean z10) {
        if (q4Var == null) {
            return;
        }
        ImageReceiver imageReceiver = q4Var.d;
        float f10 = f9;
        if (z10) {
            f10 = Math.max(0.5f, f10);
        }
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageWidth = imageReceiver.getImageWidth();
        float imageHeight = imageReceiver.getImageHeight();
        float alpha = imageReceiver.getAlpha();
        float f11 = (f10 - 0.5f) / 1.5f;
        float clamp01 = Utilities.clamp01(1.0f - Math.abs(f11));
        float width = (getWidth() / 2.0f) - (AndroidUtilities.dp(220.0f) * f11);
        float dp = AndroidUtilities.dp(80.0f);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, clamp01);
        float dp2 = AndroidUtilities.dp(160.0f);
        canvas.save();
        float f12 = ((dp2 / 2.0f) * f11) + width;
        canvas.translate(f12, dp);
        Camera camera = this.B;
        camera.save();
        camera.rotateY(f11 * (-30.0f));
        camera.applyToCanvas(canvas);
        camera.restore();
        canvas.translate(-f12, -dp);
        float f13 = dp2 * lerp;
        float f14 = f13 / 2.0f;
        imageReceiver.setImageCoords(width - f14, dp - f14, f13, f13);
        imageReceiver.setAlpha(clamp01);
        imageReceiver.draw(canvas);
        imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
        imageReceiver.setAlpha(alpha);
        canvas.restore();
    }

    public final void c() {
        boolean z10 = (this.a == null && this.b == null && this.c == null && this.s == null && this.v == null && this.w == null) ? false : true;
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
        this.A = 0.0f;
        this.y = 0.0f;
        this.x = 0.0f;
        if (z10) {
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
