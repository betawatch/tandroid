package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ua1 {
    public static final PorterDuff.Mode[] r = {null, PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_OUT, PorterDuff.Mode.SRC_ATOP, PorterDuff.Mode.DST_OVER, PorterDuff.Mode.DST_IN, PorterDuff.Mode.DST_OUT, PorterDuff.Mode.DST_ATOP, PorterDuff.Mode.ADD, PorterDuff.Mode.SRC, PorterDuff.Mode.XOR, PorterDuff.Mode.MULTIPLY, PorterDuff.Mode.SCREEN, PorterDuff.Mode.OVERLAY, PorterDuff.Mode.DARKEN, PorterDuff.Mode.LIGHTEN};
    public final Paint a = new Paint(3);
    public final Paint b = new Paint();
    public final Paint c;
    public final Path d;
    public final Path e;
    public final Matrix f;
    public final Matrix g;
    public final float[] h;
    public final float[] i;
    public final RectF j;
    public final Rect k;
    public final int l;
    public Bitmap m;
    public Bitmap n;
    public Canvas o;
    public int p;
    public int q;

    public ua1(int i10) {
        Paint paint = new Paint();
        this.c = paint;
        this.d = new Path();
        this.e = new Path();
        this.f = new Matrix();
        this.g = new Matrix();
        this.h = new float[9];
        this.i = new float[8];
        this.j = new RectF();
        this.k = new Rect();
        this.q = -1;
        this.l = i10;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Paint paint, int i10) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            sa1.a(paint, i10);
            return;
        }
        if (i10 > 0) {
            PorterDuff.Mode[] modeArr = r;
            if (i10 < modeArr.length) {
                mode = modeArr[i10];
                paint.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
            }
        }
        mode = null;
        paint.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
    }

    public final void a(Paint paint, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("pk");
        JSONArray optJSONArray = jSONObject.optJSONArray("s");
        int length = optJSONArray == null ? 0 : optJSONArray.length() / 2;
        if (optInt == 0 || length == 0) {
            paint.setShader(null);
            paint.setColor((int) jSONObject.optLong("c"));
            return;
        }
        int[] l4 = nb1.l(optJSONArray);
        float[] m10 = nb1.m(optJSONArray);
        float[] fArr = this.i;
        nb1.c(jSONObject.optJSONArray("pa"), fArr, 6, new float[0]);
        paint.setColor(-16777216);
        if (optInt == 1) {
            paint.setShader(new LinearGradient(fArr[0], fArr[1], fArr[2], fArr[3], l4, m10, Shader.TileMode.CLAMP));
            return;
        }
        if (optInt != 2) {
            SweepGradient sweepGradient = new SweepGradient(fArr[1], fArr[2], l4, m10);
            Matrix matrix = new Matrix();
            matrix.setRotate((float) Math.toDegrees(fArr[0]), fArr[1], fArr[2]);
            sweepGradient.setLocalMatrix(matrix);
            paint.setShader(sweepGradient);
            return;
        }
        float f7 = fArr[2];
        float max = Math.max(fArr[5], 0.01f);
        if (f7 > 0.0f && f7 < max) {
            float[] fArr2 = new float[m10.length];
            for (int i10 = 0; i10 < m10.length; i10++) {
                float f10 = f7 / max;
                fArr2[i10] = c3.h0.z(1.0f, f10, m10[i10], f10);
            }
            m10 = fArr2;
        }
        paint.setShader(new RadialGradient(fArr[3], fArr[4], max, l4, m10, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, JSONObject jSONObject, ta1 ta1Var) {
        Bitmap image;
        boolean z10;
        int i10;
        Bitmap bitmap;
        float[] fArr = this.i;
        nb1.c(jSONObject.optJSONArray("m"), fArr, 6, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        float f7 = fArr[0];
        float[] fArr2 = this.h;
        fArr2[0] = f7;
        fArr2[1] = fArr[2];
        fArr2[2] = fArr[4];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[3];
        fArr2[5] = fArr[5];
        fArr2[6] = 0.0f;
        fArr2[7] = 0.0f;
        fArr2[8] = 1.0f;
        Matrix matrix = this.f;
        matrix.setValues(fArr2);
        Paint paint = this.a;
        paint.reset();
        paint.setFlags(3);
        canvas.save();
        int optInt = jSONObject.optInt("k");
        if (optInt == 1 || optInt == 2) {
            Matrix matrix2 = this.g;
            if (matrix.invert(matrix2)) {
                Path path = this.d;
                nb1.h(jSONObject, path);
                path.transform(matrix2);
                canvas.concat(matrix);
                a(paint, jSONObject);
                if (jSONObject.optInt("k") == 2) {
                    paint.setStyle(Paint.Style.STROKE);
                    nb1.d(paint, jSONObject, (float) jSONObject.optDouble("lw", 1.0d), 10.0f);
                }
                canvas.drawPath(path, paint);
            }
        } else if (optInt == 4) {
            Paint font = ta1Var.font(jSONObject.optInt("f"));
            if (font != null) {
                nb1.c(jSONObject.optJSONArray("tp"), fArr, 4, 0.0f, 0.0f, 1.0f, 0.0f);
                Paint paint2 = new Paint(font);
                canvas.concat(matrix);
                canvas.translate(fArr[0], fArr[1]);
                canvas.scale(fArr[2], 1.0f);
                paint2.setShader(null);
                a(paint2, jSONObject);
                if (jSONObject.optInt("st") != 0) {
                    paint2.setStyle(Paint.Style.STROKE);
                    nb1.d(paint2, jSONObject, (float) jSONObject.optDouble("lw", 1.0d), 10.0f);
                }
                canvas.drawText(jSONObject.optString("t"), fArr[3], 0.0f, paint2);
            }
        } else if (optInt == 5) {
            if (jSONObject.has("cv")) {
                int optInt2 = jSONObject.optInt("cv");
                int i11 = this.l;
                image = optInt2 == i11 ? this.m : ta1Var.canvasBitmap(optInt2);
                if (optInt2 == i11) {
                    z10 = true;
                    if (image != null) {
                        if (z10) {
                            i10 = 0;
                            bitmap = image.copy(Bitmap.Config.ARGB_8888, false);
                        } else {
                            i10 = 0;
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            image = bitmap;
                        }
                        nb1.c(jSONObject.optJSONArray("ir"), fArr, 8, new float[i10]);
                        canvas.concat(matrix);
                        paint.setFilterBitmap(jSONObject.optInt("ns") == 0);
                        float f10 = fArr[4];
                        float f11 = fArr[5];
                        float f12 = fArr[6] + f10;
                        float f13 = fArr[7] + f11;
                        RectF rectF = this.j;
                        rectF.set(f10, f11, f12, f13);
                        float f14 = fArr[2];
                        if (f14 < 0.0f) {
                            canvas.drawBitmap(image, (Rect) null, rectF, paint);
                        } else {
                            float f15 = fArr[0];
                            float f16 = fArr[1];
                            int i12 = (int) (f15 + f14);
                            int i13 = (int) (f16 + fArr[3]);
                            Rect rect = this.k;
                            rect.set((int) f15, (int) f16, i12, i13);
                            canvas.drawBitmap(image, rect, rectF, paint);
                        }
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                    }
                }
            } else {
                image = ta1Var.image(jSONObject.optInt("i"));
            }
            z10 = false;
            if (image != null) {
            }
        }
        canvas.restore();
    }
}
