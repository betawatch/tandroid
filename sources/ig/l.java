package ig;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l extends g {
    @Override // ig.g
    public final kg.f h(jg.a aVar) {
        return new kg.f(aVar, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e2  */
    @Override // ig.g
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
        int i11;
        float f13;
        int i12;
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
                float f20 = fArr2.length < 2 ? 0.0f : fArr2[1] * f17;
                long[] jArr = fVar.a.a;
                int i15 = ((int) (f18 / f20)) + 1;
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
                    float f21 = f17;
                    float f22 = f19;
                    long j3 = jArr[max];
                    if (j3 < 0) {
                        f13 = f18;
                        i12 = i14;
                    } else {
                        f13 = f18;
                        float f23 = (this.h0.b[max] * f21) - f22;
                        float f24 = this.w;
                        float f25 = (j3 - f24) / (this.v - f24);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        i12 = i14;
                        float b10 = e2.b((getMeasuredHeight() - this.s) - g.n1, strokeWidth, f25, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (!z10) {
                            if (z12) {
                                path.moveTo(f23 - (f20 / 2.0f), b10);
                                z12 = false;
                            } else {
                                path.lineTo(f23 - (f20 / 2.0f), b10);
                            }
                            path.lineTo((f20 / 2.0f) + f23, b10);
                        } else if (i16 == 0) {
                            float f26 = f20 / 2.0f;
                            fArr[i16] = f23 - f26;
                            fArr[i16 + 1] = b10;
                            float f27 = f23 + f26;
                            fArr[i16 + 2] = f27;
                            fArr[i16 + 3] = b10;
                            int i17 = i16 + 5;
                            fArr[i16 + 4] = f27;
                            i16 += 6;
                            fArr[i17] = b10;
                        } else if (max == min) {
                            float f28 = f20 / 2.0f;
                            float f29 = f23 - f28;
                            fArr[i16] = f29;
                            fArr[i16 + 1] = b10;
                            fArr[i16 + 2] = f29;
                            fArr[i16 + 3] = b10;
                            float f30 = f23 + f28;
                            fArr[i16 + 4] = f30;
                            fArr[i16 + 5] = b10;
                            fArr[i16 + 6] = f30;
                            fArr[i16 + 7] = b10;
                            int i18 = i16 + 9;
                            fArr[i16 + 8] = f30;
                            i16 += 10;
                            fArr[i18] = (getMeasuredHeight() - this.s) - strokeWidth;
                        } else {
                            float f31 = f20 / 2.0f;
                            float f32 = f23 - f31;
                            fArr[i16] = f32;
                            fArr[i16 + 1] = b10;
                            fArr[i16 + 2] = f32;
                            fArr[i16 + 3] = b10;
                            float f33 = f23 + f31;
                            fArr[i16 + 4] = f33;
                            fArr[i16 + 5] = b10;
                            int i19 = i16 + 7;
                            fArr[i16 + 6] = f33;
                            i16 += 8;
                            fArr[i19] = b10;
                        }
                    }
                    max++;
                    f17 = f21;
                    f19 = f22;
                    f18 = f13;
                    i14 = i12;
                }
                f7 = f17;
                f10 = f19;
                f11 = f18;
                i10 = i14;
                canvas.save();
                int i20 = this.y0;
                float f34 = 1.0f;
                if (i20 == 2) {
                    kg.j jVar2 = this.z0;
                    float f35 = jVar2.f;
                    f12 = f35 > 0.5f ? 0.0f : 1.0f - (f35 * 2.0f);
                    canvas.scale((f35 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
                } else if (i20 == 1) {
                    float f36 = this.z0.f;
                    f12 = f36 < 0.3f ? 0.0f : f36;
                    canvas.save();
                    kg.j jVar3 = this.z0;
                    float f37 = jVar3.f;
                    canvas.scale(f37, f37, jVar3.d, jVar3.e);
                } else {
                    if (i20 == 3) {
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
                        i11 = 0;
                    } else {
                        i11 = 0;
                        canvas.drawLines(fArr, 0, i16, paint);
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
                i11 = i13;
                i10 = i14;
            }
            i14 = i10 + 1;
            i13 = i11;
            f17 = f7;
            f19 = f10;
            f18 = f11;
        }
    }

    @Override // ig.g
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
        jg.b bVar = this.h0;
        if (bVar != null) {
            float[] fArr = bVar.b;
            float f12 = fArr.length < 2 ? 1.0f : fArr[1] * this.C0;
            int i12 = 0;
            while (i12 < size) {
                kg.f fVar = (kg.f) arrayList3.get(i12);
                boolean z11 = fVar.n;
                Paint paint = fVar.b;
                float[] fArr2 = fVar.l;
                Path path = fVar.e;
                float f13 = 0.0f;
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
                        float f14 = f13;
                        long[] jArr2 = jArr;
                        long j3 = jArr2[i14];
                        if (j3 < 0) {
                            arrayList2 = arrayList3;
                            i11 = size;
                        } else {
                            jg.b bVar2 = this.h0;
                            arrayList2 = arrayList3;
                            float f15 = this.C0 * bVar2.b[i14];
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
                            float f16 = (1.0f - ((j3 - f11) / (f10 - f11))) * this.B0;
                            if (!z10) {
                                if (i14 == 0) {
                                    path.moveTo(f15 - (f12 / 2.0f), f16);
                                } else {
                                    path.lineTo(f15 - (f12 / 2.0f), f16);
                                }
                                path.lineTo((f12 / 2.0f) + f15, f16);
                            } else if (i13 == 0) {
                                float f17 = f12 / 2.0f;
                                fArr2[i13] = f15 - f17;
                                fArr2[i13 + 1] = f16;
                                float f18 = f15 + f17;
                                fArr2[i13 + 2] = f18;
                                fArr2[i13 + 3] = f16;
                                int i15 = i13 + 5;
                                fArr2[i13 + 4] = f18;
                                i13 += 6;
                                fArr2[i15] = f16;
                            } else if (i14 == length - 1) {
                                float f19 = f12 / 2.0f;
                                float f20 = f15 - f19;
                                fArr2[i13] = f20;
                                fArr2[i13 + 1] = f16;
                                fArr2[i13 + 2] = f20;
                                fArr2[i13 + 3] = f16;
                                float f21 = f15 + f19;
                                fArr2[i13 + 4] = f21;
                                fArr2[i13 + 5] = f16;
                                fArr2[i13 + 6] = f21;
                                fArr2[i13 + 7] = f16;
                                int i16 = i13 + 9;
                                fArr2[i13 + 8] = f21;
                                i13 += 10;
                                fArr2[i16] = f14;
                            } else {
                                float f22 = f12 / 2.0f;
                                float f23 = f15 - f22;
                                fArr2[i13] = f23;
                                fArr2[i13 + 1] = f16;
                                fArr2[i13 + 2] = f23;
                                fArr2[i13 + 3] = f16;
                                float f24 = f15 + f22;
                                fArr2[i13 + 4] = f24;
                                fArr2[i13 + 5] = f16;
                                int i17 = i13 + 7;
                                fArr2[i13 + 6] = f24;
                                i13 += 8;
                                fArr2[i17] = f16;
                            }
                        }
                        i14++;
                        f13 = f14;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i11;
                    }
                    arrayList = arrayList3;
                    i10 = size;
                    float f25 = f13;
                    fVar.j = i13;
                    if (fVar.n || fVar.o != f25) {
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

    @Override // ig.g
    public final void t() {
        this.P0 = true;
        super.t();
    }
}
