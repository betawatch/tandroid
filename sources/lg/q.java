package lg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class q extends g {
    public final Matrix D1;
    public final float[] E1;
    public final Path F1;
    public boolean[] G1;
    public float[] H1;

    public q(Context context) {
        super(context, null);
        this.D1 = new Matrix();
        this.E1 = new float[2];
        this.F1 = new Path();
        this.w0 = true;
        this.x0 = true;
        this.e = false;
    }

    @Override // lg.g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public ng.i h(mg.a aVar) {
        return new ng.i(aVar);
    }

    public final int M(float f10, float f11) {
        RectF rectF = this.H0;
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

    @Override // lg.g
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
    @Override // lg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(Canvas canvas) {
        ArrayList arrayList;
        float f10;
        float f11;
        float f12;
        int i7;
        int min;
        int i10;
        boolean z9;
        int i11;
        boolean z10;
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
        char c10;
        int i17;
        int i18;
        float f25;
        double degrees;
        int M;
        int M2;
        float f26;
        boolean z11;
        float f27;
        float f28;
        int i19;
        float f29;
        float f30;
        float f31;
        double degrees2;
        int i20;
        if (this.h0 != null) {
            float f32 = this.F0;
            j jVar = this.g0;
            float f33 = jVar.l;
            float f34 = jVar.k;
            float f35 = f32 / (f33 - f34);
            float f36 = g.k1;
            float f37 = (f34 * f35) - f36;
            RectF rectF = this.H0;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY() + g0.L(16.0f);
            int i21 = 0;
            while (true) {
                arrayList = this.d;
                if (i21 >= arrayList.size()) {
                    break;
                }
                ((ng.i) arrayList.get(i21)).f.reset();
                ((ng.i) arrayList.get(i21)).g.reset();
                i21++;
            }
            canvas.save();
            boolean[] zArr = this.G1;
            if (zArr == null || zArr.length < ((mg.e) this.h0).d.size()) {
                this.G1 = new boolean[((mg.e) this.h0).d.size()];
                this.H1 = new float[((mg.e) this.h0).d.size()];
            }
            int i22 = this.y0;
            if (i22 == 2) {
                f12 = this.z0.f / 0.6f;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                Path path = this.F1;
                path.reset();
                float width = rectF.width() > rectF.height() ? rectF.width() : rectF.height();
                float height = (rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f;
                f11 = 0.0f;
                float z12 = com.google.android.recaptcha.internal.a.z(1.0f, this.z0.f, (width - height) / 2.0f, height);
                RectF rectF2 = new RectF();
                f10 = 1.0f;
                rectF2.set(centerX - z12, centerY - z12, centerX + z12, centerY + z12);
                path.addRoundRect(rectF2, z12, z12, Path.Direction.CW);
                canvas.clipPath(path);
            } else {
                f10 = 1.0f;
                f11 = 0.0f;
                if (i22 == 3) {
                    i7 = (int) (this.z0.f * 255.0f);
                    f12 = 0.0f;
                    float[] fArr = ((mg.e) this.h0).b;
                    int i23 = ((int) (f36 / (fArr.length >= 2 ? f10 : fArr[1] * f35))) + 1;
                    int max = Math.max(0, (this.F - i23) - 1);
                    min = Math.min(((mg.e) this.h0).b.length - 1, this.G + i23 + 1);
                    i10 = max;
                    float f38 = f11;
                    float f39 = f38;
                    z9 = false;
                    while (true) {
                        i11 = g.n1;
                        if (i10 <= min) {
                            break;
                        }
                        float f40 = f35;
                        float f41 = f37;
                        float f42 = f12;
                        boolean z13 = z9;
                        float f43 = f11;
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 0;
                        while (i26 < arrayList.size()) {
                            ng.f fVar = (ng.f) arrayList.get(i26);
                            int i27 = i26;
                            if (fVar.n || fVar.o != f11) {
                                i20 = i7;
                                long j3 = fVar.a.a[i10];
                                if (j3 > 0) {
                                    f43 = (j3 * fVar.o) + f43;
                                    i24++;
                                }
                                i25 = i27;
                            } else {
                                i20 = i7;
                            }
                            i26 = i27 + 1;
                            i7 = i20;
                        }
                        int i28 = i7;
                        float f44 = f11;
                        int i29 = 0;
                        while (i29 < arrayList.size()) {
                            ng.f fVar2 = (ng.f) arrayList.get(i29);
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
                                    float[] fArr2 = ((mg.e) this.h0).b;
                                    f15 = (fArr2[i10] * f40) - f41;
                                    float measuredWidth = i10 != min ? getMeasuredWidth() : (fArr2[i10 + 1] * f40) - f41;
                                    if (f14 == f11 && i29 == i25) {
                                        z13 = true;
                                    }
                                    float measuredHeight2 = ((getMeasuredHeight() - this.s) - i11) * f14;
                                    measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight2) - f13;
                                    this.H1[i29] = measuredHeight;
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
                                    i13 = this.y0;
                                    float f46 = measuredWidth;
                                    float[] fArr3 = this.E1;
                                    i14 = i12;
                                    Matrix matrix = this.D1;
                                    if (i13 == 2 || i29 == i25) {
                                        arrayList2 = arrayList;
                                        f17 = f11;
                                        f18 = measuredHeight;
                                        f19 = f16;
                                        f20 = f15;
                                    } else {
                                        int i30 = (f15 > centerX ? 1 : (f15 == centerX ? 0 : -1));
                                        if (i30 < 0) {
                                            ng.j jVar2 = this.z0;
                                            i19 = i30;
                                            f30 = jVar2.g[i29];
                                            f29 = jVar2.h[i29];
                                        } else {
                                            i19 = i30;
                                            ng.j jVar3 = this.z0;
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
                                            matrix.postRotate(this.z0.f * f57, centerX, centerY);
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
                                            matrix.postRotate(this.z0.f * f17, centerX, centerY);
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
                                                ng.j jVar4 = this.z0;
                                                float f59 = jVar4.f;
                                                matrix.postRotate((f59 * jVar4.k[i29]) + (f59 * f17), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                float f60 = fArr3[0];
                                                f18 = fArr3[1];
                                                if (f46 >= centerX) {
                                                    float f61 = this.z0.f;
                                                    fArr3[0] = (f61 * centerX) + ((f10 - f61) * f15);
                                                } else {
                                                    fArr3[0] = f15;
                                                }
                                                fArr3[1] = f55;
                                                matrix.reset();
                                                ng.j jVar5 = this.z0;
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
                                            if (this.y0 != 2 || i29 == i25) {
                                                z11 = false;
                                                f27 = f11;
                                                f28 = measuredHeight4;
                                            } else {
                                                fArr3[0] = f11 - centerX;
                                                fArr3[1] = measuredHeight4;
                                                matrix.reset();
                                                ng.j jVar6 = this.z0;
                                                float f63 = jVar6.f;
                                                matrix.postRotate((f63 * jVar6.k[i29]) + (f17 * f63), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                z11 = false;
                                                f27 = fArr3[0];
                                                f28 = fArr3[1];
                                            }
                                            path2.moveTo(f27, f28);
                                            this.G1[i29] = z11;
                                        } else {
                                            i16 = i11;
                                        }
                                        ng.j jVar7 = this.z0;
                                        f23 = jVar7 == null ? f11 : jVar7.f;
                                        if (f14 == f11 || i10 <= 0 || jArr[i10 - 1] != 0 || i10 >= min || jArr[i10 + 1] != 0) {
                                            f24 = f23;
                                        } else {
                                            f24 = f23;
                                            if (this.y0 != 2) {
                                                if (!this.G1[i29]) {
                                                    if (i29 == i25) {
                                                        path2.lineTo(f20, (f10 - f24) * f19);
                                                    } else {
                                                        path2.lineTo(f20, f19);
                                                    }
                                                }
                                                this.G1[i29] = true;
                                                c10 = 0;
                                                if (i10 == min) {
                                                    float measuredWidth2 = getMeasuredWidth();
                                                    float measuredHeight5 = getMeasuredHeight();
                                                    if (this.y0 != 2 || i29 == i25) {
                                                        path2.lineTo(measuredWidth2, measuredHeight5);
                                                    } else {
                                                        fArr3[c10] = measuredWidth2 + centerX;
                                                        fArr3[1] = measuredHeight5;
                                                        matrix.reset();
                                                        ng.j jVar8 = this.z0;
                                                        matrix.postRotate(jVar8.f * jVar8.k[i29], centerX, centerY);
                                                        matrix.mapPoints(fArr3);
                                                        float f64 = fArr3[c10];
                                                        float f65 = fArr3[1];
                                                    }
                                                    if (this.y0 != 2) {
                                                        i17 = i25;
                                                        i18 = min;
                                                        f25 = f11;
                                                        f44 = f13 + measuredHeight2;
                                                        f39 = f21;
                                                    } else if (i29 != i25) {
                                                        ng.j jVar9 = this.z0;
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
                                                        ng.j jVar10 = this.z0;
                                                        float f67 = jVar10.g[i29];
                                                        float f68 = jVar10.h[i29];
                                                        fArr3[0] = f67;
                                                        fArr3[1] = f68;
                                                        matrix.reset();
                                                        ng.j jVar11 = this.z0;
                                                        float f69 = jVar11.f;
                                                        matrix.postRotate((f69 * jVar11.k[i29]) + ((((float) degrees) - 90.0f) * f69), centerX, centerY);
                                                        matrix.mapPoints(fArr3);
                                                        float f70 = fArr3[0];
                                                        float f71 = fArr3[1];
                                                        if (Math.abs(f22 - f70) >= 0.001d || ((f71 >= centerY || f18 >= centerY) && (f71 <= centerY || f18 <= centerY))) {
                                                            M = M(f22, f18);
                                                            M2 = M(f70, f71);
                                                        } else {
                                                            M2 = this.z0.k[i29] == -180.0f ? 0 : 3;
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
                                        if (this.G1[i29]) {
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
                                        c10 = 0;
                                        this.G1[i29] = false;
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
                                    ng.j jVar72 = this.z0;
                                    if (jVar72 == null) {
                                    }
                                    if (f14 == f11) {
                                    }
                                    f24 = f23;
                                    if (this.G1[i29]) {
                                    }
                                    if (i29 == i25) {
                                    }
                                    c10 = 0;
                                    this.G1[i29] = false;
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
                                float[] fArr22 = ((mg.e) this.h0).b;
                                f15 = (fArr22[i10] * f40) - f41;
                                if (i10 != min) {
                                }
                                if (f14 == f11) {
                                    z13 = true;
                                }
                                float measuredHeight22 = ((getMeasuredHeight() - this.s) - i11) * f14;
                                measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight22) - f13;
                                this.H1[i29] = measuredHeight;
                                float measuredHeight32 = getMeasuredHeight() - this.s;
                                if (i10 != min) {
                                }
                                i13 = this.y0;
                                float f462 = measuredWidth;
                                float[] fArr32 = this.E1;
                                i14 = i12;
                                Matrix matrix2 = this.D1;
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
                                ng.j jVar722 = this.z0;
                                if (jVar722 == null) {
                                }
                                if (f14 == f11) {
                                }
                                f24 = f23;
                                if (this.G1[i29]) {
                                }
                                if (i29 == i25) {
                                }
                                c10 = 0;
                                this.G1[i29] = false;
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
                                    float[] fArr222 = ((mg.e) this.h0).b;
                                    f15 = (fArr222[i10] * f40) - f41;
                                    if (i10 != min) {
                                    }
                                    if (f14 == f11) {
                                    }
                                    float measuredHeight222 = ((getMeasuredHeight() - this.s) - i11) * f14;
                                    measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight222) - f13;
                                    this.H1[i29] = measuredHeight;
                                    float measuredHeight322 = getMeasuredHeight() - this.s;
                                    if (i10 != min) {
                                    }
                                    i13 = this.y0;
                                    float f4622 = measuredWidth;
                                    float[] fArr322 = this.E1;
                                    i14 = i12;
                                    Matrix matrix22 = this.D1;
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
                                    ng.j jVar7222 = this.z0;
                                    if (jVar7222 == null) {
                                    }
                                    if (f14 == f11) {
                                    }
                                    f24 = f23;
                                    if (this.G1[i29]) {
                                    }
                                    if (i29 == i25) {
                                    }
                                    c10 = 0;
                                    this.G1[i29] = false;
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
                                float[] fArr2222 = ((mg.e) this.h0).b;
                                f15 = (fArr2222[i10] * f40) - f41;
                                if (i10 != min) {
                                }
                                if (f14 == f11) {
                                }
                                float measuredHeight2222 = ((getMeasuredHeight() - this.s) - i11) * f14;
                                measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight2222) - f13;
                                this.H1[i29] = measuredHeight;
                                float measuredHeight3222 = getMeasuredHeight() - this.s;
                                if (i10 != min) {
                                }
                                i13 = this.y0;
                                float f46222 = measuredWidth;
                                float[] fArr3222 = this.E1;
                                i14 = i12;
                                Matrix matrix222 = this.D1;
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
                                ng.j jVar72222 = this.z0;
                                if (jVar72222 == null) {
                                }
                                if (f14 == f11) {
                                }
                                f24 = f23;
                                if (this.G1[i29]) {
                                }
                                if (i29 == i25) {
                                }
                                c10 = 0;
                                this.G1[i29] = false;
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
                        z9 = z13;
                        i7 = i28;
                    }
                    int i31 = i7;
                    ArrayList arrayList3 = arrayList;
                    z10 = z9;
                    canvas.save();
                    canvas.clipRect(f39, i11, f38, getMeasuredHeight() - this.s);
                    if (z10) {
                        canvas.drawColor(k6.x0(null, k6.fk, false));
                    }
                    for (size = arrayList3.size() - 1; size >= 0; size--) {
                        ng.f fVar3 = (ng.f) arrayList3.get(size);
                        Paint paint = fVar3.c;
                        paint.setAlpha(i31);
                        canvas.drawPath(fVar3.f, paint);
                        paint.setAlpha(qs.e4);
                    }
                    canvas.restore();
                    canvas.restore();
                }
                f12 = 0.0f;
            }
            i7 = qs.e4;
            float[] fArr4 = ((mg.e) this.h0).b;
            int i232 = ((int) (f36 / (fArr4.length >= 2 ? f10 : fArr4[1] * f35))) + 1;
            int max2 = Math.max(0, (this.F - i232) - 1);
            min = Math.min(((mg.e) this.h0).b.length - 1, this.G + i232 + 1);
            i10 = max2;
            float f382 = f11;
            float f392 = f382;
            z9 = false;
            while (true) {
                i11 = g.n1;
                if (i10 <= min) {
                }
                i10++;
                min = min;
                f35 = f40;
                f37 = f41;
                f12 = f42;
                z9 = z13;
                i7 = i28;
            }
            int i312 = i7;
            ArrayList arrayList32 = arrayList;
            z10 = z9;
            canvas.save();
            canvas.clipRect(f392, i11, f382, getMeasuredHeight() - this.s);
            if (z10) {
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
    @Override // lg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(Canvas canvas) {
        int i7;
        boolean z9;
        float f10;
        boolean z10;
        mg.b bVar;
        if (this.h0 != null) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((ng.i) arrayList.get(i10)).g.reset();
            }
            mg.b bVar2 = this.h0;
            int i11 = ((mg.e) bVar2).n;
            boolean[] zArr = this.G1;
            if (zArr == null || zArr.length < ((mg.e) bVar2).d.size()) {
                this.G1 = new boolean[((mg.e) this.h0).d.size()];
            }
            boolean z11 = false;
            for (int i12 = 0; i12 < i11; i12++) {
                float f11 = 0.0f;
                float f12 = 0.0f;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ng.f fVar = (ng.f) arrayList.get(i15);
                    if (fVar.n || fVar.o != 0.0f) {
                        if (((mg.e) this.h0).m[i15][i12] > 0) {
                            f12 += ((mg.e) r12).m[i15][i12] * fVar.o;
                            i13++;
                        }
                        i14 = i15;
                    }
                }
                int i16 = i11 - 1;
                float f13 = (i12 / i16) * this.C0;
                float f14 = 0.0f;
                int i17 = 0;
                while (i17 < arrayList.size()) {
                    ng.f fVar2 = (ng.f) arrayList.get(i17);
                    float f15 = f11;
                    boolean z12 = fVar2.n;
                    Path path = fVar2.g;
                    if (!z12 && fVar2.o == f15) {
                        i7 = i11;
                    } else if (i13 == 1) {
                        if (((mg.e) this.h0).m[i17][i12] != 0) {
                            f10 = fVar2.o;
                            i7 = i11;
                            z9 = z11;
                            boolean z13 = (f10 == f15 || i17 != i14) ? z9 : true;
                            int i18 = this.B0;
                            float f16 = f10 * i18;
                            float f17 = (i18 - f16) - f14;
                            if (i12 != 0) {
                                z10 = z13;
                                path.moveTo(f15, i18);
                                this.G1[i17] = false;
                            } else {
                                z10 = z13;
                            }
                            bVar = this.h0;
                            if (((mg.e) bVar).m[i17][i12] == 0 || i12 <= 0 || ((mg.e) bVar).m[i17][i12 - 1] != 0 || i12 >= i16 || ((mg.e) bVar).m[i17][i12 + 1] != 0) {
                                if (this.G1[i17]) {
                                    path.lineTo(f13, i18);
                                }
                                path.lineTo(f13, f17);
                                this.G1[i17] = false;
                            } else {
                                if (!this.G1[i17]) {
                                    path.lineTo(f13, i18);
                                }
                                this.G1[i17] = true;
                            }
                            if (i12 == i16) {
                                path.lineTo(this.C0, i18);
                            }
                            f14 += f16;
                            z11 = z10;
                        }
                        i7 = i11;
                        z9 = z11;
                        f10 = f15;
                        if (f10 == f15) {
                        }
                        int i182 = this.B0;
                        float f162 = f10 * i182;
                        float f172 = (i182 - f162) - f14;
                        if (i12 != 0) {
                        }
                        bVar = this.h0;
                        if (((mg.e) bVar).m[i17][i12] == 0) {
                        }
                        if (this.G1[i17]) {
                        }
                        path.lineTo(f13, f172);
                        this.G1[i17] = false;
                        if (i12 == i16) {
                        }
                        f14 += f162;
                        z11 = z10;
                    } else {
                        if (f12 != f15) {
                            i7 = i11;
                            z9 = z11;
                            f10 = (((mg.e) this.h0).m[i17][i12] * fVar2.o) / f12;
                            if (f10 == f15) {
                            }
                            int i1822 = this.B0;
                            float f1622 = f10 * i1822;
                            float f1722 = (i1822 - f1622) - f14;
                            if (i12 != 0) {
                            }
                            bVar = this.h0;
                            if (((mg.e) bVar).m[i17][i12] == 0) {
                            }
                            if (this.G1[i17]) {
                            }
                            path.lineTo(f13, f1722);
                            this.G1[i17] = false;
                            if (i12 == i16) {
                            }
                            f14 += f1622;
                            z11 = z10;
                        }
                        i7 = i11;
                        z9 = z11;
                        f10 = f15;
                        if (f10 == f15) {
                        }
                        int i18222 = this.B0;
                        float f16222 = f10 * i18222;
                        float f17222 = (i18222 - f16222) - f14;
                        if (i12 != 0) {
                        }
                        bVar = this.h0;
                        if (((mg.e) bVar).m[i17][i12] == 0) {
                        }
                        if (this.G1[i17]) {
                        }
                        path.lineTo(f13, f17222);
                        this.G1[i17] = false;
                        if (i12 == i16) {
                        }
                        f14 += f16222;
                        z11 = z10;
                    }
                    i17++;
                    i11 = i7;
                    f11 = 0.0f;
                }
            }
            if (z11) {
                canvas.drawColor(k6.x0(null, k6.fk, false));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ng.f fVar3 = (ng.f) arrayList.get(size2);
                canvas.drawPath(fVar3.g, fVar3.c);
            }
        }
    }

    @Override // lg.g, android.view.View
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.m0 = arrayList.size();
        int i7 = 0;
        while (true) {
            this.n0 = i7;
            int i10 = this.n0;
            if (i10 >= this.m0) {
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
            l(canvas, (ng.d) arrayList.get(i10));
            p(canvas, (ng.d) arrayList.get(this.n0));
            i7 = this.n0 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0142  */
    @Override // lg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(ng.j jVar) {
        ArrayList arrayList;
        int i7;
        float f10;
        mg.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        float f11 = this.F0;
        j jVar2 = this.g0;
        float f12 = jVar2.l;
        float f13 = jVar2.k;
        float f14 = f11 / (f12 - f13);
        float f15 = g.k1;
        float f16 = (f13 * f14) - f15;
        int i10 = 2;
        int i11 = 1;
        int i12 = ((int) (f15 / (((mg.e) bVar).b.length < 2 ? 1.0f : ((mg.e) bVar).b[1] * f14))) + 1;
        int i13 = 0;
        int max = Math.max(0, (this.F - i12) - 1);
        int min = Math.min(((mg.e) this.h0).b.length - 1, this.G + i12 + 1);
        this.z0.g = new float[((mg.e) this.h0).d.size()];
        this.z0.h = new float[((mg.e) this.h0).d.size()];
        this.z0.i = new float[((mg.e) this.h0).d.size()];
        this.z0.j = new float[((mg.e) this.h0).d.size()];
        this.z0.k = new float[((mg.e) this.h0).d.size()];
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
                ng.f fVar = (ng.f) arrayList.get(i16);
                if (fVar.n || fVar.o != 0.0f) {
                    long j3 = fVar.a.a[i15];
                    if (j3 > 0) {
                        f17 += j3 * fVar.o;
                        i17++;
                    }
                }
                i16++;
            }
            int i18 = 0;
            int i19 = 0;
            while (i18 < arrayList.size()) {
                ng.f fVar2 = (ng.f) arrayList.get(i18);
                if (fVar2.n || fVar2.o != 0.0f) {
                    long[] jArr = fVar2.a.a;
                    if (i17 == i11) {
                        if (jArr[i15] != 0) {
                            f10 = fVar2.o;
                            i7 = i14;
                            float f18 = (((mg.e) this.h0).b[i15] * f14) - f16;
                            float measuredHeight = f10 * ((getMeasuredHeight() - this.s) - g.n1);
                            float f19 = i19;
                            float measuredHeight2 = ((getMeasuredHeight() - this.s) - measuredHeight) - f19;
                            i19 = (int) (f19 + measuredHeight);
                            if (i7 != 0) {
                                ng.j jVar3 = this.z0;
                                jVar3.g[i18] = f18;
                                jVar3.h[i18] = measuredHeight2;
                            } else {
                                ng.j jVar4 = this.z0;
                                jVar4.i[i18] = f18;
                                jVar4.j[i18] = measuredHeight2;
                            }
                        }
                        i7 = i14;
                        f10 = 0.0f;
                        float f182 = (((mg.e) this.h0).b[i15] * f14) - f16;
                        float measuredHeight3 = f10 * ((getMeasuredHeight() - this.s) - g.n1);
                        float f192 = i19;
                        float measuredHeight22 = ((getMeasuredHeight() - this.s) - measuredHeight3) - f192;
                        i19 = (int) (f192 + measuredHeight3);
                        if (i7 != 0) {
                        }
                    } else {
                        if (f17 != 0.0f) {
                            i7 = i14;
                            f10 = (jArr[i15] * fVar2.o) / f17;
                            float f1822 = (((mg.e) this.h0).b[i15] * f14) - f16;
                            float measuredHeight32 = f10 * ((getMeasuredHeight() - this.s) - g.n1);
                            float f1922 = i19;
                            float measuredHeight222 = ((getMeasuredHeight() - this.s) - measuredHeight32) - f1922;
                            i19 = (int) (f1922 + measuredHeight32);
                            if (i7 != 0) {
                            }
                        }
                        i7 = i14;
                        f10 = 0.0f;
                        float f18222 = (((mg.e) this.h0).b[i15] * f14) - f16;
                        float measuredHeight322 = f10 * ((getMeasuredHeight() - this.s) - g.n1);
                        float f19222 = i19;
                        float measuredHeight2222 = ((getMeasuredHeight() - this.s) - measuredHeight322) - f19222;
                        i19 = (int) (f19222 + measuredHeight322);
                        if (i7 != 0) {
                        }
                    }
                } else {
                    i7 = i14;
                }
                i18++;
                i14 = i7;
                i11 = 1;
            }
            i14++;
            i13 = 0;
            i10 = 2;
            i11 = 1;
        }
    }

    @Override // lg.g
    public final long r(int i7, int i10) {
        return 100L;
    }
}
