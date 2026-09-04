package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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

    @Override // jg.g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public lg.i h(kg.a aVar) {
        return new lg.i(aVar);
    }

    public final int M(float f7, float f10) {
        RectF rectF = this.H0;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY() + AndroidUtilities.dp(16.0f);
        if (f7 >= centerX && f10 <= centerY) {
            return 0;
        }
        if (f7 < centerX || f10 < centerY) {
            return (f7 >= centerX || f10 < centerY) ? 3 : 2;
        }
        return 1;
    }

    @Override // jg.g
    public float getMinDistance() {
        return 0.1f;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0250 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03db  */
    @Override // jg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(Canvas canvas) {
        ArrayList arrayList;
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        float f12;
        int i12;
        float f13;
        float f14;
        float measuredHeight;
        float f15;
        int i13;
        int i14;
        ArrayList arrayList2;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        int i15;
        int i16;
        float f22;
        float f23;
        char c10;
        int i17;
        int i18;
        double degrees;
        int M;
        int M2;
        boolean z10;
        float f24;
        float f25;
        int i19;
        float f26;
        float f27;
        float f28;
        double degrees2;
        int i20;
        if (this.h0 != null) {
            float f29 = this.F0;
            j jVar = this.g0;
            float f30 = jVar.l;
            float f31 = jVar.k;
            float f32 = f29 / (f30 - f31);
            float f33 = g.k1;
            float f34 = (f31 * f32) - f33;
            RectF rectF = this.H0;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY() + AndroidUtilities.dp(16.0f);
            int i21 = 0;
            while (true) {
                arrayList = this.d;
                if (i21 >= arrayList.size()) {
                    break;
                }
                ((lg.i) arrayList.get(i21)).f.reset();
                ((lg.i) arrayList.get(i21)).g.reset();
                i21++;
            }
            canvas.save();
            boolean[] zArr = this.G1;
            if (zArr == null || zArr.length < ((kg.e) this.h0).d.size()) {
                this.G1 = new boolean[((kg.e) this.h0).d.size()];
                this.H1 = new float[((kg.e) this.h0).d.size()];
            }
            int i22 = this.y0;
            if (i22 == 2) {
                f11 = this.z0.f / 0.6f;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                Path path = this.F1;
                path.reset();
                float width = rectF.width() > rectF.height() ? rectF.width() : rectF.height();
                float height = (rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f;
                f10 = 0.0f;
                float z11 = e2.z(1.0f, this.z0.f, (width - height) / 2.0f, height);
                RectF rectF2 = new RectF();
                f7 = 1.0f;
                rectF2.set(centerX - z11, centerY - z11, centerX + z11, centerY + z11);
                path.addRoundRect(rectF2, z11, z11, Path.Direction.CW);
                canvas.clipPath(path);
                i10 = 255;
            } else {
                f7 = 1.0f;
                f10 = 0.0f;
                i10 = i22 == 3 ? (int) (this.z0.f * 255.0f) : 255;
                f11 = 0.0f;
            }
            float[] fArr = ((kg.e) this.h0).b;
            int i23 = ((int) (f33 / (fArr.length < 2 ? 1.0f : fArr[1] * f32))) + 1;
            int max = Math.max(0, (this.F - i23) - 1);
            int min = Math.min(((kg.e) this.h0).b.length - 1, this.G + i23 + 1);
            int i24 = max;
            float f35 = 0.0f;
            boolean z12 = false;
            float f36 = 0.0f;
            while (true) {
                i11 = g.n1;
                if (i24 > min) {
                    break;
                }
                float f37 = f32;
                float f38 = f34;
                float f39 = f11;
                boolean z13 = z12;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                float f40 = 0.0f;
                while (i27 < arrayList.size()) {
                    lg.f fVar = (lg.f) arrayList.get(i27);
                    int i28 = i27;
                    if (fVar.n || fVar.o != f10) {
                        i20 = i10;
                        long j3 = fVar.a.a[i24];
                        if (j3 > 0) {
                            f40 = (j3 * fVar.o) + f40;
                            i25++;
                        }
                        i26 = i28;
                    } else {
                        i20 = i10;
                    }
                    i27 = i28 + 1;
                    i10 = i20;
                }
                int i29 = i10;
                float f41 = 0.0f;
                int i30 = 0;
                while (i30 < arrayList.size()) {
                    lg.f fVar2 = (lg.f) arrayList.get(i30);
                    float f42 = f35;
                    boolean z14 = fVar2.n;
                    Path path2 = fVar2.f;
                    if (z14) {
                        f12 = f41;
                    } else {
                        f12 = f41;
                        if (fVar2.o == f10) {
                            i14 = i25;
                            i18 = min;
                            arrayList2 = arrayList;
                            i15 = max;
                            i16 = i11;
                            f41 = f12;
                            i17 = i26;
                            f35 = f42;
                            i30++;
                            min = i18;
                            i26 = i17;
                            max = i15;
                            i25 = i14;
                            i11 = i16;
                            arrayList = arrayList2;
                            f10 = 0.0f;
                        }
                    }
                    long[] jArr = fVar2.a.a;
                    if (i25 == 1) {
                        if (jArr[i24] != 0) {
                            f13 = fVar2.o;
                            i12 = i25;
                            float[] fArr2 = ((kg.e) this.h0).b;
                            f14 = (fArr2[i24] * f37) - f38;
                            float measuredWidth = i24 != min ? getMeasuredWidth() : (fArr2[i24 + 1] * f37) - f38;
                            if (f13 == f10 && i30 == i26) {
                                z13 = true;
                            }
                            float measuredHeight2 = ((getMeasuredHeight() - this.s) - i11) * f13;
                            measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight2) - f12;
                            this.H1[i30] = measuredHeight;
                            float measuredHeight3 = getMeasuredHeight() - this.s;
                            if (i24 != min) {
                                f15 = measuredHeight3;
                                f42 = f14;
                            } else {
                                f15 = measuredHeight3;
                                if (i24 == max) {
                                    f36 = f14;
                                }
                            }
                            i13 = this.y0;
                            float f43 = measuredWidth;
                            float[] fArr3 = this.E1;
                            i14 = i12;
                            Matrix matrix = this.D1;
                            if (i13 == 2 || i30 == i26) {
                                arrayList2 = arrayList;
                                f16 = measuredHeight;
                                f17 = f15;
                                f18 = f14;
                                f19 = 0.0f;
                            } else {
                                int i31 = (f14 > centerX ? 1 : (f14 == centerX ? 0 : -1));
                                if (i31 < 0) {
                                    lg.j jVar2 = this.z0;
                                    i19 = i31;
                                    f27 = jVar2.g[i30];
                                    f26 = jVar2.h[i30];
                                } else {
                                    i19 = i31;
                                    lg.j jVar3 = this.z0;
                                    float f44 = jVar3.i[i30];
                                    f26 = jVar3.j[i30];
                                    f27 = f44;
                                }
                                float f45 = centerX - f27;
                                float f46 = centerY - f26;
                                float f47 = (((f14 - f27) * f46) / f45) + f26;
                                float f48 = f7 - f39;
                                float f49 = measuredHeight * f48;
                                float f50 = f47 * f39;
                                float f51 = f49 + f50;
                                float f52 = (f15 * f48) + f50;
                                float f53 = f46 / f45;
                                if (f53 > f10) {
                                    f28 = f48;
                                    arrayList2 = arrayList;
                                    degrees2 = Math.toDegrees(-Math.atan(f53));
                                } else {
                                    f28 = f48;
                                    arrayList2 = arrayList;
                                    degrees2 = Math.toDegrees(Math.atan(Math.abs(f53)));
                                }
                                float f54 = ((float) degrees2) - 90.0f;
                                if (f14 >= centerX) {
                                    fArr3[0] = f14;
                                    fArr3[1] = f51;
                                    matrix.reset();
                                    matrix.postRotate(this.z0.f * f54, centerX, centerY);
                                    matrix.mapPoints(fArr3);
                                    float f55 = fArr3[0];
                                    f16 = fArr3[1];
                                    if (f55 < centerX) {
                                        f55 = centerX;
                                    }
                                    fArr3[0] = f14;
                                    fArr3[1] = f52;
                                    matrix.reset();
                                    f19 = f54;
                                    matrix.postRotate(this.z0.f * f19, centerX, centerY);
                                    matrix.mapPoints(fArr3);
                                    f17 = fArr3[1];
                                    f20 = f36;
                                    f21 = f55;
                                    f18 = i19 < 0 ? centerX : f14;
                                } else {
                                    f19 = f54;
                                    if (f43 >= centerX) {
                                        f18 = (f14 * f28) + (centerX * f39);
                                        f17 = (centerY * f39) + (f51 * f28);
                                        f16 = f17;
                                    } else {
                                        fArr3[0] = f14;
                                        fArr3[1] = f51;
                                        matrix.reset();
                                        lg.j jVar4 = this.z0;
                                        float f56 = jVar4.f;
                                        matrix.postRotate((f56 * jVar4.k[i30]) + (f56 * f19), centerX, centerY);
                                        matrix.mapPoints(fArr3);
                                        float f57 = fArr3[0];
                                        f16 = fArr3[1];
                                        if (f43 >= centerX) {
                                            float f58 = this.z0.f;
                                            fArr3[0] = (f58 * centerX) + ((f7 - f58) * f14);
                                        } else {
                                            fArr3[0] = f14;
                                        }
                                        fArr3[1] = f52;
                                        matrix.reset();
                                        lg.j jVar5 = this.z0;
                                        float f59 = jVar5.f;
                                        matrix.postRotate((f59 * jVar5.k[i30]) + (f59 * f19), centerX, centerY);
                                        matrix.mapPoints(fArr3);
                                        f18 = fArr3[0];
                                        f17 = fArr3[1];
                                        f20 = f36;
                                        f21 = f57;
                                    }
                                }
                                i15 = max;
                                if (i24 == max) {
                                    float measuredHeight4 = getMeasuredHeight();
                                    i16 = i11;
                                    if (this.y0 != 2 || i30 == i26) {
                                        z10 = false;
                                        f24 = measuredHeight4;
                                        f25 = 0.0f;
                                    } else {
                                        fArr3[0] = f10 - centerX;
                                        fArr3[1] = measuredHeight4;
                                        matrix.reset();
                                        lg.j jVar6 = this.z0;
                                        float f60 = jVar6.f;
                                        matrix.postRotate((f60 * jVar6.k[i30]) + (f19 * f60), centerX, centerY);
                                        matrix.mapPoints(fArr3);
                                        z10 = false;
                                        f25 = fArr3[0];
                                        f24 = fArr3[1];
                                    }
                                    path2.moveTo(f25, f24);
                                    this.G1[i30] = z10;
                                } else {
                                    i16 = i11;
                                }
                                lg.j jVar7 = this.z0;
                                f22 = jVar7 == null ? 0.0f : jVar7.f;
                                if (f13 == f10 || i24 <= 0 || jArr[i24 - 1] != 0 || i24 >= min || jArr[i24 + 1] != 0) {
                                    f23 = f22;
                                } else {
                                    f23 = f22;
                                    if (this.y0 != 2) {
                                        if (!this.G1[i30]) {
                                            if (i30 == i26) {
                                                path2.lineTo(f18, (f7 - f23) * f17);
                                            } else {
                                                path2.lineTo(f18, f17);
                                            }
                                        }
                                        this.G1[i30] = true;
                                        c10 = 0;
                                        if (i24 == min) {
                                            float measuredWidth2 = getMeasuredWidth();
                                            float measuredHeight5 = getMeasuredHeight();
                                            if (this.y0 != 2 || i30 == i26) {
                                                path2.lineTo(measuredWidth2, measuredHeight5);
                                            } else {
                                                fArr3[c10] = measuredWidth2 + centerX;
                                                fArr3[1] = measuredHeight5;
                                                matrix.reset();
                                                lg.j jVar8 = this.z0;
                                                matrix.postRotate(jVar8.f * jVar8.k[i30], centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                float f61 = fArr3[c10];
                                                float f62 = fArr3[1];
                                            }
                                            if (this.y0 != 2) {
                                                i17 = i26;
                                                i18 = min;
                                                f41 = f12 + measuredHeight2;
                                                f36 = f20;
                                            } else if (i30 != i26) {
                                                lg.j jVar9 = this.z0;
                                                float f63 = (centerY - jVar9.h[i30]) / (centerX - jVar9.g[i30]);
                                                if (f63 > f10) {
                                                    i17 = i26;
                                                    i18 = min;
                                                    degrees = Math.toDegrees(-Math.atan(f63));
                                                } else {
                                                    i17 = i26;
                                                    i18 = min;
                                                    degrees = Math.toDegrees(Math.atan(Math.abs(f63)));
                                                }
                                                lg.j jVar10 = this.z0;
                                                float f64 = jVar10.g[i30];
                                                float f65 = jVar10.h[i30];
                                                fArr3[0] = f64;
                                                fArr3[1] = f65;
                                                matrix.reset();
                                                lg.j jVar11 = this.z0;
                                                float f66 = jVar11.f;
                                                matrix.postRotate((f66 * jVar11.k[i30]) + ((((float) degrees) - 90.0f) * f66), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                float f67 = fArr3[0];
                                                float f68 = fArr3[1];
                                                if (Math.abs(f21 - f67) >= 0.001d || ((f68 >= centerY || f16 >= centerY) && (f68 <= centerY || f16 <= centerY))) {
                                                    M = M(f21, f16);
                                                    M2 = M(f67, f68);
                                                } else {
                                                    M2 = this.z0.k[i30] == -180.0f ? 0 : 3;
                                                    M = 0;
                                                }
                                                while (M <= M2) {
                                                    if (M == 0) {
                                                        path2.lineTo(getMeasuredWidth(), 0.0f);
                                                    } else if (M == 1) {
                                                        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
                                                    } else {
                                                        if (M == 2) {
                                                            path2.lineTo(0.0f, getMeasuredHeight());
                                                        } else {
                                                            path2.lineTo(0.0f, 0.0f);
                                                        }
                                                        M++;
                                                    }
                                                    M++;
                                                }
                                                f41 = f12 + measuredHeight2;
                                                f36 = f20;
                                            }
                                        }
                                        i17 = i26;
                                        i18 = min;
                                        f41 = f12 + measuredHeight2;
                                        f36 = f20;
                                    }
                                }
                                if (this.G1[i30]) {
                                    if (i30 == i26) {
                                        path2.lineTo(f18, (f7 - f23) * f17);
                                    } else {
                                        path2.lineTo(f18, f17);
                                    }
                                }
                                if (i30 == i26) {
                                    path2.lineTo(f21, (f7 - f23) * f16);
                                } else {
                                    path2.lineTo(f21, f16);
                                }
                                c10 = 0;
                                this.G1[i30] = false;
                                if (i24 == min) {
                                }
                                i17 = i26;
                                i18 = min;
                                f41 = f12 + measuredHeight2;
                                f36 = f20;
                            }
                            f20 = f36;
                            f21 = f18;
                            i15 = max;
                            if (i24 == max) {
                            }
                            lg.j jVar72 = this.z0;
                            if (jVar72 == null) {
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
                            if (i24 == min) {
                            }
                            i17 = i26;
                            i18 = min;
                            f41 = f12 + measuredHeight2;
                            f36 = f20;
                        }
                        i12 = i25;
                        f13 = 0.0f;
                        float[] fArr22 = ((kg.e) this.h0).b;
                        f14 = (fArr22[i24] * f37) - f38;
                        if (i24 != min) {
                        }
                        if (f13 == f10) {
                            z13 = true;
                        }
                        float measuredHeight22 = ((getMeasuredHeight() - this.s) - i11) * f13;
                        measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight22) - f12;
                        this.H1[i30] = measuredHeight;
                        float measuredHeight32 = getMeasuredHeight() - this.s;
                        if (i24 != min) {
                        }
                        i13 = this.y0;
                        float f432 = measuredWidth;
                        float[] fArr32 = this.E1;
                        i14 = i12;
                        Matrix matrix2 = this.D1;
                        if (i13 == 2) {
                        }
                        arrayList2 = arrayList;
                        f16 = measuredHeight;
                        f17 = f15;
                        f18 = f14;
                        f19 = 0.0f;
                        f20 = f36;
                        f21 = f18;
                        i15 = max;
                        if (i24 == max) {
                        }
                        lg.j jVar722 = this.z0;
                        if (jVar722 == null) {
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
                        if (i24 == min) {
                        }
                        i17 = i26;
                        i18 = min;
                        f41 = f12 + measuredHeight22;
                        f36 = f20;
                    } else {
                        if (f40 != f10) {
                            i12 = i25;
                            f13 = (jArr[i24] * fVar2.o) / f40;
                            float[] fArr222 = ((kg.e) this.h0).b;
                            f14 = (fArr222[i24] * f37) - f38;
                            if (i24 != min) {
                            }
                            if (f13 == f10) {
                            }
                            float measuredHeight222 = ((getMeasuredHeight() - this.s) - i11) * f13;
                            measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight222) - f12;
                            this.H1[i30] = measuredHeight;
                            float measuredHeight322 = getMeasuredHeight() - this.s;
                            if (i24 != min) {
                            }
                            i13 = this.y0;
                            float f4322 = measuredWidth;
                            float[] fArr322 = this.E1;
                            i14 = i12;
                            Matrix matrix22 = this.D1;
                            if (i13 == 2) {
                            }
                            arrayList2 = arrayList;
                            f16 = measuredHeight;
                            f17 = f15;
                            f18 = f14;
                            f19 = 0.0f;
                            f20 = f36;
                            f21 = f18;
                            i15 = max;
                            if (i24 == max) {
                            }
                            lg.j jVar7222 = this.z0;
                            if (jVar7222 == null) {
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
                            if (i24 == min) {
                            }
                            i17 = i26;
                            i18 = min;
                            f41 = f12 + measuredHeight222;
                            f36 = f20;
                        }
                        i12 = i25;
                        f13 = 0.0f;
                        float[] fArr2222 = ((kg.e) this.h0).b;
                        f14 = (fArr2222[i24] * f37) - f38;
                        if (i24 != min) {
                        }
                        if (f13 == f10) {
                        }
                        float measuredHeight2222 = ((getMeasuredHeight() - this.s) - i11) * f13;
                        measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight2222) - f12;
                        this.H1[i30] = measuredHeight;
                        float measuredHeight3222 = getMeasuredHeight() - this.s;
                        if (i24 != min) {
                        }
                        i13 = this.y0;
                        float f43222 = measuredWidth;
                        float[] fArr3222 = this.E1;
                        i14 = i12;
                        Matrix matrix222 = this.D1;
                        if (i13 == 2) {
                        }
                        arrayList2 = arrayList;
                        f16 = measuredHeight;
                        f17 = f15;
                        f18 = f14;
                        f19 = 0.0f;
                        f20 = f36;
                        f21 = f18;
                        i15 = max;
                        if (i24 == max) {
                        }
                        lg.j jVar72222 = this.z0;
                        if (jVar72222 == null) {
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
                        if (i24 == min) {
                        }
                        i17 = i26;
                        i18 = min;
                        f41 = f12 + measuredHeight2222;
                        f36 = f20;
                    }
                    f35 = f42;
                    i30++;
                    min = i18;
                    i26 = i17;
                    max = i15;
                    i25 = i14;
                    i11 = i16;
                    arrayList = arrayList2;
                    f10 = 0.0f;
                }
                i24++;
                min = min;
                f32 = f37;
                f34 = f38;
                f11 = f39;
                z12 = z13;
                i10 = i29;
                f10 = 0.0f;
            }
            int i32 = i10;
            ArrayList arrayList3 = arrayList;
            boolean z15 = z12;
            canvas.save();
            canvas.clipRect(f36, i11, f35, getMeasuredHeight() - this.s);
            if (z15) {
                canvas.drawColor(j6.w0(null, j6.rj, false));
            }
            for (int size = arrayList3.size() - 1; size >= 0; size--) {
                lg.f fVar3 = (lg.f) arrayList3.get(size);
                Paint paint = fVar3.c;
                paint.setAlpha(i32);
                canvas.drawPath(fVar3.f, paint);
                paint.setAlpha(255);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f  */
    @Override // jg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(Canvas canvas) {
        int i10;
        boolean z10;
        float f7;
        boolean z11;
        kg.b bVar;
        if (this.h0 != null) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((lg.i) arrayList.get(i11)).g.reset();
            }
            kg.b bVar2 = this.h0;
            int i12 = ((kg.e) bVar2).n;
            boolean[] zArr = this.G1;
            if (zArr == null || zArr.length < ((kg.e) bVar2).d.size()) {
                this.G1 = new boolean[((kg.e) this.h0).d.size()];
            }
            boolean z12 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                float f10 = 0.0f;
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    lg.f fVar = (lg.f) arrayList.get(i16);
                    if (fVar.n || fVar.o != 0.0f) {
                        if (((kg.e) this.h0).m[i16][i13] > 0) {
                            f10 += ((kg.e) r12).m[i16][i13] * fVar.o;
                            i14++;
                        }
                        i15 = i16;
                    }
                }
                int i17 = i12 - 1;
                float f11 = (i13 / i17) * this.C0;
                int i18 = 0;
                float f12 = 0.0f;
                while (i18 < arrayList.size()) {
                    lg.f fVar2 = (lg.f) arrayList.get(i18);
                    boolean z13 = fVar2.n;
                    Path path = fVar2.g;
                    if (!z13 && fVar2.o == 0.0f) {
                        i10 = i12;
                    } else if (i14 == 1) {
                        if (((kg.e) this.h0).m[i18][i13] != 0) {
                            f7 = fVar2.o;
                            i10 = i12;
                            z10 = z12;
                            boolean z14 = (f7 == 0.0f || i18 != i15) ? z10 : true;
                            int i19 = this.B0;
                            float f13 = f7 * i19;
                            float f14 = (i19 - f13) - f12;
                            if (i13 != 0) {
                                z11 = z14;
                                path.moveTo(0.0f, i19);
                                this.G1[i18] = false;
                            } else {
                                z11 = z14;
                            }
                            bVar = this.h0;
                            if (((kg.e) bVar).m[i18][i13] == 0 || i13 <= 0 || ((kg.e) bVar).m[i18][i13 - 1] != 0 || i13 >= i17 || ((kg.e) bVar).m[i18][i13 + 1] != 0) {
                                if (this.G1[i18]) {
                                    path.lineTo(f11, i19);
                                }
                                path.lineTo(f11, f14);
                                this.G1[i18] = false;
                            } else {
                                if (!this.G1[i18]) {
                                    path.lineTo(f11, i19);
                                }
                                this.G1[i18] = true;
                            }
                            if (i13 == i17) {
                                path.lineTo(this.C0, i19);
                            }
                            f12 += f13;
                            z12 = z11;
                        }
                        i10 = i12;
                        z10 = z12;
                        f7 = 0.0f;
                        if (f7 == 0.0f) {
                        }
                        int i192 = this.B0;
                        float f132 = f7 * i192;
                        float f142 = (i192 - f132) - f12;
                        if (i13 != 0) {
                        }
                        bVar = this.h0;
                        if (((kg.e) bVar).m[i18][i13] == 0) {
                        }
                        if (this.G1[i18]) {
                        }
                        path.lineTo(f11, f142);
                        this.G1[i18] = false;
                        if (i13 == i17) {
                        }
                        f12 += f132;
                        z12 = z11;
                    } else {
                        if (f10 != 0.0f) {
                            i10 = i12;
                            z10 = z12;
                            f7 = (((kg.e) this.h0).m[i18][i13] * fVar2.o) / f10;
                            if (f7 == 0.0f) {
                            }
                            int i1922 = this.B0;
                            float f1322 = f7 * i1922;
                            float f1422 = (i1922 - f1322) - f12;
                            if (i13 != 0) {
                            }
                            bVar = this.h0;
                            if (((kg.e) bVar).m[i18][i13] == 0) {
                            }
                            if (this.G1[i18]) {
                            }
                            path.lineTo(f11, f1422);
                            this.G1[i18] = false;
                            if (i13 == i17) {
                            }
                            f12 += f1322;
                            z12 = z11;
                        }
                        i10 = i12;
                        z10 = z12;
                        f7 = 0.0f;
                        if (f7 == 0.0f) {
                        }
                        int i19222 = this.B0;
                        float f13222 = f7 * i19222;
                        float f14222 = (i19222 - f13222) - f12;
                        if (i13 != 0) {
                        }
                        bVar = this.h0;
                        if (((kg.e) bVar).m[i18][i13] == 0) {
                        }
                        if (this.G1[i18]) {
                        }
                        path.lineTo(f11, f14222);
                        this.G1[i18] = false;
                        if (i13 == i17) {
                        }
                        f12 += f13222;
                        z12 = z11;
                    }
                    i18++;
                    i12 = i10;
                }
            }
            if (z12) {
                canvas.drawColor(j6.w0(null, j6.rj, false));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                lg.f fVar3 = (lg.f) arrayList.get(size2);
                canvas.drawPath(fVar3.g, fVar3.c);
            }
        }
    }

    @Override // jg.g, android.view.View
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
            l(canvas, (lg.d) arrayList.get(i11));
            p(canvas, (lg.d) arrayList.get(this.n0));
            i10 = this.n0 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0148  */
    @Override // jg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(lg.j jVar) {
        ArrayList arrayList;
        int i10;
        float f7;
        kg.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        float f10 = this.F0;
        j jVar2 = this.g0;
        float f11 = jVar2.l;
        float f12 = jVar2.k;
        float f13 = f10 / (f11 - f12);
        float f14 = g.k1;
        float f15 = (f12 * f13) - f14;
        int i11 = 2;
        int i12 = 1;
        int i13 = ((int) (f14 / (((kg.e) bVar).b.length < 2 ? 1.0f : ((kg.e) bVar).b[1] * f13))) + 1;
        int max = Math.max(0, (this.F - i13) - 1);
        int min = Math.min(((kg.e) this.h0).b.length - 1, this.G + i13 + 1);
        this.z0.g = new float[((kg.e) this.h0).d.size()];
        this.z0.h = new float[((kg.e) this.h0).d.size()];
        this.z0.i = new float[((kg.e) this.h0).d.size()];
        this.z0.j = new float[((kg.e) this.h0).d.size()];
        this.z0.k = new float[((kg.e) this.h0).d.size()];
        int i14 = 0;
        while (i14 < i11) {
            int i15 = i14 == i12 ? min : max;
            int i16 = 0;
            float f16 = 0.0f;
            int i17 = 0;
            while (true) {
                arrayList = this.d;
                if (i16 >= arrayList.size()) {
                    break;
                }
                lg.f fVar = (lg.f) arrayList.get(i16);
                if (fVar.n || fVar.o != 0.0f) {
                    long j3 = fVar.a.a[i15];
                    if (j3 > 0) {
                        f16 += j3 * fVar.o;
                        i17++;
                    }
                }
                i16++;
            }
            int i18 = 0;
            int i19 = 0;
            while (i18 < arrayList.size()) {
                lg.f fVar2 = (lg.f) arrayList.get(i18);
                if (fVar2.n || fVar2.o != 0.0f) {
                    long[] jArr = fVar2.a.a;
                    if (i17 == i12) {
                        if (jArr[i15] != 0) {
                            f7 = fVar2.o;
                            i10 = i14;
                            float f17 = (((kg.e) this.h0).b[i15] * f13) - f15;
                            float measuredHeight = f7 * ((getMeasuredHeight() - this.s) - g.n1);
                            float f18 = i19;
                            float measuredHeight2 = ((getMeasuredHeight() - this.s) - measuredHeight) - f18;
                            i19 = (int) (f18 + measuredHeight);
                            if (i10 != 0) {
                                lg.j jVar3 = this.z0;
                                jVar3.g[i18] = f17;
                                jVar3.h[i18] = measuredHeight2;
                            } else {
                                lg.j jVar4 = this.z0;
                                jVar4.i[i18] = f17;
                                jVar4.j[i18] = measuredHeight2;
                            }
                        }
                        i10 = i14;
                        f7 = 0.0f;
                        float f172 = (((kg.e) this.h0).b[i15] * f13) - f15;
                        float measuredHeight3 = f7 * ((getMeasuredHeight() - this.s) - g.n1);
                        float f182 = i19;
                        float measuredHeight22 = ((getMeasuredHeight() - this.s) - measuredHeight3) - f182;
                        i19 = (int) (f182 + measuredHeight3);
                        if (i10 != 0) {
                        }
                    } else {
                        if (f16 != 0.0f) {
                            i10 = i14;
                            f7 = (jArr[i15] * fVar2.o) / f16;
                            float f1722 = (((kg.e) this.h0).b[i15] * f13) - f15;
                            float measuredHeight32 = f7 * ((getMeasuredHeight() - this.s) - g.n1);
                            float f1822 = i19;
                            float measuredHeight222 = ((getMeasuredHeight() - this.s) - measuredHeight32) - f1822;
                            i19 = (int) (f1822 + measuredHeight32);
                            if (i10 != 0) {
                            }
                        }
                        i10 = i14;
                        f7 = 0.0f;
                        float f17222 = (((kg.e) this.h0).b[i15] * f13) - f15;
                        float measuredHeight322 = f7 * ((getMeasuredHeight() - this.s) - g.n1);
                        float f18222 = i19;
                        float measuredHeight2222 = ((getMeasuredHeight() - this.s) - measuredHeight322) - f18222;
                        i19 = (int) (f18222 + measuredHeight322);
                        if (i10 != 0) {
                        }
                    }
                } else {
                    i10 = i14;
                }
                i18++;
                i14 = i10;
                i12 = 1;
            }
            i14++;
            i11 = 2;
            i12 = 1;
        }
    }

    @Override // jg.g
    public final long r(int i10, int i11) {
        return 100L;
    }
}
