package ig;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class m extends g {
    @Override // ig.g
    public final kg.f h(jg.a aVar) {
        return new kg.f(aVar, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167  */
    @Override // ig.g
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
        j jVar = this.g0;
        float f17 = jVar.l;
        float f18 = jVar.k;
        float f19 = f16 / (f17 - f18);
        float f20 = g.k1;
        float f21 = (f18 * f19) - f20;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i14 >= arrayList.size()) {
                return;
            }
            kg.f fVar = (kg.f) arrayList.get(i14);
            boolean z11 = fVar.n;
            float[] fArr = fVar.k;
            Path path = fVar.f;
            Paint paint = fVar.c;
            if (z11 || fVar.o != 0.0f) {
                float[] fArr2 = this.h0.b;
                float f22 = fArr2.length < 2 ? 0.0f : fArr2[1] * f19;
                long[] jArr = fVar.a.a;
                int i15 = ((int) (f20 / f22)) + 1;
                path.reset();
                int max = Math.max(i13, this.F - i15);
                int min = Math.min(this.h0.b.length - 1, this.G + i15);
                boolean z12 = true;
                int i16 = 0;
                while (true) {
                    z10 = g.A1;
                    if (max > min) {
                        break;
                    }
                    int i17 = i16;
                    long j3 = jArr[max];
                    if (j3 < 0) {
                        f13 = f19;
                        f14 = f21;
                        f15 = f20;
                        i11 = min;
                    } else {
                        f13 = f19;
                        float f23 = (this.h0.b[max] * f13) - f21;
                        float f24 = this.w;
                        f14 = f21;
                        float f25 = (j3 - f24) / (this.v - f24);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        f15 = f20;
                        i11 = min;
                        float b10 = e2.b((getMeasuredHeight() - this.s) - g.n1, strokeWidth, f25, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (z10) {
                            if (i17 == 0) {
                                fArr[i17] = f23;
                                i12 = i17 + 2;
                                fArr[i17 + 1] = b10;
                            } else {
                                fArr[i17] = f23;
                                fArr[i17 + 1] = b10;
                                fArr[i17 + 2] = f23;
                                i12 = i17 + 4;
                                fArr[i17 + 3] = b10;
                            }
                            i16 = i12;
                        } else if (z12) {
                            path.moveTo(f23, b10);
                            i16 = i17;
                            z12 = false;
                        } else {
                            path.lineTo(f23, b10);
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
                    kg.j jVar2 = this.z0;
                    float f27 = jVar2.f;
                    f12 = f27 > 0.5f ? 0.0f : 1.0f - (f27 * 2.0f);
                    canvas.scale((f27 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
                } else if (i19 == 1) {
                    float f28 = this.z0.f;
                    f12 = f28 < 0.3f ? 0.0f : f28;
                    canvas.save();
                    kg.j jVar3 = this.z0;
                    float f29 = jVar3.f;
                    canvas.scale(f29, f29, jVar3.d, jVar3.e);
                } else {
                    if (i19 == 3) {
                        f26 = this.z0.f;
                    }
                    paint.setAlpha((int) (fVar.o * 255.0f * f26));
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
                paint.setAlpha((int) (fVar.o * 255.0f * f26));
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

    @Override // ig.g
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
                kg.f fVar = (kg.f) arrayList3.get(i13);
                boolean z11 = fVar.n;
                Paint paint2 = fVar.b;
                float[] fArr = fVar.l;
                Path path = fVar.e;
                float f11 = 0.0f;
                if (z11 || fVar.o != 0.0f) {
                    path.reset();
                    int length = this.h0.b.length;
                    long[] jArr = fVar.a.a;
                    fVar.f.reset();
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        z10 = g.A1;
                        if (i14 >= length) {
                            break;
                        }
                        float f12 = f11;
                        long[] jArr2 = jArr;
                        long j3 = jArr2[i14];
                        if (j3 < 0) {
                            arrayList2 = arrayList3;
                            i11 = size;
                            i12 = length;
                        } else {
                            jg.b bVar = this.h0;
                            arrayList2 = arrayList3;
                            float f13 = this.C0 * bVar.b[i14];
                            boolean z12 = g.B1;
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
                            float f14 = (1.0f - ((j3 - f10) / (f7 - f10))) * this.B0;
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
                    fVar.j = i15;
                    if (fVar.n || fVar.o != f15) {
                        Paint paint3 = paint2;
                        paint3.setAlpha((int) (fVar.o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.j, paint3);
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

    @Override // ig.g
    public final void t() {
        this.P0 = true;
        super.t();
    }
}
