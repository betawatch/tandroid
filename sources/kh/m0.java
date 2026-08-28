package kh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class m0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final /* synthetic */ n0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, Context context) {
        super(context);
        this.d = n0Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        boolean z10 = getContext() instanceof BubbleActivity;
        h0 h0Var = this.d.h;
        return ((getHeight() - (h0Var.A + (!z10 ? AndroidUtilities.statusBarHeight : 0))) - h0Var.y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int currentWidth;
        int currentHeight;
        boolean z10;
        MediaController.CropState cropState;
        float f10;
        float f11;
        n0 n0Var = this.d;
        h0 h0Var = n0Var.h;
        int[] iArr = n0Var.x;
        r6 r6Var = n0Var.a;
        if (n0Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (n0Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (n0Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            float width = r6Var.getWidth();
            float height = r6Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            int[] iArr2 = n0Var.w;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, n0Var.s, rectF);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, n0Var.s);
            path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f12 = n0Var.s;
        float f13 = 1.0f - f12;
        int[] iArr3 = n0Var.v;
        canvas.translate((-iArr3[0]) * f13, (-iArr3[1]) * f13);
        if (f13 > 0.0f) {
            if (n0Var.A) {
                n0Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f13, iArr[1] * f13);
            MediaController.CropState cropState2 = n0Var.b.C0;
            if (cropState2 != null) {
                f11 = cropState2.cropPw;
                f10 = cropState2.cropPh;
            } else {
                f10 = 1.0f;
                f11 = 1.0f;
            }
            float lerp2 = AndroidUtilities.lerp(1.0f, (n0Var.b.getScaleX() * (r9.getWidth() / f11)) / r6Var.getWidth(), f13);
            canvas.scale(lerp2, lerp2);
            canvas.rotate(n0Var.b.getRotation() * f13);
            canvas.translate(((n0Var.b.getContentWidth() * f11) / 2.0f) * f13, ((n0Var.b.getContentHeight() * f10) / 2.0f) * f13);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + AndroidUtilities.dp(16.0f)) * f12, (((getContainerHeight() + AndroidUtilities.dp(32.0f)) / 2.0f) + h0Var.A + (!(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0)) * f12);
        if (f13 > 0.0f) {
            float contentWidth = n0Var.b.getContentWidth();
            float contentHeight = n0Var.b.getContentHeight();
            MediaController.CropState cropState3 = n0Var.b.C0;
            float f14 = cropState3 != null ? cropState3.cropPw : 1.0f;
            float f15 = cropState3 != null ? cropState3.cropPh : 1.0f;
            float lerp3 = (AndroidUtilities.lerp(1.0f, f14, f13) * contentWidth) / 2.0f;
            float lerp4 = (AndroidUtilities.lerp(1.0f, f15, f13) * contentHeight) / 2.0f;
            float lerp5 = AndroidUtilities.lerp(1.0f, 4.0f, f12);
            canvas.clipRect((-lerp3) * lerp5, (-lerp4) * lerp5, lerp3 * lerp5, lerp4 * lerp5);
        }
        currentWidth = n0Var.getCurrentWidth();
        tf.f fVar = n0Var.y;
        currentHeight = n0Var.getCurrentHeight();
        int i9 = fVar.i;
        if (i9 == 90 || i9 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z11 = e2.c.z(fVar.l, 1.0f, f13, 1.0f);
        float f16 = currentWidth;
        float containerWidth = getContainerWidth() / f16;
        float f17 = currentHeight;
        if (containerWidth * f17 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f17;
        }
        canvas.translate(fVar.d * 1.0f, fVar.e * 1.0f);
        float f18 = (fVar.f / z11) * containerWidth;
        yf.x1 x1Var = n0Var.b;
        float lerp6 = (x1Var == null || (cropState = x1Var.C0) == null) ? AndroidUtilities.lerp(1.0f, f18, f12) : AndroidUtilities.lerp(cropState.cropScale, f18, f12);
        canvas.scale(lerp6, lerp6);
        canvas.translate(fVar.b * f16 * 1.0f, fVar.c * f17 * 1.0f);
        float d = n0Var.d.d(i9, false) + n0Var.b.getOrientation() + fVar.g;
        MediaController.CropState cropState4 = n0Var.b.C0;
        canvas.rotate(cropState4 == null ? AndroidUtilities.lerp(0.0f, d, n0Var.s) : AndroidUtilities.lerp(cropState4.cropRotate + cropState4.transformRotation, d, n0Var.s));
        canvas.rotate(n0Var.b.getOrientation());
        org.telegram.ui.Components.y5 y5Var = n0Var.c;
        if (n0Var.A) {
            MediaController.CropState cropState5 = n0Var.b.C0;
            if (cropState5 != null && cropState5.mirrored) {
                z10 = true;
            }
            z10 = false;
        } else {
            tf.l lVar = h0Var.H;
            if (lVar != null) {
                z10 = lVar.j;
            }
            z10 = false;
        }
        canvas.scale(AndroidUtilities.lerp(1.0f, -1.0f, y5Var.e(z10)), 1.0f);
        canvas.translate((-n0Var.b.getContentWidth()) / 2.0f, (-n0Var.b.getContentHeight()) / 2.0f);
        yf.x1 x1Var2 = n0Var.b;
        Paint paint2 = x1Var2.B0;
        Bitmap bitmap = x1Var2.w0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
