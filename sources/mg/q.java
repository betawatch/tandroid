package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class q extends g {
    public final Matrix E1;
    public final float[] F1;
    public final Path G1;
    public boolean[] H1;
    public float[] I1;

    public q(Context context) {
        super(context, null);
        this.E1 = new Matrix();
        this.F1 = new float[2];
        this.G1 = new Path();
        this.x0 = true;
        this.y0 = true;
        this.e = false;
    }

    @Override // mg.g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public og.i h(ng.a aVar) {
        return new og.i(aVar);
    }

    public final int M(float f10, float f11) {
        RectF rectF = this.I0;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY() + g0.L(16.0f);
        if (f10 >= centerX && f11 <= centerY) {
            return 0;
        }
        if (f10 < centerX || f11 < centerY) {
            return (f10 >= centerX || f11 < centerY) ? 3 : 2;
        }
        return 1;
    }

    @Override // mg.g
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
    @Override // mg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(Canvas canvas) {
        ArrayList arrayList;
        float f10;
        float f11;
        float f12;
        int i3;
        int min;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int size;
        float f13;
        int i12;
        float f14;
        float f15;
        float measuredHeight;
        float f16;
        int i13;
        int i14;
        ArrayList arrayList2;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        int i15;
        int i16;
        float f23;
        float f24;
        char c2;
        int i17;
        int i18;
        float f25;
        double degrees;
        int M;
        int M2;
        float f26;
        boolean z12;
        float f27;
        float f28;
        int i19;
        float f29;
        float f30;
        float f31;
        double degrees2;
        int i20;
        if (this.i0 != null) {
            float f32 = this.G0;
            j jVar = this.h0;
            float f33 = jVar.l;
            float f34 = jVar.k;
            float f35 = f32 / (f33 - f34);
            float f36 = g.l1;
            float f37 = (f34 * f35) - f36;
            RectF rectF = this.I0;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY() + g0.L(16.0f);
            int i21 = 0;
            while (true) {
                arrayList = this.d;
                if (i21 >= arrayList.size()) {
                    break;
                }
                ((og.i) arrayList.get(i21)).f.reset();
                ((og.i) arrayList.get(i21)).g.reset();
                i21++;
            }
            canvas.save();
            boolean[] zArr = this.H1;
            if (zArr == null || zArr.length < ((ng.e) this.i0).d.size()) {
                this.H1 = new boolean[((ng.e) this.i0).d.size()];
                this.I1 = new float[((ng.e) this.i0).d.size()];
            }
            int i22 = this.z0;
            if (i22 == 2) {
                f12 = this.A0.f / 0.6f;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                Path path = this.G1;
                path.reset();
                float width = rectF.width() > rectF.height() ? rectF.width() : rectF.height();
                float height = (rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f;
                f11 = 0.0f;
                float y9 = com.google.android.recaptcha.internal.a.y(1.0f, this.A0.f, (width - height) / 2.0f, height);
                RectF rectF2 = new RectF();
                f10 = 1.0f;
                rectF2.set(centerX - y9, centerY - y9, centerX + y9, centerY + y9);
                path.addRoundRect(rectF2, y9, y9, Path.Direction.CW);
                canvas.clipPath(path);
            } else {
                f10 = 1.0f;
                f11 = 0.0f;
                if (i22 == 3) {
                    i3 = (int) (this.A0.f * 255.0f);
                    f12 = 0.0f;
                    float[] fArr = ((ng.e) this.i0).b;
                    int i23 = ((int) (f36 / (fArr.length >= 2 ? f10 : fArr[1] * f35))) + 1;
                    int max = Math.max(0, (this.G - i23) - 1);
                    min = Math.min(((ng.e) this.i0).b.length - 1, this.H + i23 + 1);
                    i10 = max;
                    float f38 = f11;
                    float f39 = f38;
                    z10 = false;
                    while (true) {
                        i11 = g.o1;
                        if (i10 <= min) {
                            break;
                        }
                        float f40 = f35;
                        float f41 = f37;
                        float f42 = f12;
                        boolean z13 = z10;
                        float f43 = f11;
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 0;
                        while (i26 < arrayList.size()) {
                            og.f fVar = (og.f) arrayList.get(i26);
                            int i27 = i26;
                            if (fVar.n || fVar.o != f11) {
                                i20 = i3;
                                long j10 = fVar.a.a[i10];
                                if (j10 > 0) {
                                    f43 = (j10 * fVar.o) + f43;
                                    i24++;
                                }
                                i25 = i27;
                            } else {
                                i20 = i3;
                            }
                            i26 = i27 + 1;
                            i3 = i20;
                        }
                        int i28 = i3;
                        float f44 = f11;
                        int i29 = 0;
                        while (i29 < arrayList.size()) {
                            og.f fVar2 = (og.f) arrayList.get(i29);
                            float f45 = f38;
                            boolean z14 = fVar2.n;
                            Path path2 = fVar2.f;
                            if (z14) {
                                f13 = f44;
                            } else {
                                f13 = f44;
                                if (fVar2.o == f11) {
                                    i14 = i24;
                                    i18 = min;
                                    arrayList2 = arrayList;
                                    i15 = max;
                                    i16 = i11;
                                    f25 = f11;
                                    f44 = f13;
                                    i17 = i25;
                                    f38 = f45;
                                    i29++;
                                    f11 = f25;
                                    min = i18;
                                    i25 = i17;
                                    max = i15;
                                    i24 = i14;
                                    i11 = i16;
                                    arrayList = arrayList2;
                                }
                            }
                            long[] jArr = fVar2.a.a;
                            if (i24 == 1) {
                                if (jArr[i10] != 0) {
                                    f14 = fVar2.o;
                                    i12 = i24;
                                    float[] fArr2 = ((ng.e) this.i0).b;
                                    f15 = (fArr2[i10] * f40) - f41;
                                    float measuredWidth = i10 != min ? getMeasuredWidth() : (fArr2[i10 + 1] * f40) - f41;
                                    if (f14 == f11 && i29 == i25) {
                                        z13 = true;
                                    }
                                    float measuredHeight2 = ((getMeasuredHeight() - this.s) - i11) * f14;
                                    measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight2) - f13;
                                    this.I1[i29] = measuredHeight;
                                    float measuredHeight3 = getMeasuredHeight() - this.s;
                                    if (i10 != min) {
                                        f16 = measuredHeight3;
                                        f45 = f15;
                                    } else {
                                        f16 = measuredHeight3;
                                        if (i10 == max) {
                                            f39 = f15;
                                        }
                                    }
                                    i13 = this.z0;
                                    float f46 = measuredWidth;
                                    float[] fArr3 = this.F1;
                                    i14 = i12;
                                    Matrix matrix = this.E1;
                                    if (i13 == 2 || i29 == i25) {
                                        arrayList2 = arrayList;
                                        f17 = f11;
                                        f18 = measuredHeight;
                                        f19 = f16;
                                        f20 = f15;
                                    } else {
                                        int i30 = (f15 > centerX ? 1 : (f15 == centerX ? 0 : -1));
                                        if (i30 < 0) {
                                            og.j jVar2 = this.A0;
                                            i19 = i30;
                                            f30 = jVar2.g[i29];
                                            f29 = jVar2.h[i29];
                                        } else {
                                            i19 = i30;
                                            og.j jVar3 = this.A0;
                                            float f47 = jVar3.i[i29];
                                            f29 = jVar3.j[i29];
                                            f30 = f47;
                                        }
                                        float f48 = centerX - f30;
                                        float f49 = centerY - f29;
                                        float f50 = (((f15 - f30) * f49) / f48) + f29;
                                        float f51 = f10 - f42;
                                        float f52 = measuredHeight * f51;
                                        float f53 = f50 * f42;
                                        float f54 = f52 + f53;
                                        float f55 = (f16 * f51) + f53;
                                        float f56 = f49 / f48;
                                        if (f56 > f11) {
                                            f31 = f51;
                                            arrayList2 = arrayList;
                                            degrees2 = Math.toDegrees(-Math.atan(f56));
                                        } else {
                                            f31 = f51;
                                            arrayList2 = arrayList;
                                            degrees2 = Math.toDegrees(Math.atan(Math.abs(f56)));
                                        }
                                        float f57 = ((float) degrees2) - 90.0f;
                                        if (f15 >= centerX) {
                                            fArr3[0] = f15;
                                            fArr3[1] = f54;
                                            matrix.reset();
                                            matrix.postRotate(this.A0.f * f57, centerX, centerY);
                                            matrix.mapPoints(fArr3);
                                            float f58 = fArr3[0];
                                            f18 = fArr3[1];
                                            if (f58 < centerX) {
                                                f58 = centerX;
                                            }
                                            fArr3[0] = f15;
                                            fArr3[1] = f55;
                                            matrix.reset();
                                            f17 = f57;
                                            matrix.postRotate(this.A0.f * f17, centerX, centerY);
                                            matrix.mapPoints(fArr3);
                                            f19 = fArr3[1];
                                            f21 = f39;
                                            f22 = f58;
                                            f20 = i19 < 0 ? centerX : f15;
                                        } else {
                                            f17 = f57;
                                            if (f46 >= centerX) {
                                                f20 = (f15 * f31) + (centerX * f42);
                                                f19 = (centerY * f42) + (f54 * f31);
                                                f18 = f19;
                                            } else {
                                                fArr3[0] = f15;
                                                fArr3[1] = f54;
                                                matrix.reset();
                                                og.j jVar4 = this.A0;
                                                float f59 = jVar4.f;
                                                matrix.postRotate((f59 * jVar4.k[i29]) + (f59 * f17), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                float f60 = fArr3[0];
                                                f18 = fArr3[1];
                                                if (f46 >= centerX) {
                                                    float f61 = this.A0.f;
                                                    fArr3[0] = (f61 * centerX) + ((f10 - f61) * f15);
                                                } else {
                                                    fArr3[0] = f15;
                                                }
                                                fArr3[1] = f55;
                                                matrix.reset();
                                                og.j jVar5 = this.A0;
                                                float f62 = jVar5.f;
                                                matrix.postRotate((f62 * jVar5.k[i29]) + (f62 * f17), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                f20 = fArr3[0];
                                                f19 = fArr3[1];
                                                f21 = f39;
                                                f22 = f60;
                                            }
                                        }
                                        i15 = max;
                                        if (i10 == max) {
                                            float measuredHeight4 = getMeasuredHeight();
                                            i16 = i11;
                                            if (this.z0 != 2 || i29 == i25) {
                                                z12 = false;
                                                f27 = f11;
                                                f28 = measuredHeight4;
                                            } else {
                                                fArr3[0] = f11 - centerX;
                                                fArr3[1] = measuredHeight4;
                                                matrix.reset();
                                                og.j jVar6 = this.A0;
                                                float f63 = jVar6.f;
                                                matrix.postRotate((f63 * jVar6.k[i29]) + (f17 * f63), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                z12 = false;
                                                f27 = fArr3[0];
                                                f28 = fArr3[1];
                                            }
                                            path2.moveTo(f27, f28);
                                            this.H1[i29] = z12;
                                        } else {
                                            i16 = i11;
                                        }
                                        og.j jVar7 = this.A0;
                                        f23 = jVar7 == null ? f11 : jVar7.f;
                                        if (f14 == f11 || i10 <= 0 || jArr[i10 - 1] != 0 || i10 >= min || jArr[i10 + 1] != 0) {
                                            f24 = f23;
                                        } else {
                                            f24 = f23;
                                            if (this.z0 != 2) {
                                                if (!this.H1[i29]) {
                                                    if (i29 == i25) {
                                                        path2.lineTo(f20, (f10 - f24) * f19);
                                                    } else {
                                                        path2.lineTo(f20, f19);
                                                    }
                                                }
                                                this.H1[i29] = true;
                                                c2 = 0;
                                                if (i10 == min) {
                                                    float measuredWidth2 = getMeasuredWidth();
                                                    float measuredHeight5 = getMeasuredHeight();
                                                    if (this.z0 != 2 || i29 == i25) {
                                                        path2.lineTo(measuredWidth2, measuredHeight5);
                                                    } else {
                                                        fArr3[c2] = measuredWidth2 + centerX;
                                                        fArr3[1] = measuredHeight5;
                                                        matrix.reset();
                                                        og.j jVar8 = this.A0;
                                                        matrix.postRotate(jVar8.f * jVar8.k[i29], centerX, centerY);
                                                        matrix.mapPoints(fArr3);
                                                        float f64 = fArr3[c2];
                                                        float f65 = fArr3[1];
                                                    }
                                                    if (this.z0 != 2) {
                                                        i17 = i25;
                                                        i18 = min;
                                                        f25 = f11;
                                                        f44 = f13 + measuredHeight2;
                                                        f39 = f21;
                                                    } else if (i29 != i25) {
                                                        og.j jVar9 = this.A0;
                                                        float f66 = (centerY - jVar9.h[i29]) / (centerX - jVar9.g[i29]);
                                                        if (f66 > f11) {
                                                            i17 = i25;
                                                            i18 = min;
                                                            degrees = Math.toDegrees(-Math.atan(f66));
                                                        } else {
                                                            i17 = i25;
                                                            i18 = min;
                                                            degrees = Math.toDegrees(Math.atan(Math.abs(f66)));
                                                        }
                                                        og.j jVar10 = this.A0;
                                                        float f67 = jVar10.g[i29];
                                                        float f68 = jVar10.h[i29];
                                                        fArr3[0] = f67;
                                                        fArr3[1] = f68;
                                                        matrix.reset();
                                                        og.j jVar11 = this.A0;
                                                        float f69 = jVar11.f;
                                                        matrix.postRotate((f69 * jVar11.k[i29]) + ((((float) degrees) - 90.0f) * f69), centerX, centerY);
                                                        matrix.mapPoints(fArr3);
                                                        float f70 = fArr3[0];
                                                        float f71 = fArr3[1];
                                                        if (Math.abs(f22 - f70) >= 0.001d || ((f71 >= centerY || f18 >= centerY) && (f71 <= centerY || f18 <= centerY))) {
                                                            M = M(f22, f18);
                                                            M2 = M(f70, f71);
                                                        } else {
                                                            M2 = this.A0.k[i29] == -180.0f ? 0 : 3;
                                                            M = 0;
                                                        }
                                                        while (M <= M2) {
                                                            if (M == 0) {
                                                                f26 = f11;
                                                                path2.lineTo(getMeasuredWidth(), f26);
                                                            } else if (M == 1) {
                                                                path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
                                                                f26 = 0.0f;
                                                            } else {
                                                                if (M == 2) {
                                                                    f26 = 0.0f;
                                                                    path2.lineTo(0.0f, getMeasuredHeight());
                                                                } else {
                                                                    f26 = 0.0f;
                                                                    path2.lineTo(0.0f, 0.0f);
                                                                }
                                                                M++;
                                                                f11 = f26;
                                                            }
                                                            M++;
                                                            f11 = f26;
                                                        }
                                                        f25 = f11;
                                                        f44 = f13 + measuredHeight2;
                                                        f39 = f21;
                                                    }
                                                }
                                                i17 = i25;
                                                i18 = min;
                                                f25 = f11;
                                                f44 = f13 + measuredHeight2;
                                                f39 = f21;
                                            }
                                        }
                                        if (this.H1[i29]) {
                                            if (i29 == i25) {
                                                path2.lineTo(f20, (f10 - f24) * f19);
                                            } else {
                                                path2.lineTo(f20, f19);
                                            }
                                        }
                                        if (i29 == i25) {
                                            path2.lineTo(f22, (f10 - f24) * f18);
                                        } else {
                                            path2.lineTo(f22, f18);
                                        }
                                        c2 = 0;
                                        this.H1[i29] = false;
                                        if (i10 == min) {
                                        }
                                        i17 = i25;
                                        i18 = min;
                                        f25 = f11;
                                        f44 = f13 + measuredHeight2;
                                        f39 = f21;
                                    }
                                    f21 = f39;
                                    f22 = f20;
                                    i15 = max;
                                    if (i10 == max) {
                                    }
                                    og.j jVar72 = this.A0;
                                    if (jVar72 == null) {
                                    }
                                    if (f14 == f11) {
                                    }
                                    f24 = f23;
                                    if (this.H1[i29]) {
                                    }
                                    if (i29 == i25) {
                                    }
                                    c2 = 0;
                                    this.H1[i29] = false;
                                    if (i10 == min) {
                                    }
                                    i17 = i25;
                                    i18 = min;
                                    f25 = f11;
                                    f44 = f13 + measuredHeight2;
                                    f39 = f21;
                                }
                                i12 = i24;
                                f14 = f11;
                                float[] fArr22 = ((ng.e) this.i0).b;
                                f15 = (fArr22[i10] * f40) - f41;
                                if (i10 != min) {
                                }
                                if (f14 == f11) {
                                    z13 = true;
                                }
                                float measuredHeight22 = ((getMeasuredHeight() - this.s) - i11) * f14;
                                measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight22) - f13;
                                this.I1[i29] = measuredHeight;
                                float measuredHeight32 = getMeasuredHeight() - this.s;
                                if (i10 != min) {
                                }
                                i13 = this.z0;
                                float f462 = measuredWidth;
                                float[] fArr32 = this.F1;
                                i14 = i12;
                                Matrix matrix2 = this.E1;
                                if (i13 == 2) {
                                }
                                arrayList2 = arrayList;
                                f17 = f11;
                                f18 = measuredHeight;
                                f19 = f16;
                                f20 = f15;
                                f21 = f39;
                                f22 = f20;
                                i15 = max;
                                if (i10 == max) {
                                }
                                og.j jVar722 = this.A0;
                                if (jVar722 == null) {
                                }
                                if (f14 == f11) {
                                }
                                f24 = f23;
                                if (this.H1[i29]) {
                                }
                                if (i29 == i25) {
                                }
                                c2 = 0;
                                this.H1[i29] = false;
                                if (i10 == min) {
                                }
                                i17 = i25;
                                i18 = min;
                                f25 = f11;
                                f44 = f13 + measuredHeight22;
                                f39 = f21;
                            } else {
                                if (f43 != f11) {
                                    i12 = i24;
                                    f14 = (jArr[i10] * fVar2.o) / f43;
                                    float[] fArr222 = ((ng.e) this.i0).b;
                                    f15 = (fArr222[i10] * f40) - f41;
                                    if (i10 != min) {
                                    }
                                    if (f14 == f11) {
                                    }
                                    float measuredHeight222 = ((getMeasuredHeight() - this.s) - i11) * f14;
                                    measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight222) - f13;
                                    this.I1[i29] = measuredHeight;
                                    float measuredHeight322 = getMeasuredHeight() - this.s;
                                    if (i10 != min) {
                                    }
                                    i13 = this.z0;
                                    float f4622 = measuredWidth;
                                    float[] fArr322 = this.F1;
                                    i14 = i12;
                                    Matrix matrix22 = this.E1;
                                    if (i13 == 2) {
                                    }
                                    arrayList2 = arrayList;
                                    f17 = f11;
                                    f18 = measuredHeight;
                                    f19 = f16;
                                    f20 = f15;
                                    f21 = f39;
                                    f22 = f20;
                                    i15 = max;
                                    if (i10 == max) {
                                    }
                                    og.j jVar7222 = this.A0;
                                    if (jVar7222 == null) {
                                    }
                                    if (f14 == f11) {
                                    }
                                    f24 = f23;
                                    if (this.H1[i29]) {
                                    }
                                    if (i29 == i25) {
                                    }
                                    c2 = 0;
                                    this.H1[i29] = false;
                                    if (i10 == min) {
                                    }
                                    i17 = i25;
                                    i18 = min;
                                    f25 = f11;
                                    f44 = f13 + measuredHeight222;
                                    f39 = f21;
                                }
                                i12 = i24;
                                f14 = f11;
                                float[] fArr2222 = ((ng.e) this.i0).b;
                                f15 = (fArr2222[i10] * f40) - f41;
                                if (i10 != min) {
                                }
                                if (f14 == f11) {
                                }
                                float measuredHeight2222 = ((getMeasuredHeight() - this.s) - i11) * f14;
                                measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight2222) - f13;
                                this.I1[i29] = measuredHeight;
                                float measuredHeight3222 = getMeasuredHeight() - this.s;
                                if (i10 != min) {
                                }
                                i13 = this.z0;
                                float f46222 = measuredWidth;
                                float[] fArr3222 = this.F1;
                                i14 = i12;
                                Matrix matrix222 = this.E1;
                                if (i13 == 2) {
                                }
                                arrayList2 = arrayList;
                                f17 = f11;
                                f18 = measuredHeight;
                                f19 = f16;
                                f20 = f15;
                                f21 = f39;
                                f22 = f20;
                                i15 = max;
                                if (i10 == max) {
                                }
                                og.j jVar72222 = this.A0;
                                if (jVar72222 == null) {
                                }
                                if (f14 == f11) {
                                }
                                f24 = f23;
                                if (this.H1[i29]) {
                                }
                                if (i29 == i25) {
                                }
                                c2 = 0;
                                this.H1[i29] = false;
                                if (i10 == min) {
                                }
                                i17 = i25;
                                i18 = min;
                                f25 = f11;
                                f44 = f13 + measuredHeight2222;
                                f39 = f21;
                            }
                            f38 = f45;
                            i29++;
                            f11 = f25;
                            min = i18;
                            i25 = i17;
                            max = i15;
                            i24 = i14;
                            i11 = i16;
                            arrayList = arrayList2;
                        }
                        i10++;
                        min = min;
                        f35 = f40;
                        f37 = f41;
                        f12 = f42;
                        z10 = z13;
                        i3 = i28;
                    }
                    int i31 = i3;
                    ArrayList arrayList3 = arrayList;
                    z11 = z10;
                    canvas.save();
                    canvas.clipRect(f39, i11, f38, getMeasuredHeight() - this.s);
                    if (z11) {
                        canvas.drawColor(k6.x0(null, k6.fk, false));
                    }
                    for (size = arrayList3.size() - 1; size >= 0; size--) {
                        og.f fVar3 = (og.f) arrayList3.get(size);
                        Paint paint = fVar3.c;
                        paint.setAlpha(i31);
                        canvas.drawPath(fVar3.f, paint);
                        paint.setAlpha(hs.e4);
                    }
                    canvas.restore();
                    canvas.restore();
                }
                f12 = 0.0f;
            }
            i3 = hs.e4;
            float[] fArr4 = ((ng.e) this.i0).b;
            int i232 = ((int) (f36 / (fArr4.length >= 2 ? f10 : fArr4[1] * f35))) + 1;
            int max2 = Math.max(0, (this.G - i232) - 1);
            min = Math.min(((ng.e) this.i0).b.length - 1, this.H + i232 + 1);
            i10 = max2;
            float f382 = f11;
            float f392 = f382;
            z10 = false;
            while (true) {
                i11 = g.o1;
                if (i10 <= min) {
                }
                i10++;
                min = min;
                f35 = f40;
                f37 = f41;
                f12 = f42;
                z10 = z13;
                i3 = i28;
            }
            int i312 = i3;
            ArrayList arrayList32 = arrayList;
            z11 = z10;
            canvas.save();
            canvas.clipRect(f392, i11, f382, getMeasuredHeight() - this.s);
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
    @Override // mg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(Canvas canvas) {
        int i3;
        boolean z10;
        float f10;
        boolean z11;
        ng.b bVar;
        if (this.i0 != null) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((og.i) arrayList.get(i10)).g.reset();
            }
            ng.b bVar2 = this.i0;
            int i11 = ((ng.e) bVar2).n;
            boolean[] zArr = this.H1;
            if (zArr == null || zArr.length < ((ng.e) bVar2).d.size()) {
                this.H1 = new boolean[((ng.e) this.i0).d.size()];
            }
            boolean z12 = false;
            for (int i12 = 0; i12 < i11; i12++) {
                float f11 = 0.0f;
                float f12 = 0.0f;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    og.f fVar = (og.f) arrayList.get(i15);
                    if (fVar.n || fVar.o != 0.0f) {
                        if (((ng.e) this.i0).m[i15][i12] > 0) {
                            f12 += ((ng.e) r12).m[i15][i12] * fVar.o;
                            i13++;
                        }
                        i14 = i15;
                    }
                }
                int i16 = i11 - 1;
                float f13 = (i12 / i16) * this.D0;
                float f14 = 0.0f;
                int i17 = 0;
                while (i17 < arrayList.size()) {
                    og.f fVar2 = (og.f) arrayList.get(i17);
                    float f15 = f11;
                    boolean z13 = fVar2.n;
                    Path path = fVar2.g;
                    if (!z13 && fVar2.o == f15) {
                        i3 = i11;
                    } else if (i13 == 1) {
                        if (((ng.e) this.i0).m[i17][i12] != 0) {
                            f10 = fVar2.o;
                            i3 = i11;
                            z10 = z12;
                            boolean z14 = (f10 == f15 || i17 != i14) ? z10 : true;
                            int i18 = this.C0;
                            float f16 = f10 * i18;
                            float f17 = (i18 - f16) - f14;
                            if (i12 != 0) {
                                z11 = z14;
                                path.moveTo(f15, i18);
                                this.H1[i17] = false;
                            } else {
                                z11 = z14;
                            }
                            bVar = this.i0;
                            if (((ng.e) bVar).m[i17][i12] == 0 || i12 <= 0 || ((ng.e) bVar).m[i17][i12 - 1] != 0 || i12 >= i16 || ((ng.e) bVar).m[i17][i12 + 1] != 0) {
                                if (this.H1[i17]) {
                                    path.lineTo(f13, i18);
                                }
                                path.lineTo(f13, f17);
                                this.H1[i17] = false;
                            } else {
                                if (!this.H1[i17]) {
                                    path.lineTo(f13, i18);
                                }
                                this.H1[i17] = true;
                            }
                            if (i12 == i16) {
                                path.lineTo(this.D0, i18);
                            }
                            f14 += f16;
                            z12 = z11;
                        }
                        i3 = i11;
                        z10 = z12;
                        f10 = f15;
                        if (f10 == f15) {
                        }
                        int i182 = this.C0;
                        float f162 = f10 * i182;
                        float f172 = (i182 - f162) - f14;
                        if (i12 != 0) {
                        }
                        bVar = this.i0;
                        if (((ng.e) bVar).m[i17][i12] == 0) {
                        }
                        if (this.H1[i17]) {
                        }
                        path.lineTo(f13, f172);
                        this.H1[i17] = false;
                        if (i12 == i16) {
                        }
                        f14 += f162;
                        z12 = z11;
                    } else {
                        if (f12 != f15) {
                            i3 = i11;
                            z10 = z12;
                            f10 = (((ng.e) this.i0).m[i17][i12] * fVar2.o) / f12;
                            if (f10 == f15) {
                            }
                            int i1822 = this.C0;
                            float f1622 = f10 * i1822;
                            float f1722 = (i1822 - f1622) - f14;
                            if (i12 != 0) {
                            }
                            bVar = this.i0;
                            if (((ng.e) bVar).m[i17][i12] == 0) {
                            }
                            if (this.H1[i17]) {
                            }
                            path.lineTo(f13, f1722);
                            this.H1[i17] = false;
                            if (i12 == i16) {
                            }
                            f14 += f1622;
                            z12 = z11;
                        }
                        i3 = i11;
                        z10 = z12;
                        f10 = f15;
                        if (f10 == f15) {
                        }
                        int i18222 = this.C0;
                        float f16222 = f10 * i18222;
                        float f17222 = (i18222 - f16222) - f14;
                        if (i12 != 0) {
                        }
                        bVar = this.i0;
                        if (((ng.e) bVar).m[i17][i12] == 0) {
                        }
                        if (this.H1[i17]) {
                        }
                        path.lineTo(f13, f17222);
                        this.H1[i17] = false;
                        if (i12 == i16) {
                        }
                        f14 += f16222;
                        z12 = z11;
                    }
                    i17++;
                    i11 = i3;
                    f11 = 0.0f;
                }
            }
            if (z12) {
                canvas.drawColor(k6.x0(null, k6.fk, false));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                og.f fVar3 = (og.f) arrayList.get(size2);
                canvas.drawPath(fVar3.g, fVar3.c);
            }
        }
    }

    @Override // mg.g, android.view.View
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.n0 = arrayList.size();
        int i3 = 0;
        while (true) {
            this.o0 = i3;
            int i10 = this.o0;
            if (i10 >= this.n0) {
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
            l(canvas, (og.d) arrayList.get(i10));
            p(canvas, (og.d) arrayList.get(this.o0));
            i3 = this.o0 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0142  */
    @Override // mg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(og.j jVar) {
        ArrayList arrayList;
        int i3;
        float f10;
        ng.b bVar = this.i0;
        if (bVar == null) {
            return;
        }
        float f11 = this.G0;
        j jVar2 = this.h0;
        float f12 = jVar2.l;
        float f13 = jVar2.k;
        float f14 = f11 / (f12 - f13);
        float f15 = g.l1;
        float f16 = (f13 * f14) - f15;
        int i10 = 2;
        int i11 = 1;
        int i12 = ((int) (f15 / (((ng.e) bVar).b.length < 2 ? 1.0f : ((ng.e) bVar).b[1] * f14))) + 1;
        int i13 = 0;
        int max = Math.max(0, (this.G - i12) - 1);
        int min = Math.min(((ng.e) this.i0).b.length - 1, this.H + i12 + 1);
        this.A0.g = new float[((ng.e) this.i0).d.size()];
        this.A0.h = new float[((ng.e) this.i0).d.size()];
        this.A0.i = new float[((ng.e) this.i0).d.size()];
        this.A0.j = new float[((ng.e) this.i0).d.size()];
        this.A0.k = new float[((ng.e) this.i0).d.size()];
        int i14 = 0;
        while (i14 < i10) {
            int i15 = i14 == i11 ? min : max;
            int i16 = i13;
            int i17 = i16;
            float f17 = 0.0f;
            while (true) {
                arrayList = this.d;
                if (i16 >= arrayList.size()) {
                    break;
                }
                og.f fVar = (og.f) arrayList.get(i16);
                if (fVar.n || fVar.o != 0.0f) {
                    long j10 = fVar.a.a[i15];
                    if (j10 > 0) {
                        f17 += j10 * fVar.o;
                        i17++;
                    }
                }
                i16++;
            }
            int i18 = 0;
            int i19 = 0;
            while (i18 < arrayList.size()) {
                og.f fVar2 = (og.f) arrayList.get(i18);
                if (fVar2.n || fVar2.o != 0.0f) {
                    long[] jArr = fVar2.a.a;
                    if (i17 == i11) {
                        if (jArr[i15] != 0) {
                            f10 = fVar2.o;
                            i3 = i14;
                            float f18 = (((ng.e) this.i0).b[i15] * f14) - f16;
                            float measuredHeight = f10 * ((getMeasuredHeight() - this.s) - g.o1);
                            float f19 = i19;
                            float measuredHeight2 = ((getMeasuredHeight() - this.s) - measuredHeight) - f19;
                            i19 = (int) (f19 + measuredHeight);
                            if (i3 != 0) {
                                og.j jVar3 = this.A0;
                                jVar3.g[i18] = f18;
                                jVar3.h[i18] = measuredHeight2;
                            } else {
                                og.j jVar4 = this.A0;
                                jVar4.i[i18] = f18;
                                jVar4.j[i18] = measuredHeight2;
                            }
                        }
                        i3 = i14;
                        f10 = 0.0f;
                        float f182 = (((ng.e) this.i0).b[i15] * f14) - f16;
                        float measuredHeight3 = f10 * ((getMeasuredHeight() - this.s) - g.o1);
                        float f192 = i19;
                        float measuredHeight22 = ((getMeasuredHeight() - this.s) - measuredHeight3) - f192;
                        i19 = (int) (f192 + measuredHeight3);
                        if (i3 != 0) {
                        }
                    } else {
                        if (f17 != 0.0f) {
                            i3 = i14;
                            f10 = (jArr[i15] * fVar2.o) / f17;
                            float f1822 = (((ng.e) this.i0).b[i15] * f14) - f16;
                            float measuredHeight32 = f10 * ((getMeasuredHeight() - this.s) - g.o1);
                            float f1922 = i19;
                            float measuredHeight222 = ((getMeasuredHeight() - this.s) - measuredHeight32) - f1922;
                            i19 = (int) (f1922 + measuredHeight32);
                            if (i3 != 0) {
                            }
                        }
                        i3 = i14;
                        f10 = 0.0f;
                        float f18222 = (((ng.e) this.i0).b[i15] * f14) - f16;
                        float measuredHeight322 = f10 * ((getMeasuredHeight() - this.s) - g.o1);
                        float f19222 = i19;
                        float measuredHeight2222 = ((getMeasuredHeight() - this.s) - measuredHeight322) - f19222;
                        i19 = (int) (f19222 + measuredHeight322);
                        if (i3 != 0) {
                        }
                    }
                } else {
                    i3 = i14;
                }
                i18++;
                i14 = i3;
                i11 = 1;
            }
            i14++;
            i13 = 0;
            i10 = 2;
            i11 = 1;
        }
    }

    @Override // mg.g
    public final long r(int i3, int i10) {
        return 100L;
    }
}
