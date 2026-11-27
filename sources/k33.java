// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class k33 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f;
    public final Matrix h;
    public final Matrix n;
    public final Matrix r;
    public final /* synthetic */ l33 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k33(l33 l33Var, Context context) {
        super(context);
        this.s = l33Var;
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
        return ((getHeight() - (!(getContext() instanceof BubbleActivity) ? hl.m : 0.0f)) - this.s.f.E) - hl.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - hl.L(32.0f);
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
        fo6 fo6Var;
        l33 l33Var = this.s;
        currentWidth = l33Var.getCurrentWidth();
        currentHeight = l33Var.getCurrentHeight();
        u33 u33Var = l33Var.x;
        int i = u33Var.i;
        if (i == 90 || i == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float f = 1.0f;
        float f2 = 0.0f;
        float f3 = ((u33Var.l - 1.0f) * (z ? 1.0f : 0.0f)) + 1.0f;
        float f4 = currentWidth;
        float containerWidth = getContainerWidth() / f4;
        float f5 = currentHeight;
        if (containerWidth * f5 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f5;
        }
        boolean z2 = (l33Var.y.Q / 90) % 2 == 1;
        matrix.preTranslate(u33Var.d, u33Var.e);
        float f6 = (u33Var.f / f3) * containerWidth;
        c8b c8bVar = l33Var.y;
        if (c8bVar != null && (fo6Var = c8bVar.m0) != null) {
            if (z) {
                f = fo6Var.c;
            }
            f = f6;
        }
        matrix.preScale(f, f);
        float f7 = u33Var.b;
        float f8 = u33Var.c;
        if (l33Var.E && z) {
            fo6 fo6Var2 = l33Var.y.m0;
            float f9 = fo6Var2 == null ? 0.0f : !z2 ? fo6Var2.a : fo6Var2.b;
            f8 = fo6Var2 == null ? 0.0f : !z2 ? fo6Var2.b : fo6Var2.a;
            f7 = f9;
        }
        matrix.preTranslate(f7 * f4, f8 * f5);
        c8b c8bVar2 = l33Var.y;
        float f10 = c8bVar2.Q + u33Var.g + i;
        fo6 fo6Var3 = c8bVar2.m0;
        if (fo6Var3 != null) {
            if (z) {
                f2 = fo6Var3.d + fo6Var3.k;
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
        l33 l33Var = this.s;
        int[] iArr = l33Var.s;
        int[] iArr2 = l33Var.w;
        gbb gbbVar = l33Var.a;
        if (!z) {
            f = 255.0f;
            f2 = 2.0f;
            canvas2 = canvas;
        } else {
            if (l33Var.r >= 1.0f) {
                return;
            }
            f = 255.0f;
            f2 = 2.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, gbbVar.getWidth(), gbbVar.getHeight(), (int) (Math.min(1.0f, (1.0f - l33Var.r) * 2.0f) * 255.0f), 31);
            canvas2.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
        canvas2.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (l33Var.r * f));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (l33Var.r < 1.0f && !z) {
            Path path = this.b;
            path.rewind();
            float width = gbbVar.getWidth();
            float height = gbbVar.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = hl.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            hl.X1(rectF, rectF2, l33Var.r, rectF);
            float U1 = hl.U1(l33Var.r, hl.L(12.0f), 0);
            path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        float f6 = l33Var.r;
        Matrix matrix = this.f;
        matrix.reset();
        Matrix matrix2 = this.h;
        matrix2.reset();
        matrix.preTranslate(-iArr[0], -iArr[1]);
        matrix.preTranslate(iArr2[0], iArr2[1]);
        matrix.preScale(gbbVar.getWidth() / l33Var.y.i0, gbbVar.getHeight() / l33Var.y.j0);
        matrix.preConcat(l33Var.y.n0);
        matrix.preTranslate(gbbVar.getContentWidth() / f2, gbbVar.getContentHeight() / f2);
        matrix2.preTranslate((getContainerWidth() / f2) + hl.L(16.0f), qd4.e(getContainerHeight(), hl.L(32.0f), f2, !(getContext() instanceof BubbleActivity) ? hl.m : 0.0f));
        if (z) {
            float f7 = l33Var.r;
            Matrix matrix3 = this.n;
            Matrix matrix4 = this.d;
            f3 = f2;
            if (matrix4 != null) {
                float[] fArr = hl.h0;
                matrix.getValues(fArr);
                float[] fArr2 = hl.i0;
                matrix4.getValues(fArr2);
                hl.Y1(fArr, fArr2, f7, fArr2);
                matrix3.setValues(fArr2);
            }
            matrix3.preRotate(-l33Var.y.Q);
            Matrix matrix5 = this.r;
            if (matrix3.invert(matrix5)) {
                c8b c8bVar = l33Var.y;
                int i = c8bVar.Q;
                fo6 fo6Var = c8bVar.m0;
                boolean z4 = ((i + (fo6Var != null ? fo6Var.k : 0)) / 90) % 2 == 1;
                float contentWidth = gbbVar.getContentWidth();
                float contentHeight = gbbVar.getContentHeight();
                fo6 fo6Var2 = l33Var.y.m0;
                if (fo6Var2 != null) {
                    f4 = fo6Var2.e;
                    f5 = fo6Var2.f;
                } else {
                    f4 = 1.0f;
                    f5 = 1.0f;
                }
                float f8 = ((z4 ? contentHeight : contentWidth) * f4) / f3;
                if (!z4) {
                    contentWidth = contentHeight;
                }
                float f9 = (contentWidth * f5) / f3;
                float R1 = hl.R1(1.0f, 4.0f, f6);
                canvas2.concat(matrix3);
                canvas2.clipRect((-f8) * R1, (-f9) * R1, f8 * R1, f9 * R1);
                canvas2.concat(matrix5);
                z2 = true;
                a(matrix, z2);
                a(matrix2, false);
                mm mmVar = l33Var.b;
                if (l33Var.E) {
                    z33 z33Var = l33Var.f.M;
                    if (z33Var != null) {
                        z2 = z33Var.j;
                        z3 = z2;
                    }
                    z3 = false;
                } else {
                    fo6 fo6Var3 = l33Var.y.m0;
                    if (fo6Var3 != null) {
                    }
                    z3 = false;
                }
                float d = mmVar.d(z3);
                float f10 = 1.0f - (d * f3);
                matrix2.preScale(f10, 1.0f);
                matrix.preScale(f10, 1.0f);
                float z5 = qd4.z(1.0f, d, 4.0f * d, 0.25f);
                matrix2.preSkew(0.0f, z5);
                matrix.preSkew(0.0f, z5);
                matrix2.preTranslate((-gbbVar.getContentWidth()) / f3, (-gbbVar.getContentHeight()) / f3);
                matrix.preTranslate((-gbbVar.getContentWidth()) / f3, (-gbbVar.getContentHeight()) / f3);
                float f11 = l33Var.r;
                float[] fArr3 = hl.h0;
                matrix.getValues(fArr3);
                float[] fArr4 = hl.i0;
                matrix2.getValues(fArr4);
                hl.Y1(fArr3, fArr4, f11, fArr4);
                Matrix matrix6 = this.e;
                matrix6.setValues(fArr4);
                canvas2.concat(matrix6);
                Paint paint2 = gbbVar.R;
                Matrix matrix7 = gbbVar.a0;
                if (gbbVar.n == null) {
                    canvas2.save();
                    canvas2.scale(gbbVar.getContentWidth() / gbbVar.getWidth(), gbbVar.getContentHeight() / gbbVar.getHeight());
                    canvas2.concat(gbbVar.k0);
                    gbbVar.n.draw(canvas2);
                    canvas2.restore();
                } else if (gbbVar.a != null && gbbVar.d != null) {
                    matrix7.reset();
                    matrix7.preScale(gbbVar.d.k0 / gbbVar.a.getWidth(), gbbVar.d.l0 / gbbVar.a.getHeight());
                    paint2.setAlpha(jn7.d4);
                    canvas2.drawBitmap(gbbVar.a, matrix7, paint2);
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
        mm mmVar2 = l33Var.b;
        if (l33Var.E) {
        }
        float d2 = mmVar2.d(z3);
        float f102 = 1.0f - (d2 * f3);
        matrix2.preScale(f102, 1.0f);
        matrix.preScale(f102, 1.0f);
        float z52 = qd4.z(1.0f, d2, 4.0f * d2, 0.25f);
        matrix2.preSkew(0.0f, z52);
        matrix.preSkew(0.0f, z52);
        matrix2.preTranslate((-gbbVar.getContentWidth()) / f3, (-gbbVar.getContentHeight()) / f3);
        matrix.preTranslate((-gbbVar.getContentWidth()) / f3, (-gbbVar.getContentHeight()) / f3);
        float f112 = l33Var.r;
        float[] fArr32 = hl.h0;
        matrix.getValues(fArr32);
        float[] fArr42 = hl.i0;
        matrix2.getValues(fArr42);
        hl.Y1(fArr32, fArr42, f112, fArr42);
        Matrix matrix62 = this.e;
        matrix62.setValues(fArr42);
        canvas2.concat(matrix62);
        Paint paint22 = gbbVar.R;
        Matrix matrix72 = gbbVar.a0;
        if (gbbVar.n == null) {
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
