package mg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m extends g {
    @Override // mg.g
    public final og.f h(ng.a aVar) {
        return new og.f(aVar, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167  */
    @Override // mg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        int i3;
        float f14;
        float f15;
        float f16;
        int i10;
        int i11;
        if (this.i0 == null) {
            return;
        }
        float f17 = this.G0;
        j jVar = this.h0;
        float f18 = jVar.l;
        float f19 = jVar.k;
        float f20 = f17 / (f18 - f19);
        float f21 = g.l1;
        float f22 = (f19 * f20) - f21;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i13 >= arrayList.size()) {
                return;
            }
            og.f fVar = (og.f) arrayList.get(i13);
            boolean z11 = fVar.n;
            float[] fArr = fVar.k;
            Path path = fVar.f;
            Paint paint = fVar.c;
            if (z11 || fVar.o != 0.0f) {
                float[] fArr2 = this.i0.b;
                float f23 = fArr2.length < 2 ? 0.0f : fArr2[1] * f20;
                long[] jArr = fVar.a.a;
                int i14 = ((int) (f21 / f23)) + 1;
                path.reset();
                int max = Math.max(i12, this.G - i14);
                int min = Math.min(this.i0.b.length - 1, this.H + i14);
                boolean z12 = true;
                int i15 = 0;
                while (true) {
                    z10 = g.B1;
                    if (max > min) {
                        break;
                    }
                    int i16 = i15;
                    long j10 = jArr[max];
                    if (j10 < 0) {
                        f14 = f20;
                        f15 = f22;
                        f16 = f21;
                        i10 = min;
                    } else {
                        f14 = f20;
                        float f24 = (this.i0.b[max] * f14) - f22;
                        float f25 = this.x;
                        f15 = f22;
                        float f26 = (j10 - f25) / (this.w - f25);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        f16 = f21;
                        i10 = min;
                        float D = a1.g.D((getMeasuredHeight() - this.s) - g.o1, strokeWidth, f26, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (z10) {
                            if (i16 == 0) {
                                fArr[i16] = f24;
                                i11 = i16 + 2;
                                fArr[i16 + 1] = D;
                            } else {
                                fArr[i16] = f24;
                                fArr[i16 + 1] = D;
                                fArr[i16 + 2] = f24;
                                i11 = i16 + 4;
                                fArr[i16 + 3] = D;
                            }
                            i15 = i11;
                        } else if (z12) {
                            path.moveTo(f24, D);
                            i15 = i16;
                            z12 = false;
                        } else {
                            path.lineTo(f24, D);
                        }
                        max++;
                        f20 = f14;
                        f22 = f15;
                        f21 = f16;
                        min = i10;
                    }
                    i15 = i16;
                    max++;
                    f20 = f14;
                    f22 = f15;
                    f21 = f16;
                    min = i10;
                }
                f10 = f20;
                f11 = f22;
                f12 = f21;
                int i17 = i15;
                canvas.save();
                int i18 = this.z0;
                float f27 = 1.0f;
                if (i18 == 2) {
                    og.j jVar2 = this.A0;
                    float f28 = jVar2.f;
                    f13 = f28 > 0.5f ? 0.0f : 1.0f - (f28 * 2.0f);
                    canvas.scale((f28 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
                } else if (i18 == 1) {
                    float f29 = this.A0.f;
                    f13 = f29 < 0.3f ? 0.0f : f29;
                    canvas.save();
                    og.j jVar3 = this.A0;
                    float f30 = jVar3.f;
                    canvas.scale(f30, f30, jVar3.d, jVar3.e);
                } else {
                    if (i18 == 3) {
                        f27 = this.A0.f;
                    }
                    paint.setAlpha((int) (fVar.o * 255.0f * f27));
                    if (this.H - this.G <= 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z10) {
                        canvas.drawPath(path, paint);
                        i3 = 0;
                    } else {
                        i3 = 0;
                        canvas.drawLines(fArr, 0, i17, paint);
                    }
                    canvas.restore();
                }
                f27 = f13;
                paint.setAlpha((int) (fVar.o * 255.0f * f27));
                if (this.H - this.G <= 100) {
                }
                if (z10) {
                }
                canvas.restore();
            } else {
                f10 = f20;
                f11 = f22;
                f12 = f21;
                i3 = i12;
            }
            i13++;
            i12 = i3;
            f20 = f10;
            f22 = f11;
            f21 = f12;
        }
    }

    @Override // mg.g
    public final void n(Canvas canvas) {
        boolean z10;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        int i10;
        int i11;
        Paint paint;
        float f10;
        float f11;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.i0 != null) {
            int i12 = 0;
            while (i12 < size) {
                og.f fVar = (og.f) arrayList3.get(i12);
                boolean z11 = fVar.n;
                Paint paint2 = fVar.b;
                float[] fArr = fVar.l;
                Path path = fVar.e;
                float f12 = 0.0f;
                if (z11 || fVar.o != 0.0f) {
                    path.reset();
                    int length = this.i0.b.length;
                    long[] jArr = fVar.a.a;
                    fVar.f.reset();
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        z10 = g.B1;
                        if (i13 >= length) {
                            break;
                        }
                        float f13 = f12;
                        long[] jArr2 = jArr;
                        long j10 = jArr2[i13];
                        if (j10 < 0) {
                            arrayList2 = arrayList3;
                            i10 = size;
                            i11 = length;
                        } else {
                            ng.b bVar = this.i0;
                            arrayList2 = arrayList3;
                            float f14 = this.D0 * bVar.b[i13];
                            boolean z12 = g.C1;
                            i10 = size;
                            if (z12) {
                                i11 = length;
                                f10 = this.k0;
                                paint = paint2;
                            } else {
                                i11 = length;
                                paint = paint2;
                                f10 = bVar.e;
                            }
                            if (z12) {
                                f11 = this.l0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f11 = bVar.f;
                            }
                            float f15 = (1.0f - ((j10 - f11) / (f10 - f11))) * this.C0;
                            if (z10) {
                                if (i14 == 0) {
                                    int i15 = i14 + 1;
                                    fArr[i14] = f14;
                                    i14 += 2;
                                    fArr[i15] = f15;
                                } else {
                                    fArr[i14] = f14;
                                    fArr[i14 + 1] = f15;
                                    int i16 = i14 + 3;
                                    fArr[i14 + 2] = f14;
                                    i14 += 4;
                                    fArr[i16] = f15;
                                }
                            } else if (i13 == 0) {
                                path.moveTo(f14, f15);
                            } else {
                                path.lineTo(f14, f15);
                            }
                        }
                        i13++;
                        f12 = f13;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i10;
                        length = i11;
                    }
                    arrayList = arrayList3;
                    i3 = size;
                    float f16 = f12;
                    fVar.j = i14;
                    if (fVar.n || fVar.o != f16) {
                        Paint paint3 = paint2;
                        paint3.setAlpha((int) (fVar.o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.j, paint3);
                        } else {
                            canvas.drawPath(path, paint3);
                        }
                        i12++;
                        arrayList3 = arrayList;
                        size = i3;
                    }
                } else {
                    arrayList = arrayList3;
                    i3 = size;
                }
                i12++;
                arrayList3 = arrayList;
                size = i3;
            }
        }
    }

    @Override // mg.g
    public final void t() {
        this.Q0 = true;
        super.t();
    }
}
