package bi;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class m0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f;
    public final Matrix h;
    public final Matrix n;
    public final Matrix r;
    public final /* synthetic */ n0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, Context context) {
        super(context);
        this.s = n0Var;
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
        n0 n0Var = this.s;
        currentWidth = n0Var.getCurrentWidth();
        currentHeight = n0Var.getCurrentHeight();
        kg.g gVar = n0Var.w;
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
        boolean z11 = (n0Var.x.Q / 90) % 2 == 1;
        matrix.preTranslate(gVar.d, gVar.e);
        float f14 = (gVar.f / f11) * containerWidth;
        r9 r9Var = n0Var.x;
        if (r9Var != null && (cropState = r9Var.m0) != null) {
            if (z10) {
                f7 = cropState.cropScale;
            }
            f7 = f14;
        }
        matrix.preScale(f7, f7);
        float f15 = gVar.b;
        float f16 = gVar.c;
        if (n0Var.y && z10) {
            MediaController.CropState cropState2 = n0Var.x.m0;
            float f17 = cropState2 == null ? 0.0f : !z11 ? cropState2.cropPx : cropState2.cropPy;
            float f18 = cropState2 == null ? 0.0f : !z11 ? cropState2.cropPy : cropState2.cropPx;
            f15 = f17;
            f16 = f18;
        }
        matrix.preTranslate(f15 * f12, f16 * f13);
        r9 r9Var2 = n0Var.x;
        float f19 = r9Var2.Q + gVar.g + i10;
        MediaController.CropState cropState3 = r9Var2.m0;
        if (cropState3 != null) {
            if (z10) {
                f10 = cropState3.cropRotate + cropState3.transformRotation;
            }
            f10 = f19;
        }
        matrix.preRotate(f10);
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
        float f7;
        float f10;
        float f11;
        boolean z11;
        n0 n0Var = this.s;
        int[] iArr = n0Var.s;
        int[] iArr2 = n0Var.v;
        e8 e8Var = n0Var.a;
        if (!z10) {
            canvas2 = canvas;
            f7 = 2.0f;
            f10 = 255.0f;
        } else {
            if (n0Var.r >= 1.0f) {
                return;
            }
            canvas2 = canvas;
            f7 = 2.0f;
            f10 = 255.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, e8Var.getWidth(), e8Var.getHeight(), (int) (Math.min(1.0f, (1.0f - n0Var.r) * 2.0f) * 255.0f), 31);
            canvas2.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
        canvas2.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (n0Var.r * f10));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (n0Var.r < 1.0f && !z10) {
            Path path = this.b;
            path.rewind();
            float width = e8Var.getWidth();
            float height = e8Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, n0Var.r, rectF);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, n0Var.r);
            path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        float f12 = n0Var.r;
        Matrix matrix = this.f;
        matrix.reset();
        Matrix matrix2 = this.h;
        matrix2.reset();
        matrix.preTranslate(-iArr[0], -iArr[1]);
        matrix.preTranslate(iArr2[0], iArr2[1]);
        matrix.preScale(e8Var.getWidth() / n0Var.x.i0, e8Var.getHeight() / n0Var.x.j0);
        matrix.preConcat(n0Var.x.n0);
        matrix.preTranslate(e8Var.getContentWidth() / f7, e8Var.getContentHeight() / f7);
        matrix2.preTranslate((getContainerWidth() / f7) + AndroidUtilities.dp(16.0f), org.telegram.messenger.a2.a(getContainerHeight(), AndroidUtilities.dp(32.0f), f7, !(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0.0f));
        if (z10) {
            Matrix matrix3 = this.d;
            float f13 = n0Var.r;
            Matrix matrix4 = this.n;
            AndroidUtilities.lerp(matrix, matrix3, f13, matrix4);
            matrix4.preRotate(-n0Var.x.Q);
            Matrix matrix5 = this.r;
            if (matrix4.invert(matrix5)) {
                r9 r9Var = n0Var.x;
                f11 = 2.0f;
                int i10 = r9Var.Q;
                MediaController.CropState cropState = r9Var.m0;
                boolean z12 = ((i10 + (cropState != null ? cropState.transformRotation : 0)) / 90) % 2 == 1;
                float contentWidth = e8Var.getContentWidth();
                float contentHeight = e8Var.getContentHeight();
                MediaController.CropState cropState2 = n0Var.x.m0;
                float f14 = cropState2 != null ? cropState2.cropPw : 1.0f;
                float f15 = cropState2 != null ? cropState2.cropPh : 1.0f;
                float f16 = ((z12 ? contentHeight : contentWidth) * f14) / 2.0f;
                if (!z12) {
                    contentWidth = contentHeight;
                }
                float f17 = (contentWidth * f15) / 2.0f;
                float lerp2 = AndroidUtilities.lerp(1.0f, 4.0f, f12);
                canvas2.concat(matrix4);
                canvas2.clipRect((-f16) * lerp2, (-f17) * lerp2, f16 * lerp2, f17 * lerp2);
                canvas2.concat(matrix5);
                a(matrix, true);
                a(matrix2, false);
                org.telegram.ui.Components.d6 d6Var = n0Var.b;
                if (n0Var.y) {
                    kg.n nVar = n0Var.f.L;
                    if (nVar != null) {
                        z11 = nVar.j;
                    }
                    z11 = false;
                } else {
                    MediaController.CropState cropState3 = n0Var.x.m0;
                    if (cropState3 != null && cropState3.mirrored) {
                        z11 = true;
                    }
                    z11 = false;
                }
                float e = d6Var.e(z11);
                float f18 = 1.0f - (e * f11);
                matrix2.preScale(f18, 1.0f);
                matrix.preScale(f18, 1.0f);
                float A = org.telegram.messenger.a2.A(1.0f, e, 4.0f * e, 0.25f);
                matrix2.preSkew(0.0f, A);
                matrix.preSkew(0.0f, A);
                matrix2.preTranslate((-e8Var.getContentWidth()) / f11, (-e8Var.getContentHeight()) / f11);
                matrix.preTranslate((-e8Var.getContentWidth()) / f11, (-e8Var.getContentHeight()) / f11);
                float f19 = n0Var.r;
                Matrix matrix6 = this.e;
                AndroidUtilities.lerp(matrix, matrix2, f19, matrix6);
                canvas2.concat(matrix6);
                Paint paint2 = e8Var.Q;
                Matrix matrix7 = e8Var.W;
                if (e8Var.n == null) {
                    canvas2.save();
                    canvas2.scale(e8Var.getContentWidth() / e8Var.getWidth(), e8Var.getContentHeight() / e8Var.getHeight());
                    canvas2.concat(e8Var.j0);
                    e8Var.n.draw(canvas2);
                    canvas2.restore();
                } else if (e8Var.a != null && e8Var.d != null) {
                    matrix7.reset();
                    matrix7.preScale(e8Var.d.k0 / e8Var.a.getWidth(), e8Var.d.l0 / e8Var.a.getHeight());
                    paint2.setAlpha(255);
                    canvas2.drawBitmap(e8Var.a, matrix7, paint2);
                }
                canvas2.restore();
                if (z10) {
                    return;
                }
                canvas2.restore();
                return;
            }
        }
        f11 = 2.0f;
        a(matrix, true);
        a(matrix2, false);
        org.telegram.ui.Components.d6 d6Var2 = n0Var.b;
        if (n0Var.y) {
        }
        float e7 = d6Var2.e(z11);
        float f182 = 1.0f - (e7 * f11);
        matrix2.preScale(f182, 1.0f);
        matrix.preScale(f182, 1.0f);
        float A2 = org.telegram.messenger.a2.A(1.0f, e7, 4.0f * e7, 0.25f);
        matrix2.preSkew(0.0f, A2);
        matrix.preSkew(0.0f, A2);
        matrix2.preTranslate((-e8Var.getContentWidth()) / f11, (-e8Var.getContentHeight()) / f11);
        matrix.preTranslate((-e8Var.getContentWidth()) / f11, (-e8Var.getContentHeight()) / f11);
        float f192 = n0Var.r;
        Matrix matrix62 = this.e;
        AndroidUtilities.lerp(matrix, matrix2, f192, matrix62);
        canvas2.concat(matrix62);
        Paint paint22 = e8Var.Q;
        Matrix matrix72 = e8Var.W;
        if (e8Var.n == null) {
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
