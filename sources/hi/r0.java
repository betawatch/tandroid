package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ks;
import org.telegram.messenger.we;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class r0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f;
    public final Matrix h;
    public final Matrix n;
    public final Matrix r;
    public final /* synthetic */ s0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, Context context) {
        super(context);
        this.s = s0Var;
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
        return ((getHeight() - (!(getContext() instanceof BubbleActivity) ? org.telegram.messenger.g0.m : 0.0f)) - this.s.f.E) - org.telegram.messenger.g0.L(32.0f);
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
    public final void a(Matrix matrix, boolean z10) {
        int currentWidth;
        int currentHeight;
        we weVar;
        s0 s0Var = this.s;
        currentWidth = s0Var.getCurrentWidth();
        currentHeight = s0Var.getCurrentHeight();
        og.g gVar = s0Var.x;
        int i7 = gVar.i;
        if (i7 == 90 || i7 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float f10 = 1.0f;
        float f11 = 0.0f;
        float f12 = ((gVar.l - 1.0f) * (z10 ? 1.0f : 0.0f)) + 1.0f;
        float f13 = currentWidth;
        float containerWidth = getContainerWidth() / f13;
        float f14 = currentHeight;
        if (containerWidth * f14 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f14;
        }
        boolean z11 = (s0Var.y.Q / 90) % 2 == 1;
        matrix.preTranslate(gVar.d, gVar.e);
        float f15 = (gVar.f / f12) * containerWidth;
        x7 x7Var = s0Var.y;
        if (x7Var != null && (weVar = x7Var.m0) != null) {
            if (z10) {
                f10 = weVar.c;
            }
            f10 = f15;
        }
        matrix.preScale(f10, f10);
        float f16 = gVar.b;
        float f17 = gVar.c;
        if (s0Var.E && z10) {
            we weVar2 = s0Var.y.m0;
            float f18 = weVar2 == null ? 0.0f : !z11 ? weVar2.a : weVar2.b;
            float f19 = weVar2 == null ? 0.0f : !z11 ? weVar2.b : weVar2.a;
            f16 = f18;
            f17 = f19;
        }
        matrix.preTranslate(f16 * f13, f17 * f14);
        x7 x7Var2 = s0Var.y;
        float f20 = x7Var2.Q + gVar.g + i7;
        we weVar3 = x7Var2.m0;
        if (weVar3 != null) {
            if (z10) {
                f11 = weVar3.d + weVar3.k;
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
    public final void b(Canvas canvas, boolean z10) {
        float f10;
        float f11;
        Canvas canvas2;
        float f12;
        boolean z11;
        boolean z12;
        s0 s0Var = this.s;
        int[] iArr = s0Var.s;
        int[] iArr2 = s0Var.w;
        f6 f6Var = s0Var.a;
        if (!z10) {
            f10 = 255.0f;
            f11 = 2.0f;
            canvas2 = canvas;
        } else {
            if (s0Var.r >= 1.0f) {
                return;
            }
            f10 = 255.0f;
            f11 = 2.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, f6Var.getWidth(), f6Var.getHeight(), (int) (Math.min(1.0f, (1.0f - s0Var.r) * 2.0f) * 255.0f), 31);
            canvas2.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
        canvas2.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (s0Var.r * f10));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (s0Var.r < 1.0f && !z10) {
            Path path = this.b;
            path.rewind();
            float width = f6Var.getWidth();
            float height = f6Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            org.telegram.messenger.g0.Z1(rectF, rectF2, s0Var.r, rectF);
            float W1 = org.telegram.messenger.g0.W1(s0Var.r, org.telegram.messenger.g0.L(12.0f), 0);
            path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        float f13 = s0Var.r;
        Matrix matrix = this.f;
        matrix.reset();
        Matrix matrix2 = this.h;
        matrix2.reset();
        matrix.preTranslate(-iArr[0], -iArr[1]);
        matrix.preTranslate(iArr2[0], iArr2[1]);
        matrix.preScale(f6Var.getWidth() / s0Var.y.i0, f6Var.getHeight() / s0Var.y.j0);
        matrix.preConcat(s0Var.y.n0);
        matrix.preTranslate(f6Var.getContentWidth() / f11, f6Var.getContentHeight() / f11);
        matrix2.preTranslate((getContainerWidth() / f11) + org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.f3.a(getContainerHeight(), org.telegram.messenger.g0.L(32.0f), f11, !(getContext() instanceof BubbleActivity) ? org.telegram.messenger.g0.m : 0.0f));
        if (z10) {
            float f14 = s0Var.r;
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
            matrix3.preRotate(-s0Var.y.Q);
            Matrix matrix5 = this.r;
            if (matrix3.invert(matrix5)) {
                x7 x7Var = s0Var.y;
                int i7 = x7Var.Q;
                we weVar = x7Var.m0;
                boolean z13 = ((i7 + (weVar != null ? weVar.k : 0)) / 90) % 2 == 1;
                float contentWidth = f6Var.getContentWidth();
                float contentHeight = f6Var.getContentHeight();
                we weVar2 = s0Var.y.m0;
                float f15 = weVar2 != null ? weVar2.e : 1.0f;
                float f16 = weVar2 != null ? weVar2.f : 1.0f;
                float f17 = ((z13 ? contentHeight : contentWidth) * f15) / f12;
                if (!z13) {
                    contentWidth = contentHeight;
                }
                float f18 = (contentWidth * f16) / f12;
                float T1 = org.telegram.messenger.g0.T1(1.0f, 4.0f, f13);
                canvas2.concat(matrix3);
                canvas2.clipRect((-f17) * T1, (-f18) * T1, f17 * T1, f18 * T1);
                canvas2.concat(matrix5);
                z11 = true;
                a(matrix, z11);
                a(matrix2, false);
                org.telegram.ui.Components.c6 c6Var = s0Var.b;
                if (s0Var.E) {
                    og.m mVar = s0Var.f.M;
                    if (mVar != null) {
                        z11 = mVar.j;
                        z12 = z11;
                    }
                    z12 = false;
                } else {
                    we weVar3 = s0Var.y.m0;
                    if (weVar3 != null) {
                    }
                    z12 = false;
                }
                float d = c6Var.d(z12);
                float f19 = 1.0f - (d * f12);
                matrix2.preScale(f19, 1.0f);
                matrix.preScale(f19, 1.0f);
                float A = org.telegram.messenger.f3.A(1.0f, d, 4.0f * d, 0.25f);
                matrix2.preSkew(0.0f, A);
                matrix.preSkew(0.0f, A);
                matrix2.preTranslate((-f6Var.getContentWidth()) / f12, (-f6Var.getContentHeight()) / f12);
                matrix.preTranslate((-f6Var.getContentWidth()) / f12, (-f6Var.getContentHeight()) / f12);
                float f20 = s0Var.r;
                float[] fArr3 = org.telegram.messenger.g0.h0;
                matrix.getValues(fArr3);
                float[] fArr4 = org.telegram.messenger.g0.i0;
                matrix2.getValues(fArr4);
                org.telegram.messenger.g0.a2(fArr3, fArr4, f20, fArr4);
                Matrix matrix6 = this.e;
                matrix6.setValues(fArr4);
                canvas2.concat(matrix6);
                Paint paint2 = f6Var.R;
                Matrix matrix7 = f6Var.a0;
                if (f6Var.n == null) {
                    canvas2.save();
                    canvas2.scale(f6Var.getContentWidth() / f6Var.getWidth(), f6Var.getContentHeight() / f6Var.getHeight());
                    canvas2.concat(f6Var.k0);
                    f6Var.n.draw(canvas2);
                    canvas2.restore();
                } else if (f6Var.a != null && f6Var.d != null) {
                    matrix7.reset();
                    matrix7.preScale(f6Var.d.k0 / f6Var.a.getWidth(), f6Var.d.l0 / f6Var.a.getHeight());
                    paint2.setAlpha(ks.e4);
                    canvas2.drawBitmap(f6Var.a, matrix7, paint2);
                }
                canvas2.restore();
                if (z10) {
                    return;
                }
                canvas2.restore();
                return;
            }
        } else {
            f12 = f11;
        }
        z11 = true;
        a(matrix, z11);
        a(matrix2, false);
        org.telegram.ui.Components.c6 c6Var2 = s0Var.b;
        if (s0Var.E) {
        }
        float d2 = c6Var2.d(z12);
        float f192 = 1.0f - (d2 * f12);
        matrix2.preScale(f192, 1.0f);
        matrix.preScale(f192, 1.0f);
        float A2 = org.telegram.messenger.f3.A(1.0f, d2, 4.0f * d2, 0.25f);
        matrix2.preSkew(0.0f, A2);
        matrix.preSkew(0.0f, A2);
        matrix2.preTranslate((-f6Var.getContentWidth()) / f12, (-f6Var.getContentHeight()) / f12);
        matrix.preTranslate((-f6Var.getContentWidth()) / f12, (-f6Var.getContentHeight()) / f12);
        float f202 = s0Var.r;
        float[] fArr32 = org.telegram.messenger.g0.h0;
        matrix.getValues(fArr32);
        float[] fArr42 = org.telegram.messenger.g0.i0;
        matrix2.getValues(fArr42);
        org.telegram.messenger.g0.a2(fArr32, fArr42, f202, fArr42);
        Matrix matrix62 = this.e;
        matrix62.setValues(fArr42);
        canvas2.concat(matrix62);
        Paint paint22 = f6Var.R;
        Matrix matrix72 = f6Var.a0;
        if (f6Var.n == null) {
        }
        canvas2.restore();
        if (z10) {
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
