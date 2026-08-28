package kh;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f;
    public final Matrix h;
    public final Matrix n;
    public final Matrix r;
    public final /* synthetic */ k0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, Context context) {
        super(context);
        this.s = k0Var;
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
        k0 k0Var = this.s;
        currentWidth = k0Var.getCurrentWidth();
        currentHeight = k0Var.getCurrentHeight();
        tf.f fVar = k0Var.w;
        int i9 = fVar.i;
        if (i9 == 90 || i9 == 270) {
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
        boolean z11 = (k0Var.x.Q / 90) % 2 == 1;
        matrix.preTranslate(fVar.d, fVar.e);
        float f15 = (fVar.f / f12) * containerWidth;
        a8 a8Var = k0Var.x;
        if (a8Var != null && (cropState = a8Var.m0) != null) {
            if (z10) {
                f10 = cropState.cropScale;
            }
            f10 = f15;
        }
        matrix.preScale(f10, f10);
        float f16 = fVar.b;
        float f17 = fVar.c;
        if (k0Var.y && z10) {
            MediaController.CropState cropState2 = k0Var.x.m0;
            float f18 = cropState2 == null ? 0.0f : !z11 ? cropState2.cropPx : cropState2.cropPy;
            float f19 = cropState2 == null ? 0.0f : !z11 ? cropState2.cropPy : cropState2.cropPx;
            f16 = f18;
            f17 = f19;
        }
        matrix.preTranslate(f16 * f13, f17 * f14);
        a8 a8Var2 = k0Var.x;
        float f20 = a8Var2.Q + fVar.g + i9;
        MediaController.CropState cropState3 = a8Var2.m0;
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
        k0 k0Var = this.s;
        int[] iArr = k0Var.s;
        int[] iArr2 = k0Var.v;
        r6 r6Var = k0Var.a;
        if (!z10) {
            canvas2 = canvas;
            f10 = 2.0f;
            f11 = 255.0f;
        } else {
            if (k0Var.r >= 1.0f) {
                return;
            }
            canvas2 = canvas;
            f10 = 2.0f;
            f11 = 255.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, r6Var.getWidth(), r6Var.getHeight(), (int) (Math.min(1.0f, (1.0f - k0Var.r) * 2.0f) * 255.0f), 31);
            canvas2.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
        canvas2.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (k0Var.r * f11));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (k0Var.r < 1.0f && !z10) {
            Path path = this.b;
            path.rewind();
            float width = r6Var.getWidth();
            float height = r6Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, k0Var.r, rectF);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, k0Var.r);
            path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        float f13 = k0Var.r;
        Matrix matrix = this.f;
        matrix.reset();
        Matrix matrix2 = this.h;
        matrix2.reset();
        matrix.preTranslate(-iArr[0], -iArr[1]);
        matrix.preTranslate(iArr2[0], iArr2[1]);
        matrix.preScale(r6Var.getWidth() / k0Var.x.i0, r6Var.getHeight() / k0Var.x.j0);
        matrix.preConcat(k0Var.x.n0);
        matrix.preTranslate(r6Var.getContentWidth() / f10, r6Var.getContentHeight() / f10);
        matrix2.preTranslate((getContainerWidth() / f10) + AndroidUtilities.dp(16.0f), j3.r0.c(getContainerHeight(), AndroidUtilities.dp(32.0f), f10, !(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0.0f));
        if (z10) {
            Matrix matrix3 = this.d;
            float f14 = k0Var.r;
            Matrix matrix4 = this.n;
            AndroidUtilities.lerp(matrix, matrix3, f14, matrix4);
            matrix4.preRotate(-k0Var.x.Q);
            Matrix matrix5 = this.r;
            if (matrix4.invert(matrix5)) {
                a8 a8Var = k0Var.x;
                f12 = 2.0f;
                int i9 = a8Var.Q;
                MediaController.CropState cropState = a8Var.m0;
                boolean z12 = ((i9 + (cropState != null ? cropState.transformRotation : 0)) / 90) % 2 == 1;
                float contentWidth = r6Var.getContentWidth();
                float contentHeight = r6Var.getContentHeight();
                MediaController.CropState cropState2 = k0Var.x.m0;
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
                org.telegram.ui.Components.y5 y5Var = k0Var.b;
                if (k0Var.y) {
                    tf.l lVar = k0Var.f.H;
                    if (lVar != null) {
                        z11 = lVar.j;
                    }
                    z11 = false;
                } else {
                    MediaController.CropState cropState3 = k0Var.x.m0;
                    if (cropState3 != null && cropState3.mirrored) {
                        z11 = true;
                    }
                    z11 = false;
                }
                float e10 = y5Var.e(z11);
                float f19 = 1.0f - (e10 * f12);
                matrix2.preScale(f19, 1.0f);
                matrix.preScale(f19, 1.0f);
                float y10 = org.telegram.messenger.l0.y(1.0f, e10, 4.0f * e10, 0.25f);
                matrix2.preSkew(0.0f, y10);
                matrix.preSkew(0.0f, y10);
                matrix2.preTranslate((-r6Var.getContentWidth()) / f12, (-r6Var.getContentHeight()) / f12);
                matrix.preTranslate((-r6Var.getContentWidth()) / f12, (-r6Var.getContentHeight()) / f12);
                float f20 = k0Var.r;
                Matrix matrix6 = this.e;
                AndroidUtilities.lerp(matrix, matrix2, f20, matrix6);
                canvas2.concat(matrix6);
                Paint paint2 = r6Var.M;
                Matrix matrix7 = r6Var.S;
                if (r6Var.n == null) {
                    canvas2.save();
                    canvas2.scale(r6Var.getContentWidth() / r6Var.getWidth(), r6Var.getContentHeight() / r6Var.getHeight());
                    canvas2.concat(r6Var.f0);
                    r6Var.n.draw(canvas2);
                    canvas2.restore();
                } else if (r6Var.a != null && r6Var.d != null) {
                    matrix7.reset();
                    matrix7.preScale(r6Var.d.k0 / r6Var.a.getWidth(), r6Var.d.l0 / r6Var.a.getHeight());
                    paint2.setAlpha(255);
                    canvas2.drawBitmap(r6Var.a, matrix7, paint2);
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
        org.telegram.ui.Components.y5 y5Var2 = k0Var.b;
        if (k0Var.y) {
        }
        float e102 = y5Var2.e(z11);
        float f192 = 1.0f - (e102 * f12);
        matrix2.preScale(f192, 1.0f);
        matrix.preScale(f192, 1.0f);
        float y102 = org.telegram.messenger.l0.y(1.0f, e102, 4.0f * e102, 0.25f);
        matrix2.preSkew(0.0f, y102);
        matrix.preSkew(0.0f, y102);
        matrix2.preTranslate((-r6Var.getContentWidth()) / f12, (-r6Var.getContentHeight()) / f12);
        matrix.preTranslate((-r6Var.getContentWidth()) / f12, (-r6Var.getContentHeight()) / f12);
        float f202 = k0Var.r;
        Matrix matrix62 = this.e;
        AndroidUtilities.lerp(matrix, matrix2, f202, matrix62);
        canvas2.concat(matrix62);
        Paint paint22 = r6Var.M;
        Matrix matrix72 = r6Var.S;
        if (r6Var.n == null) {
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
