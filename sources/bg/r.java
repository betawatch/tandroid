package bg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r extends i {
    @Override // bg.i
    public final dg.g h(cg.a aVar) {
        return new dg.g(aVar, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167  */
    @Override // bg.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        int i11;
        int i12;
        if (this.h0 == null) {
            return;
        }
        float f16 = this.F0;
        n nVar = this.g0;
        float f17 = nVar.l;
        float f18 = nVar.k;
        float f19 = f16 / (f17 - f18);
        float f20 = i.k1;
        float f21 = (f18 * f19) - f20;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i14 >= arrayList.size()) {
                return;
            }
            dg.g gVar = (dg.g) arrayList.get(i14);
            boolean z11 = gVar.n;
            float[] fArr = gVar.k;
            Path path = gVar.f;
            Paint paint = gVar.c;
            if (z11 || gVar.o != 0.0f) {
                float[] fArr2 = this.h0.b;
                float f22 = fArr2.length < 2 ? 0.0f : fArr2[1] * f19;
                long[] jArr = gVar.a.a;
                int i15 = ((int) (f20 / f22)) + 1;
                path.reset();
                int max = Math.max(i13, this.F - i15);
                int min = Math.min(this.h0.b.length - 1, this.G + i15);
                boolean z12 = true;
                int i16 = 0;
                while (true) {
                    z10 = i.A1;
                    if (max > min) {
                        break;
                    }
                    int i17 = i16;
                    long j10 = jArr[max];
                    if (j10 < 0) {
                        f13 = f19;
                        f14 = f21;
                        f15 = f20;
                        i11 = min;
                    } else {
                        f13 = f19;
                        float f23 = (this.h0.b[max] * f13) - f21;
                        float f24 = this.x;
                        f14 = f21;
                        float f25 = (j10 - f24) / (this.w - f24);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        f15 = f20;
                        i11 = min;
                        float z13 = sc.e.z((getMeasuredHeight() - this.s) - i.n1, strokeWidth, f25, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (z10) {
                            if (i17 == 0) {
                                fArr[i17] = f23;
                                i12 = i17 + 2;
                                fArr[i17 + 1] = z13;
                            } else {
                                fArr[i17] = f23;
                                fArr[i17 + 1] = z13;
                                fArr[i17 + 2] = f23;
                                i12 = i17 + 4;
                                fArr[i17 + 3] = z13;
                            }
                            i16 = i12;
                        } else if (z12) {
                            path.moveTo(f23, z13);
                            i16 = i17;
                            z12 = false;
                        } else {
                            path.lineTo(f23, z13);
                        }
                        max++;
                        f19 = f13;
                        f21 = f14;
                        f20 = f15;
                        min = i11;
                    }
                    i16 = i17;
                    max++;
                    f19 = f13;
                    f21 = f14;
                    f20 = f15;
                    min = i11;
                }
                f7 = f19;
                f10 = f21;
                f11 = f20;
                int i18 = i16;
                canvas.save();
                int i19 = this.y0;
                float f26 = 1.0f;
                if (i19 == 2) {
                    dg.k kVar = this.z0;
                    float f27 = kVar.f;
                    f12 = f27 > 0.5f ? 0.0f : 1.0f - (f27 * 2.0f);
                    canvas.scale((f27 * 2.0f) + 1.0f, 1.0f, kVar.d, kVar.e);
                } else if (i19 == 1) {
                    float f28 = this.z0.f;
                    f12 = f28 < 0.3f ? 0.0f : f28;
                    canvas.save();
                    dg.k kVar2 = this.z0;
                    float f29 = kVar2.f;
                    canvas.scale(f29, f29, kVar2.d, kVar2.e);
                } else {
                    if (i19 == 3) {
                        f26 = this.z0.f;
                    }
                    paint.setAlpha((int) (gVar.o * 255.0f * f26));
                    if (this.G - this.F <= 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z10) {
                        canvas.drawPath(path, paint);
                        i10 = 0;
                    } else {
                        i10 = 0;
                        canvas.drawLines(fArr, 0, i18, paint);
                    }
                    canvas.restore();
                }
                f26 = f12;
                paint.setAlpha((int) (gVar.o * 255.0f * f26));
                if (this.G - this.F <= 100) {
                }
                if (z10) {
                }
                canvas.restore();
            } else {
                f7 = f19;
                f10 = f21;
                f11 = f20;
                i10 = i13;
            }
            i14++;
            i13 = i10;
            f19 = f7;
            f21 = f10;
            f20 = f11;
        }
    }

    @Override // bg.i
    public final void n(Canvas canvas) {
        boolean z10;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        int i11;
        int i12;
        Paint paint;
        float f7;
        float f10;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.h0 != null) {
            int i13 = 0;
            while (i13 < size) {
                dg.g gVar = (dg.g) arrayList3.get(i13);
                boolean z11 = gVar.n;
                Paint paint2 = gVar.b;
                float[] fArr = gVar.l;
                Path path = gVar.e;
                float f11 = 0.0f;
                if (z11 || gVar.o != 0.0f) {
                    path.reset();
                    int length = this.h0.b.length;
                    long[] jArr = gVar.a.a;
                    gVar.f.reset();
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        z10 = i.A1;
                        if (i14 >= length) {
                            break;
                        }
                        float f12 = f11;
                        long[] jArr2 = jArr;
                        long j10 = jArr2[i14];
                        if (j10 < 0) {
                            arrayList2 = arrayList3;
                            i11 = size;
                            i12 = length;
                        } else {
                            cg.b bVar = this.h0;
                            arrayList2 = arrayList3;
                            float f13 = this.C0 * bVar.b[i14];
                            boolean z12 = i.B1;
                            i11 = size;
                            if (z12) {
                                i12 = length;
                                f7 = this.j0;
                                paint = paint2;
                            } else {
                                i12 = length;
                                paint = paint2;
                                f7 = bVar.e;
                            }
                            if (z12) {
                                f10 = this.k0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f10 = bVar.f;
                            }
                            float f14 = (1.0f - ((j10 - f10) / (f7 - f10))) * this.B0;
                            if (z10) {
                                if (i15 == 0) {
                                    int i16 = i15 + 1;
                                    fArr[i15] = f13;
                                    i15 += 2;
                                    fArr[i16] = f14;
                                } else {
                                    fArr[i15] = f13;
                                    fArr[i15 + 1] = f14;
                                    int i17 = i15 + 3;
                                    fArr[i15 + 2] = f13;
                                    i15 += 4;
                                    fArr[i17] = f14;
                                }
                            } else if (i14 == 0) {
                                path.moveTo(f13, f14);
                            } else {
                                path.lineTo(f13, f14);
                            }
                        }
                        i14++;
                        f11 = f12;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i11;
                        length = i12;
                    }
                    arrayList = arrayList3;
                    i10 = size;
                    float f15 = f11;
                    gVar.j = i15;
                    if (gVar.n || gVar.o != f15) {
                        Paint paint3 = paint2;
                        paint3.setAlpha((int) (gVar.o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, gVar.j, paint3);
                        } else {
                            canvas.drawPath(path, paint3);
                        }
                        i13++;
                        arrayList3 = arrayList;
                        size = i10;
                    }
                } else {
                    arrayList = arrayList3;
                    i10 = size;
                }
                i13++;
                arrayList3 = arrayList;
                size = i10;
            }
        }
    }

    @Override // bg.i
    public final void t() {
        this.P0 = true;
        super.t();
    }
}
