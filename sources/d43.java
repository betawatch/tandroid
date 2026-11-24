// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class d43 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f;
    public final Matrix h;
    public final Matrix n;
    public final Matrix r;
    public final /* synthetic */ e43 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d43(e43 e43Var, Context context) {
        super(context);
        this.s = e43Var;
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
        return ((getHeight() - (!(getContext() instanceof BubbleActivity) ? gm.m : 0.0f)) - this.s.f.E) - gm.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - gm.L(32.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        if (r15 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0060, code lost:
    
        if (r15 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Matrix matrix, boolean z) {
        int currentWidth;
        int currentHeight;
        ao6 ao6Var;
        e43 e43Var = this.s;
        currentWidth = e43Var.getCurrentWidth();
        currentHeight = e43Var.getCurrentHeight();
        n43 n43Var = e43Var.x;
        int i = n43Var.i;
        if (i == 90 || i == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float f = 1.0f;
        float f2 = 0.0f;
        float f3 = ((n43Var.l - 1.0f) * (z ? 1.0f : 0.0f)) + 1.0f;
        float f4 = currentWidth;
        float containerWidth = getContainerWidth() / f4;
        float f5 = currentHeight;
        if (containerWidth * f5 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f5;
        }
        boolean z2 = (e43Var.y.Q / 90) % 2 == 1;
        matrix.preTranslate(n43Var.d, n43Var.e);
        float f6 = (n43Var.f / f3) * containerWidth;
        g6b g6bVar = e43Var.y;
        if (g6bVar != null && (ao6Var = g6bVar.m0) != null) {
            if (z) {
                f = ao6Var.c;
            }
            f = f6;
        }
        matrix.preScale(f, f);
        float f7 = n43Var.b;
        float f8 = n43Var.c;
        if (e43Var.E && z) {
            ao6 ao6Var2 = e43Var.y.m0;
            float f9 = ao6Var2 == null ? 0.0f : !z2 ? ao6Var2.a : ao6Var2.b;
            f8 = ao6Var2 == null ? 0.0f : !z2 ? ao6Var2.b : ao6Var2.a;
            f7 = f9;
        }
        matrix.preTranslate(f7 * f4, f8 * f5);
        g6b g6bVar2 = e43Var.y;
        float f10 = g6bVar2.Q + n43Var.g + i;
        ao6 ao6Var3 = g6bVar2.m0;
        if (ao6Var3 != null) {
            if (z) {
                f2 = ao6Var3.d + ao6Var3.k;
            }
            f2 = f10;
        }
        matrix.preRotate(f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01d6, code lost:
    
        if (r9.l != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, boolean z) {
        float f;
        float f2;
        Canvas canvas2;
        float f3;
        boolean z2;
        boolean z3;
        float f4;
        float f5;
        e43 e43Var = this.s;
        int[] iArr = e43Var.s;
        int[] iArr2 = e43Var.w;
        k9b k9bVar = e43Var.a;
        if (!z) {
            f = 255.0f;
            f2 = 2.0f;
            canvas2 = canvas;
        } else {
            if (e43Var.r >= 1.0f) {
                return;
            }
            f = 255.0f;
            f2 = 2.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, k9bVar.getWidth(), k9bVar.getHeight(), (int) (Math.min(1.0f, (1.0f - e43Var.r) * 2.0f) * 255.0f), 31);
            canvas2.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
        canvas2.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (e43Var.r * f));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (e43Var.r < 1.0f && !z) {
            Path path = this.b;
            path.rewind();
            float width = k9bVar.getWidth();
            float height = k9bVar.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = gm.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            gm.X1(rectF, rectF2, e43Var.r, rectF);
            float U1 = gm.U1(e43Var.r, gm.L(12.0f), 0);
            path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        float f6 = e43Var.r;
        Matrix matrix = this.f;
        matrix.reset();
        Matrix matrix2 = this.h;
        matrix2.reset();
        matrix.preTranslate(-iArr[0], -iArr[1]);
        matrix.preTranslate(iArr2[0], iArr2[1]);
        matrix.preScale(k9bVar.getWidth() / e43Var.y.i0, k9bVar.getHeight() / e43Var.y.j0);
        matrix.preConcat(e43Var.y.n0);
        matrix.preTranslate(k9bVar.getContentWidth() / f2, k9bVar.getContentHeight() / f2);
        matrix2.preTranslate((getContainerWidth() / f2) + gm.L(16.0f), td4.e(getContainerHeight(), gm.L(32.0f), f2, !(getContext() instanceof BubbleActivity) ? gm.m : 0.0f));
        if (z) {
            float f7 = e43Var.r;
            Matrix matrix3 = this.n;
            Matrix matrix4 = this.d;
            f3 = f2;
            if (matrix4 != null) {
                float[] fArr = gm.h0;
                matrix.getValues(fArr);
                float[] fArr2 = gm.i0;
                matrix4.getValues(fArr2);
                gm.Y1(fArr, fArr2, f7, fArr2);
                matrix3.setValues(fArr2);
            }
            matrix3.preRotate(-e43Var.y.Q);
            Matrix matrix5 = this.r;
            if (matrix3.invert(matrix5)) {
                g6b g6bVar = e43Var.y;
                int i = g6bVar.Q;
                ao6 ao6Var = g6bVar.m0;
                boolean z4 = ((i + (ao6Var != null ? ao6Var.k : 0)) / 90) % 2 == 1;
                float contentWidth = k9bVar.getContentWidth();
                float contentHeight = k9bVar.getContentHeight();
                ao6 ao6Var2 = e43Var.y.m0;
                if (ao6Var2 != null) {
                    f4 = ao6Var2.e;
                    f5 = ao6Var2.f;
                } else {
                    f4 = 1.0f;
                    f5 = 1.0f;
                }
                float f8 = ((z4 ? contentHeight : contentWidth) * f4) / f3;
                if (!z4) {
                    contentWidth = contentHeight;
                }
                float f9 = (contentWidth * f5) / f3;
                float R1 = gm.R1(1.0f, 4.0f, f6);
                canvas2.concat(matrix3);
                canvas2.clipRect((-f8) * R1, (-f9) * R1, f8 * R1, f9 * R1);
                canvas2.concat(matrix5);
                z2 = true;
                a(matrix, z2);
                a(matrix2, false);
                ln lnVar = e43Var.b;
                if (e43Var.E) {
                    s43 s43Var = e43Var.f.M;
                    if (s43Var != null) {
                        z2 = s43Var.j;
                        z3 = z2;
                    }
                    z3 = false;
                } else {
                    ao6 ao6Var3 = e43Var.y.m0;
                    if (ao6Var3 != null) {
                    }
                    z3 = false;
                }
                float d = lnVar.d(z3);
                float f10 = 1.0f - (d * f3);
                matrix2.preScale(f10, 1.0f);
                matrix.preScale(f10, 1.0f);
                float z5 = td4.z(1.0f, d, 4.0f * d, 0.25f);
                matrix2.preSkew(0.0f, z5);
                matrix.preSkew(0.0f, z5);
                matrix2.preTranslate((-k9bVar.getContentWidth()) / f3, (-k9bVar.getContentHeight()) / f3);
                matrix.preTranslate((-k9bVar.getContentWidth()) / f3, (-k9bVar.getContentHeight()) / f3);
                float f11 = e43Var.r;
                float[] fArr3 = gm.h0;
                matrix.getValues(fArr3);
                float[] fArr4 = gm.i0;
                matrix2.getValues(fArr4);
                gm.Y1(fArr3, fArr4, f11, fArr4);
                Matrix matrix6 = this.e;
                matrix6.setValues(fArr4);
                canvas2.concat(matrix6);
                Paint paint2 = k9bVar.R;
                Matrix matrix7 = k9bVar.a0;
                if (k9bVar.n == null) {
                    canvas2.save();
                    canvas2.scale(k9bVar.getContentWidth() / k9bVar.getWidth(), k9bVar.getContentHeight() / k9bVar.getHeight());
                    canvas2.concat(k9bVar.k0);
                    k9bVar.n.draw(canvas2);
                    canvas2.restore();
                } else if (k9bVar.a != null && k9bVar.d != null) {
                    matrix7.reset();
                    matrix7.preScale(k9bVar.d.k0 / k9bVar.a.getWidth(), k9bVar.d.l0 / k9bVar.a.getHeight());
                    paint2.setAlpha(nm7.d4);
                    canvas2.drawBitmap(k9bVar.a, matrix7, paint2);
                }
                canvas2.restore();
                if (z) {
                    return;
                }
                canvas2.restore();
                return;
            }
        } else {
            f3 = f2;
        }
        z2 = true;
        a(matrix, z2);
        a(matrix2, false);
        ln lnVar2 = e43Var.b;
        if (e43Var.E) {
        }
        float d2 = lnVar2.d(z3);
        float f102 = 1.0f - (d2 * f3);
        matrix2.preScale(f102, 1.0f);
        matrix.preScale(f102, 1.0f);
        float z52 = td4.z(1.0f, d2, 4.0f * d2, 0.25f);
        matrix2.preSkew(0.0f, z52);
        matrix.preSkew(0.0f, z52);
        matrix2.preTranslate((-k9bVar.getContentWidth()) / f3, (-k9bVar.getContentHeight()) / f3);
        matrix.preTranslate((-k9bVar.getContentWidth()) / f3, (-k9bVar.getContentHeight()) / f3);
        float f112 = e43Var.r;
        float[] fArr32 = gm.h0;
        matrix.getValues(fArr32);
        float[] fArr42 = gm.i0;
        matrix2.getValues(fArr42);
        gm.Y1(fArr32, fArr42, f112, fArr42);
        Matrix matrix62 = this.e;
        matrix62.setValues(fArr42);
        canvas2.concat(matrix62);
        Paint paint22 = k9bVar.R;
        Matrix matrix72 = k9bVar.a0;
        if (k9bVar.n == null) {
        }
        canvas2.restore();
        if (z) {
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
