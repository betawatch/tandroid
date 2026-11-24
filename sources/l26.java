// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l26 extends nf0 {
    @Override // nf0
    public final k26 h(ek1 ek1Var) {
        return new k26(ek1Var, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01da  */
    @Override // nf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        int i2;
        float f5;
        int i3;
        if (this.i0 == null) {
            return;
        }
        float f6 = this.G0;
        lk1 lk1Var = this.h0;
        float f7 = lk1Var.l;
        float f8 = lk1Var.k;
        float f9 = f6 / (f7 - f8);
        float f10 = nf0.l1;
        float f11 = (f8 * f9) - f10;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i5 >= arrayList.size()) {
                return;
            }
            k26 k26Var = (k26) arrayList.get(i5);
            boolean z2 = k26Var.n;
            float[] fArr = k26Var.k;
            Path path = k26Var.f;
            Paint paint = k26Var.c;
            if (z2 || k26Var.o != 0.0f) {
                float[] fArr2 = this.i0.b;
                float f12 = fArr2.length < 2 ? 0.0f : fArr2[1] * f9;
                long[] jArr = k26Var.a.a;
                int i6 = ((int) (f10 / f12)) + 1;
                path.reset();
                int max = Math.max(i4, this.G - i6);
                int min = Math.min(this.i0.b.length - 1, this.H + i6);
                boolean z3 = true;
                int i7 = 0;
                while (true) {
                    z = nf0.B1;
                    f = f9;
                    f2 = f11;
                    if (max > min) {
                        break;
                    }
                    long j = jArr[max];
                    if (j < 0) {
                        f5 = f10;
                        i3 = i5;
                    } else {
                        f5 = f10;
                        float f13 = (this.i0.b[max] * f) - f2;
                        float f14 = this.x;
                        float f15 = (j - f14) / (this.w - f14);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        i3 = i5;
                        float B = ls6.B((getMeasuredHeight() - this.s) - nf0.o1, strokeWidth, f15, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (!z) {
                            float f16 = f13 - (f12 / 2.0f);
                            if (z3) {
                                path.moveTo(f16, B);
                                z3 = false;
                            } else {
                                path.lineTo(f16, B);
                            }
                            path.lineTo((f12 / 2.0f) + f13, B);
                        } else if (i7 == 0) {
                            float f17 = f12 / 2.0f;
                            fArr[i7] = f13 - f17;
                            fArr[i7 + 1] = B;
                            float f18 = f13 + f17;
                            fArr[i7 + 2] = f18;
                            fArr[i7 + 3] = B;
                            int i8 = i7 + 5;
                            fArr[i7 + 4] = f18;
                            i7 += 6;
                            fArr[i8] = B;
                        } else if (max == min) {
                            float f19 = f12 / 2.0f;
                            float f20 = f13 - f19;
                            fArr[i7] = f20;
                            fArr[i7 + 1] = B;
                            fArr[i7 + 2] = f20;
                            fArr[i7 + 3] = B;
                            float f21 = f13 + f19;
                            fArr[i7 + 4] = f21;
                            fArr[i7 + 5] = B;
                            fArr[i7 + 6] = f21;
                            fArr[i7 + 7] = B;
                            int i9 = i7 + 9;
                            fArr[i7 + 8] = f21;
                            i7 += 10;
                            fArr[i9] = (getMeasuredHeight() - this.s) - strokeWidth;
                        } else {
                            float f22 = f12 / 2.0f;
                            float f23 = f13 - f22;
                            fArr[i7] = f23;
                            fArr[i7 + 1] = B;
                            fArr[i7 + 2] = f23;
                            fArr[i7 + 3] = B;
                            float f24 = f13 + f22;
                            fArr[i7 + 4] = f24;
                            fArr[i7 + 5] = B;
                            int i10 = i7 + 7;
                            fArr[i7 + 6] = f24;
                            i7 += 8;
                            fArr[i10] = B;
                        }
                    }
                    max++;
                    f9 = f;
                    f11 = f2;
                    f10 = f5;
                    i5 = i3;
                }
                f3 = f10;
                i = i5;
                canvas.save();
                byte b = this.z0;
                float f25 = 1.0f;
                if (b == 2) {
                    zyb zybVar = this.A0;
                    float f26 = zybVar.f;
                    f4 = f26 > 0.5f ? 0.0f : 1.0f - (f26 * 2.0f);
                    canvas.scale((f26 * 2.0f) + 1.0f, 1.0f, zybVar.d, zybVar.e);
                } else if (b == 1) {
                    float f27 = this.A0.f;
                    f4 = f27 < 0.3f ? 0.0f : f27;
                    canvas.save();
                    zyb zybVar2 = this.A0;
                    float f28 = zybVar2.f;
                    canvas.scale(f28, f28, zybVar2.d, zybVar2.e);
                } else {
                    if (b == 3) {
                        f25 = this.A0.f;
                    }
                    paint.setAlpha((int) (k26Var.o * 255.0f * f25));
                    if (this.H - this.G <= 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z) {
                        canvas.drawPath(path, paint);
                        i2 = 0;
                    } else {
                        i2 = 0;
                        canvas.drawLines(fArr, 0, i7, paint);
                    }
                    canvas.restore();
                }
                f25 = f4;
                paint.setAlpha((int) (k26Var.o * 255.0f * f25));
                if (this.H - this.G <= 100) {
                }
                if (z) {
                }
                canvas.restore();
            } else {
                f = f9;
                f2 = f11;
                f3 = f10;
                i2 = i4;
                i = i5;
            }
            i5 = i + 1;
            i4 = i2;
            f9 = f;
            f11 = f2;
            f10 = f3;
        }
    }

    @Override // nf0
    public final void n(Canvas canvas) {
        boolean z;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        float f;
        int i2;
        float f2;
        float f3;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        fk1 fk1Var = this.i0;
        if (fk1Var != null) {
            float[] fArr = fk1Var.b;
            float f4 = fArr.length < 2 ? 1.0f : fArr[1] * this.D0;
            int i3 = 0;
            while (i3 < size) {
                k26 k26Var = (k26) arrayList3.get(i3);
                boolean z2 = k26Var.n;
                Paint paint = k26Var.b;
                float[] fArr2 = k26Var.l;
                Path path = k26Var.e;
                float f5 = 0.0f;
                if (z2 || k26Var.o != 0.0f) {
                    path.reset();
                    int length = this.i0.b.length;
                    long[] jArr = k26Var.a.a;
                    k26Var.f.reset();
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        z = nf0.B1;
                        if (i5 >= length) {
                            break;
                        }
                        float f6 = f5;
                        long[] jArr2 = jArr;
                        long j = jArr2[i5];
                        if (j < 0) {
                            arrayList2 = arrayList3;
                            i2 = size;
                        } else {
                            fk1 fk1Var2 = this.i0;
                            arrayList2 = arrayList3;
                            float f7 = this.D0 * fk1Var2.b[i5];
                            if (nf0.C1) {
                                f3 = this.k0;
                                f = f7;
                                f2 = this.l0;
                                i2 = size;
                            } else {
                                f = f7;
                                i2 = size;
                                float f8 = fk1Var2.e;
                                f2 = fk1Var2.f;
                                f3 = f8;
                            }
                            float f9 = (1.0f - ((j - f2) / (f3 - f2))) * this.C0;
                            if (!z) {
                                float f10 = f - (f4 / 2.0f);
                                if (i5 == 0) {
                                    path.moveTo(f10, f9);
                                } else {
                                    path.lineTo(f10, f9);
                                }
                                path.lineTo((f4 / 2.0f) + f, f9);
                            } else if (i4 == 0) {
                                float f11 = f4 / 2.0f;
                                fArr2[i4] = f - f11;
                                fArr2[i4 + 1] = f9;
                                float f12 = f + f11;
                                fArr2[i4 + 2] = f12;
                                fArr2[i4 + 3] = f9;
                                int i6 = i4 + 5;
                                fArr2[i4 + 4] = f12;
                                i4 += 6;
                                fArr2[i6] = f9;
                            } else if (i5 == length - 1) {
                                float f13 = f4 / 2.0f;
                                float f14 = f - f13;
                                fArr2[i4] = f14;
                                fArr2[i4 + 1] = f9;
                                fArr2[i4 + 2] = f14;
                                fArr2[i4 + 3] = f9;
                                float f15 = f + f13;
                                fArr2[i4 + 4] = f15;
                                fArr2[i4 + 5] = f9;
                                fArr2[i4 + 6] = f15;
                                fArr2[i4 + 7] = f9;
                                int i7 = i4 + 9;
                                fArr2[i4 + 8] = f15;
                                i4 += 10;
                                fArr2[i7] = f6;
                            } else {
                                float f16 = f4 / 2.0f;
                                float f17 = f - f16;
                                fArr2[i4] = f17;
                                fArr2[i4 + 1] = f9;
                                fArr2[i4 + 2] = f17;
                                fArr2[i4 + 3] = f9;
                                float f18 = f + f16;
                                fArr2[i4 + 4] = f18;
                                fArr2[i4 + 5] = f9;
                                int i8 = i4 + 7;
                                fArr2[i4 + 6] = f18;
                                i4 += 8;
                                fArr2[i8] = f9;
                            }
                        }
                        i5++;
                        f5 = f6;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i2;
                    }
                    arrayList = arrayList3;
                    i = size;
                    float f19 = f5;
                    k26Var.j = i4;
                    if (k26Var.n || k26Var.o != f19) {
                        paint.setAlpha((int) (k26Var.o * 255.0f));
                        if (z) {
                            canvas.drawLines(fArr2, 0, k26Var.j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                } else {
                    arrayList = arrayList3;
                    i = size;
                }
                i3++;
                arrayList3 = arrayList;
                size = i;
            }
        }
    }

    @Override // nf0
    public final void t() {
        this.Q0 = true;
        super.t();
    }
}
