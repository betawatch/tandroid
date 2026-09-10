package bi;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class p0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final /* synthetic */ q0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, Context context) {
        super(context);
        this.d = q0Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        boolean z10 = getContext() instanceof BubbleActivity;
        l0 l0Var = this.d.h;
        return ((getHeight() - (l0Var.E + (!z10 ? AndroidUtilities.statusBarHeight : 0))) - l0Var.y) - AndroidUtilities.dp(32.0f);
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
        q0 q0Var = this.d;
        l0 l0Var = q0Var.h;
        int[] iArr = q0Var.x;
        e8 e8Var = q0Var.a;
        if (q0Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (q0Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (q0Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            float width = e8Var.getWidth();
            float height = e8Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            int[] iArr2 = q0Var.w;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, q0Var.s, rectF);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, q0Var.s);
            path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f11 = q0Var.s;
        float f12 = 1.0f - f11;
        int[] iArr3 = q0Var.v;
        canvas.translate((-iArr3[0]) * f12, (-iArr3[1]) * f12);
        if (f12 > 0.0f) {
            if (q0Var.E) {
                q0Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f12, iArr[1] * f12);
            MediaController.CropState cropState2 = q0Var.b.G0;
            if (cropState2 != null) {
                f10 = cropState2.cropPw;
                f7 = cropState2.cropPh;
            } else {
                f7 = 1.0f;
                f10 = 1.0f;
            }
            float lerp2 = AndroidUtilities.lerp(1.0f, (q0Var.b.getScaleX() * (r9.getWidth() / f10)) / e8Var.getWidth(), f12);
            canvas.scale(lerp2, lerp2);
            canvas.rotate(q0Var.b.getRotation() * f12);
            canvas.translate(((q0Var.b.getContentWidth() * f10) / 2.0f) * f12, ((q0Var.b.getContentHeight() * f7) / 2.0f) * f12);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + AndroidUtilities.dp(16.0f)) * f11, (((getContainerHeight() + AndroidUtilities.dp(32.0f)) / 2.0f) + l0Var.E + (!(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0)) * f11);
        if (f12 > 0.0f) {
            float contentWidth = q0Var.b.getContentWidth();
            float contentHeight = q0Var.b.getContentHeight();
            MediaController.CropState cropState3 = q0Var.b.G0;
            float f13 = cropState3 != null ? cropState3.cropPw : 1.0f;
            float f14 = cropState3 != null ? cropState3.cropPh : 1.0f;
            float lerp3 = (AndroidUtilities.lerp(1.0f, f13, f12) * contentWidth) / 2.0f;
            float lerp4 = (AndroidUtilities.lerp(1.0f, f14, f12) * contentHeight) / 2.0f;
            float lerp5 = AndroidUtilities.lerp(1.0f, 4.0f, f11);
            canvas.clipRect((-lerp3) * lerp5, (-lerp4) * lerp5, lerp3 * lerp5, lerp4 * lerp5);
        }
        currentWidth = q0Var.getCurrentWidth();
        kg.g gVar = q0Var.y;
        currentHeight = q0Var.getCurrentHeight();
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
        pg.x1 x1Var = q0Var.b;
        float lerp6 = (x1Var == null || (cropState = x1Var.G0) == null) ? AndroidUtilities.lerp(1.0f, f17, f11) : AndroidUtilities.lerp(cropState.cropScale, f17, f11);
        canvas.scale(lerp6, lerp6);
        canvas.translate(gVar.b * f15 * 1.0f, gVar.c * f16 * 1.0f);
        float d = q0Var.d.d(i10, false) + q0Var.b.getOrientation() + gVar.g;
        MediaController.CropState cropState4 = q0Var.b.G0;
        canvas.rotate(cropState4 == null ? AndroidUtilities.lerp(0.0f, d, q0Var.s) : AndroidUtilities.lerp(cropState4.cropRotate + cropState4.transformRotation, d, q0Var.s));
        canvas.rotate(q0Var.b.getOrientation());
        org.telegram.ui.Components.d6 d6Var = q0Var.c;
        if (q0Var.E) {
            MediaController.CropState cropState5 = q0Var.b.G0;
            if (cropState5 != null && cropState5.mirrored) {
                z10 = true;
            }
            z10 = false;
        } else {
            kg.n nVar = l0Var.L;
            if (nVar != null) {
                z10 = nVar.j;
            }
            z10 = false;
        }
        canvas.scale(AndroidUtilities.lerp(1.0f, -1.0f, d6Var.e(z10)), 1.0f);
        canvas.translate((-q0Var.b.getContentWidth()) / 2.0f, (-q0Var.b.getContentHeight()) / 2.0f);
        pg.x1 x1Var2 = q0Var.b;
        Paint paint2 = x1Var2.F0;
        Bitmap bitmap = x1Var2.A0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
