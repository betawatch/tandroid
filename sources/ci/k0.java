package ci;

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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class k0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final /* synthetic */ l0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, Context context) {
        super(context);
        this.d = l0Var;
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
        l0 l0Var = this.d;
        g0 g0Var = l0Var.h;
        int[] iArr = l0Var.x;
        b7 b7Var = l0Var.a;
        if (l0Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (l0Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (l0Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            float width = b7Var.getWidth();
            float height = b7Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            int[] iArr2 = l0Var.w;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, l0Var.s, rectF);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, l0Var.s);
            path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f11 = l0Var.s;
        float f12 = 1.0f - f11;
        int[] iArr3 = l0Var.v;
        canvas.translate((-iArr3[0]) * f12, (-iArr3[1]) * f12);
        if (f12 > 0.0f) {
            if (l0Var.E) {
                l0Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f12, iArr[1] * f12);
            MediaController.CropState cropState2 = l0Var.b.G0;
            if (cropState2 != null) {
                f10 = cropState2.cropPw;
                f7 = cropState2.cropPh;
            } else {
                f7 = 1.0f;
                f10 = 1.0f;
            }
            float lerp2 = AndroidUtilities.lerp(1.0f, (l0Var.b.getScaleX() * (r9.getWidth() / f10)) / b7Var.getWidth(), f12);
            canvas.scale(lerp2, lerp2);
            canvas.rotate(l0Var.b.getRotation() * f12);
            canvas.translate(((l0Var.b.getContentWidth() * f10) / 2.0f) * f12, ((l0Var.b.getContentHeight() * f7) / 2.0f) * f12);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + AndroidUtilities.dp(16.0f)) * f11, (((getContainerHeight() + AndroidUtilities.dp(32.0f)) / 2.0f) + g0Var.E + (!(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0)) * f11);
        if (f12 > 0.0f) {
            float contentWidth = l0Var.b.getContentWidth();
            float contentHeight = l0Var.b.getContentHeight();
            MediaController.CropState cropState3 = l0Var.b.G0;
            float f13 = cropState3 != null ? cropState3.cropPw : 1.0f;
            float f14 = cropState3 != null ? cropState3.cropPh : 1.0f;
            float lerp3 = (AndroidUtilities.lerp(1.0f, f13, f12) * contentWidth) / 2.0f;
            float lerp4 = (AndroidUtilities.lerp(1.0f, f14, f12) * contentHeight) / 2.0f;
            float lerp5 = AndroidUtilities.lerp(1.0f, 4.0f, f11);
            canvas.clipRect((-lerp3) * lerp5, (-lerp4) * lerp5, lerp3 * lerp5, lerp4 * lerp5);
        }
        currentWidth = l0Var.getCurrentWidth();
        lg.g gVar = l0Var.y;
        currentHeight = l0Var.getCurrentHeight();
        int i10 = gVar.i;
        if (i10 == 90 || i10 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float y3 = com.google.android.gms.internal.vision.e2.y(gVar.l, 1.0f, f12, 1.0f);
        float f15 = currentWidth;
        float containerWidth = getContainerWidth() / f15;
        float f16 = currentHeight;
        if (containerWidth * f16 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f16;
        }
        canvas.translate(gVar.d * 1.0f, gVar.e * 1.0f);
        float f17 = (gVar.f / y3) * containerWidth;
        qg.y1 y1Var = l0Var.b;
        float lerp6 = (y1Var == null || (cropState = y1Var.G0) == null) ? AndroidUtilities.lerp(1.0f, f17, f11) : AndroidUtilities.lerp(cropState.cropScale, f17, f11);
        canvas.scale(lerp6, lerp6);
        canvas.translate(gVar.b * f15 * 1.0f, gVar.c * f16 * 1.0f);
        float d = l0Var.d.d(i10, false) + l0Var.b.getOrientation() + gVar.g;
        MediaController.CropState cropState4 = l0Var.b.G0;
        canvas.rotate(cropState4 == null ? AndroidUtilities.lerp(0.0f, d, l0Var.s) : AndroidUtilities.lerp(cropState4.cropRotate + cropState4.transformRotation, d, l0Var.s));
        canvas.rotate(l0Var.b.getOrientation());
        org.telegram.ui.Components.g6 g6Var = l0Var.c;
        if (l0Var.E) {
            MediaController.CropState cropState5 = l0Var.b.G0;
            if (cropState5 != null && cropState5.mirrored) {
                z10 = true;
            }
            z10 = false;
        } else {
            lg.n nVar = g0Var.L;
            if (nVar != null) {
                z10 = nVar.j;
            }
            z10 = false;
        }
        canvas.scale(AndroidUtilities.lerp(1.0f, -1.0f, g6Var.e(z10)), 1.0f);
        canvas.translate((-l0Var.b.getContentWidth()) / 2.0f, (-l0Var.b.getContentHeight()) / 2.0f);
        qg.y1 y1Var2 = l0Var.b;
        Paint paint2 = y1Var2.F0;
        Bitmap bitmap = y1Var2.A0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
