package lh;

import android.content.Context;
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
public final class i0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f;
    public final Matrix h;
    public final Matrix n;
    public final Matrix r;
    public final /* synthetic */ j0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, Context context) {
        super(context);
        this.s = j0Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = new Matrix();
        this.h = new Matrix();
        this.n = new Matrix();
        this.r = new Matrix();
    }

    private float getContainerHeight() {
        return ((getHeight() - (!(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0.0f)) - this.s.f.y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r15 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0063, code lost:
    
        if (r15 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Matrix matrix, boolean z10) {
        int currentWidth;
        int currentHeight;
        MediaController.CropState cropState;
        j0 j0Var = this.s;
        currentWidth = j0Var.getCurrentWidth();
        currentHeight = j0Var.getCurrentHeight();
        uf.f fVar = j0Var.w;
        int i10 = fVar.i;
        if (i10 == 90 || i10 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float f10 = 1.0f;
        float f11 = 0.0f;
        float f12 = ((fVar.l - 1.0f) * (z10 ? 1.0f : 0.0f)) + 1.0f;
        float f13 = currentWidth;
        float containerWidth = getContainerWidth() / f13;
        float f14 = currentHeight;
        if (containerWidth * f14 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f14;
        }
        boolean z11 = (j0Var.x.Q / 90) % 2 == 1;
        matrix.preTranslate(fVar.d, fVar.e);
        float f15 = (fVar.f / f12) * containerWidth;
        z7 z7Var = j0Var.x;
        if (z7Var != null && (cropState = z7Var.m0) != null) {
            if (z10) {
                f10 = cropState.cropScale;
            }
            f10 = f15;
        }
        matrix.preScale(f10, f10);
        float f16 = fVar.b;
        float f17 = fVar.c;
        if (j0Var.y && z10) {
            MediaController.CropState cropState2 = j0Var.x.m0;
            float f18 = cropState2 == null ? 0.0f : !z11 ? cropState2.cropPx : cropState2.cropPy;
            float f19 = cropState2 == null ? 0.0f : !z11 ? cropState2.cropPy : cropState2.cropPx;
            f16 = f18;
            f17 = f19;
        }
        matrix.preTranslate(f16 * f13, f17 * f14);
        z7 z7Var2 = j0Var.x;
        float f20 = z7Var2.Q + fVar.g + i10;
        MediaController.CropState cropState3 = z7Var2.m0;
        if (cropState3 != null) {
            if (z10) {
                f11 = cropState3.cropRotate + cropState3.transformRotation;
            }
            f11 = f20;
        }
        matrix.preRotate(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, boolean z10) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        boolean z11;
        j0 j0Var = this.s;
        int[] iArr = j0Var.s;
        int[] iArr2 = j0Var.v;
        q6 q6Var = j0Var.a;
        if (!z10) {
            canvas2 = canvas;
            f10 = 2.0f;
            f11 = 255.0f;
        } else {
            if (j0Var.r >= 1.0f) {
                return;
            }
            canvas2 = canvas;
            f10 = 2.0f;
            f11 = 255.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, q6Var.getWidth(), q6Var.getHeight(), (int) (Math.min(1.0f, (1.0f - j0Var.r) * 2.0f) * 255.0f), 31);
            canvas2.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
        canvas2.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (j0Var.r * f11));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (j0Var.r < 1.0f && !z10) {
            Path path = this.b;
            path.rewind();
            float width = q6Var.getWidth();
            float height = q6Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, j0Var.r, rectF);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, j0Var.r);
            path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        float f13 = j0Var.r;
        Matrix matrix = this.f;
        matrix.reset();
        Matrix matrix2 = this.h;
        matrix2.reset();
        matrix.preTranslate(-iArr[0], -iArr[1]);
        matrix.preTranslate(iArr2[0], iArr2[1]);
        matrix.preScale(q6Var.getWidth() / j0Var.x.i0, q6Var.getHeight() / j0Var.x.j0);
        matrix.preConcat(j0Var.x.n0);
        matrix.preTranslate(q6Var.getContentWidth() / f10, q6Var.getContentHeight() / f10);
        matrix2.preTranslate((getContainerWidth() / f10) + AndroidUtilities.dp(16.0f), i0.a.c(getContainerHeight(), AndroidUtilities.dp(32.0f), f10, !(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0.0f));
        if (z10) {
            Matrix matrix3 = this.d;
            float f14 = j0Var.r;
            Matrix matrix4 = this.n;
            AndroidUtilities.lerp(matrix, matrix3, f14, matrix4);
            matrix4.preRotate(-j0Var.x.Q);
            Matrix matrix5 = this.r;
            if (matrix4.invert(matrix5)) {
                z7 z7Var = j0Var.x;
                f12 = 2.0f;
                int i10 = z7Var.Q;
                MediaController.CropState cropState = z7Var.m0;
                boolean z12 = ((i10 + (cropState != null ? cropState.transformRotation : 0)) / 90) % 2 == 1;
                float contentWidth = q6Var.getContentWidth();
                float contentHeight = q6Var.getContentHeight();
                MediaController.CropState cropState2 = j0Var.x.m0;
                float f15 = cropState2 != null ? cropState2.cropPw : 1.0f;
                float f16 = cropState2 != null ? cropState2.cropPh : 1.0f;
                float f17 = ((z12 ? contentHeight : contentWidth) * f15) / 2.0f;
                if (!z12) {
                    contentWidth = contentHeight;
                }
                float f18 = (contentWidth * f16) / 2.0f;
                float lerp2 = AndroidUtilities.lerp(1.0f, 4.0f, f13);
                canvas2.concat(matrix4);
                canvas2.clipRect((-f17) * lerp2, (-f18) * lerp2, f17 * lerp2, f18 * lerp2);
                canvas2.concat(matrix5);
                a(matrix, true);
                a(matrix2, false);
                org.telegram.ui.Components.y5 y5Var = j0Var.b;
                if (j0Var.y) {
                    uf.l lVar = j0Var.f.H;
                    if (lVar != null) {
                        z11 = lVar.j;
                    }
                    z11 = false;
                } else {
                    MediaController.CropState cropState3 = j0Var.x.m0;
                    if (cropState3 != null && cropState3.mirrored) {
                        z11 = true;
                    }
                    z11 = false;
                }
                float e9 = y5Var.e(z11);
                float f19 = 1.0f - (e9 * f12);
                matrix2.preScale(f19, 1.0f);
                matrix.preScale(f19, 1.0f);
                float z13 = org.telegram.messenger.y1.z(1.0f, e9, 4.0f * e9, 0.25f);
                matrix2.preSkew(0.0f, z13);
                matrix.preSkew(0.0f, z13);
                matrix2.preTranslate((-q6Var.getContentWidth()) / f12, (-q6Var.getContentHeight()) / f12);
                matrix.preTranslate((-q6Var.getContentWidth()) / f12, (-q6Var.getContentHeight()) / f12);
                float f20 = j0Var.r;
                Matrix matrix6 = this.e;
                AndroidUtilities.lerp(matrix, matrix2, f20, matrix6);
                canvas2.concat(matrix6);
                Paint paint2 = q6Var.M;
                Matrix matrix7 = q6Var.S;
                if (q6Var.n == null) {
                    canvas2.save();
                    canvas2.scale(q6Var.getContentWidth() / q6Var.getWidth(), q6Var.getContentHeight() / q6Var.getHeight());
                    canvas2.concat(q6Var.f0);
                    q6Var.n.draw(canvas2);
                    canvas2.restore();
                } else if (q6Var.a != null && q6Var.d != null) {
                    matrix7.reset();
                    matrix7.preScale(q6Var.d.k0 / q6Var.a.getWidth(), q6Var.d.l0 / q6Var.a.getHeight());
                    paint2.setAlpha(255);
                    canvas2.drawBitmap(q6Var.a, matrix7, paint2);
                }
                canvas2.restore();
                if (z10) {
                    return;
                }
                canvas2.restore();
                return;
            }
        }
        f12 = 2.0f;
        a(matrix, true);
        a(matrix2, false);
        org.telegram.ui.Components.y5 y5Var2 = j0Var.b;
        if (j0Var.y) {
        }
        float e92 = y5Var2.e(z11);
        float f192 = 1.0f - (e92 * f12);
        matrix2.preScale(f192, 1.0f);
        matrix.preScale(f192, 1.0f);
        float z132 = org.telegram.messenger.y1.z(1.0f, e92, 4.0f * e92, 0.25f);
        matrix2.preSkew(0.0f, z132);
        matrix.preSkew(0.0f, z132);
        matrix2.preTranslate((-q6Var.getContentWidth()) / f12, (-q6Var.getContentHeight()) / f12);
        matrix.preTranslate((-q6Var.getContentWidth()) / f12, (-q6Var.getContentHeight()) / f12);
        float f202 = j0Var.r;
        Matrix matrix62 = this.e;
        AndroidUtilities.lerp(matrix, matrix2, f202, matrix62);
        canvas2.concat(matrix62);
        Paint paint22 = q6Var.M;
        Matrix matrix72 = q6Var.S;
        if (q6Var.n == null) {
        }
        canvas2.restore();
        if (z10) {
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.s.x == null) {
            return;
        }
        b(canvas, false);
    }
}
