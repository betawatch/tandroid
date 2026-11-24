// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class mma extends nf0 {
    public final Matrix E1;
    public final float[] F1;
    public final Path G1;
    public boolean[] H1;
    public float[] I1;

    public mma(Context context) {
        super(context, null);
        this.E1 = new Matrix();
        this.F1 = new float[2];
        this.G1 = new Path();
        this.x0 = true;
        this.y0 = true;
        this.e = false;
    }

    @Override // nf0
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public nma h(ek1 ek1Var) {
        return new nma(ek1Var);
    }

    public final int M(float f, float f2) {
        RectF rectF = this.I0;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY() + gl.L(16.0f);
        if (f >= centerX) {
            if (f2 <= centerY) {
                return 0;
            }
            if (f2 >= centerY) {
                return 1;
            }
        }
        return (f >= centerX || f2 < centerY) ? 3 : 2;
    }

    @Override // nf0
    public float getMinDistance() {
        return 0.1f;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0560 A[EDGE_INSN: B:202:0x0560->B:203:0x0560 BREAK  A[LOOP:1: B:29:0x0137->B:201:0x0550], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0592 A[LOOP:5: B:207:0x0590->B:208:0x0592, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03c6  */
    @Override // nf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(Canvas canvas) {
        ArrayList arrayList;
        float f;
        float f2;
        float f3;
        int i;
        int min;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int size;
        float f4;
        int i4;
        float f5;
        float f6;
        float measuredHeight;
        float measuredHeight2;
        byte b;
        int i5;
        ArrayList arrayList2;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        int i6;
        int i7;
        float f13;
        float f14;
        char c;
        int i8;
        int i9;
        float f15;
        double degrees;
        int M;
        int M2;
        float f16;
        boolean z3;
        float f17;
        float f18;
        float f19;
        float f20;
        double degrees2;
        int i10;
        if (this.i0 != null) {
            float f21 = this.G0;
            lk1 lk1Var = this.h0;
            float f22 = lk1Var.l;
            float f23 = lk1Var.k;
            float f24 = f21 / (f22 - f23);
            float f25 = nf0.l1;
            float f26 = (f23 * f24) - f25;
            RectF rectF = this.I0;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY() + gl.L(16.0f);
            int i11 = 0;
            while (true) {
                arrayList = this.d;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((nma) arrayList.get(i11)).f.reset();
                ((nma) arrayList.get(i11)).g.reset();
                i11++;
            }
            canvas.save();
            boolean[] zArr = this.H1;
            if (zArr == null || zArr.length < ((lma) this.i0).d.size()) {
                this.H1 = new boolean[((lma) this.i0).d.size()];
                this.I1 = new float[((lma) this.i0).d.size()];
            }
            byte b2 = this.z0;
            if (b2 == 2) {
                f3 = this.A0.f / 0.6f;
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                Path path = this.G1;
                path.reset();
                float width = rectF.width() > rectF.height() ? rectF.width() : rectF.height();
                float height = (rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f;
                f2 = 0.0f;
                float A = tb4.A(1.0f, this.A0.f, (width - height) / 2.0f, height);
                RectF rectF2 = new RectF();
                f = 1.0f;
                rectF2.set(centerX - A, centerY - A, centerX + A, centerY + A);
                path.addRoundRect(rectF2, A, A, Path.Direction.CW);
                canvas.clipPath(path);
            } else {
                f = 1.0f;
                f2 = 0.0f;
                if (b2 == 3) {
                    i = (int) (this.A0.f * 255.0f);
                    f3 = 0.0f;
                    float[] fArr = ((lma) this.i0).b;
                    int i12 = ((int) (f25 / (fArr.length >= 2 ? f : fArr[1] * f24))) + 1;
                    int max = Math.max(0, (this.G - i12) - 1);
                    min = Math.min(((lma) this.i0).b.length - 1, this.H + i12 + 1);
                    i2 = max;
                    float f27 = f2;
                    float f28 = f27;
                    z = false;
                    while (true) {
                        i3 = nf0.o1;
                        if (i2 <= min) {
                            break;
                        }
                        float f29 = f24;
                        float f30 = f26;
                        float f31 = f3;
                        boolean z4 = z;
                        float f32 = f2;
                        int i13 = 0;
                        int i14 = 0;
                        int i15 = 0;
                        while (i15 < arrayList.size()) {
                            k26 k26Var = (k26) arrayList.get(i15);
                            int i16 = i15;
                            if (k26Var.n || k26Var.o != f2) {
                                i10 = i;
                                long j = k26Var.a.a[i2];
                                if (j > 0) {
                                    f32 = (j * k26Var.o) + f32;
                                    i13++;
                                }
                                i14 = i16;
                            } else {
                                i10 = i;
                            }
                            i15 = i16 + 1;
                            i = i10;
                        }
                        int i17 = i;
                        float f33 = f2;
                        int i18 = 0;
                        while (i18 < arrayList.size()) {
                            k26 k26Var2 = (k26) arrayList.get(i18);
                            float f34 = f27;
                            boolean z5 = k26Var2.n;
                            Path path2 = k26Var2.f;
                            if (z5) {
                                f4 = f33;
                            } else {
                                f4 = f33;
                                if (k26Var2.o == f2) {
                                    i5 = i13;
                                    i9 = min;
                                    arrayList2 = arrayList;
                                    i6 = max;
                                    i7 = i3;
                                    f15 = f2;
                                    f33 = f4;
                                    i8 = i14;
                                    f27 = f34;
                                    i18++;
                                    f2 = f15;
                                    min = i9;
                                    i14 = i8;
                                    max = i6;
                                    i13 = i5;
                                    i3 = i7;
                                    arrayList = arrayList2;
                                }
                            }
                            long[] jArr = k26Var2.a.a;
                            if (i13 == 1) {
                                if (jArr[i2] != 0) {
                                    f5 = k26Var2.o;
                                    i4 = i13;
                                    float[] fArr2 = ((lma) this.i0).b;
                                    f6 = (fArr2[i2] * f29) - f30;
                                    float measuredWidth = i2 != min ? getMeasuredWidth() : (fArr2[i2 + 1] * f29) - f30;
                                    if (f5 == f2 && i18 == i14) {
                                        z4 = true;
                                    }
                                    float measuredHeight3 = ((getMeasuredHeight() - this.s) - i3) * f5;
                                    measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight3) - f4;
                                    this.I1[i18] = measuredHeight;
                                    measuredHeight2 = getMeasuredHeight() - this.s;
                                    if (i2 != min) {
                                        f34 = f6;
                                    } else if (i2 == max) {
                                        f28 = f6;
                                    }
                                    b = this.z0;
                                    float f35 = measuredWidth;
                                    float[] fArr3 = this.F1;
                                    i5 = i4;
                                    Matrix matrix = this.E1;
                                    if (b == 2 || i18 == i14) {
                                        arrayList2 = arrayList;
                                        f7 = f2;
                                        f8 = measuredHeight;
                                        f9 = measuredHeight2;
                                        f10 = f6;
                                    } else {
                                        zyb zybVar = this.A0;
                                        if (f6 < centerX) {
                                            f19 = zybVar.g[i18];
                                            f20 = zybVar.h[i18];
                                        } else {
                                            f19 = zybVar.i[i18];
                                            f20 = zybVar.j[i18];
                                        }
                                        float f36 = centerX - f19;
                                        float f37 = centerY - f20;
                                        float f38 = (((f6 - f19) * f37) / f36) + f20;
                                        float f39 = f - f31;
                                        float f40 = measuredHeight * f39;
                                        float f41 = f38 * f31;
                                        float f42 = f40 + f41;
                                        float f43 = (measuredHeight2 * f39) + f41;
                                        float f44 = f37 / f36;
                                        if (f44 > f2) {
                                            arrayList2 = arrayList;
                                            degrees2 = Math.toDegrees(-Math.atan(f44));
                                        } else {
                                            arrayList2 = arrayList;
                                            degrees2 = Math.toDegrees(Math.atan(Math.abs(f44)));
                                        }
                                        float f45 = ((float) degrees2) - 90.0f;
                                        if (f6 >= centerX) {
                                            fArr3[0] = f6;
                                            fArr3[1] = f42;
                                            matrix.reset();
                                            matrix.postRotate(this.A0.f * f45, centerX, centerY);
                                            matrix.mapPoints(fArr3);
                                            float f46 = fArr3[0];
                                            f8 = fArr3[1];
                                            if (f46 < centerX) {
                                                f46 = centerX;
                                            }
                                            fArr3[0] = f6;
                                            fArr3[1] = f43;
                                            matrix.reset();
                                            f7 = f45;
                                            matrix.postRotate(this.A0.f * f7, centerX, centerY);
                                            matrix.mapPoints(fArr3);
                                            f9 = fArr3[1];
                                            f11 = f28;
                                            f12 = f46;
                                            f10 = f6 < centerX ? centerX : f6;
                                        } else {
                                            f7 = f45;
                                            if (f35 >= centerX) {
                                                f10 = (f6 * f39) + (centerX * f31);
                                                f9 = (centerY * f31) + (f42 * f39);
                                                f8 = f9;
                                            } else {
                                                fArr3[0] = f6;
                                                fArr3[1] = f42;
                                                matrix.reset();
                                                zyb zybVar2 = this.A0;
                                                float f47 = zybVar2.f;
                                                matrix.postRotate((f47 * zybVar2.k[i18]) + (f47 * f7), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                float f48 = fArr3[0];
                                                f8 = fArr3[1];
                                                if (f35 >= centerX) {
                                                    float f49 = this.A0.f;
                                                    fArr3[0] = (f49 * centerX) + ((f - f49) * f6);
                                                } else {
                                                    fArr3[0] = f6;
                                                }
                                                fArr3[1] = f43;
                                                matrix.reset();
                                                zyb zybVar3 = this.A0;
                                                float f50 = zybVar3.f;
                                                matrix.postRotate((f50 * zybVar3.k[i18]) + (f50 * f7), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                f10 = fArr3[0];
                                                f9 = fArr3[1];
                                                f11 = f28;
                                                f12 = f48;
                                            }
                                        }
                                        i6 = max;
                                        if (i2 == max) {
                                            float measuredHeight4 = getMeasuredHeight();
                                            i7 = i3;
                                            if (this.z0 != 2 || i18 == i14) {
                                                z3 = false;
                                                f17 = f2;
                                                f18 = measuredHeight4;
                                            } else {
                                                fArr3[0] = f2 - centerX;
                                                fArr3[1] = measuredHeight4;
                                                matrix.reset();
                                                zyb zybVar4 = this.A0;
                                                float f51 = zybVar4.f;
                                                matrix.postRotate((f51 * zybVar4.k[i18]) + (f7 * f51), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                z3 = false;
                                                f17 = fArr3[0];
                                                f18 = fArr3[1];
                                            }
                                            path2.moveTo(f17, f18);
                                            this.H1[i18] = z3;
                                        } else {
                                            i7 = i3;
                                        }
                                        zyb zybVar5 = this.A0;
                                        f13 = zybVar5 == null ? f2 : zybVar5.f;
                                        if (f5 == f2 || i2 <= 0 || jArr[i2 - 1] != 0 || i2 >= min || jArr[i2 + 1] != 0) {
                                            f14 = f13;
                                        } else {
                                            f14 = f13;
                                            if (this.z0 != 2) {
                                                if (!this.H1[i18]) {
                                                    if (i18 == i14) {
                                                        path2.lineTo(f10, (f - f14) * f9);
                                                    } else {
                                                        path2.lineTo(f10, f9);
                                                    }
                                                }
                                                this.H1[i18] = true;
                                                c = 0;
                                                if (i2 == min) {
                                                    float measuredWidth2 = getMeasuredWidth();
                                                    float measuredHeight5 = getMeasuredHeight();
                                                    if (this.z0 != 2 || i18 == i14) {
                                                        path2.lineTo(measuredWidth2, measuredHeight5);
                                                    } else {
                                                        fArr3[c] = measuredWidth2 + centerX;
                                                        fArr3[1] = measuredHeight5;
                                                        matrix.reset();
                                                        zyb zybVar6 = this.A0;
                                                        matrix.postRotate(zybVar6.f * zybVar6.k[i18], centerX, centerY);
                                                        matrix.mapPoints(fArr3);
                                                        float f52 = fArr3[c];
                                                        float f53 = fArr3[1];
                                                    }
                                                    if (this.z0 == 2 && i18 != i14) {
                                                        zyb zybVar7 = this.A0;
                                                        float f54 = (centerY - zybVar7.h[i18]) / (centerX - zybVar7.g[i18]);
                                                        i8 = i14;
                                                        if (f54 > f2) {
                                                            i9 = min;
                                                            degrees = Math.toDegrees(-Math.atan(f54));
                                                        } else {
                                                            i9 = min;
                                                            degrees = Math.toDegrees(Math.atan(Math.abs(f54)));
                                                        }
                                                        zyb zybVar8 = this.A0;
                                                        float f55 = zybVar8.g[i18];
                                                        float f56 = zybVar8.h[i18];
                                                        fArr3[0] = f55;
                                                        fArr3[1] = f56;
                                                        matrix.reset();
                                                        zyb zybVar9 = this.A0;
                                                        float f57 = zybVar9.f;
                                                        matrix.postRotate((f57 * zybVar9.k[i18]) + ((((float) degrees) - 90.0f) * f57), centerX, centerY);
                                                        matrix.mapPoints(fArr3);
                                                        float f58 = fArr3[0];
                                                        float f59 = fArr3[1];
                                                        if (Math.abs(f12 - f58) >= 0.001d || ((f59 >= centerY || f8 >= centerY) && (f59 <= centerY || f8 <= centerY))) {
                                                            M = M(f12, f8);
                                                            M2 = M(f58, f59);
                                                        } else {
                                                            M2 = this.A0.k[i18] == -180.0f ? 0 : 3;
                                                            M = 0;
                                                        }
                                                        while (M <= M2) {
                                                            if (M == 0) {
                                                                f16 = f2;
                                                                path2.lineTo(getMeasuredWidth(), f16);
                                                            } else if (M == 1) {
                                                                path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
                                                                f16 = 0.0f;
                                                            } else if (M == 2) {
                                                                f16 = 0.0f;
                                                                path2.lineTo(0.0f, getMeasuredHeight());
                                                            } else {
                                                                f16 = 0.0f;
                                                                path2.lineTo(0.0f, 0.0f);
                                                            }
                                                            M++;
                                                            f2 = f16;
                                                        }
                                                        f15 = f2;
                                                        f33 = f4 + measuredHeight3;
                                                        f28 = f11;
                                                    }
                                                }
                                                i8 = i14;
                                                i9 = min;
                                                f15 = f2;
                                                f33 = f4 + measuredHeight3;
                                                f28 = f11;
                                            }
                                        }
                                        if (this.H1[i18]) {
                                            if (i18 == i14) {
                                                path2.lineTo(f10, (f - f14) * f9);
                                            } else {
                                                path2.lineTo(f10, f9);
                                            }
                                        }
                                        if (i18 == i14) {
                                            path2.lineTo(f12, (f - f14) * f8);
                                        } else {
                                            path2.lineTo(f12, f8);
                                        }
                                        c = 0;
                                        this.H1[i18] = false;
                                        if (i2 == min) {
                                        }
                                        i8 = i14;
                                        i9 = min;
                                        f15 = f2;
                                        f33 = f4 + measuredHeight3;
                                        f28 = f11;
                                    }
                                    f11 = f28;
                                    f12 = f10;
                                    i6 = max;
                                    if (i2 == max) {
                                    }
                                    zyb zybVar52 = this.A0;
                                    if (zybVar52 == null) {
                                    }
                                    if (f5 == f2) {
                                    }
                                    f14 = f13;
                                    if (this.H1[i18]) {
                                    }
                                    if (i18 == i14) {
                                    }
                                    c = 0;
                                    this.H1[i18] = false;
                                    if (i2 == min) {
                                    }
                                    i8 = i14;
                                    i9 = min;
                                    f15 = f2;
                                    f33 = f4 + measuredHeight3;
                                    f28 = f11;
                                }
                                i4 = i13;
                                f5 = f2;
                                float[] fArr22 = ((lma) this.i0).b;
                                f6 = (fArr22[i2] * f29) - f30;
                                if (i2 != min) {
                                }
                                if (f5 == f2) {
                                    z4 = true;
                                }
                                float measuredHeight32 = ((getMeasuredHeight() - this.s) - i3) * f5;
                                measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight32) - f4;
                                this.I1[i18] = measuredHeight;
                                measuredHeight2 = getMeasuredHeight() - this.s;
                                if (i2 != min) {
                                }
                                b = this.z0;
                                float f352 = measuredWidth;
                                float[] fArr32 = this.F1;
                                i5 = i4;
                                Matrix matrix2 = this.E1;
                                if (b == 2) {
                                }
                                arrayList2 = arrayList;
                                f7 = f2;
                                f8 = measuredHeight;
                                f9 = measuredHeight2;
                                f10 = f6;
                                f11 = f28;
                                f12 = f10;
                                i6 = max;
                                if (i2 == max) {
                                }
                                zyb zybVar522 = this.A0;
                                if (zybVar522 == null) {
                                }
                                if (f5 == f2) {
                                }
                                f14 = f13;
                                if (this.H1[i18]) {
                                }
                                if (i18 == i14) {
                                }
                                c = 0;
                                this.H1[i18] = false;
                                if (i2 == min) {
                                }
                                i8 = i14;
                                i9 = min;
                                f15 = f2;
                                f33 = f4 + measuredHeight32;
                                f28 = f11;
                            } else {
                                if (f32 != f2) {
                                    i4 = i13;
                                    f5 = (jArr[i2] * k26Var2.o) / f32;
                                    float[] fArr222 = ((lma) this.i0).b;
                                    f6 = (fArr222[i2] * f29) - f30;
                                    if (i2 != min) {
                                    }
                                    if (f5 == f2) {
                                    }
                                    float measuredHeight322 = ((getMeasuredHeight() - this.s) - i3) * f5;
                                    measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight322) - f4;
                                    this.I1[i18] = measuredHeight;
                                    measuredHeight2 = getMeasuredHeight() - this.s;
                                    if (i2 != min) {
                                    }
                                    b = this.z0;
                                    float f3522 = measuredWidth;
                                    float[] fArr322 = this.F1;
                                    i5 = i4;
                                    Matrix matrix22 = this.E1;
                                    if (b == 2) {
                                    }
                                    arrayList2 = arrayList;
                                    f7 = f2;
                                    f8 = measuredHeight;
                                    f9 = measuredHeight2;
                                    f10 = f6;
                                    f11 = f28;
                                    f12 = f10;
                                    i6 = max;
                                    if (i2 == max) {
                                    }
                                    zyb zybVar5222 = this.A0;
                                    if (zybVar5222 == null) {
                                    }
                                    if (f5 == f2) {
                                    }
                                    f14 = f13;
                                    if (this.H1[i18]) {
                                    }
                                    if (i18 == i14) {
                                    }
                                    c = 0;
                                    this.H1[i18] = false;
                                    if (i2 == min) {
                                    }
                                    i8 = i14;
                                    i9 = min;
                                    f15 = f2;
                                    f33 = f4 + measuredHeight322;
                                    f28 = f11;
                                }
                                i4 = i13;
                                f5 = f2;
                                float[] fArr2222 = ((lma) this.i0).b;
                                f6 = (fArr2222[i2] * f29) - f30;
                                if (i2 != min) {
                                }
                                if (f5 == f2) {
                                }
                                float measuredHeight3222 = ((getMeasuredHeight() - this.s) - i3) * f5;
                                measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight3222) - f4;
                                this.I1[i18] = measuredHeight;
                                measuredHeight2 = getMeasuredHeight() - this.s;
                                if (i2 != min) {
                                }
                                b = this.z0;
                                float f35222 = measuredWidth;
                                float[] fArr3222 = this.F1;
                                i5 = i4;
                                Matrix matrix222 = this.E1;
                                if (b == 2) {
                                }
                                arrayList2 = arrayList;
                                f7 = f2;
                                f8 = measuredHeight;
                                f9 = measuredHeight2;
                                f10 = f6;
                                f11 = f28;
                                f12 = f10;
                                i6 = max;
                                if (i2 == max) {
                                }
                                zyb zybVar52222 = this.A0;
                                if (zybVar52222 == null) {
                                }
                                if (f5 == f2) {
                                }
                                f14 = f13;
                                if (this.H1[i18]) {
                                }
                                if (i18 == i14) {
                                }
                                c = 0;
                                this.H1[i18] = false;
                                if (i2 == min) {
                                }
                                i8 = i14;
                                i9 = min;
                                f15 = f2;
                                f33 = f4 + measuredHeight3222;
                                f28 = f11;
                            }
                            f27 = f34;
                            i18++;
                            f2 = f15;
                            min = i9;
                            i14 = i8;
                            max = i6;
                            i13 = i5;
                            i3 = i7;
                            arrayList = arrayList2;
                        }
                        i2++;
                        min = min;
                        f24 = f29;
                        f26 = f30;
                        f3 = f31;
                        z = z4;
                        i = i17;
                    }
                    int i19 = i;
                    ArrayList arrayList3 = arrayList;
                    z2 = z;
                    canvas.save();
                    canvas.clipRect(f28, i3, f27, getMeasuredHeight() - this.s);
                    if (z2) {
                        canvas.drawColor(bkb.w0(null, bkb.hk, false));
                    }
                    for (size = arrayList3.size() - 1; size >= 0; size--) {
                        k26 k26Var3 = (k26) arrayList3.get(size);
                        Paint paint = k26Var3.c;
                        paint.setAlpha(i19);
                        canvas.drawPath(k26Var3.f, paint);
                        paint.setAlpha(kk7.d4);
                    }
                    canvas.restore();
                    canvas.restore();
                }
                f3 = 0.0f;
            }
            i = kk7.d4;
            float[] fArr4 = ((lma) this.i0).b;
            int i122 = ((int) (f25 / (fArr4.length >= 2 ? f : fArr4[1] * f24))) + 1;
            int max2 = Math.max(0, (this.G - i122) - 1);
            min = Math.min(((lma) this.i0).b.length - 1, this.H + i122 + 1);
            i2 = max2;
            float f272 = f2;
            float f282 = f272;
            z = false;
            while (true) {
                i3 = nf0.o1;
                if (i2 <= min) {
                }
                i2++;
                min = min;
                f24 = f29;
                f26 = f30;
                f3 = f31;
                z = z4;
                i = i17;
            }
            int i192 = i;
            ArrayList arrayList32 = arrayList;
            z2 = z;
            canvas.save();
            canvas.clipRect(f282, i3, f272, getMeasuredHeight() - this.s);
            if (z2) {
            }
            while (size >= 0) {
            }
            canvas.restore();
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010b  */
    @Override // nf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(Canvas canvas) {
        int i;
        boolean z;
        float f;
        boolean z2;
        fk1 fk1Var;
        if (this.i0 != null) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((nma) arrayList.get(i2)).g.reset();
            }
            fk1 fk1Var2 = this.i0;
            int i3 = ((lma) fk1Var2).n;
            boolean[] zArr = this.H1;
            if (zArr == null || zArr.length < ((lma) fk1Var2).d.size()) {
                this.H1 = new boolean[((lma) this.i0).d.size()];
            }
            boolean z3 = false;
            for (int i4 = 0; i4 < i3; i4++) {
                float f2 = 0.0f;
                float f3 = 0.0f;
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    k26 k26Var = (k26) arrayList.get(i7);
                    if (k26Var.n || k26Var.o != 0.0f) {
                        if (((lma) this.i0).m[i7][i4] > 0) {
                            f3 += ((lma) r12).m[i7][i4] * k26Var.o;
                            i5++;
                        }
                        i6 = i7;
                    }
                }
                int i8 = i3 - 1;
                float f4 = (i4 / i8) * this.D0;
                float f5 = 0.0f;
                int i9 = 0;
                while (i9 < arrayList.size()) {
                    k26 k26Var2 = (k26) arrayList.get(i9);
                    float f6 = f2;
                    boolean z4 = k26Var2.n;
                    Path path = k26Var2.g;
                    if (!z4 && k26Var2.o == f6) {
                        i = i3;
                    } else if (i5 == 1) {
                        if (((lma) this.i0).m[i9][i4] != 0) {
                            f = k26Var2.o;
                            i = i3;
                            z = z3;
                            boolean z5 = (f == f6 || i9 != i6) ? z : true;
                            int i10 = this.C0;
                            float f7 = f * i10;
                            float f8 = (i10 - f7) - f5;
                            if (i4 != 0) {
                                z2 = z5;
                                path.moveTo(f6, i10);
                                this.H1[i9] = false;
                            } else {
                                z2 = z5;
                            }
                            fk1Var = this.i0;
                            if (((lma) fk1Var).m[i9][i4] == 0 || i4 <= 0 || ((lma) fk1Var).m[i9][i4 - 1] != 0 || i4 >= i8 || ((lma) fk1Var).m[i9][i4 + 1] != 0) {
                                if (this.H1[i9]) {
                                    path.lineTo(f4, i10);
                                }
                                path.lineTo(f4, f8);
                                this.H1[i9] = false;
                            } else {
                                if (!this.H1[i9]) {
                                    path.lineTo(f4, i10);
                                }
                                this.H1[i9] = true;
                            }
                            if (i4 == i8) {
                                path.lineTo(this.D0, i10);
                            }
                            f5 += f7;
                            z3 = z2;
                        }
                        i = i3;
                        z = z3;
                        f = f6;
                        if (f == f6) {
                        }
                        int i102 = this.C0;
                        float f72 = f * i102;
                        float f82 = (i102 - f72) - f5;
                        if (i4 != 0) {
                        }
                        fk1Var = this.i0;
                        if (((lma) fk1Var).m[i9][i4] == 0) {
                        }
                        if (this.H1[i9]) {
                        }
                        path.lineTo(f4, f82);
                        this.H1[i9] = false;
                        if (i4 == i8) {
                        }
                        f5 += f72;
                        z3 = z2;
                    } else {
                        if (f3 != f6) {
                            i = i3;
                            z = z3;
                            f = (((lma) this.i0).m[i9][i4] * k26Var2.o) / f3;
                            if (f == f6) {
                            }
                            int i1022 = this.C0;
                            float f722 = f * i1022;
                            float f822 = (i1022 - f722) - f5;
                            if (i4 != 0) {
                            }
                            fk1Var = this.i0;
                            if (((lma) fk1Var).m[i9][i4] == 0) {
                            }
                            if (this.H1[i9]) {
                            }
                            path.lineTo(f4, f822);
                            this.H1[i9] = false;
                            if (i4 == i8) {
                            }
                            f5 += f722;
                            z3 = z2;
                        }
                        i = i3;
                        z = z3;
                        f = f6;
                        if (f == f6) {
                        }
                        int i10222 = this.C0;
                        float f7222 = f * i10222;
                        float f8222 = (i10222 - f7222) - f5;
                        if (i4 != 0) {
                        }
                        fk1Var = this.i0;
                        if (((lma) fk1Var).m[i9][i4] == 0) {
                        }
                        if (this.H1[i9]) {
                        }
                        path.lineTo(f4, f8222);
                        this.H1[i9] = false;
                        if (i4 == i8) {
                        }
                        f5 += f7222;
                        z3 = z2;
                    }
                    i9++;
                    i3 = i;
                    f2 = 0.0f;
                }
            }
            if (z3) {
                canvas.drawColor(bkb.w0(null, bkb.hk, false));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                k26 k26Var3 = (k26) arrayList.get(size2);
                canvas.drawPath(k26Var3.g, k26Var3.c);
            }
        }
    }

    @Override // nf0, android.view.View
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.n0 = arrayList.size();
        int i = 0;
        while (true) {
            this.o0 = i;
            int i2 = this.o0;
            if (i2 >= this.n0) {
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
            l(canvas, (ik1) arrayList.get(i2));
            p(canvas, (ik1) arrayList.get(this.o0));
            i = this.o0 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013c  */
    @Override // nf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(zyb zybVar) {
        ArrayList arrayList;
        int i;
        float f;
        fk1 fk1Var = this.i0;
        if (fk1Var != null) {
            float f2 = this.G0;
            lk1 lk1Var = this.h0;
            float f3 = lk1Var.l;
            float f4 = lk1Var.k;
            float f5 = f2 / (f3 - f4);
            float f6 = nf0.l1;
            float f7 = (f4 * f5) - f6;
            int i2 = 2;
            int i3 = 1;
            int i4 = ((int) (f6 / (((lma) fk1Var).b.length < 2 ? 1.0f : ((lma) fk1Var).b[1] * f5))) + 1;
            int i5 = 0;
            int max = Math.max(0, (this.G - i4) - 1);
            int min = Math.min(((lma) this.i0).b.length - 1, this.H + i4 + 1);
            this.A0.g = new float[((lma) this.i0).d.size()];
            this.A0.h = new float[((lma) this.i0).d.size()];
            this.A0.i = new float[((lma) this.i0).d.size()];
            this.A0.j = new float[((lma) this.i0).d.size()];
            this.A0.k = new float[((lma) this.i0).d.size()];
            int i6 = 0;
            while (i6 < i2) {
                int i7 = i6 == i3 ? min : max;
                int i8 = i5;
                int i9 = i8;
                float f8 = 0.0f;
                while (true) {
                    arrayList = this.d;
                    if (i8 >= arrayList.size()) {
                        break;
                    }
                    k26 k26Var = (k26) arrayList.get(i8);
                    if (k26Var.n || k26Var.o != 0.0f) {
                        long j = k26Var.a.a[i7];
                        if (j > 0) {
                            f8 += j * k26Var.o;
                            i9++;
                        }
                    }
                    i8++;
                }
                int i10 = 0;
                int i11 = 0;
                while (i10 < arrayList.size()) {
                    k26 k26Var2 = (k26) arrayList.get(i10);
                    if (k26Var2.n || k26Var2.o != 0.0f) {
                        long[] jArr = k26Var2.a.a;
                        if (i9 == i3) {
                            if (jArr[i7] != 0) {
                                f = k26Var2.o;
                                i = i6;
                                float f9 = (((lma) this.i0).b[i7] * f5) - f7;
                                float measuredHeight = f * ((getMeasuredHeight() - this.s) - nf0.o1);
                                float f10 = i11;
                                float measuredHeight2 = ((getMeasuredHeight() - this.s) - measuredHeight) - f10;
                                i11 = (int) (f10 + measuredHeight);
                                zyb zybVar2 = this.A0;
                                if (i != 0) {
                                    zybVar2.g[i10] = f9;
                                    zybVar2.h[i10] = measuredHeight2;
                                } else {
                                    zybVar2.i[i10] = f9;
                                    zybVar2.j[i10] = measuredHeight2;
                                }
                            }
                            i = i6;
                            f = 0.0f;
                            float f92 = (((lma) this.i0).b[i7] * f5) - f7;
                            float measuredHeight3 = f * ((getMeasuredHeight() - this.s) - nf0.o1);
                            float f102 = i11;
                            float measuredHeight22 = ((getMeasuredHeight() - this.s) - measuredHeight3) - f102;
                            i11 = (int) (f102 + measuredHeight3);
                            zyb zybVar22 = this.A0;
                            if (i != 0) {
                            }
                        } else {
                            if (f8 != 0.0f) {
                                i = i6;
                                f = (jArr[i7] * k26Var2.o) / f8;
                                float f922 = (((lma) this.i0).b[i7] * f5) - f7;
                                float measuredHeight32 = f * ((getMeasuredHeight() - this.s) - nf0.o1);
                                float f1022 = i11;
                                float measuredHeight222 = ((getMeasuredHeight() - this.s) - measuredHeight32) - f1022;
                                i11 = (int) (f1022 + measuredHeight32);
                                zyb zybVar222 = this.A0;
                                if (i != 0) {
                                }
                            }
                            i = i6;
                            f = 0.0f;
                            float f9222 = (((lma) this.i0).b[i7] * f5) - f7;
                            float measuredHeight322 = f * ((getMeasuredHeight() - this.s) - nf0.o1);
                            float f10222 = i11;
                            float measuredHeight2222 = ((getMeasuredHeight() - this.s) - measuredHeight322) - f10222;
                            i11 = (int) (f10222 + measuredHeight322);
                            zyb zybVar2222 = this.A0;
                            if (i != 0) {
                            }
                        }
                    } else {
                        i = i6;
                    }
                    i10++;
                    i6 = i;
                    i3 = 1;
                }
                i6++;
                i5 = 0;
                i2 = 2;
                i3 = 1;
            }
        }
    }

    @Override // nf0
    public final long r(int i, int i2) {
        return 100L;
    }
}
