package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class n5 extends View {
    public final Paint a;
    public final Matrix b;
    public final Path c;
    public SweepGradient d;
    public float[] e;
    public final Paint f;
    public float h;
    public float n;

    public n5(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Matrix();
        this.c = new Path();
        this.f = new Paint(1);
        setClipToOutline(true);
        setOutlineProvider(new dh.b(this, 7));
        if (Build.VERSION.SDK_INT >= 31) {
            setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Shader.TileMode.CLAMP));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int m10;
        int i10;
        int i11;
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a);
        if (this.e != null) {
            for (int i12 = 0; i12 < 2; i12++) {
                int i13 = i12 * 3;
                int i14 = i12 * 4;
                int i15 = i14 + 10;
                float[] fArr = this.e;
                if (fArr.length >= 18) {
                    float f7 = fArr[i15];
                    if (f7 >= 0.0f) {
                        int i16 = i14 + 11;
                        i10 = k7.l(-16216082, (int) f7, (int) fArr[i16]);
                        float[] fArr2 = this.e;
                        m10 = k7.l(-15291399, (int) fArr2[i15], (int) fArr2[i16]);
                        SweepGradient sweepGradient = new SweepGradient(this.h, this.n, new int[]{i10, m10, i10, m10, i10}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f});
                        sweepGradient.setLocalMatrix(this.b);
                        Paint paint = this.f;
                        paint.setShader(sweepGradient);
                        if (i12 == 1) {
                            float[] fArr3 = this.e;
                            if (fArr3[9] > 0.5f) {
                                i11 = Math.round(fArr3[8] * 255.0f);
                                paint.setAlpha(i11);
                                canvas.save();
                                if (i12 == 1) {
                                    float[] fArr4 = this.e;
                                    if (fArr4[9] < 0.5f && fArr4[8] < 1.0f) {
                                        Path path = new Path();
                                        path.addCircle(this.e[6] * getWidth(), this.e[7] * getHeight(), this.e[8] * getWidth() * 1.2f, Path.Direction.CW);
                                        canvas.clipPath(path);
                                    }
                                }
                                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
                                canvas.restore();
                            }
                        }
                        i11 = 255;
                        paint.setAlpha(i11);
                        canvas.save();
                        if (i12 == 1) {
                        }
                        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
                        canvas.restore();
                    }
                }
                int m11 = k7.m(fArr, -16216082, i13);
                m10 = k7.m(this.e, -15291399, i13);
                i10 = m11;
                SweepGradient sweepGradient2 = new SweepGradient(this.h, this.n, new int[]{i10, m10, i10, m10, i10}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f});
                sweepGradient2.setLocalMatrix(this.b);
                Paint paint2 = this.f;
                paint2.setShader(sweepGradient2);
                if (i12 == 1) {
                }
                i11 = 255;
                paint2.setAlpha(i11);
                canvas.save();
                if (i12 == 1) {
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint2);
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.h = i10 * 0.5f;
        this.n = i11 * 0.5f;
        this.d = new SweepGradient(this.h, this.n, new int[]{-16216082, -15291399, -16216082, -15291399, -16216082}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f});
        float f7 = this.h;
        float f10 = this.n;
        Matrix matrix = this.b;
        matrix.setRotate(-69.01f, f7, f10);
        this.d.setLocalMatrix(matrix);
        this.a.setShader(this.d);
        invalidateOutline();
    }
}
