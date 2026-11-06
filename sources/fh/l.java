package fh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import c8.n0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l {
    public static final i h = new i(TLObject.FLAG_22, 0);
    public static final float[] i = new float[8];
    public static final k j = new k();
    public final long[] a = new long[4];
    public final j[] b = new j[4];
    public final int[] c = new int[4];
    public final PorterDuffColorFilter[] d = new PorterDuffColorFilter[4];
    public final Paint e = new Paint(2);
    public final float[] f = new float[8];
    public final Rect g = new Rect();

    public static void b(Canvas canvas, Path path, float f10, Paint paint) {
        canvas.save();
        canvas.clipPath(path);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f10 * 2.0f);
        paint.setStrokeJoin(Paint.Join.ROUND);
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    public static float e(float f10, float f11, float f12) {
        return (f12 <= f11 || f12 <= 0.0f) ? f10 : Math.min(f10, f11 / f12);
    }

    public static k f(int i7, h hVar, float[] fArr, int i10, int i11) {
        k kVar = j;
        kVar.a = i7;
        for (int i12 = 0; i12 < 8; i12++) {
            kVar.b[i12] = Math.round(fArr[i12] * 4.0f);
        }
        hVar.getClass();
        double radians = Math.toRadians(0.0f);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        if (i7 == 3) {
            kVar.d = 0.0f;
            kVar.c = 0.0f;
            kVar.l = Math.round(hVar.g * 16.0f);
            kVar.q = 0;
            kVar.p = 0;
            kVar.o = 0;
            kVar.n = 0;
            kVar.m = 0;
        } else if (i7 == 2) {
            kVar.d = 0.0f;
            kVar.c = 0.0f;
            kVar.l = Math.round(hVar.e * 16.0f);
            kVar.m = 0;
            kVar.n = Math.round(1000.0f);
            kVar.o = Math.round(1000.0f);
            kVar.p = Math.round(1000.0f);
            kVar.q = 0;
        } else {
            float f10 = i7 == 0 ? hVar.a : -hVar.c;
            kVar.c = Math.round((sin * f10) * 8.0f) / 8.0f;
            kVar.d = Math.round((cos * f10) * 8.0f) / 8.0f;
            kVar.q = 0;
            kVar.p = 0;
            kVar.o = 0;
            kVar.n = 0;
            kVar.m = 0;
            kVar.l = 0;
        }
        float abs = Math.abs(kVar.c);
        float abs2 = Math.abs(kVar.d);
        kVar.e = ((int) Math.ceil(Math.max(fArr[0], fArr[6]) + abs)) + 1;
        kVar.g = ((int) Math.ceil(Math.max(fArr[2], fArr[4]) + abs)) + 1;
        kVar.f = ((int) Math.ceil(Math.max(fArr[1], fArr[3]) + abs2)) + 1;
        int ceil = ((int) Math.ceil(Math.max(fArr[5], fArr[7]) + abs2)) + 1;
        int i13 = kVar.e + kVar.g + 2;
        boolean z9 = i10 >= i13;
        kVar.j = z9;
        int i14 = kVar.f + ceil + 2;
        boolean z10 = i11 >= i14;
        kVar.k = z10;
        if (z9) {
            i10 = i13;
        }
        kVar.h = i10;
        if (z10) {
            i11 = i14;
        }
        kVar.i = i11;
        return kVar;
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, float[] fArr, h hVar, float f14) {
        float f15 = f12 - f10;
        float f16 = f13 - f11;
        if (f15 < 1.0f || f16 < 1.0f || f14 <= 0.0f) {
            return;
        }
        float e10 = e(e(e(e(1.0f, f15, fArr[0] + fArr[2]), f15, fArr[6] + fArr[4]), f16, fArr[1] + fArr[7]), f16, fArr[3] + fArr[5]);
        for (int i7 = 0; i7 < 8; i7++) {
            this.f[i7] = Math.max(0.0f, fArr[i7]) * e10;
        }
        if (hVar.a()) {
            c(canvas, 2, f10, f11, f12, f13, hVar, hVar.f, f14);
        }
        if (hVar.a > 0.05f) {
            int i10 = hVar.b;
            if ((i10 >>> 24) != 0) {
                c(canvas, 0, f10, f11, f12, f13, hVar, i10, f14);
            }
        }
        if (hVar.c > 0.05f) {
            int i11 = hVar.d;
            if ((i11 >>> 24) != 0) {
                c(canvas, 1, f10, f11, f12, f13, hVar, i11, f14);
            }
        }
        if (hVar.g > 0.05f) {
            int i12 = hVar.h;
            if ((i12 >>> 24) != 0) {
                c(canvas, 3, f10, f11, f12, f13, hVar, i12, f14);
            }
        }
    }

    public final void c(Canvas canvas, int i7, float f10, float f11, float f12, float f13, h hVar, int i10, float f14) {
        long j3;
        int i11;
        int i12;
        k f15 = f(i7, hVar, this.f, Math.round(f12 - f10), Math.round(f13 - f11));
        float f16 = hVar.e;
        long a10 = f15.a();
        j[] jVarArr = this.b;
        j jVar = jVarArr[i7];
        long[] jArr = this.a;
        if (jVar == null || jArr[i7] != a10) {
            Long valueOf = Long.valueOf(a10);
            i iVar = h;
            jVar = (j) iVar.get(valueOf);
            if (jVar == null) {
                int ceil = i7 == 2 ? ((int) Math.ceil(f16)) + 2 : 1;
                int i13 = ceil * 2;
                Bitmap createBitmap = Bitmap.createBitmap(f15.h + i13, f15.i + i13, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f17 = ceil;
                j3 = a10;
                RectF rectF = new RectF(f17, f17, f15.h + ceil, f15.i + ceil);
                float[] fArr = new float[8];
                for (int i14 = 0; i14 < 8; i14++) {
                    fArr[i14] = f15.b[i14] / 4.0f;
                }
                Paint paint = new Paint(1);
                paint.setColor(-1);
                if (i7 == 2) {
                    RectF rectF2 = new RectF(rectF);
                    float f18 = (-f16) / 2.0f;
                    rectF2.inset(f18, f18);
                    float[] fArr2 = new float[8];
                    for (int i15 = 0; i15 < 8; i15++) {
                        float f19 = fArr[i15];
                        float f20 = 0.0f;
                        if (f19 > 0.0f) {
                            f20 = (f16 / 2.0f) + f19;
                        }
                        fArr2[i15] = f20;
                    }
                    Path path = new Path();
                    path.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(f16);
                    paint.setAlpha(Math.round(Math.min(1.0f, 1.0f) * 255.0f));
                    canvas2.drawPath(path, paint);
                } else if (i7 == 3) {
                    Path path2 = new Path();
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    b(canvas2, path2, hVar.g, paint);
                } else {
                    Path path3 = new Path();
                    Path.Direction direction = Path.Direction.CW;
                    path3.addRoundRect(rectF, fArr, direction);
                    Path path4 = new Path();
                    float f21 = rectF.left;
                    float f22 = f15.c;
                    float f23 = f21 + f22;
                    float f24 = rectF.top;
                    float f25 = f15.d;
                    path4.addRoundRect(f23, f24 + f25, rectF.right + f22, rectF.bottom + f25, fArr, direction);
                    canvas2.save();
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas2.clipOutPath(path4);
                    } else {
                        canvas2.clipPath(path4, Region.Op.DIFFERENCE);
                    }
                    canvas2.drawPath(path3, paint);
                    canvas2.restore();
                }
                createBitmap.prepareToDraw();
                boolean z9 = f15.j;
                if (z9) {
                    i12 = f15.e + ceil;
                    i11 = 2;
                } else {
                    i11 = 2;
                    i12 = (f15.h / 2) + ceil;
                }
                int i16 = i12;
                boolean z10 = f15.k;
                int i17 = z10 ? f15.f + ceil : (f15.i / 2) + ceil;
                j jVar2 = new j(new NinePatch(createBitmap, n0.c(i16, i16 + (z9 ? i11 : 1), i17, i17 + (z10 ? i11 : 1), 0, 0, 0, 0, 1).array(), null), null, ceil, createBitmap.getByteCount());
                iVar.put(Long.valueOf(j3), jVar2);
                jVar = jVar2;
            } else {
                j3 = a10;
            }
            jArr[i7] = j3;
            jVarArr[i7] = jVar;
        }
        int i18 = jVar.c;
        int i19 = i10 | (-16777216);
        PorterDuffColorFilter[] porterDuffColorFilterArr = this.d;
        PorterDuffColorFilter porterDuffColorFilter = porterDuffColorFilterArr[i7];
        int[] iArr = this.c;
        if (porterDuffColorFilter == null || iArr[i7] != i19) {
            iArr[i7] = i19;
            porterDuffColorFilterArr[i7] = new PorterDuffColorFilter(i19, PorterDuff.Mode.SRC_IN);
        }
        PorterDuffColorFilter porterDuffColorFilter2 = porterDuffColorFilterArr[i7];
        Paint paint2 = this.e;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setAlpha(Math.round(Math.min(1.0f, f14) * Color.alpha(i10)));
        int round = Math.round(f10) - i18;
        int round2 = Math.round(f11) - i18;
        int round3 = Math.round(f12) + i18;
        int round4 = Math.round(f13) + i18;
        Rect rect = this.g;
        rect.set(round, round2, round3, round4);
        jVar.a.draw(canvas, rect, paint2);
    }

    public final void d(Canvas canvas, int i7, Path path, long j3, float f10, float f11, float f12, float f13, h hVar, int i10, float f14) {
        long[] jArr;
        int round = Math.round(f12 - f10);
        int round2 = Math.round(f13 - f11);
        k f15 = f(i7, hVar, i, round, round2);
        float f16 = hVar.e;
        long a10 = (((((f15.a() ^ j3) * 1099511628211L) ^ round) * 1099511628211L) ^ round2) * 1099511628211L;
        j[] jVarArr = this.b;
        j jVar = jVarArr[i7];
        long[] jArr2 = this.a;
        if (jVar == null || jArr2[i7] != a10) {
            Long valueOf = Long.valueOf(a10);
            i iVar = h;
            jVar = (j) iVar.get(valueOf);
            if (jVar == null) {
                int round3 = Math.round(f10);
                int round4 = Math.round(f11);
                jArr = jArr2;
                int ceil = i7 == 2 ? ((int) Math.ceil(f16)) + 2 : 1;
                int i11 = ceil * 2;
                Bitmap createBitmap = Bitmap.createBitmap(round + i11, i11 + round2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                Path path2 = new Path(path);
                path2.offset(ceil - round3, ceil - round4);
                Paint paint = new Paint(1);
                paint.setColor(-1);
                canvas2.save();
                if (i7 == 2) {
                    float f17 = ceil;
                    new RectF(f17, f17, ceil + round, ceil + round2);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(f16 * 2.0f);
                    paint.setStrokeJoin(Paint.Join.ROUND);
                    paint.setAlpha(Math.round(Math.min(1.0f, 1.0f) * 255.0f));
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas2.clipOutPath(path2);
                    } else {
                        canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                    }
                    canvas2.drawPath(path2, paint);
                } else if (i7 == 3) {
                    b(canvas2, path2, hVar.g, paint);
                } else {
                    Path path3 = new Path(path2);
                    path3.offset(f15.c, f15.d);
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas2.clipOutPath(path3);
                    } else {
                        canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    }
                    canvas2.drawPath(path2, paint);
                }
                canvas2.restore();
                createBitmap.prepareToDraw();
                j jVar2 = new j(null, createBitmap, ceil, createBitmap.getByteCount());
                iVar.put(Long.valueOf(a10), jVar2);
                jVar = jVar2;
            } else {
                jArr = jArr2;
            }
            jArr[i7] = a10;
            jVarArr[i7] = jVar;
        }
        int i12 = jVar.c;
        int i13 = i10 | (-16777216);
        PorterDuffColorFilter[] porterDuffColorFilterArr = this.d;
        PorterDuffColorFilter porterDuffColorFilter = porterDuffColorFilterArr[i7];
        int[] iArr = this.c;
        if (porterDuffColorFilter == null || iArr[i7] != i13) {
            iArr[i7] = i13;
            porterDuffColorFilterArr[i7] = new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_IN);
        }
        PorterDuffColorFilter porterDuffColorFilter2 = porterDuffColorFilterArr[i7];
        Paint paint2 = this.e;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setAlpha(Math.round(Math.min(1.0f, f14) * Color.alpha(i10)));
        if (paint2.getAlpha() > 0) {
            canvas.drawBitmap(jVar.b, Math.round(f10) - i12, Math.round(f11) - i12, paint2);
        }
    }
}
