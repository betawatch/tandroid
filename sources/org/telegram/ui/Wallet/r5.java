package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class r5 extends FrameLayout {
    public final Matrix a;
    public boolean b;
    public final Path c;
    public final float[] d;
    public final /* synthetic */ s5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(s5 s5Var, Context context) {
        super(context);
        this.e = s5Var;
        this.a = new Matrix();
        this.c = new Path();
        this.d = new float[8];
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s5 s5Var = this.e;
        o5 o5Var = s5Var.b;
        if (o5Var != null) {
            float[] fArr = (float[]) s5Var.f.b;
            float[] fArr2 = o5Var.k;
            float[] fArr3 = o5Var.l;
            Paint paint = o5Var.b;
            Paint paint2 = o5Var.d;
            Path path = o5Var.p;
            if (o5Var.q != 0.0f) {
                int a2 = h7.a(fArr, -16216082);
                int a10 = h7.a(fArr, -15291399);
                paint.setShader(null);
                paint.setAlpha(255);
                paint.setColor(o5.d(0.55f, 0.0f, 0.0f, a2, a10));
                path.rewind();
                boolean z10 = true;
                path.moveTo(fArr3[0], fArr3[1]);
                int i10 = 1;
                while (i10 < 76) {
                    int i11 = i10 * 2;
                    path.lineTo(fArr3[i11], fArr3[i11 + 1]);
                    i10++;
                    z10 = z10;
                }
                path.close();
                canvas.drawPath(path, paint);
                paint2.setShader(null);
                paint2.setAlpha(255);
                float f7 = 0.6f;
                paint2.setStrokeWidth(o5Var.q * 0.6f);
                int[] iArr = o5Var.o;
                int length = iArr.length;
                int i12 = 0;
                while (i12 < length) {
                    int i13 = iArr[i12];
                    int i14 = (i13 + 1) % 76;
                    int i15 = i13 * 2;
                    int i16 = i14 * 2;
                    float[] fArr4 = o5Var.j;
                    float f10 = (fArr4[i15] + fArr4[i16]) * 0.5f;
                    int i17 = i15 + 1;
                    int i18 = i16 + 1;
                    float f11 = (fArr4[i17] + fArr4[i18]) * 0.5f;
                    float f12 = f7;
                    int[] iArr2 = iArr;
                    int i19 = length;
                    float sqrt = 1.0f / ((float) Math.sqrt(r4.c.c(f11, f11, f10 * f10, 0.0144f)));
                    float f13 = f10 * sqrt;
                    float f14 = f11 * sqrt;
                    int d = o5.d((0.38f * o5.c((o5Var.Y * (o5Var.r ? -0.12f : 0.12f) * sqrt) + (o5Var.X * f14) + (o5Var.W * f13))) + 0.36f, 0.06f, ((float) Math.pow(o5.c((r2 * o5Var.b0) + (f14 * o5Var.a0) + (f13 * o5Var.Z)), 24.0d)) * 0.1f, a2, a10);
                    paint.setColor(d);
                    paint2.setColor(d);
                    path.rewind();
                    path.moveTo(fArr2[i15], fArr2[i17]);
                    path.lineTo(fArr2[i16], fArr2[i18]);
                    path.lineTo(fArr3[i16], fArr3[i18]);
                    path.lineTo(fArr3[i15], fArr3[i17]);
                    path.close();
                    paint2.setStrokeWidth(o5Var.q * f12);
                    canvas.drawPath(path, paint);
                    canvas.drawPath(path, paint2);
                    paint2.setColor(o5.d(0.75f, 0.0f, 0.0f, d, d));
                    paint2.setStrokeWidth(o5Var.q * 0.7f);
                    canvas.drawLine(fArr3[i15], fArr3[i17], fArr3[i16], fArr3[i18], paint2);
                    i12++;
                    iArr = iArr2;
                    f7 = f12;
                    length = i19;
                }
            }
        }
        if (this.b) {
            int save = canvas.save();
            canvas.concat(this.a);
            float width = getWidth();
            float height = getHeight();
            Path path2 = this.c;
            path2.rewind();
            path2.addRoundRect(0.0f, 0.0f, width, height, (width * 0.15f) / 2.0f, (0.15f * height) / 1.212122f, Path.Direction.CW);
            canvas.clipPath(path2);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        s5 s5Var = this.e;
        s5Var.f0 = -1;
        s5Var.b(s5Var.W, s5Var.c0);
    }
}
