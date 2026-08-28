package gh;

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
import org.telegram.ui.s10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y4 extends View {
    public float A;
    public final Camera B;
    public final s10 C;
    public final RectF D;
    public t4 a;
    public t4 b;
    public t4 c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public s4 s;
    public s4 v;
    public s4 w;
    public float x;
    public float y;

    public y4(Context context) {
        super(context);
        this.B = new Camera();
        this.C = new s10();
        this.D = new RectF();
    }

    public final void a(Canvas canvas, s4 s4Var, float f10, float f11, float f12, int[] iArr, int[] iArr2, int[] iArr3) {
        if (s4Var != null) {
            Matrix matrix = s4Var.d;
            Paint paint = s4Var.c;
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
            s4Var.e.setLocalMatrix(matrix);
            paint.setAlpha((int) (clamp01 * 255.0f));
            canvas.drawRect(f15, 0.0f, f16, f12, paint);
            canvas.save();
            float dp = AndroidUtilities.dp(90.0f);
            RectF rectF = this.D;
            rectF.set(f15, 0.0f, f15 + dp, f12);
            s10 s10Var = this.C;
            s10Var.b(canvas, rectF, 0, 1.0f);
            rectF.set(f16 - dp, 0.0f, f16, f12);
            s10Var.b(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            for (int i9 = 0; i9 < iArr.length; i9++) {
                float width = (getWidth() / (iArr.length - 1)) * i9;
                iArr[i9] = org.telegram.ui.ActionBar.f6.v(iArr[i9], org.telegram.ui.ActionBar.f6.l1(clamp01 * ((width < f15 || width > f16) ? 0.0f : Math.min(Utilities.clamp01((width - f15) / max), Utilities.clamp01(1.0f - ((width - (f16 - max)) / max)))), s4Var.g));
            }
            for (int i10 = 0; i10 < iArr2.length; i10++) {
                float width2 = (getWidth() / (iArr2.length - 1)) * i10;
                iArr2[i10] = org.telegram.ui.ActionBar.f6.v(iArr2[i10], org.telegram.ui.ActionBar.f6.l1(clamp01 * ((width2 < f15 || width2 > f16) ? 0.0f : Math.min(Utilities.clamp01((width2 - f15) / max), Utilities.clamp01(1.0f - ((width2 - (f16 - max)) / max)))), s4Var.f));
            }
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                float width3 = (getWidth() / (iArr2.length - 1)) * i11;
                iArr3[i11] = org.telegram.ui.ActionBar.f6.v(iArr3[i11], org.telegram.ui.ActionBar.f6.l1(clamp01 * ((width3 < f15 || width3 > f16) ? 0.0f : Math.min(Utilities.clamp01((width3 - f15) / max), Utilities.clamp01(1.0f - ((width3 - (f16 - max)) / max)))), s4Var.h));
            }
        }
    }

    public final void b(Canvas canvas, t4 t4Var, float f10, boolean z10) {
        if (t4Var == null) {
            return;
        }
        ImageReceiver imageReceiver = t4Var.d;
        float f11 = f10;
        if (z10) {
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
        Camera camera = this.B;
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
