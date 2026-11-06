package lg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class l extends g {
    @Override // lg.g
    public final ng.f h(mg.a aVar) {
        return new ng.f(aVar, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e2  */
    @Override // lg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        boolean z9;
        float f10;
        float f11;
        float f12;
        int i7;
        float f13;
        int i10;
        float f14;
        int i11;
        if (this.h0 == null) {
            return;
        }
        float f15 = this.F0;
        j jVar = this.g0;
        float f16 = jVar.l;
        float f17 = jVar.k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.k1;
        float f20 = (f17 * f18) - f19;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i13 >= arrayList.size()) {
                return;
            }
            ng.f fVar = (ng.f) arrayList.get(i13);
            boolean z10 = fVar.n;
            float[] fArr = fVar.k;
            Path path = fVar.f;
            Paint paint = fVar.c;
            if (z10 || fVar.o != 0.0f) {
                float[] fArr2 = this.h0.b;
                float f21 = fArr2.length < 2 ? 0.0f : fArr2[1] * f18;
                long[] jArr = fVar.a.a;
                int i14 = ((int) (f19 / f21)) + 1;
                path.reset();
                int max = Math.max(i12, this.F - i14);
                int min = Math.min(this.h0.b.length - 1, this.G + i14);
                boolean z11 = true;
                int i15 = 0;
                while (true) {
                    z9 = g.A1;
                    if (max > min) {
                        break;
                    }
                    float f22 = f18;
                    float f23 = f20;
                    long j3 = jArr[max];
                    if (j3 < 0) {
                        f14 = f19;
                        i11 = i13;
                    } else {
                        f14 = f19;
                        float f24 = (this.h0.b[max] * f22) - f23;
                        float f25 = this.x;
                        float f26 = (j3 - f25) / (this.w - f25);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        i11 = i13;
                        float v = com.google.android.recaptcha.internal.a.v((getMeasuredHeight() - this.s) - g.n1, strokeWidth, f26, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (!z9) {
                            if (z11) {
                                path.moveTo(f24 - (f21 / 2.0f), v);
                                z11 = false;
                            } else {
                                path.lineTo(f24 - (f21 / 2.0f), v);
                            }
                            path.lineTo((f21 / 2.0f) + f24, v);
                        } else if (i15 == 0) {
                            float f27 = f21 / 2.0f;
                            fArr[i15] = f24 - f27;
                            fArr[i15 + 1] = v;
                            float f28 = f24 + f27;
                            fArr[i15 + 2] = f28;
                            fArr[i15 + 3] = v;
                            int i16 = i15 + 5;
                            fArr[i15 + 4] = f28;
                            i15 += 6;
                            fArr[i16] = v;
                        } else if (max == min) {
                            float f29 = f21 / 2.0f;
                            float f30 = f24 - f29;
                            fArr[i15] = f30;
                            fArr[i15 + 1] = v;
                            fArr[i15 + 2] = f30;
                            fArr[i15 + 3] = v;
                            float f31 = f24 + f29;
                            fArr[i15 + 4] = f31;
                            fArr[i15 + 5] = v;
                            fArr[i15 + 6] = f31;
                            fArr[i15 + 7] = v;
                            int i17 = i15 + 9;
                            fArr[i15 + 8] = f31;
                            i15 += 10;
                            fArr[i17] = (getMeasuredHeight() - this.s) - strokeWidth;
                        } else {
                            float f32 = f21 / 2.0f;
                            float f33 = f24 - f32;
                            fArr[i15] = f33;
                            fArr[i15 + 1] = v;
                            fArr[i15 + 2] = f33;
                            fArr[i15 + 3] = v;
                            float f34 = f24 + f32;
                            fArr[i15 + 4] = f34;
                            fArr[i15 + 5] = v;
                            int i18 = i15 + 7;
                            fArr[i15 + 6] = f34;
                            i15 += 8;
                            fArr[i18] = v;
                        }
                    }
                    max++;
                    f18 = f22;
                    f20 = f23;
                    f19 = f14;
                    i13 = i11;
                }
                f10 = f18;
                f11 = f20;
                f12 = f19;
                i7 = i13;
                canvas.save();
                int i19 = this.y0;
                float f35 = 1.0f;
                if (i19 == 2) {
                    ng.j jVar2 = this.z0;
                    float f36 = jVar2.f;
                    f13 = f36 > 0.5f ? 0.0f : 1.0f - (f36 * 2.0f);
                    canvas.scale((f36 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
                } else if (i19 == 1) {
                    float f37 = this.z0.f;
                    f13 = f37 < 0.3f ? 0.0f : f37;
                    canvas.save();
                    ng.j jVar3 = this.z0;
                    float f38 = jVar3.f;
                    canvas.scale(f38, f38, jVar3.d, jVar3.e);
                } else {
                    if (i19 == 3) {
                        f35 = this.z0.f;
                    }
                    paint.setAlpha((int) (fVar.o * 255.0f * f35));
                    if (this.G - this.F <= 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z9) {
                        canvas.drawPath(path, paint);
                        i10 = 0;
                    } else {
                        i10 = 0;
                        canvas.drawLines(fArr, 0, i15, paint);
                    }
                    canvas.restore();
                }
                f35 = f13;
                paint.setAlpha((int) (fVar.o * 255.0f * f35));
                if (this.G - this.F <= 100) {
                }
                if (z9) {
                }
                canvas.restore();
            } else {
                f10 = f18;
                f11 = f20;
                f12 = f19;
                i10 = i12;
                i7 = i13;
            }
            i13 = i7 + 1;
            i12 = i10;
            f18 = f10;
            f20 = f11;
            f19 = f12;
        }
    }

    @Override // lg.g
    public final void n(Canvas canvas) {
        boolean z9;
        ArrayList arrayList;
        int i7;
        ArrayList arrayList2;
        int i10;
        float f10;
        float f11;
        float f12;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        mg.b bVar = this.h0;
        if (bVar != null) {
            float[] fArr = bVar.b;
            float f13 = fArr.length < 2 ? 1.0f : fArr[1] * this.C0;
            int i11 = 0;
            while (i11 < size) {
                ng.f fVar = (ng.f) arrayList3.get(i11);
                boolean z10 = fVar.n;
                Paint paint = fVar.b;
                float[] fArr2 = fVar.l;
                Path path = fVar.e;
                float f14 = 0.0f;
                if (z10 || fVar.o != 0.0f) {
                    path.reset();
                    int length = this.h0.b.length;
                    long[] jArr = fVar.a.a;
                    fVar.f.reset();
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        z9 = g.A1;
                        if (i13 >= length) {
                            break;
                        }
                        float f15 = f14;
                        long[] jArr2 = jArr;
                        long j3 = jArr2[i13];
                        if (j3 < 0) {
                            arrayList2 = arrayList3;
                            i10 = size;
                        } else {
                            mg.b bVar2 = this.h0;
                            arrayList2 = arrayList3;
                            float f16 = this.C0 * bVar2.b[i13];
                            boolean z11 = g.B1;
                            if (z11) {
                                f10 = this.j0;
                                i10 = size;
                            } else {
                                i10 = size;
                                f10 = bVar2.e;
                            }
                            if (z11) {
                                f12 = this.k0;
                                f11 = f10;
                            } else {
                                f11 = f10;
                                f12 = bVar2.f;
                            }
                            float f17 = (1.0f - ((j3 - f12) / (f11 - f12))) * this.B0;
                            if (!z9) {
                                if (i13 == 0) {
                                    path.moveTo(f16 - (f13 / 2.0f), f17);
                                } else {
                                    path.lineTo(f16 - (f13 / 2.0f), f17);
                                }
                                path.lineTo((f13 / 2.0f) + f16, f17);
                            } else if (i12 == 0) {
                                float f18 = f13 / 2.0f;
                                fArr2[i12] = f16 - f18;
                                fArr2[i12 + 1] = f17;
                                float f19 = f16 + f18;
                                fArr2[i12 + 2] = f19;
                                fArr2[i12 + 3] = f17;
                                int i14 = i12 + 5;
                                fArr2[i12 + 4] = f19;
                                i12 += 6;
                                fArr2[i14] = f17;
                            } else if (i13 == length - 1) {
                                float f20 = f13 / 2.0f;
                                float f21 = f16 - f20;
                                fArr2[i12] = f21;
                                fArr2[i12 + 1] = f17;
                                fArr2[i12 + 2] = f21;
                                fArr2[i12 + 3] = f17;
                                float f22 = f16 + f20;
                                fArr2[i12 + 4] = f22;
                                fArr2[i12 + 5] = f17;
                                fArr2[i12 + 6] = f22;
                                fArr2[i12 + 7] = f17;
                                int i15 = i12 + 9;
                                fArr2[i12 + 8] = f22;
                                i12 += 10;
                                fArr2[i15] = f15;
                            } else {
                                float f23 = f13 / 2.0f;
                                float f24 = f16 - f23;
                                fArr2[i12] = f24;
                                fArr2[i12 + 1] = f17;
                                fArr2[i12 + 2] = f24;
                                fArr2[i12 + 3] = f17;
                                float f25 = f16 + f23;
                                fArr2[i12 + 4] = f25;
                                fArr2[i12 + 5] = f17;
                                int i16 = i12 + 7;
                                fArr2[i12 + 6] = f25;
                                i12 += 8;
                                fArr2[i16] = f17;
                            }
                        }
                        i13++;
                        f14 = f15;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i10;
                    }
                    arrayList = arrayList3;
                    i7 = size;
                    float f26 = f14;
                    fVar.j = i12;
                    if (fVar.n || fVar.o != f26) {
                        paint.setAlpha((int) (fVar.o * 255.0f));
                        if (z9) {
                            canvas.drawLines(fArr2, 0, fVar.j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                } else {
                    arrayList = arrayList3;
                    i7 = size;
                }
                i11++;
                arrayList3 = arrayList;
                size = i7;
            }
        }
    }

    @Override // lg.g
    public final void t() {
        this.P0 = true;
        super.t();
    }
}
