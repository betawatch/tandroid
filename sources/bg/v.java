package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class v extends i {
    public final Matrix D1;
    public final float[] E1;
    public final Path F1;
    public boolean[] G1;
    public float[] H1;

    public v(Context context) {
        super(context, null);
        this.D1 = new Matrix();
        this.E1 = new float[2];
        this.F1 = new Path();
        this.w0 = true;
        this.x0 = true;
        this.e = false;
    }

    @Override // bg.i
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public dg.j h(cg.a aVar) {
        return new dg.j(aVar);
    }

    public final int M(float f7, float f10) {
        RectF rectF = this.H0;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY() + i0.L(16.0f);
        if (f7 >= centerX && f10 <= centerY) {
            return 0;
        }
        if (f7 < centerX || f10 < centerY) {
            return (f7 >= centerX || f10 < centerY) ? 3 : 2;
        }
        return 1;
    }

    @Override // bg.i
    public float getMinDistance() {
        return 0.1f;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0584 A[EDGE_INSN: B:204:0x0584->B:205:0x0584 BREAK  A[LOOP:1: B:29:0x0138->B:203:0x0569], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05b6 A[LOOP:5: B:209:0x05b4->B:210:0x05b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03d6  */
    @Override // bg.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(Canvas canvas) {
        ArrayList arrayList;
        float f7;
        float f10;
        float f11;
        int i10;
        int min;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int size;
        float f12;
        int i13;
        float f13;
        float f14;
        float measuredHeight;
        float f15;
        int i14;
        int i15;
        ArrayList arrayList2;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        int i16;
        int i17;
        float f22;
        float f23;
        char c10;
        int i18;
        int i19;
        float f24;
        double degrees;
        int M;
        int M2;
        float f25;
        boolean z12;
        float f26;
        float f27;
        int i20;
        float f28;
        float f29;
        float f30;
        double degrees2;
        int i21;
        if (this.h0 != null) {
            float f31 = this.F0;
            n nVar = this.g0;
            float f32 = nVar.l;
            float f33 = nVar.k;
            float f34 = f31 / (f32 - f33);
            float f35 = i.k1;
            float f36 = (f33 * f34) - f35;
            RectF rectF = this.H0;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY() + i0.L(16.0f);
            int i22 = 0;
            while (true) {
                arrayList = this.d;
                if (i22 >= arrayList.size()) {
                    break;
                }
                ((dg.j) arrayList.get(i22)).f.reset();
                ((dg.j) arrayList.get(i22)).g.reset();
                i22++;
            }
            canvas.save();
            boolean[] zArr = this.G1;
            if (zArr == null || zArr.length < ((cg.e) this.h0).d.size()) {
                this.G1 = new boolean[((cg.e) this.h0).d.size()];
                this.H1 = new float[((cg.e) this.h0).d.size()];
            }
            int i23 = this.y0;
            if (i23 == 2) {
                f11 = this.z0.f / 0.6f;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                Path path = this.F1;
                path.reset();
                float width = rectF.width() > rectF.height() ? rectF.width() : rectF.height();
                float height = (rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f;
                f10 = 0.0f;
                float z13 = c3.i0.z(1.0f, this.z0.f, (width - height) / 2.0f, height);
                RectF rectF2 = new RectF();
                f7 = 1.0f;
                rectF2.set(centerX - z13, centerY - z13, centerX + z13, centerY + z13);
                path.addRoundRect(rectF2, z13, z13, Path.Direction.CW);
                canvas.clipPath(path);
            } else {
                f7 = 1.0f;
                f10 = 0.0f;
                if (i23 == 3) {
                    i10 = (int) (this.z0.f * 255.0f);
                    f11 = 0.0f;
                    float[] fArr = ((cg.e) this.h0).b;
                    int i24 = ((int) (f35 / (fArr.length >= 2 ? f7 : fArr[1] * f34))) + 1;
                    int max = Math.max(0, (this.F - i24) - 1);
                    min = Math.min(((cg.e) this.h0).b.length - 1, this.G + i24 + 1);
                    i11 = max;
                    float f37 = f10;
                    float f38 = f37;
                    z10 = false;
                    while (true) {
                        i12 = i.n1;
                        if (i11 <= min) {
                            break;
                        }
                        float f39 = f34;
                        float f40 = f36;
                        float f41 = f11;
                        boolean z14 = z10;
                        float f42 = f10;
                        int i25 = 0;
                        int i26 = 0;
                        int i27 = 0;
                        while (i27 < arrayList.size()) {
                            dg.g gVar = (dg.g) arrayList.get(i27);
                            int i28 = i27;
                            if (gVar.n || gVar.o != f10) {
                                i21 = i10;
                                long j10 = gVar.a.a[i11];
                                if (j10 > 0) {
                                    f42 = (j10 * gVar.o) + f42;
                                    i25++;
                                }
                                i26 = i28;
                            } else {
                                i21 = i10;
                            }
                            i27 = i28 + 1;
                            i10 = i21;
                        }
                        int i29 = i10;
                        float f43 = f10;
                        int i30 = 0;
                        while (i30 < arrayList.size()) {
                            dg.g gVar2 = (dg.g) arrayList.get(i30);
                            float f44 = f37;
                            boolean z15 = gVar2.n;
                            Path path2 = gVar2.f;
                            if (z15) {
                                f12 = f43;
                            } else {
                                f12 = f43;
                                if (gVar2.o == f10) {
                                    i15 = i25;
                                    i19 = min;
                                    arrayList2 = arrayList;
                                    i16 = max;
                                    i17 = i12;
                                    f24 = f10;
                                    f43 = f12;
                                    i18 = i26;
                                    f37 = f44;
                                    i30++;
                                    f10 = f24;
                                    min = i19;
                                    i26 = i18;
                                    max = i16;
                                    i25 = i15;
                                    i12 = i17;
                                    arrayList = arrayList2;
                                }
                            }
                            long[] jArr = gVar2.a.a;
                            if (i25 == 1) {
                                if (jArr[i11] != 0) {
                                    f13 = gVar2.o;
                                    i13 = i25;
                                    float[] fArr2 = ((cg.e) this.h0).b;
                                    f14 = (fArr2[i11] * f39) - f40;
                                    float measuredWidth = i11 != min ? getMeasuredWidth() : (fArr2[i11 + 1] * f39) - f40;
                                    if (f13 == f10 && i30 == i26) {
                                        z14 = true;
                                    }
                                    float measuredHeight2 = ((getMeasuredHeight() - this.s) - i12) * f13;
                                    measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight2) - f12;
                                    this.H1[i30] = measuredHeight;
                                    float measuredHeight3 = getMeasuredHeight() - this.s;
                                    if (i11 != min) {
                                        f15 = measuredHeight3;
                                        f44 = f14;
                                    } else {
                                        f15 = measuredHeight3;
                                        if (i11 == max) {
                                            f38 = f14;
                                        }
                                    }
                                    i14 = this.y0;
                                    float f45 = measuredWidth;
                                    float[] fArr3 = this.E1;
                                    i15 = i13;
                                    Matrix matrix = this.D1;
                                    if (i14 == 2 || i30 == i26) {
                                        arrayList2 = arrayList;
                                        f16 = f10;
                                        f17 = measuredHeight;
                                        f18 = f15;
                                        f19 = f14;
                                    } else {
                                        int i31 = (f14 > centerX ? 1 : (f14 == centerX ? 0 : -1));
                                        if (i31 < 0) {
                                            dg.k kVar = this.z0;
                                            i20 = i31;
                                            f29 = kVar.g[i30];
                                            f28 = kVar.h[i30];
                                        } else {
                                            i20 = i31;
                                            dg.k kVar2 = this.z0;
                                            float f46 = kVar2.i[i30];
                                            f28 = kVar2.j[i30];
                                            f29 = f46;
                                        }
                                        float f47 = centerX - f29;
                                        float f48 = centerY - f28;
                                        float f49 = (((f14 - f29) * f48) / f47) + f28;
                                        float f50 = f7 - f41;
                                        float f51 = measuredHeight * f50;
                                        float f52 = f49 * f41;
                                        float f53 = f51 + f52;
                                        float f54 = (f15 * f50) + f52;
                                        float f55 = f48 / f47;
                                        if (f55 > f10) {
                                            f30 = f50;
                                            arrayList2 = arrayList;
                                            degrees2 = Math.toDegrees(-Math.atan(f55));
                                        } else {
                                            f30 = f50;
                                            arrayList2 = arrayList;
                                            degrees2 = Math.toDegrees(Math.atan(Math.abs(f55)));
                                        }
                                        float f56 = ((float) degrees2) - 90.0f;
                                        if (f14 >= centerX) {
                                            fArr3[0] = f14;
                                            fArr3[1] = f53;
                                            matrix.reset();
                                            matrix.postRotate(this.z0.f * f56, centerX, centerY);
                                            matrix.mapPoints(fArr3);
                                            float f57 = fArr3[0];
                                            f17 = fArr3[1];
                                            if (f57 < centerX) {
                                                f57 = centerX;
                                            }
                                            fArr3[0] = f14;
                                            fArr3[1] = f54;
                                            matrix.reset();
                                            f16 = f56;
                                            matrix.postRotate(this.z0.f * f16, centerX, centerY);
                                            matrix.mapPoints(fArr3);
                                            f18 = fArr3[1];
                                            f20 = f38;
                                            f21 = f57;
                                            f19 = i20 < 0 ? centerX : f14;
                                        } else {
                                            f16 = f56;
                                            if (f45 >= centerX) {
                                                f19 = (f14 * f30) + (centerX * f41);
                                                f18 = (centerY * f41) + (f53 * f30);
                                                f17 = f18;
                                            } else {
                                                fArr3[0] = f14;
                                                fArr3[1] = f53;
                                                matrix.reset();
                                                dg.k kVar3 = this.z0;
                                                float f58 = kVar3.f;
                                                matrix.postRotate((f58 * kVar3.k[i30]) + (f58 * f16), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                float f59 = fArr3[0];
                                                f17 = fArr3[1];
                                                if (f45 >= centerX) {
                                                    float f60 = this.z0.f;
                                                    fArr3[0] = (f60 * centerX) + ((f7 - f60) * f14);
                                                } else {
                                                    fArr3[0] = f14;
                                                }
                                                fArr3[1] = f54;
                                                matrix.reset();
                                                dg.k kVar4 = this.z0;
                                                float f61 = kVar4.f;
                                                matrix.postRotate((f61 * kVar4.k[i30]) + (f61 * f16), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                f19 = fArr3[0];
                                                f18 = fArr3[1];
                                                f20 = f38;
                                                f21 = f59;
                                            }
                                        }
                                        i16 = max;
                                        if (i11 == max) {
                                            float measuredHeight4 = getMeasuredHeight();
                                            i17 = i12;
                                            if (this.y0 != 2 || i30 == i26) {
                                                z12 = false;
                                                f26 = f10;
                                                f27 = measuredHeight4;
                                            } else {
                                                fArr3[0] = f10 - centerX;
                                                fArr3[1] = measuredHeight4;
                                                matrix.reset();
                                                dg.k kVar5 = this.z0;
                                                float f62 = kVar5.f;
                                                matrix.postRotate((f62 * kVar5.k[i30]) + (f16 * f62), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                z12 = false;
                                                f26 = fArr3[0];
                                                f27 = fArr3[1];
                                            }
                                            path2.moveTo(f26, f27);
                                            this.G1[i30] = z12;
                                        } else {
                                            i17 = i12;
                                        }
                                        dg.k kVar6 = this.z0;
                                        f22 = kVar6 == null ? f10 : kVar6.f;
                                        if (f13 == f10 || i11 <= 0 || jArr[i11 - 1] != 0 || i11 >= min || jArr[i11 + 1] != 0) {
                                            f23 = f22;
                                        } else {
                                            f23 = f22;
                                            if (this.y0 != 2) {
                                                if (!this.G1[i30]) {
                                                    if (i30 == i26) {
                                                        path2.lineTo(f19, (f7 - f23) * f18);
                                                    } else {
                                                        path2.lineTo(f19, f18);
                                                    }
                                                }
                                                this.G1[i30] = true;
                                                c10 = 0;
                                                if (i11 == min) {
                                                    float measuredWidth2 = getMeasuredWidth();
                                                    float measuredHeight5 = getMeasuredHeight();
                                                    if (this.y0 != 2 || i30 == i26) {
                                                        path2.lineTo(measuredWidth2, measuredHeight5);
                                                    } else {
                                                        fArr3[c10] = measuredWidth2 + centerX;
                                                        fArr3[1] = measuredHeight5;
                                                        matrix.reset();
                                                        dg.k kVar7 = this.z0;
                                                        matrix.postRotate(kVar7.f * kVar7.k[i30], centerX, centerY);
                                                        matrix.mapPoints(fArr3);
                                                        float f63 = fArr3[c10];
                                                        float f64 = fArr3[1];
                                                    }
                                                    if (this.y0 != 2) {
                                                        i18 = i26;
                                                        i19 = min;
                                                        f24 = f10;
                                                        f43 = f12 + measuredHeight2;
                                                        f38 = f20;
                                                    } else if (i30 != i26) {
                                                        dg.k kVar8 = this.z0;
                                                        float f65 = (centerY - kVar8.h[i30]) / (centerX - kVar8.g[i30]);
                                                        if (f65 > f10) {
                                                            i18 = i26;
                                                            i19 = min;
                                                            degrees = Math.toDegrees(-Math.atan(f65));
                                                        } else {
                                                            i18 = i26;
                                                            i19 = min;
                                                            degrees = Math.toDegrees(Math.atan(Math.abs(f65)));
                                                        }
                                                        dg.k kVar9 = this.z0;
                                                        float f66 = kVar9.g[i30];
                                                        float f67 = kVar9.h[i30];
                                                        fArr3[0] = f66;
                                                        fArr3[1] = f67;
                                                        matrix.reset();
                                                        dg.k kVar10 = this.z0;
                                                        float f68 = kVar10.f;
                                                        matrix.postRotate((f68 * kVar10.k[i30]) + ((((float) degrees) - 90.0f) * f68), centerX, centerY);
                                                        matrix.mapPoints(fArr3);
                                                        float f69 = fArr3[0];
                                                        float f70 = fArr3[1];
                                                        if (Math.abs(f21 - f69) >= 0.001d || ((f70 >= centerY || f17 >= centerY) && (f70 <= centerY || f17 <= centerY))) {
                                                            M = M(f21, f17);
                                                            M2 = M(f69, f70);
                                                        } else {
                                                            M2 = this.z0.k[i30] == -180.0f ? 0 : 3;
                                                            M = 0;
                                                        }
                                                        while (M <= M2) {
                                                            if (M == 0) {
                                                                f25 = f10;
                                                                path2.lineTo(getMeasuredWidth(), f25);
                                                            } else if (M == 1) {
                                                                path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
                                                                f25 = 0.0f;
                                                            } else {
                                                                if (M == 2) {
                                                                    f25 = 0.0f;
                                                                    path2.lineTo(0.0f, getMeasuredHeight());
                                                                } else {
                                                                    f25 = 0.0f;
                                                                    path2.lineTo(0.0f, 0.0f);
                                                                }
                                                                M++;
                                                                f10 = f25;
                                                            }
                                                            M++;
                                                            f10 = f25;
                                                        }
                                                        f24 = f10;
                                                        f43 = f12 + measuredHeight2;
                                                        f38 = f20;
                                                    }
                                                }
                                                i18 = i26;
                                                i19 = min;
                                                f24 = f10;
                                                f43 = f12 + measuredHeight2;
                                                f38 = f20;
                                            }
                                        }
                                        if (this.G1[i30]) {
                                            if (i30 == i26) {
                                                path2.lineTo(f19, (f7 - f23) * f18);
                                            } else {
                                                path2.lineTo(f19, f18);
                                            }
                                        }
                                        if (i30 == i26) {
                                            path2.lineTo(f21, (f7 - f23) * f17);
                                        } else {
                                            path2.lineTo(f21, f17);
                                        }
                                        c10 = 0;
                                        this.G1[i30] = false;
                                        if (i11 == min) {
                                        }
                                        i18 = i26;
                                        i19 = min;
                                        f24 = f10;
                                        f43 = f12 + measuredHeight2;
                                        f38 = f20;
                                    }
                                    f20 = f38;
                                    f21 = f19;
                                    i16 = max;
                                    if (i11 == max) {
                                    }
                                    dg.k kVar62 = this.z0;
                                    if (kVar62 == null) {
                                    }
                                    if (f13 == f10) {
                                    }
                                    f23 = f22;
                                    if (this.G1[i30]) {
                                    }
                                    if (i30 == i26) {
                                    }
                                    c10 = 0;
                                    this.G1[i30] = false;
                                    if (i11 == min) {
                                    }
                                    i18 = i26;
                                    i19 = min;
                                    f24 = f10;
                                    f43 = f12 + measuredHeight2;
                                    f38 = f20;
                                }
                                i13 = i25;
                                f13 = f10;
                                float[] fArr22 = ((cg.e) this.h0).b;
                                f14 = (fArr22[i11] * f39) - f40;
                                if (i11 != min) {
                                }
                                if (f13 == f10) {
                                    z14 = true;
                                }
                                float measuredHeight22 = ((getMeasuredHeight() - this.s) - i12) * f13;
                                measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight22) - f12;
                                this.H1[i30] = measuredHeight;
                                float measuredHeight32 = getMeasuredHeight() - this.s;
                                if (i11 != min) {
                                }
                                i14 = this.y0;
                                float f452 = measuredWidth;
                                float[] fArr32 = this.E1;
                                i15 = i13;
                                Matrix matrix2 = this.D1;
                                if (i14 == 2) {
                                }
                                arrayList2 = arrayList;
                                f16 = f10;
                                f17 = measuredHeight;
                                f18 = f15;
                                f19 = f14;
                                f20 = f38;
                                f21 = f19;
                                i16 = max;
                                if (i11 == max) {
                                }
                                dg.k kVar622 = this.z0;
                                if (kVar622 == null) {
                                }
                                if (f13 == f10) {
                                }
                                f23 = f22;
                                if (this.G1[i30]) {
                                }
                                if (i30 == i26) {
                                }
                                c10 = 0;
                                this.G1[i30] = false;
                                if (i11 == min) {
                                }
                                i18 = i26;
                                i19 = min;
                                f24 = f10;
                                f43 = f12 + measuredHeight22;
                                f38 = f20;
                            } else {
                                if (f42 != f10) {
                                    i13 = i25;
                                    f13 = (jArr[i11] * gVar2.o) / f42;
                                    float[] fArr222 = ((cg.e) this.h0).b;
                                    f14 = (fArr222[i11] * f39) - f40;
                                    if (i11 != min) {
                                    }
                                    if (f13 == f10) {
                                    }
                                    float measuredHeight222 = ((getMeasuredHeight() - this.s) - i12) * f13;
                                    measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight222) - f12;
                                    this.H1[i30] = measuredHeight;
                                    float measuredHeight322 = getMeasuredHeight() - this.s;
                                    if (i11 != min) {
                                    }
                                    i14 = this.y0;
                                    float f4522 = measuredWidth;
                                    float[] fArr322 = this.E1;
                                    i15 = i13;
                                    Matrix matrix22 = this.D1;
                                    if (i14 == 2) {
                                    }
                                    arrayList2 = arrayList;
                                    f16 = f10;
                                    f17 = measuredHeight;
                                    f18 = f15;
                                    f19 = f14;
                                    f20 = f38;
                                    f21 = f19;
                                    i16 = max;
                                    if (i11 == max) {
                                    }
                                    dg.k kVar6222 = this.z0;
                                    if (kVar6222 == null) {
                                    }
                                    if (f13 == f10) {
                                    }
                                    f23 = f22;
                                    if (this.G1[i30]) {
                                    }
                                    if (i30 == i26) {
                                    }
                                    c10 = 0;
                                    this.G1[i30] = false;
                                    if (i11 == min) {
                                    }
                                    i18 = i26;
                                    i19 = min;
                                    f24 = f10;
                                    f43 = f12 + measuredHeight222;
                                    f38 = f20;
                                }
                                i13 = i25;
                                f13 = f10;
                                float[] fArr2222 = ((cg.e) this.h0).b;
                                f14 = (fArr2222[i11] * f39) - f40;
                                if (i11 != min) {
                                }
                                if (f13 == f10) {
                                }
                                float measuredHeight2222 = ((getMeasuredHeight() - this.s) - i12) * f13;
                                measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight2222) - f12;
                                this.H1[i30] = measuredHeight;
                                float measuredHeight3222 = getMeasuredHeight() - this.s;
                                if (i11 != min) {
                                }
                                i14 = this.y0;
                                float f45222 = measuredWidth;
                                float[] fArr3222 = this.E1;
                                i15 = i13;
                                Matrix matrix222 = this.D1;
                                if (i14 == 2) {
                                }
                                arrayList2 = arrayList;
                                f16 = f10;
                                f17 = measuredHeight;
                                f18 = f15;
                                f19 = f14;
                                f20 = f38;
                                f21 = f19;
                                i16 = max;
                                if (i11 == max) {
                                }
                                dg.k kVar62222 = this.z0;
                                if (kVar62222 == null) {
                                }
                                if (f13 == f10) {
                                }
                                f23 = f22;
                                if (this.G1[i30]) {
                                }
                                if (i30 == i26) {
                                }
                                c10 = 0;
                                this.G1[i30] = false;
                                if (i11 == min) {
                                }
                                i18 = i26;
                                i19 = min;
                                f24 = f10;
                                f43 = f12 + measuredHeight2222;
                                f38 = f20;
                            }
                            f37 = f44;
                            i30++;
                            f10 = f24;
                            min = i19;
                            i26 = i18;
                            max = i16;
                            i25 = i15;
                            i12 = i17;
                            arrayList = arrayList2;
                        }
                        i11++;
                        min = min;
                        f34 = f39;
                        f36 = f40;
                        f11 = f41;
                        z10 = z14;
                        i10 = i29;
                    }
                    int i32 = i10;
                    ArrayList arrayList3 = arrayList;
                    z11 = z10;
                    canvas.save();
                    canvas.clipRect(f38, i12, f37, getMeasuredHeight() - this.s);
                    if (z11) {
                        canvas.drawColor(t6.x0(null, t6.fk, false));
                    }
                    for (size = arrayList3.size() - 1; size >= 0; size--) {
                        dg.g gVar3 = (dg.g) arrayList3.get(size);
                        Paint paint = gVar3.c;
                        paint.setAlpha(i32);
                        canvas.drawPath(gVar3.f, paint);
                        paint.setAlpha(zs.e4);
                    }
                    canvas.restore();
                    canvas.restore();
                }
                f11 = 0.0f;
            }
            i10 = zs.e4;
            float[] fArr4 = ((cg.e) this.h0).b;
            int i242 = ((int) (f35 / (fArr4.length >= 2 ? f7 : fArr4[1] * f34))) + 1;
            int max2 = Math.max(0, (this.F - i242) - 1);
            min = Math.min(((cg.e) this.h0).b.length - 1, this.G + i242 + 1);
            i11 = max2;
            float f372 = f10;
            float f382 = f372;
            z10 = false;
            while (true) {
                i12 = i.n1;
                if (i11 <= min) {
                }
                i11++;
                min = min;
                f34 = f39;
                f36 = f40;
                f11 = f41;
                z10 = z14;
                i10 = i29;
            }
            int i322 = i10;
            ArrayList arrayList32 = arrayList;
            z11 = z10;
            canvas.save();
            canvas.clipRect(f382, i12, f372, getMeasuredHeight() - this.s);
            if (z11) {
            }
            while (size >= 0) {
            }
            canvas.restore();
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d  */
    @Override // bg.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(Canvas canvas) {
        int i10;
        boolean z10;
        float f7;
        boolean z11;
        cg.b bVar;
        if (this.h0 != null) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((dg.j) arrayList.get(i11)).g.reset();
            }
            cg.b bVar2 = this.h0;
            int i12 = ((cg.e) bVar2).n;
            boolean[] zArr = this.G1;
            if (zArr == null || zArr.length < ((cg.e) bVar2).d.size()) {
                this.G1 = new boolean[((cg.e) this.h0).d.size()];
            }
            boolean z12 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                float f10 = 0.0f;
                float f11 = 0.0f;
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    dg.g gVar = (dg.g) arrayList.get(i16);
                    if (gVar.n || gVar.o != 0.0f) {
                        if (((cg.e) this.h0).m[i16][i13] > 0) {
                            f11 += ((cg.e) r12).m[i16][i13] * gVar.o;
                            i14++;
                        }
                        i15 = i16;
                    }
                }
                int i17 = i12 - 1;
                float f12 = (i13 / i17) * this.C0;
                float f13 = 0.0f;
                int i18 = 0;
                while (i18 < arrayList.size()) {
                    dg.g gVar2 = (dg.g) arrayList.get(i18);
                    float f14 = f10;
                    boolean z13 = gVar2.n;
                    Path path = gVar2.g;
                    if (!z13 && gVar2.o == f14) {
                        i10 = i12;
                    } else if (i14 == 1) {
                        if (((cg.e) this.h0).m[i18][i13] != 0) {
                            f7 = gVar2.o;
                            i10 = i12;
                            z10 = z12;
                            boolean z14 = (f7 == f14 || i18 != i15) ? z10 : true;
                            int i19 = this.B0;
                            float f15 = f7 * i19;
                            float f16 = (i19 - f15) - f13;
                            if (i13 != 0) {
                                z11 = z14;
                                path.moveTo(f14, i19);
                                this.G1[i18] = false;
                            } else {
                                z11 = z14;
                            }
                            bVar = this.h0;
                            if (((cg.e) bVar).m[i18][i13] == 0 || i13 <= 0 || ((cg.e) bVar).m[i18][i13 - 1] != 0 || i13 >= i17 || ((cg.e) bVar).m[i18][i13 + 1] != 0) {
                                if (this.G1[i18]) {
                                    path.lineTo(f12, i19);
                                }
                                path.lineTo(f12, f16);
                                this.G1[i18] = false;
                            } else {
                                if (!this.G1[i18]) {
                                    path.lineTo(f12, i19);
                                }
                                this.G1[i18] = true;
                            }
                            if (i13 == i17) {
                                path.lineTo(this.C0, i19);
                            }
                            f13 += f15;
                            z12 = z11;
                        }
                        i10 = i12;
                        z10 = z12;
                        f7 = f14;
                        if (f7 == f14) {
                        }
                        int i192 = this.B0;
                        float f152 = f7 * i192;
                        float f162 = (i192 - f152) - f13;
                        if (i13 != 0) {
                        }
                        bVar = this.h0;
                        if (((cg.e) bVar).m[i18][i13] == 0) {
                        }
                        if (this.G1[i18]) {
                        }
                        path.lineTo(f12, f162);
                        this.G1[i18] = false;
                        if (i13 == i17) {
                        }
                        f13 += f152;
                        z12 = z11;
                    } else {
                        if (f11 != f14) {
                            i10 = i12;
                            z10 = z12;
                            f7 = (((cg.e) this.h0).m[i18][i13] * gVar2.o) / f11;
                            if (f7 == f14) {
                            }
                            int i1922 = this.B0;
                            float f1522 = f7 * i1922;
                            float f1622 = (i1922 - f1522) - f13;
                            if (i13 != 0) {
                            }
                            bVar = this.h0;
                            if (((cg.e) bVar).m[i18][i13] == 0) {
                            }
                            if (this.G1[i18]) {
                            }
                            path.lineTo(f12, f1622);
                            this.G1[i18] = false;
                            if (i13 == i17) {
                            }
                            f13 += f1522;
                            z12 = z11;
                        }
                        i10 = i12;
                        z10 = z12;
                        f7 = f14;
                        if (f7 == f14) {
                        }
                        int i19222 = this.B0;
                        float f15222 = f7 * i19222;
                        float f16222 = (i19222 - f15222) - f13;
                        if (i13 != 0) {
                        }
                        bVar = this.h0;
                        if (((cg.e) bVar).m[i18][i13] == 0) {
                        }
                        if (this.G1[i18]) {
                        }
                        path.lineTo(f12, f16222);
                        this.G1[i18] = false;
                        if (i13 == i17) {
                        }
                        f13 += f15222;
                        z12 = z11;
                    }
                    i18++;
                    i12 = i10;
                    f10 = 0.0f;
                }
            }
            if (z12) {
                canvas.drawColor(t6.x0(null, t6.fk, false));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                dg.g gVar3 = (dg.g) arrayList.get(size2);
                canvas.drawPath(gVar3.g, gVar3.c);
            }
        }
    }

    @Override // bg.i, android.view.View
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.n0 = i10;
            int i11 = this.n0;
            if (i11 >= this.m0) {
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
            l(canvas, (dg.e) arrayList.get(i11));
            p(canvas, (dg.e) arrayList.get(this.n0));
            i10 = this.n0 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0142  */
    @Override // bg.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(dg.k kVar) {
        ArrayList arrayList;
        int i10;
        float f7;
        cg.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        float f10 = this.F0;
        n nVar = this.g0;
        float f11 = nVar.l;
        float f12 = nVar.k;
        float f13 = f10 / (f11 - f12);
        float f14 = i.k1;
        float f15 = (f12 * f13) - f14;
        int i11 = 2;
        int i12 = 1;
        int i13 = ((int) (f14 / (((cg.e) bVar).b.length < 2 ? 1.0f : ((cg.e) bVar).b[1] * f13))) + 1;
        int i14 = 0;
        int max = Math.max(0, (this.F - i13) - 1);
        int min = Math.min(((cg.e) this.h0).b.length - 1, this.G + i13 + 1);
        this.z0.g = new float[((cg.e) this.h0).d.size()];
        this.z0.h = new float[((cg.e) this.h0).d.size()];
        this.z0.i = new float[((cg.e) this.h0).d.size()];
        this.z0.j = new float[((cg.e) this.h0).d.size()];
        this.z0.k = new float[((cg.e) this.h0).d.size()];
        int i15 = 0;
        while (i15 < i11) {
            int i16 = i15 == i12 ? min : max;
            int i17 = i14;
            int i18 = i17;
            float f16 = 0.0f;
            while (true) {
                arrayList = this.d;
                if (i17 >= arrayList.size()) {
                    break;
                }
                dg.g gVar = (dg.g) arrayList.get(i17);
                if (gVar.n || gVar.o != 0.0f) {
                    long j10 = gVar.a.a[i16];
                    if (j10 > 0) {
                        f16 += j10 * gVar.o;
                        i18++;
                    }
                }
                i17++;
            }
            int i19 = 0;
            int i20 = 0;
            while (i19 < arrayList.size()) {
                dg.g gVar2 = (dg.g) arrayList.get(i19);
                if (gVar2.n || gVar2.o != 0.0f) {
                    long[] jArr = gVar2.a.a;
                    if (i18 == i12) {
                        if (jArr[i16] != 0) {
                            f7 = gVar2.o;
                            i10 = i15;
                            float f17 = (((cg.e) this.h0).b[i16] * f13) - f15;
                            float measuredHeight = f7 * ((getMeasuredHeight() - this.s) - i.n1);
                            float f18 = i20;
                            float measuredHeight2 = ((getMeasuredHeight() - this.s) - measuredHeight) - f18;
                            i20 = (int) (f18 + measuredHeight);
                            if (i10 != 0) {
                                dg.k kVar2 = this.z0;
                                kVar2.g[i19] = f17;
                                kVar2.h[i19] = measuredHeight2;
                            } else {
                                dg.k kVar3 = this.z0;
                                kVar3.i[i19] = f17;
                                kVar3.j[i19] = measuredHeight2;
                            }
                        }
                        i10 = i15;
                        f7 = 0.0f;
                        float f172 = (((cg.e) this.h0).b[i16] * f13) - f15;
                        float measuredHeight3 = f7 * ((getMeasuredHeight() - this.s) - i.n1);
                        float f182 = i20;
                        float measuredHeight22 = ((getMeasuredHeight() - this.s) - measuredHeight3) - f182;
                        i20 = (int) (f182 + measuredHeight3);
                        if (i10 != 0) {
                        }
                    } else {
                        if (f16 != 0.0f) {
                            i10 = i15;
                            f7 = (jArr[i16] * gVar2.o) / f16;
                            float f1722 = (((cg.e) this.h0).b[i16] * f13) - f15;
                            float measuredHeight32 = f7 * ((getMeasuredHeight() - this.s) - i.n1);
                            float f1822 = i20;
                            float measuredHeight222 = ((getMeasuredHeight() - this.s) - measuredHeight32) - f1822;
                            i20 = (int) (f1822 + measuredHeight32);
                            if (i10 != 0) {
                            }
                        }
                        i10 = i15;
                        f7 = 0.0f;
                        float f17222 = (((cg.e) this.h0).b[i16] * f13) - f15;
                        float measuredHeight322 = f7 * ((getMeasuredHeight() - this.s) - i.n1);
                        float f18222 = i20;
                        float measuredHeight2222 = ((getMeasuredHeight() - this.s) - measuredHeight322) - f18222;
                        i20 = (int) (f18222 + measuredHeight322);
                        if (i10 != 0) {
                        }
                    }
                } else {
                    i10 = i15;
                }
                i19++;
                i15 = i10;
                i12 = 1;
            }
            i15++;
            i14 = 0;
            i11 = 2;
            i12 = 1;
        }
    }

    @Override // bg.i
    public final long r(int i10, int i11) {
        return 100L;
    }
}
