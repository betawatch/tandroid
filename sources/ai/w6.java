package ai;

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
import org.telegram.ui.w10;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class w6 extends View {
    public float E;
    public final Camera F;
    public final w10 G;
    public final RectF H;
    public r6 a;
    public r6 b;
    public r6 c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public q6 s;
    public q6 v;
    public q6 w;
    public float x;
    public float y;

    public w6(Context context) {
        super(context);
        this.F = new Camera();
        this.G = new w10();
        this.H = new RectF();
    }

    public final void a(Canvas canvas, q6 q6Var, float f7, float f10, float f11, int[] iArr, int[] iArr2, int[] iArr3) {
        if (q6Var != null) {
            Matrix matrix = q6Var.d;
            Paint paint = q6Var.c;
            if (paint == null) {
                return;
            }
            float f12 = (f7 - 0.5f) / 1.5f;
            float clamp01 = Utilities.clamp01(1.0f - Math.abs(f12));
            float max = Math.max(0.8f * f10, AndroidUtilities.dp(180.0f));
            float x10 = org.telegram.ui.Cells.b1.x(f12, max, 1.8f, f10 / 2.0f);
            float min = Math.min(AndroidUtilities.dp(176.0f), f11) / 2.0f;
            float f13 = x10 - max;
            float f14 = x10 + max;
            canvas.saveLayerAlpha(f13, 0.0f, f14, f11, 255, 31);
            matrix.reset();
            matrix.postTranslate(x10, min);
            q6Var.e.setLocalMatrix(matrix);
            paint.setAlpha((int) (clamp01 * 255.0f));
            canvas.drawRect(f13, 0.0f, f14, f11, paint);
            canvas.save();
            float dp = AndroidUtilities.dp(90.0f);
            RectF rectF = this.H;
            rectF.set(f13, 0.0f, f13 + dp, f11);
            w10 w10Var = this.G;
            w10Var.b(canvas, rectF, 0, 1.0f);
            rectF.set(f14 - dp, 0.0f, f14, f11);
            w10Var.b(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            for (int i10 = 0; i10 < iArr.length; i10++) {
                float width = (getWidth() / (iArr.length - 1)) * i10;
                iArr[i10] = org.telegram.ui.ActionBar.k6.v(iArr[i10], org.telegram.ui.ActionBar.k6.o1(clamp01 * ((width < f13 || width > f14) ? 0.0f : Math.min(Utilities.clamp01((width - f13) / max), Utilities.clamp01(1.0f - ((width - (f14 - max)) / max)))), q6Var.g));
            }
            for (int i11 = 0; i11 < iArr2.length; i11++) {
                float width2 = (getWidth() / (iArr2.length - 1)) * i11;
                iArr2[i11] = org.telegram.ui.ActionBar.k6.v(iArr2[i11], org.telegram.ui.ActionBar.k6.o1(clamp01 * ((width2 < f13 || width2 > f14) ? 0.0f : Math.min(Utilities.clamp01((width2 - f13) / max), Utilities.clamp01(1.0f - ((width2 - (f14 - max)) / max)))), q6Var.f));
            }
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                float width3 = (getWidth() / (iArr2.length - 1)) * i12;
                iArr3[i12] = org.telegram.ui.ActionBar.k6.v(iArr3[i12], org.telegram.ui.ActionBar.k6.o1(clamp01 * ((width3 < f13 || width3 > f14) ? 0.0f : Math.min(Utilities.clamp01((width3 - f13) / max), Utilities.clamp01(1.0f - ((width3 - (f14 - max)) / max)))), q6Var.h));
            }
        }
    }

    public final void b(Canvas canvas, r6 r6Var, float f7, boolean z10) {
        if (r6Var == null) {
            return;
        }
        ImageReceiver imageReceiver = r6Var.d;
        float f10 = f7;
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
        Camera camera = this.F;
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
        this.E = 0.0f;
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
