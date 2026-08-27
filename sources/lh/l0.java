package lh;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class l0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final /* synthetic */ m0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, Context context) {
        super(context);
        this.d = m0Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        boolean z10 = getContext() instanceof BubbleActivity;
        g0 g0Var = this.d.h;
        return ((getHeight() - (g0Var.A + (!z10 ? AndroidUtilities.statusBarHeight : 0))) - g0Var.y) - AndroidUtilities.dp(32.0f);
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
        m0 m0Var = this.d;
        g0 g0Var = m0Var.h;
        int[] iArr = m0Var.x;
        q6 q6Var = m0Var.a;
        if (m0Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (m0Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (m0Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            float width = q6Var.getWidth();
            float height = q6Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            int[] iArr2 = m0Var.w;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, m0Var.s, rectF);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, m0Var.s);
            path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f12 = m0Var.s;
        float f13 = 1.0f - f12;
        int[] iArr3 = m0Var.v;
        canvas.translate((-iArr3[0]) * f13, (-iArr3[1]) * f13);
        if (f13 > 0.0f) {
            if (m0Var.A) {
                m0Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f13, iArr[1] * f13);
            MediaController.CropState cropState2 = m0Var.b.C0;
            if (cropState2 != null) {
                f11 = cropState2.cropPw;
                f10 = cropState2.cropPh;
            } else {
                f10 = 1.0f;
                f11 = 1.0f;
            }
            float lerp2 = AndroidUtilities.lerp(1.0f, (m0Var.b.getScaleX() * (r9.getWidth() / f11)) / q6Var.getWidth(), f13);
            canvas.scale(lerp2, lerp2);
            canvas.rotate(m0Var.b.getRotation() * f13);
            canvas.translate(((m0Var.b.getContentWidth() * f11) / 2.0f) * f13, ((m0Var.b.getContentHeight() * f10) / 2.0f) * f13);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + AndroidUtilities.dp(16.0f)) * f12, (((getContainerHeight() + AndroidUtilities.dp(32.0f)) / 2.0f) + g0Var.A + (!(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0)) * f12);
        if (f13 > 0.0f) {
            float contentWidth = m0Var.b.getContentWidth();
            float contentHeight = m0Var.b.getContentHeight();
            MediaController.CropState cropState3 = m0Var.b.C0;
            float f14 = cropState3 != null ? cropState3.cropPw : 1.0f;
            float f15 = cropState3 != null ? cropState3.cropPh : 1.0f;
            float lerp3 = (AndroidUtilities.lerp(1.0f, f14, f13) * contentWidth) / 2.0f;
            float lerp4 = (AndroidUtilities.lerp(1.0f, f15, f13) * contentHeight) / 2.0f;
            float lerp5 = AndroidUtilities.lerp(1.0f, 4.0f, f12);
            canvas.clipRect((-lerp3) * lerp5, (-lerp4) * lerp5, lerp3 * lerp5, lerp4 * lerp5);
        }
        currentWidth = m0Var.getCurrentWidth();
        uf.f fVar = m0Var.y;
        currentHeight = m0Var.getCurrentHeight();
        int i10 = fVar.i;
        if (i10 == 90 || i10 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z11 = com.google.android.recaptcha.internal.a.z(fVar.l, 1.0f, f13, 1.0f);
        float f16 = currentWidth;
        float containerWidth = getContainerWidth() / f16;
        float f17 = currentHeight;
        if (containerWidth * f17 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f17;
        }
        canvas.translate(fVar.d * 1.0f, fVar.e * 1.0f);
        float f18 = (fVar.f / z11) * containerWidth;
        zf.x1 x1Var = m0Var.b;
        float lerp6 = (x1Var == null || (cropState = x1Var.C0) == null) ? AndroidUtilities.lerp(1.0f, f18, f12) : AndroidUtilities.lerp(cropState.cropScale, f18, f12);
        canvas.scale(lerp6, lerp6);
        canvas.translate(fVar.b * f16 * 1.0f, fVar.c * f17 * 1.0f);
        float d = m0Var.d.d(i10, false) + m0Var.b.getOrientation() + fVar.g;
        MediaController.CropState cropState4 = m0Var.b.C0;
        canvas.rotate(cropState4 == null ? AndroidUtilities.lerp(0.0f, d, m0Var.s) : AndroidUtilities.lerp(cropState4.cropRotate + cropState4.transformRotation, d, m0Var.s));
        canvas.rotate(m0Var.b.getOrientation());
        org.telegram.ui.Components.y5 y5Var = m0Var.c;
        if (m0Var.A) {
            MediaController.CropState cropState5 = m0Var.b.C0;
            if (cropState5 != null && cropState5.mirrored) {
                z10 = true;
            }
            z10 = false;
        } else {
            uf.l lVar = g0Var.H;
            if (lVar != null) {
                z10 = lVar.j;
            }
            z10 = false;
        }
        canvas.scale(AndroidUtilities.lerp(1.0f, -1.0f, y5Var.e(z10)), 1.0f);
        canvas.translate((-m0Var.b.getContentWidth()) / 2.0f, (-m0Var.b.getContentHeight()) / 2.0f);
        zf.x1 x1Var2 = m0Var.b;
        Paint paint2 = x1Var2.B0;
        Bitmap bitmap = x1Var2.w0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
