package di;

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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        return ((getHeight() - (g0Var.E + (!z10 ? AndroidUtilities.statusBarHeight : 0))) - g0Var.y) - AndroidUtilities.dp(32.0f);
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
        float f7;
        float f10;
        m0 m0Var = this.d;
        g0 g0Var = m0Var.h;
        int[] iArr = m0Var.x;
        d7 d7Var = m0Var.a;
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
            float width = d7Var.getWidth();
            float height = d7Var.getHeight();
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
        float f11 = m0Var.s;
        float f12 = 1.0f - f11;
        int[] iArr3 = m0Var.v;
        canvas.translate((-iArr3[0]) * f12, (-iArr3[1]) * f12);
        if (f12 > 0.0f) {
            if (m0Var.E) {
                m0Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f12, iArr[1] * f12);
            MediaController.CropState cropState2 = m0Var.b.G0;
            if (cropState2 != null) {
                f10 = cropState2.cropPw;
                f7 = cropState2.cropPh;
            } else {
                f7 = 1.0f;
                f10 = 1.0f;
            }
            float lerp2 = AndroidUtilities.lerp(1.0f, (m0Var.b.getScaleX() * (r9.getWidth() / f10)) / d7Var.getWidth(), f12);
            canvas.scale(lerp2, lerp2);
            canvas.rotate(m0Var.b.getRotation() * f12);
            canvas.translate(((m0Var.b.getContentWidth() * f10) / 2.0f) * f12, ((m0Var.b.getContentHeight() * f7) / 2.0f) * f12);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + AndroidUtilities.dp(16.0f)) * f11, (((getContainerHeight() + AndroidUtilities.dp(32.0f)) / 2.0f) + g0Var.E + (!(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0)) * f11);
        if (f12 > 0.0f) {
            float contentWidth = m0Var.b.getContentWidth();
            float contentHeight = m0Var.b.getContentHeight();
            MediaController.CropState cropState3 = m0Var.b.G0;
            float f13 = cropState3 != null ? cropState3.cropPw : 1.0f;
            float f14 = cropState3 != null ? cropState3.cropPh : 1.0f;
            float lerp3 = (AndroidUtilities.lerp(1.0f, f13, f12) * contentWidth) / 2.0f;
            float lerp4 = (AndroidUtilities.lerp(1.0f, f14, f12) * contentHeight) / 2.0f;
            float lerp5 = AndroidUtilities.lerp(1.0f, 4.0f, f11);
            canvas.clipRect((-lerp3) * lerp5, (-lerp4) * lerp5, lerp3 * lerp5, lerp4 * lerp5);
        }
        currentWidth = m0Var.getCurrentWidth();
        mg.g gVar = m0Var.y;
        currentHeight = m0Var.getCurrentHeight();
        int i10 = gVar.i;
        if (i10 == 90 || i10 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z11 = com.google.android.gms.internal.vision.e2.z(gVar.l, 1.0f, f12, 1.0f);
        float f15 = currentWidth;
        float containerWidth = getContainerWidth() / f15;
        float f16 = currentHeight;
        if (containerWidth * f16 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f16;
        }
        canvas.translate(gVar.d * 1.0f, gVar.e * 1.0f);
        float f17 = (gVar.f / z11) * containerWidth;
        rg.z1 z1Var = m0Var.b;
        float lerp6 = (z1Var == null || (cropState = z1Var.G0) == null) ? AndroidUtilities.lerp(1.0f, f17, f11) : AndroidUtilities.lerp(cropState.cropScale, f17, f11);
        canvas.scale(lerp6, lerp6);
        canvas.translate(gVar.b * f15 * 1.0f, gVar.c * f16 * 1.0f);
        float d = m0Var.d.d(i10, false) + m0Var.b.getOrientation() + gVar.g;
        MediaController.CropState cropState4 = m0Var.b.G0;
        canvas.rotate(cropState4 == null ? AndroidUtilities.lerp(0.0f, d, m0Var.s) : AndroidUtilities.lerp(cropState4.cropRotate + cropState4.transformRotation, d, m0Var.s));
        canvas.rotate(m0Var.b.getOrientation());
        org.telegram.ui.Components.e6 e6Var = m0Var.c;
        if (m0Var.E) {
            MediaController.CropState cropState5 = m0Var.b.G0;
            if (cropState5 != null && cropState5.mirrored) {
                z10 = true;
            }
            z10 = false;
        } else {
            mg.o oVar = g0Var.L;
            if (oVar != null) {
                z10 = oVar.j;
            }
            z10 = false;
        }
        canvas.scale(AndroidUtilities.lerp(1.0f, -1.0f, e6Var.e(z10)), 1.0f);
        canvas.translate((-m0Var.b.getContentWidth()) / 2.0f, (-m0Var.b.getContentHeight()) / 2.0f);
        rg.z1 z1Var2 = m0Var.b;
        Paint paint2 = z1Var2.F0;
        Bitmap bitmap = z1Var2.A0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
