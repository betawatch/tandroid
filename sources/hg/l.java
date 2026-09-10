package hg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l extends g {
    @Override // hg.g
    public final jg.f h(ig.a aVar) {
        return new jg.f(aVar, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e4  */
    @Override // hg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        int i11;
        if (this.h0 == null) {
            return;
        }
        float f14 = this.F0;
        j jVar = this.g0;
        float f15 = jVar.l;
        float f16 = jVar.k;
        float f17 = f14 / (f15 - f16);
        float f18 = g.k1;
        float f19 = (f16 * f17) - f18;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i13 >= arrayList.size()) {
                return;
            }
            jg.f fVar = (jg.f) arrayList.get(i13);
            boolean z11 = fVar.n;
            float[] fArr = fVar.k;
            Path path = fVar.f;
            Paint paint = fVar.c;
            if (z11 || fVar.o != 0.0f) {
                float[] fArr2 = this.h0.b;
                float f20 = fArr2.length < 2 ? 0.0f : fArr2[1] * f17;
                long[] jArr = fVar.a.a;
                int i14 = ((int) (f18 / f20)) + 1;
                path.reset();
                int max = Math.max(i12, this.F - i14);
                int min = Math.min(this.h0.b.length - 1, this.G + i14);
                boolean z12 = true;
                int i15 = 0;
                while (true) {
                    z10 = g.A1;
                    if (max > min) {
                        break;
                    }
                    float f21 = f17;
                    float f22 = f19;
                    long j3 = jArr[max];
                    if (j3 < 0) {
                        f13 = f18;
                        i11 = i13;
                    } else {
                        f13 = f18;
                        float f23 = (this.h0.b[max] * f21) - f22;
                        float f24 = this.w;
                        float f25 = (j3 - f24) / (this.v - f24);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        i11 = i13;
                        float a2 = e2.a((getMeasuredHeight() - this.s) - g.n1, strokeWidth, f25, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (!z10) {
                            if (z12) {
                                path.moveTo(f23 - (f20 / 2.0f), a2);
                                z12 = false;
                            } else {
                                path.lineTo(f23 - (f20 / 2.0f), a2);
                            }
                            path.lineTo((f20 / 2.0f) + f23, a2);
                        } else if (i15 == 0) {
                            float f26 = f20 / 2.0f;
                            fArr[i15] = f23 - f26;
                            fArr[i15 + 1] = a2;
                            float f27 = f23 + f26;
                            fArr[i15 + 2] = f27;
                            fArr[i15 + 3] = a2;
                            int i16 = i15 + 5;
                            fArr[i15 + 4] = f27;
                            i15 += 6;
                            fArr[i16] = a2;
                        } else if (max == min) {
                            float f28 = f20 / 2.0f;
                            float f29 = f23 - f28;
                            fArr[i15] = f29;
                            fArr[i15 + 1] = a2;
                            fArr[i15 + 2] = f29;
                            fArr[i15 + 3] = a2;
                            float f30 = f23 + f28;
                            fArr[i15 + 4] = f30;
                            fArr[i15 + 5] = a2;
                            fArr[i15 + 6] = f30;
                            fArr[i15 + 7] = a2;
                            int i17 = i15 + 9;
                            fArr[i15 + 8] = f30;
                            i15 += 10;
                            fArr[i17] = (getMeasuredHeight() - this.s) - strokeWidth;
                        } else {
                            float f31 = f20 / 2.0f;
                            float f32 = f23 - f31;
                            fArr[i15] = f32;
                            fArr[i15 + 1] = a2;
                            fArr[i15 + 2] = f32;
                            fArr[i15 + 3] = a2;
                            float f33 = f23 + f31;
                            fArr[i15 + 4] = f33;
                            fArr[i15 + 5] = a2;
                            int i18 = i15 + 7;
                            fArr[i15 + 6] = f33;
                            i15 += 8;
                            fArr[i18] = a2;
                        }
                    }
                    max++;
                    f17 = f21;
                    f19 = f22;
                    f18 = f13;
                    i13 = i11;
                }
                f7 = f17;
                f10 = f19;
                f11 = f18;
                i10 = i13;
                canvas.save();
                int i19 = this.y0;
                float f34 = 1.0f;
                if (i19 == 2) {
                    jg.j jVar2 = this.z0;
                    float f35 = jVar2.f;
                    f12 = f35 > 0.5f ? 0.0f : 1.0f - (f35 * 2.0f);
                    canvas.scale((f35 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
                } else if (i19 == 1) {
                    float f36 = this.z0.f;
                    f12 = f36 < 0.3f ? 0.0f : f36;
                    canvas.save();
                    jg.j jVar3 = this.z0;
                    float f37 = jVar3.f;
                    canvas.scale(f37, f37, jVar3.d, jVar3.e);
                } else {
                    if (i19 == 3) {
                        f34 = this.z0.f;
                    }
                    paint.setAlpha((int) (fVar.o * 255.0f * f34));
                    if (this.G - this.F <= 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z10) {
                        canvas.drawPath(path, paint);
                    } else {
                        canvas.drawLines(fArr, 0, i15, paint);
                    }
                    canvas.restore();
                }
                f34 = f12;
                paint.setAlpha((int) (fVar.o * 255.0f * f34));
                if (this.G - this.F <= 100) {
                }
                if (z10) {
                }
                canvas.restore();
            } else {
                f7 = f17;
                f10 = f19;
                f11 = f18;
                i10 = i13;
            }
            i13 = i10 + 1;
            f17 = f7;
            f19 = f10;
            f18 = f11;
            i12 = 0;
        }
    }

    @Override // hg.g
    public final void n(Canvas canvas) {
        boolean z10;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        int i11;
        float f7;
        float f10;
        float f11;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        ig.b bVar = this.h0;
        if (bVar != null) {
            float[] fArr = bVar.b;
            float f12 = fArr.length < 2 ? 1.0f : fArr[1] * this.C0;
            int i12 = 0;
            while (i12 < size) {
                jg.f fVar = (jg.f) arrayList3.get(i12);
                boolean z11 = fVar.n;
                Paint paint = fVar.b;
                float[] fArr2 = fVar.l;
                Path path = fVar.e;
                if (z11 || fVar.o != 0.0f) {
                    path.reset();
                    int length = this.h0.b.length;
                    long[] jArr = fVar.a.a;
                    fVar.f.reset();
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        z10 = g.A1;
                        if (i14 >= length) {
                            break;
                        }
                        long[] jArr2 = jArr;
                        long j3 = jArr2[i14];
                        if (j3 < 0) {
                            arrayList2 = arrayList3;
                            i11 = size;
                        } else {
                            ig.b bVar2 = this.h0;
                            arrayList2 = arrayList3;
                            float f13 = this.C0 * bVar2.b[i14];
                            boolean z12 = g.B1;
                            if (z12) {
                                f7 = this.j0;
                                i11 = size;
                            } else {
                                i11 = size;
                                f7 = bVar2.e;
                            }
                            if (z12) {
                                f11 = this.k0;
                                f10 = f7;
                            } else {
                                f10 = f7;
                                f11 = bVar2.f;
                            }
                            float f14 = (1.0f - ((j3 - f11) / (f10 - f11))) * this.B0;
                            if (!z10) {
                                if (i14 == 0) {
                                    path.moveTo(f13 - (f12 / 2.0f), f14);
                                } else {
                                    path.lineTo(f13 - (f12 / 2.0f), f14);
                                }
                                path.lineTo((f12 / 2.0f) + f13, f14);
                            } else if (i13 == 0) {
                                float f15 = f12 / 2.0f;
                                fArr2[i13] = f13 - f15;
                                fArr2[i13 + 1] = f14;
                                float f16 = f13 + f15;
                                fArr2[i13 + 2] = f16;
                                fArr2[i13 + 3] = f14;
                                int i15 = i13 + 5;
                                fArr2[i13 + 4] = f16;
                                i13 += 6;
                                fArr2[i15] = f14;
                            } else if (i14 == length - 1) {
                                float f17 = f12 / 2.0f;
                                float f18 = f13 - f17;
                                fArr2[i13] = f18;
                                fArr2[i13 + 1] = f14;
                                fArr2[i13 + 2] = f18;
                                fArr2[i13 + 3] = f14;
                                float f19 = f13 + f17;
                                fArr2[i13 + 4] = f19;
                                fArr2[i13 + 5] = f14;
                                fArr2[i13 + 6] = f19;
                                fArr2[i13 + 7] = f14;
                                int i16 = i13 + 9;
                                fArr2[i13 + 8] = f19;
                                i13 += 10;
                                fArr2[i16] = 0.0f;
                            } else {
                                float f20 = f12 / 2.0f;
                                float f21 = f13 - f20;
                                fArr2[i13] = f21;
                                fArr2[i13 + 1] = f14;
                                fArr2[i13 + 2] = f21;
                                fArr2[i13 + 3] = f14;
                                float f22 = f13 + f20;
                                fArr2[i13 + 4] = f22;
                                fArr2[i13 + 5] = f14;
                                int i17 = i13 + 7;
                                fArr2[i13 + 6] = f22;
                                i13 += 8;
                                fArr2[i17] = f14;
                            }
                        }
                        i14++;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i11;
                    }
                    arrayList = arrayList3;
                    i10 = size;
                    fVar.j = i13;
                    if (fVar.n || fVar.o != 0.0f) {
                        paint.setAlpha((int) (fVar.o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr2, 0, fVar.j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                } else {
                    arrayList = arrayList3;
                    i10 = size;
                }
                i12++;
                arrayList3 = arrayList;
                size = i10;
            }
        }
    }

    @Override // hg.g
    public final void t() {
        this.P0 = true;
        super.t();
    }
}
