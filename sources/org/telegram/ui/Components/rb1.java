package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rb1 {
    public final Paint a = new Paint(1);
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public final Path f;
    public final Path g;
    public final RectF h;
    public final RectF i;
    public final RectF j;
    public final float[] k;
    public final float[] l;
    public final Matrix m;
    public final float[] n;

    public rb1() {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(2);
        this.d = new Paint(1);
        this.e = new Path();
        this.f = new Path();
        this.g = new Path();
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new float[8];
        this.l = new float[8];
        this.m = new Matrix();
        this.n = new float[9];
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void c(JSONArray jSONArray, float[] fArr, int i10, float... fArr2) {
        int i11 = 0;
        while (i11 < i10) {
            float f7 = i11 < fArr2.length ? fArr2[i11] : 0.0f;
            if (jSONArray != null && i11 < jSONArray.length()) {
                f7 = (float) jSONArray.optDouble(i11, f7);
            }
            fArr[i11] = f7;
            i11++;
        }
    }

    public static void d(Paint paint, JSONObject jSONObject, float f7, float f10) {
        paint.setStrokeWidth(f7);
        int optInt = jSONObject.optInt("lc");
        int optInt2 = jSONObject.optInt("lj");
        paint.setStrokeCap(optInt == 1 ? Paint.Cap.ROUND : optInt == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
        paint.setStrokeJoin(optInt2 == 1 ? Paint.Join.ROUND : optInt2 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
        paint.setStrokeMiter((float) jSONObject.optDouble("ml", f10));
        JSONArray optJSONArray = jSONObject.optJSONArray("d");
        paint.setPathEffect(null);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return;
        }
        int length = optJSONArray.length();
        int i10 = length % 2 == 1 ? length * 2 : length;
        float[] fArr = new float[i10];
        float f11 = 0.0f;
        for (int i11 = 0; i11 < i10; i11++) {
            float max = Math.max(0.0f, (float) optJSONArray.optDouble(i11 % length));
            fArr[i11] = max;
            f11 += max;
        }
        if (f11 > 0.0f) {
            paint.setPathEffect(new DashPathEffect(fArr, (float) jSONObject.optDouble("do")));
        }
    }

    public static void h(JSONObject jSONObject, Path path) {
        path.rewind();
        JSONArray optJSONArray = jSONObject.optJSONArray("o");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("v");
        if (optJSONArray == null) {
            return;
        }
        int length = optJSONArray2 == null ? 0 : optJSONArray2.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < optJSONArray.length()) {
            int optInt = optJSONArray.optInt(i11);
            int i12 = i10 + (optInt == 3 ? 6 : optInt == 2 ? 4 : optInt == 4 ? 0 : 2);
            if (i12 > length) {
                break;
            }
            if (optInt == 0) {
                path.moveTo((float) optJSONArray2.optDouble(i10), (float) optJSONArray2.optDouble(i10 + 1));
            } else if (optInt == 1) {
                path.lineTo((float) optJSONArray2.optDouble(i10), (float) optJSONArray2.optDouble(i10 + 1));
            } else if (optInt == 2) {
                path.quadTo((float) optJSONArray2.optDouble(i10), (float) optJSONArray2.optDouble(i10 + 1), (float) optJSONArray2.optDouble(i10 + 2), (float) optJSONArray2.optDouble(i10 + 3));
            } else if (optInt == 3) {
                path.cubicTo((float) optJSONArray2.optDouble(i10), (float) optJSONArray2.optDouble(i10 + 1), (float) optJSONArray2.optDouble(i10 + 2), (float) optJSONArray2.optDouble(i10 + 3), (float) optJSONArray2.optDouble(i10 + 4), (float) optJSONArray2.optDouble(i10 + 5));
            } else if (optInt == 4) {
                path.close();
            }
            i11++;
            i10 = i12;
        }
        path.setFillType(jSONObject.optInt("e") != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public static RectF i(JSONObject jSONObject, String str, RectF rectF) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            rectF.setEmpty();
            return rectF;
        }
        float optDouble = (float) optJSONArray.optDouble(0);
        float optDouble2 = (float) optJSONArray.optDouble(1);
        rectF.set(optDouble, optDouble2, ((float) optJSONArray.optDouble(2)) + optDouble, ((float) optJSONArray.optDouble(3)) + optDouble2);
        return rectF;
    }

    public static void k(Paint paint, int i10) {
        paint.setShader(null);
        paint.setColor(i10);
    }

    public static int[] l(JSONArray jSONArray) {
        int length = jSONArray.length() / 2;
        int[] iArr = new int[Math.max(2, length)];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = (int) jSONArray.optLong((i10 * 2) + 1);
        }
        if (length == 1) {
            iArr[1] = iArr[0];
        }
        return iArr;
    }

    public static float[] m(JSONArray jSONArray) {
        int length = jSONArray.length() / 2;
        if (length == 1) {
            return new float[]{0.0f, 1.0f};
        }
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = Math.max(0.0f, Math.min(1.0f, (float) jSONArray.optDouble(i10 * 2)));
        }
        return fArr;
    }

    public final void a(Path path, JSONObject jSONObject, RectF rectF, float f7) {
        JSONArray optJSONArray = jSONObject.optJSONArray("q");
        if (optJSONArray == null) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i10 = 0;
        while (true) {
            float[] fArr = this.k;
            if (i10 >= 8) {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            } else {
                fArr[i10] = Math.max(((float) optJSONArray.optDouble(i10)) + f7, 0.0f);
                i10++;
            }
        }
    }

    public final void b(Canvas canvas, JSONObject jSONObject) {
        if (jSONObject.has("l")) {
            canvas.clipRect(i(jSONObject, "l", this.i));
        }
    }

    public final void e(Canvas canvas, JSONArray jSONArray, int i10, qb1 qb1Var, float f7, boolean z10) {
        int i11;
        rb1 rb1Var;
        Matrix matrix;
        e0.e0 e0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        e0.e0 e0Var2;
        Canvas canvas2;
        Matrix matrix2;
        e0.e0 e0Var3;
        rb1 rb1Var2;
        Matrix matrix3;
        e0.e0 e0Var4;
        int i12;
        float f10;
        BlurMaskFilter blurMaskFilter;
        Canvas canvas3;
        ArrayList arrayList3;
        Matrix matrix4;
        boolean z11;
        int i13;
        float[] fArr;
        ArrayList arrayList4;
        Matrix matrix5;
        rb1 rb1Var3 = this;
        e0.e0 e0Var5 = new e0.e0(canvas);
        ArrayList arrayList5 = (ArrayList) e0Var5.e;
        Matrix matrix6 = (Matrix) e0Var5.d;
        ArrayList arrayList6 = (ArrayList) e0Var5.f;
        int i14 = 0;
        while (i14 < i10) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i14);
            if (optJSONObject == null) {
                e0Var = e0Var5;
                i11 = i14;
                matrix = matrix6;
                arrayList2 = arrayList6;
                rb1Var = rb1Var3;
            } else {
                Canvas canvas4 = (Canvas) e0Var5.c;
                int optInt = optJSONObject.optInt("k");
                e0.e0 e0Var6 = e0Var5;
                RectF rectF = rb1Var3.j;
                i11 = i14;
                float[] fArr2 = rb1Var3.n;
                Path path = rb1Var3.e;
                float[] fArr3 = rb1Var3.l;
                Paint paint = rb1Var3.b;
                Path path2 = rb1Var3.f;
                Paint paint2 = rb1Var3.a;
                RectF rectF2 = rb1Var3.h;
                switch (optInt) {
                    case 0:
                        rb1Var = this;
                        matrix = matrix6;
                        e0Var = e0Var6;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        canvas4.save();
                        rb1Var.b(canvas4, optJSONObject);
                        k(paint2, (int) optJSONObject.optLong("c"));
                        rb1Var.j(optJSONObject, "r", path);
                        canvas4.drawPath(path, paint2);
                        canvas4.restore();
                        break;
                    case 1:
                        matrix = matrix6;
                        e0Var = e0Var6;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        paint.setColor((int) optJSONObject.optLong("c"));
                        paint.setStrokeWidth((float) optJSONObject.optDouble("w", 1.0d));
                        paint.setStrokeCap(Paint.Cap.BUTT);
                        paint.setStrokeJoin(Paint.Join.MITER);
                        paint.setPathEffect(null);
                        rb1Var = this;
                        rb1Var.j(optJSONObject, "r", path);
                        canvas4.drawPath(path, paint);
                        break;
                    case 2:
                        matrix = matrix6;
                        e0Var = e0Var6;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        k(paint2, (int) optJSONObject.optLong("c"));
                        canvas4.drawOval(i(optJSONObject, "r", rectF2), paint2);
                        rb1Var = this;
                        break;
                    case 3:
                        matrix = matrix6;
                        e0Var = e0Var6;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        float optDouble = (float) optJSONObject.optDouble("w", 1.0d);
                        float f11 = optDouble / 2.0f;
                        i(optJSONObject, "r", rectF2).inset(f11, f11);
                        paint.setColor((int) optJSONObject.optLong("c"));
                        paint.setStrokeWidth(optDouble);
                        paint.setStrokeCap(Paint.Cap.BUTT);
                        paint.setStrokeJoin(Paint.Join.MITER);
                        paint.setPathEffect(null);
                        canvas4.drawOval(rectF2, paint);
                        rb1Var = this;
                        break;
                    case 4:
                        rb1Var = this;
                        matrix = matrix6;
                        e0Var = e0Var6;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        Paint deviceFont = qb1Var.deviceFont(optJSONObject.optInt("f"));
                        if (deviceFont != null) {
                            deviceFont.setColor((int) optJSONObject.optLong("c"));
                            deviceFont.setShader(null);
                            canvas4.save();
                            float f12 = 1.0f / f7;
                            canvas4.scale(f12, f12);
                            canvas4.drawText(optJSONObject.optString("t"), ((float) optJSONObject.optDouble("x")) * f7, ((float) optJSONObject.optDouble("y")) * f7, deviceFont);
                            canvas4.restore();
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        rb1Var = this;
                        matrix = matrix6;
                        e0Var2 = e0Var6;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        Bitmap canvas5 = optJSONObject.has("cv") ? qb1Var.canvas(optJSONObject.optInt("cv")) : qb1Var.image(optJSONObject.optInt("i"));
                        if (canvas5 != null) {
                            canvas4.save();
                            rb1Var.b(canvas4, optJSONObject);
                            if (optJSONObject.has("q")) {
                                rb1Var.j(optJSONObject, optJSONObject.has("l") ? "l" : "r", path2);
                                canvas4.clipPath(path2);
                            }
                            canvas4.drawBitmap(canvas5, (Rect) null, i(optJSONObject, "r", rectF2), rb1Var.c);
                            canvas4.restore();
                        }
                        e0Var = e0Var2;
                        break;
                    case 6:
                    case 7:
                    case 8:
                        Matrix matrix7 = matrix6;
                        arrayList = arrayList5;
                        rb1Var = this;
                        arrayList2 = arrayList6;
                        JSONArray optJSONArray = optJSONObject.optJSONArray("s");
                        if (optJSONArray == null || optJSONArray.length() < 2) {
                            matrix = matrix7;
                            e0Var2 = e0Var6;
                        } else {
                            int[] l4 = l(optJSONArray);
                            float[] m10 = m(optJSONArray);
                            matrix = matrix7;
                            c(optJSONObject.optJSONArray("a"), fArr3, 4, new float[0]);
                            float f13 = fArr3[0];
                            float f14 = fArr3[1];
                            float f15 = fArr3[2];
                            float f16 = fArr3[3];
                            canvas4.save();
                            rb1Var.b(canvas4, optJSONObject);
                            rb1Var.j(optJSONObject, "r", path2);
                            canvas4.clipPath(path2);
                            paint2.setColor(-16777216);
                            int i15 = 6;
                            if (optInt == 6) {
                                if (l4.length > 16) {
                                    double d = f15 - f13;
                                    e0Var2 = e0Var6;
                                    double d10 = f16 - f14;
                                    float hypot = (float) Math.hypot(d, d10);
                                    if (hypot <= 0.0f) {
                                        canvas2 = canvas4;
                                    } else {
                                        canvas4.translate(f13, f14);
                                        canvas4.rotate((float) Math.toDegrees(Math.atan2(d10, d)));
                                        int length = m10.length - 1;
                                        int i16 = l4[0];
                                        paint2.setShader(null);
                                        paint2.setColor(i16);
                                        canvas4.drawRect(-8000.0f, -8000.0f, m10[0] * hypot, 8000.0f, paint2);
                                        int i17 = 0;
                                        while (i17 < length) {
                                            float f17 = m10[i17] * hypot;
                                            int i18 = i17 + 1;
                                            float f18 = m10[i18] * hypot;
                                            if (f18 > f17) {
                                                int i19 = l4[i17];
                                                if (i19 == l4[i18]) {
                                                    paint2.setShader(null);
                                                    paint2.setColor(i19);
                                                } else {
                                                    paint2.setColor(-16777216);
                                                    paint2.setShader(new LinearGradient(f17, 0.0f, f18, 0.0f, l4[i17], l4[i18], Shader.TileMode.CLAMP));
                                                }
                                                canvas4.drawRect(f17, -8000.0f, f18, 8000.0f, paint2);
                                            }
                                            i17 = i18;
                                        }
                                        int i20 = l4[length];
                                        paint2.setShader(null);
                                        paint2.setColor(i20);
                                        canvas4.drawRect(m10[length] * hypot, -8000.0f, 8000.0f, 8000.0f, paint2);
                                        canvas2 = canvas4;
                                        paint2.setShader(null);
                                    }
                                    canvas2.restore();
                                } else {
                                    i15 = 6;
                                }
                            }
                            e0Var2 = e0Var6;
                            if (optInt == i15) {
                                paint2.setShader(new LinearGradient(f13, f14, f15, f16, l4, m10, Shader.TileMode.CLAMP));
                            } else if (optInt == 7) {
                                float max = Math.max(f15, 0.01f);
                                float max2 = Math.max(f16, 0.01f);
                                paint2.setShader(new RadialGradient(f13, f14, max, l4, m10, Shader.TileMode.CLAMP));
                                canvas4.translate(f13, f14);
                                canvas4.scale(1.0f, max2 / max);
                                canvas4.translate(-f13, -f14);
                            } else {
                                paint2.setShader(new SweepGradient(f13, f14, l4, m10));
                                canvas4.rotate(f15 - 90.0f, f13, f14);
                            }
                            i(optJSONObject, "r", rectF2);
                            canvas4.drawRect(rectF2.left - 4000.0f, rectF2.top - 4000.0f, rectF2.right + 4000.0f, rectF2.bottom + 4000.0f, paint2);
                            paint2.setShader(null);
                            canvas4.restore();
                        }
                        e0Var = e0Var2;
                        break;
                    case 9:
                        Matrix matrix8 = matrix6;
                        arrayList = arrayList5;
                        matrix2 = matrix8;
                        rb1Var = this;
                        e0Var3 = e0Var6;
                        arrayList2 = arrayList6;
                        canvas4.save();
                        arrayList.add(new Matrix(matrix2));
                        e0Var3.b++;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("p");
                        if (optJSONObject2 != null) {
                            h(optJSONObject2, path2);
                        } else {
                            rb1Var.j(optJSONObject, "r", path2);
                        }
                        canvas4.clipPath(path2);
                        matrix = matrix2;
                        e0Var = e0Var3;
                        break;
                    case 10:
                    case 13:
                        Matrix matrix9 = matrix6;
                        arrayList = arrayList5;
                        matrix2 = matrix9;
                        rb1Var = this;
                        arrayList2 = arrayList6;
                        e0Var3 = e0Var6;
                        if (e0Var3.b > 0) {
                            e0Var3.d();
                        }
                        matrix = matrix2;
                        e0Var = e0Var3;
                        break;
                    case 11:
                        Matrix matrix10 = matrix6;
                        arrayList = arrayList5;
                        matrix2 = matrix10;
                        rb1Var = this;
                        e0Var3 = e0Var6;
                        arrayList2 = arrayList6;
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("p");
                        if (optJSONObject3 != null) {
                            h(optJSONObject3, path);
                            Shader f19 = rb1Var.f(optJSONObject3, ImageLoader.AUTOPLAY_FILTER, "ga", "s");
                            if (f19 != null) {
                                paint2.setColor(-16777216);
                                paint2.setShader(f19);
                                canvas4.drawPath(path, paint2);
                                paint2.setShader(null);
                            } else if (optJSONObject3.has("f") && (((int) optJSONObject3.optLong("f")) >>> 24) != 0) {
                                k(paint2, (int) optJSONObject3.optLong("f"));
                                canvas4.drawPath(path, paint2);
                            }
                            float optDouble2 = (float) optJSONObject3.optDouble("sw");
                            Shader f20 = optDouble2 > 0.0f ? rb1Var.f(optJSONObject3, "sg", "sga", "ss") : null;
                            if (optJSONObject3.has("sc") && (((((int) optJSONObject3.optLong("sc")) >>> 24) != 0 || f20 != null) && optDouble2 > 0.0f)) {
                                paint.setColor(f20 != null ? -16777216 : (int) optJSONObject3.optLong("sc"));
                                paint.setShader(f20);
                                d(paint, optJSONObject3, optDouble2, 4.0f);
                                canvas4.drawPath(path, paint);
                                paint.setPathEffect(null);
                                paint.setShader(null);
                            }
                        }
                        matrix = matrix2;
                        e0Var = e0Var3;
                        break;
                    case 12:
                        ArrayList arrayList7 = arrayList5;
                        Matrix matrix11 = matrix6;
                        arrayList2 = arrayList6;
                        float optDouble3 = (float) optJSONObject.optDouble("o", 1.0d);
                        boolean z12 = optJSONObject.optInt("h") != 0;
                        if (optDouble3 >= 1.0f || z12) {
                            canvas4.save();
                        } else {
                            canvas4.saveLayerAlpha(null, Math.round(Math.max(0.0f, Math.min(1.0f, optDouble3)) * 255.0f));
                        }
                        arrayList = arrayList7;
                        arrayList.add(new Matrix(matrix11));
                        e0Var = e0Var6;
                        e0Var.b++;
                        c(optJSONObject.optJSONArray("m"), fArr3, 6, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
                        fArr2[0] = fArr3[0];
                        fArr2[1] = fArr3[2];
                        fArr2[2] = fArr3[4];
                        fArr2[3] = fArr3[1];
                        fArr2[4] = fArr3[3];
                        fArr2[5] = fArr3[5];
                        fArr2[6] = 0.0f;
                        fArr2[7] = 0.0f;
                        fArr2[8] = 1.0f;
                        Matrix matrix12 = this.m;
                        matrix12.setValues(fArr2);
                        canvas4.concat(matrix12);
                        matrix11.preConcat(matrix12);
                        if (!z12) {
                            rb1Var = this;
                            matrix = matrix11;
                            break;
                        } else {
                            canvas4.clipRect(0, 0, 0, 0);
                            rb1Var = this;
                            matrix = matrix11;
                            break;
                        }
                    case 14:
                        ArrayList arrayList8 = arrayList5;
                        Matrix matrix13 = matrix6;
                        arrayList2 = arrayList6;
                        c(optJSONObject.optJSONArray("a"), fArr3, 4, new float[0]);
                        float f21 = fArr3[0];
                        float f22 = fArr3[1];
                        float max3 = Math.max(fArr3[2], 0.0f);
                        float f23 = fArr3[3];
                        int optLong = (int) optJSONObject.optLong("c");
                        i(optJSONObject, "r", rectF);
                        if (rectF.isEmpty() || (optLong >>> 24) == 0 || ((i12 = Build.VERSION.SDK_INT) < 28 && (max3 / 2.0f) * f7 > 0.5f)) {
                            rb1Var2 = this;
                            matrix3 = matrix13;
                            e0Var4 = e0Var6;
                        } else {
                            boolean z13 = optJSONObject.optInt("n") != 0;
                            rb1Var2 = this;
                            Paint paint3 = rb1Var2.d;
                            paint3.setColor(optLong);
                            float f24 = (max3 / 2.0f) * f7;
                            if (f24 > 0.5f) {
                                f10 = max3;
                                e0Var4 = e0Var6;
                                blurMaskFilter = new BlurMaskFilter(((f24 - 0.5f) / 0.57735f) / f7, BlurMaskFilter.Blur.NORMAL);
                            } else {
                                f10 = max3;
                                e0Var4 = e0Var6;
                                blurMaskFilter = null;
                            }
                            paint3.setMaskFilter(blurMaskFilter);
                            Path path3 = rb1Var2.g;
                            path3.rewind();
                            if (z13) {
                                float abs = Math.abs(f22) + Math.abs(f21) + Math.abs(f23) + (f10 * 1.5f) + 2.0f;
                                matrix3 = matrix13;
                                rectF2.set(rectF.left - abs, rectF.top - abs, rectF.right + abs, rectF.bottom + abs);
                                path3.addRect(rectF2, Path.Direction.CW);
                                rectF2.set(rectF.left + f23, rectF.top + f23, rectF.right - f23, rectF.bottom - f23);
                                if (!rectF2.isEmpty()) {
                                    rb1Var2.a(path3, optJSONObject, rectF2, -f23);
                                }
                                path3.setFillType(Path.FillType.EVEN_ODD);
                            } else {
                                matrix3 = matrix13;
                                rectF2.set(rectF.left - f23, rectF.top - f23, rectF.right + f23, rectF.bottom + f23);
                                if (!optJSONObject.has("q")) {
                                    f23 = 0.0f;
                                }
                                rb1Var2.a(path3, optJSONObject, rectF2, f23);
                            }
                            path3.offset(f21, f22);
                            canvas4.save();
                            rb1Var2.j(optJSONObject, "r", path2);
                            if (z13) {
                                canvas3 = canvas4;
                                canvas3.clipPath(path2);
                            } else {
                                canvas3 = canvas4;
                                if (i12 >= 26) {
                                    canvas3.clipOutPath(path2);
                                } else {
                                    canvas3.clipPath(path2, Region.Op.DIFFERENCE);
                                }
                            }
                            canvas3.drawPath(path3, paint3);
                            canvas3.restore();
                            paint3.setMaskFilter(null);
                        }
                        rb1Var = rb1Var2;
                        e0Var = e0Var4;
                        arrayList = arrayList8;
                        matrix = matrix3;
                        break;
                    case 15:
                        e0Var = e0Var6;
                        pb1 pb1Var = new pb1();
                        pb1Var.a = (Canvas) e0Var.c;
                        pb1Var.b = e0Var.b;
                        arrayList6.add(pb1Var);
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("fl");
                        if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                            i(optJSONObject, "r", rectF);
                            if (!rectF.isEmpty()) {
                                arrayList2 = arrayList6;
                                int i21 = 0;
                                float f25 = 0.0f;
                                float f26 = 0.0f;
                                float f27 = 0.0f;
                                float f28 = 0.0f;
                                while (i21 < optJSONArray2.length()) {
                                    JSONArray optJSONArray3 = optJSONArray2.optJSONArray(i21);
                                    if (optJSONArray3 == null) {
                                        i13 = i21;
                                        fArr = fArr2;
                                    } else {
                                        i13 = i21;
                                        fArr = fArr2;
                                        float max4 = Math.max(0.0f, (float) optJSONArray3.optDouble(1));
                                        if (optJSONArray3.optInt(0) == 0) {
                                            float f29 = max4 * 3.0f;
                                            f25 += f29;
                                            f26 += f29;
                                            f27 += f29;
                                            f28 += f29;
                                        } else {
                                            arrayList4 = arrayList5;
                                            matrix5 = matrix6;
                                            if (optJSONArray3.optInt(0) == 9) {
                                                float optDouble4 = (float) optJSONArray3.optDouble(2);
                                                float optDouble5 = (float) optJSONArray3.optDouble(3);
                                                float f30 = max4 * 1.5f;
                                                float max5 = Math.max(f25, f30 - optDouble4);
                                                float max6 = Math.max(f27, optDouble4 + f30);
                                                float max7 = Math.max(f26, f30 - optDouble5);
                                                f28 = Math.max(f28, f30 + optDouble5);
                                                f27 = max6;
                                                f25 = max5;
                                                f26 = max7;
                                            }
                                            i21 = i13 + 1;
                                            fArr2 = fArr;
                                            arrayList5 = arrayList4;
                                            matrix6 = matrix5;
                                        }
                                    }
                                    arrayList4 = arrayList5;
                                    matrix5 = matrix6;
                                    i21 = i13 + 1;
                                    fArr2 = fArr;
                                    arrayList5 = arrayList4;
                                    matrix6 = matrix5;
                                }
                                float[] fArr4 = fArr2;
                                arrayList3 = arrayList5;
                                Matrix matrix14 = matrix6;
                                rectF.set(rectF.left - f25, rectF.top - f26, rectF.right + f27, rectF.bottom + f28);
                                if (Build.VERSION.SDK_INT < 31 || !((Canvas) e0Var.c).isHardwareAccelerated()) {
                                    matrix4 = matrix14;
                                    matrix4.getValues(fArr4);
                                    if (fArr4[1] == 0.0f && fArr4[3] == 0.0f) {
                                        Matrix matrix15 = pb1Var.g;
                                        matrix15.set(matrix4);
                                        matrix15.postScale(f7, f7);
                                        matrix15.mapRect(rectF2, rectF);
                                        int floor = (int) Math.floor(rectF2.left);
                                        int floor2 = (int) Math.floor(rectF2.top);
                                        int ceil = ((int) Math.ceil(rectF2.right)) - floor;
                                        int ceil2 = ((int) Math.ceil(rectF2.bottom)) - floor2;
                                        if (ceil > 0 && ceil2 > 0 && ceil * ceil2 <= 16777216) {
                                            pb1Var.f = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                            pb1Var.d = floor;
                                            pb1Var.e = floor2;
                                            pb1Var.h = Math.abs(fArr4[0]) * f7;
                                            pb1Var.i = optJSONArray2;
                                            Canvas canvas6 = new Canvas(pb1Var.f);
                                            canvas6.translate(-floor, -floor2);
                                            canvas6.concat(matrix15);
                                            e0Var.c = canvas6;
                                            z11 = false;
                                            e0Var.b = 0;
                                            matrix = matrix4;
                                            arrayList = arrayList3;
                                            rb1Var = this;
                                            break;
                                        }
                                    }
                                    z11 = false;
                                    matrix = matrix4;
                                    arrayList = arrayList3;
                                    rb1Var = this;
                                } else {
                                    Canvas b10 = ob1.b(pb1Var, rectF, optJSONArray2, f7);
                                    if (b10 != null) {
                                        e0Var.c = b10;
                                        e0Var.b = 0;
                                        z11 = false;
                                        matrix4 = matrix14;
                                        matrix = matrix4;
                                        arrayList = arrayList3;
                                        rb1Var = this;
                                    } else {
                                        matrix4 = matrix14;
                                        z11 = false;
                                        matrix = matrix4;
                                        arrayList = arrayList3;
                                        rb1Var = this;
                                    }
                                }
                            }
                        }
                        arrayList3 = arrayList5;
                        matrix4 = matrix6;
                        arrayList2 = arrayList6;
                        z11 = false;
                        matrix = matrix4;
                        arrayList = arrayList3;
                        rb1Var = this;
                        break;
                    case 16:
                        e0Var = e0Var6;
                        if (!arrayList6.isEmpty()) {
                            g(e0Var, f7);
                        }
                        rb1Var = this;
                        matrix = matrix6;
                        arrayList2 = arrayList6;
                        break;
                    case 17:
                        if (z10 && Build.VERSION.SDK_INT >= 31 && canvas4.isHardwareAccelerated()) {
                            ob1.a(this, e0Var6, jSONArray, i11, optJSONObject, qb1Var, f7);
                            rb1Var = this;
                            e0Var = e0Var6;
                            matrix = matrix6;
                            arrayList2 = arrayList6;
                            break;
                        }
                        break;
                    default:
                        rb1Var = this;
                        matrix = matrix6;
                        arrayList2 = arrayList6;
                        e0Var = e0Var6;
                        break;
                }
                rb1 rb1Var4 = rb1Var;
                i14 = i11 + 1;
                rb1Var3 = rb1Var4;
                arrayList5 = arrayList;
                e0Var5 = e0Var;
                matrix6 = matrix;
                arrayList6 = arrayList2;
            }
            arrayList = arrayList5;
            rb1 rb1Var42 = rb1Var;
            i14 = i11 + 1;
            rb1Var3 = rb1Var42;
            arrayList5 = arrayList;
            e0Var5 = e0Var;
            matrix6 = matrix;
            arrayList6 = arrayList2;
        }
        rb1 rb1Var5 = rb1Var3;
        e0.e0 e0Var7 = e0Var5;
        ArrayList arrayList9 = arrayList6;
        while (!arrayList9.isEmpty()) {
            rb1Var5.g(e0Var7, f7);
        }
        while (e0Var7.b > 0) {
            e0Var7.d();
        }
    }

    public final Shader f(JSONObject jSONObject, String str, String str2, String str3) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str3);
        if (!jSONObject.has(str) || optJSONArray == null || optJSONArray.length() < 4) {
            return null;
        }
        int[] l4 = l(optJSONArray);
        float[] m10 = m(optJSONArray);
        float[] fArr = this.l;
        c(jSONObject.optJSONArray(str2), fArr, 7, new float[0]);
        return jSONObject.optInt(str) == 1 ? new LinearGradient(fArr[0], fArr[1], fArr[2], fArr[3], l4, m10, Shader.TileMode.CLAMP) : new RadialGradient(fArr[0], fArr[1], Math.max(fArr[4], 0.01f), l4, m10, Shader.TileMode.CLAMP);
    }

    public final void g(e0.e0 e0Var, float f7) {
        Object obj;
        pb1 pb1Var = (pb1) ic.a.y(1, (ArrayList) e0Var.f);
        while (true) {
            int i10 = e0Var.b;
            obj = pb1Var.c;
            if (i10 <= ((obj == null && pb1Var.f == null) ? pb1Var.b : 0)) {
                break;
            } else {
                e0Var.d();
            }
        }
        if (obj != null) {
            ob1.d(pb1Var, f7);
            e0Var.c = pb1Var.a;
        } else {
            Bitmap bitmap = pb1Var.f;
            if (bitmap != null) {
                WidgetSandboxNative.filterPixels(bitmap, pb1Var.i.toString().getBytes(StandardCharsets.UTF_8), pb1Var.h);
                e0Var.c = pb1Var.a;
                Matrix matrix = new Matrix();
                if (pb1Var.g.invert(matrix)) {
                    ((Canvas) e0Var.c).save();
                    ((Canvas) e0Var.c).concat(matrix);
                    ((Canvas) e0Var.c).drawBitmap(pb1Var.f, pb1Var.d, pb1Var.e, this.c);
                    ((Canvas) e0Var.c).restore();
                }
            }
        }
        e0Var.b = pb1Var.b;
    }

    public final void j(JSONObject jSONObject, String str, Path path) {
        RectF rectF = this.h;
        i(jSONObject, str, rectF);
        path.rewind();
        JSONArray optJSONArray = jSONObject.optJSONArray("q");
        if (optJSONArray == null) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i10 = 0;
        while (true) {
            float[] fArr = this.k;
            if (i10 >= 8) {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            } else {
                fArr[i10] = (float) optJSONArray.optDouble(i10);
                i10++;
            }
        }
    }
}
