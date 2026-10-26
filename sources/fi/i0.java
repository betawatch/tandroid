package fi;

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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        if (r15 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0060, code lost:
    
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
        ng.g gVar = j0Var.w;
        int i10 = gVar.i;
        if (i10 == 90 || i10 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float f7 = 1.0f;
        float f10 = 0.0f;
        float f11 = ((gVar.l - 1.0f) * (z10 ? 1.0f : 0.0f)) + 1.0f;
        float f12 = currentWidth;
        float containerWidth = getContainerWidth() / f12;
        float f13 = currentHeight;
        if (containerWidth * f13 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f13;
        }
        boolean z11 = (j0Var.x.Q / 90) % 2 == 1;
        matrix.preTranslate(gVar.d, gVar.e);
        float f14 = (gVar.f / f11) * containerWidth;
        w7 w7Var = j0Var.x;
        if (w7Var != null && (cropState = w7Var.m0) != null) {
            if (z10) {
                f7 = cropState.cropScale;
            }
            f7 = f14;
        }
        matrix.preScale(f7, f7);
        float f15 = gVar.b;
        float f16 = gVar.c;
        if (j0Var.y && z10) {
            MediaController.CropState cropState2 = j0Var.x.m0;
            float f17 = cropState2 == null ? 0.0f : !z11 ? cropState2.cropPx : cropState2.cropPy;
            float f18 = cropState2 == null ? 0.0f : !z11 ? cropState2.cropPy : cropState2.cropPx;
            f15 = f17;
            f16 = f18;
        }
        matrix.preTranslate(f15 * f12, f16 * f13);
        w7 w7Var2 = j0Var.x;
        float f19 = w7Var2.Q + gVar.g + i10;
        MediaController.CropState cropState3 = w7Var2.m0;
        if (cropState3 != null) {
            if (z10) {
                f10 = cropState3.cropRotate + cropState3.transformRotation;
            }
            f10 = f19;
        }
        matrix.preRotate(f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01cb, code lost:
    
        if (r9.mirrored != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, boolean z10) {
        float f7;
        float f10;
        Canvas canvas2;
        float f11;
        boolean z11;
        boolean z12;
        j0 j0Var = this.s;
        int[] iArr = j0Var.s;
        int[] iArr2 = j0Var.v;
        o6 o6Var = j0Var.a;
        if (!z10) {
            f7 = 255.0f;
            f10 = 2.0f;
            canvas2 = canvas;
        } else {
            if (j0Var.r >= 1.0f) {
                return;
            }
            f7 = 255.0f;
            f10 = 2.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, o6Var.getWidth(), o6Var.getHeight(), (int) (Math.min(1.0f, (1.0f - j0Var.r) * 2.0f) * 255.0f), 31);
            canvas2.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
        canvas2.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (j0Var.r * f7));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (j0Var.r < 1.0f && !z10) {
            Path path = this.b;
            path.rewind();
            float width = o6Var.getWidth();
            float height = o6Var.getHeight();
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
        float f12 = j0Var.r;
        Matrix matrix = this.f;
        matrix.reset();
        Matrix matrix2 = this.h;
        matrix2.reset();
        matrix.preTranslate(-iArr[0], -iArr[1]);
        matrix.preTranslate(iArr2[0], iArr2[1]);
        matrix.preScale(o6Var.getWidth() / j0Var.x.i0, o6Var.getHeight() / j0Var.x.j0);
        matrix.preConcat(j0Var.x.n0);
        matrix.preTranslate(o6Var.getContentWidth() / f10, o6Var.getContentHeight() / f10);
        matrix2.preTranslate((getContainerWidth() / f10) + AndroidUtilities.dp(16.0f), org.telegram.messenger.t.b(getContainerHeight(), AndroidUtilities.dp(32.0f), f10, !(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0.0f));
        if (z10) {
            Matrix matrix3 = this.d;
            float f13 = j0Var.r;
            Matrix matrix4 = this.n;
            AndroidUtilities.lerp(matrix, matrix3, f13, matrix4);
            matrix4.preRotate(-j0Var.x.Q);
            Matrix matrix5 = this.r;
            if (matrix4.invert(matrix5)) {
                w7 w7Var = j0Var.x;
                f11 = f10;
                int i10 = w7Var.Q;
                MediaController.CropState cropState = w7Var.m0;
                boolean z13 = ((i10 + (cropState != null ? cropState.transformRotation : 0)) / 90) % 2 == 1;
                float contentWidth = o6Var.getContentWidth();
                float contentHeight = o6Var.getContentHeight();
                MediaController.CropState cropState2 = j0Var.x.m0;
                float f14 = cropState2 != null ? cropState2.cropPw : 1.0f;
                float f15 = cropState2 != null ? cropState2.cropPh : 1.0f;
                float f16 = ((z13 ? contentHeight : contentWidth) * f14) / f11;
                if (!z13) {
                    contentWidth = contentHeight;
                }
                float f17 = (contentWidth * f15) / f11;
                float lerp2 = AndroidUtilities.lerp(1.0f, 4.0f, f12);
                canvas2.concat(matrix4);
                canvas2.clipRect((-f16) * lerp2, (-f17) * lerp2, f16 * lerp2, f17 * lerp2);
                canvas2.concat(matrix5);
                z11 = true;
                a(matrix, z11);
                a(matrix2, false);
                org.telegram.ui.Components.h6 h6Var = j0Var.b;
                if (j0Var.y) {
                    ng.n nVar = j0Var.f.L;
                    if (nVar != null) {
                        z11 = nVar.j;
                        z12 = z11;
                    }
                    z12 = false;
                } else {
                    MediaController.CropState cropState3 = j0Var.x.m0;
                    if (cropState3 != null) {
                    }
                    z12 = false;
                }
                float e = h6Var.e(z12);
                float f18 = 1.0f - (e * f11);
                matrix2.preScale(f18, 1.0f);
                matrix.preScale(f18, 1.0f);
                float A = org.telegram.messenger.t.A(1.0f, e, 4.0f * e, 0.25f);
                matrix2.preSkew(0.0f, A);
                matrix.preSkew(0.0f, A);
                matrix2.preTranslate((-o6Var.getContentWidth()) / f11, (-o6Var.getContentHeight()) / f11);
                matrix.preTranslate((-o6Var.getContentWidth()) / f11, (-o6Var.getContentHeight()) / f11);
                float f19 = j0Var.r;
                Matrix matrix6 = this.e;
                AndroidUtilities.lerp(matrix, matrix2, f19, matrix6);
                canvas2.concat(matrix6);
                Paint paint2 = o6Var.Q;
                Matrix matrix7 = o6Var.W;
                if (o6Var.n == null) {
                    canvas2.save();
                    canvas2.scale(o6Var.getContentWidth() / o6Var.getWidth(), o6Var.getContentHeight() / o6Var.getHeight());
                    canvas2.concat(o6Var.j0);
                    o6Var.n.draw(canvas2);
                    canvas2.restore();
                } else if (o6Var.a != null && o6Var.d != null) {
                    matrix7.reset();
                    matrix7.preScale(o6Var.d.k0 / o6Var.a.getWidth(), o6Var.d.l0 / o6Var.a.getHeight());
                    paint2.setAlpha(255);
                    canvas2.drawBitmap(o6Var.a, matrix7, paint2);
                }
                canvas2.restore();
                if (z10) {
                    return;
                }
                canvas2.restore();
                return;
            }
        }
        f11 = f10;
        z11 = true;
        a(matrix, z11);
        a(matrix2, false);
        org.telegram.ui.Components.h6 h6Var2 = j0Var.b;
        if (j0Var.y) {
        }
        float e10 = h6Var2.e(z12);
        float f182 = 1.0f - (e10 * f11);
        matrix2.preScale(f182, 1.0f);
        matrix.preScale(f182, 1.0f);
        float A2 = org.telegram.messenger.t.A(1.0f, e10, 4.0f * e10, 0.25f);
        matrix2.preSkew(0.0f, A2);
        matrix.preSkew(0.0f, A2);
        matrix2.preTranslate((-o6Var.getContentWidth()) / f11, (-o6Var.getContentHeight()) / f11);
        matrix.preTranslate((-o6Var.getContentWidth()) / f11, (-o6Var.getContentHeight()) / f11);
        float f192 = j0Var.r;
        Matrix matrix62 = this.e;
        AndroidUtilities.lerp(matrix, matrix2, f192, matrix62);
        canvas2.concat(matrix62);
        Paint paint22 = o6Var.Q;
        Matrix matrix72 = o6Var.W;
        if (o6Var.n == null) {
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
