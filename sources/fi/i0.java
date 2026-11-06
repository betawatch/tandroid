package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.qs;
import org.telegram.messenger.ye;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
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
        return ((getHeight() - (!(getContext() instanceof BubbleActivity) ? org.telegram.messenger.g0.m : 0.0f)) - this.s.f.D) - org.telegram.messenger.g0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.g0.L(32.0f);
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
    public final void a(Matrix matrix, boolean z9) {
        int currentWidth;
        int currentHeight;
        ye yeVar;
        j0 j0Var = this.s;
        currentWidth = j0Var.getCurrentWidth();
        currentHeight = j0Var.getCurrentHeight();
        og.g gVar = j0Var.x;
        int i7 = gVar.i;
        if (i7 == 90 || i7 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float f10 = 1.0f;
        float f11 = 0.0f;
        float f12 = ((gVar.l - 1.0f) * (z9 ? 1.0f : 0.0f)) + 1.0f;
        float f13 = currentWidth;
        float containerWidth = getContainerWidth() / f13;
        float f14 = currentHeight;
        if (containerWidth * f14 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f14;
        }
        boolean z10 = (j0Var.y.Q / 90) % 2 == 1;
        matrix.preTranslate(gVar.d, gVar.e);
        float f15 = (gVar.f / f12) * containerWidth;
        e7 e7Var = j0Var.y;
        if (e7Var != null && (yeVar = e7Var.m0) != null) {
            if (z9) {
                f10 = yeVar.c;
            }
            f10 = f15;
        }
        matrix.preScale(f10, f10);
        float f16 = gVar.b;
        float f17 = gVar.c;
        if (j0Var.D && z9) {
            ye yeVar2 = j0Var.y.m0;
            float f18 = yeVar2 == null ? 0.0f : !z10 ? yeVar2.a : yeVar2.b;
            float f19 = yeVar2 == null ? 0.0f : !z10 ? yeVar2.b : yeVar2.a;
            f16 = f18;
            f17 = f19;
        }
        matrix.preTranslate(f16 * f13, f17 * f14);
        e7 e7Var2 = j0Var.y;
        float f20 = e7Var2.Q + gVar.g + i7;
        ye yeVar3 = e7Var2.m0;
        if (yeVar3 != null) {
            if (z9) {
                f11 = yeVar3.d + yeVar3.k;
            }
            f11 = f20;
        }
        matrix.preRotate(f11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01df, code lost:
    
        if (r9.l != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, boolean z9) {
        float f10;
        float f11;
        Canvas canvas2;
        float f12;
        boolean z10;
        boolean z11;
        j0 j0Var = this.s;
        int[] iArr = j0Var.s;
        int[] iArr2 = j0Var.w;
        y5 y5Var = j0Var.a;
        if (!z9) {
            f10 = 255.0f;
            f11 = 2.0f;
            canvas2 = canvas;
        } else {
            if (j0Var.r >= 1.0f) {
                return;
            }
            f10 = 255.0f;
            f11 = 2.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, y5Var.getWidth(), y5Var.getHeight(), (int) (Math.min(1.0f, (1.0f - j0Var.r) * 2.0f) * 255.0f), 31);
            canvas2.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
        canvas2.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (j0Var.r * f10));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (j0Var.r < 1.0f && !z9) {
            Path path = this.b;
            path.rewind();
            float width = y5Var.getWidth();
            float height = y5Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            org.telegram.messenger.g0.Z1(rectF, rectF2, j0Var.r, rectF);
            float W1 = org.telegram.messenger.g0.W1(j0Var.r, org.telegram.messenger.g0.L(12.0f), 0);
            path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        float f13 = j0Var.r;
        Matrix matrix = this.f;
        matrix.reset();
        Matrix matrix2 = this.h;
        matrix2.reset();
        matrix.preTranslate(-iArr[0], -iArr[1]);
        matrix.preTranslate(iArr2[0], iArr2[1]);
        matrix.preScale(y5Var.getWidth() / j0Var.y.i0, y5Var.getHeight() / j0Var.y.j0);
        matrix.preConcat(j0Var.y.n0);
        matrix.preTranslate(y5Var.getContentWidth() / f11, y5Var.getContentHeight() / f11);
        matrix2.preTranslate((getContainerWidth() / f11) + org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.k5.a(getContainerHeight(), org.telegram.messenger.g0.L(32.0f), f11, !(getContext() instanceof BubbleActivity) ? org.telegram.messenger.g0.m : 0.0f));
        if (z9) {
            float f14 = j0Var.r;
            Matrix matrix3 = this.n;
            Matrix matrix4 = this.d;
            if (matrix4 == null) {
                f12 = f11;
            } else {
                f12 = f11;
                float[] fArr = org.telegram.messenger.g0.h0;
                matrix.getValues(fArr);
                float[] fArr2 = org.telegram.messenger.g0.i0;
                matrix4.getValues(fArr2);
                org.telegram.messenger.g0.a2(fArr, fArr2, f14, fArr2);
                matrix3.setValues(fArr2);
            }
            matrix3.preRotate(-j0Var.y.Q);
            Matrix matrix5 = this.r;
            if (matrix3.invert(matrix5)) {
                e7 e7Var = j0Var.y;
                int i7 = e7Var.Q;
                ye yeVar = e7Var.m0;
                boolean z12 = ((i7 + (yeVar != null ? yeVar.k : 0)) / 90) % 2 == 1;
                float contentWidth = y5Var.getContentWidth();
                float contentHeight = y5Var.getContentHeight();
                ye yeVar2 = j0Var.y.m0;
                float f15 = yeVar2 != null ? yeVar2.e : 1.0f;
                float f16 = yeVar2 != null ? yeVar2.f : 1.0f;
                float f17 = ((z12 ? contentHeight : contentWidth) * f15) / f12;
                if (!z12) {
                    contentWidth = contentHeight;
                }
                float f18 = (contentWidth * f16) / f12;
                float T1 = org.telegram.messenger.g0.T1(1.0f, 4.0f, f13);
                canvas2.concat(matrix3);
                canvas2.clipRect((-f17) * T1, (-f18) * T1, f17 * T1, f18 * T1);
                canvas2.concat(matrix5);
                z10 = true;
                a(matrix, z10);
                a(matrix2, false);
                org.telegram.ui.Components.w5 w5Var = j0Var.b;
                if (j0Var.D) {
                    og.m mVar = j0Var.f.L;
                    if (mVar != null) {
                        z10 = mVar.j;
                        z11 = z10;
                    }
                    z11 = false;
                } else {
                    ye yeVar3 = j0Var.y.m0;
                    if (yeVar3 != null) {
                    }
                    z11 = false;
                }
                float d = w5Var.d(z11);
                float f19 = 1.0f - (d * f12);
                matrix2.preScale(f19, 1.0f);
                matrix.preScale(f19, 1.0f);
                float A = org.telegram.messenger.k5.A(1.0f, d, 4.0f * d, 0.25f);
                matrix2.preSkew(0.0f, A);
                matrix.preSkew(0.0f, A);
                matrix2.preTranslate((-y5Var.getContentWidth()) / f12, (-y5Var.getContentHeight()) / f12);
                matrix.preTranslate((-y5Var.getContentWidth()) / f12, (-y5Var.getContentHeight()) / f12);
                float f20 = j0Var.r;
                float[] fArr3 = org.telegram.messenger.g0.h0;
                matrix.getValues(fArr3);
                float[] fArr4 = org.telegram.messenger.g0.i0;
                matrix2.getValues(fArr4);
                org.telegram.messenger.g0.a2(fArr3, fArr4, f20, fArr4);
                Matrix matrix6 = this.e;
                matrix6.setValues(fArr4);
                canvas2.concat(matrix6);
                Paint paint2 = y5Var.Q;
                Matrix matrix7 = y5Var.W;
                if (y5Var.n == null) {
                    canvas2.save();
                    canvas2.scale(y5Var.getContentWidth() / y5Var.getWidth(), y5Var.getContentHeight() / y5Var.getHeight());
                    canvas2.concat(y5Var.j0);
                    y5Var.n.draw(canvas2);
                    canvas2.restore();
                } else if (y5Var.a != null && y5Var.d != null) {
                    matrix7.reset();
                    matrix7.preScale(y5Var.d.k0 / y5Var.a.getWidth(), y5Var.d.l0 / y5Var.a.getHeight());
                    paint2.setAlpha(qs.e4);
                    canvas2.drawBitmap(y5Var.a, matrix7, paint2);
                }
                canvas2.restore();
                if (z9) {
                    return;
                }
                canvas2.restore();
                return;
            }
        } else {
            f12 = f11;
        }
        z10 = true;
        a(matrix, z10);
        a(matrix2, false);
        org.telegram.ui.Components.w5 w5Var2 = j0Var.b;
        if (j0Var.D) {
        }
        float d2 = w5Var2.d(z11);
        float f192 = 1.0f - (d2 * f12);
        matrix2.preScale(f192, 1.0f);
        matrix.preScale(f192, 1.0f);
        float A2 = org.telegram.messenger.k5.A(1.0f, d2, 4.0f * d2, 0.25f);
        matrix2.preSkew(0.0f, A2);
        matrix.preSkew(0.0f, A2);
        matrix2.preTranslate((-y5Var.getContentWidth()) / f12, (-y5Var.getContentHeight()) / f12);
        matrix.preTranslate((-y5Var.getContentWidth()) / f12, (-y5Var.getContentHeight()) / f12);
        float f202 = j0Var.r;
        float[] fArr32 = org.telegram.messenger.g0.h0;
        matrix.getValues(fArr32);
        float[] fArr42 = org.telegram.messenger.g0.i0;
        matrix2.getValues(fArr42);
        org.telegram.messenger.g0.a2(fArr32, fArr42, f202, fArr42);
        Matrix matrix62 = this.e;
        matrix62.setValues(fArr42);
        canvas2.concat(matrix62);
        Paint paint22 = y5Var.Q;
        Matrix matrix72 = y5Var.W;
        if (y5Var.n == null) {
        }
        canvas2.restore();
        if (z9) {
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.s.y == null) {
            return;
        }
        b(canvas, false);
    }
}
