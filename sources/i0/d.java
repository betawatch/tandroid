package i0;

import android.graphics.Path;
import android.util.Log;
import org.telegram.messenger.voip.VoIPService;
import v7.c8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d {
    public char a;
    public final float[] b;

    public d(char c10, float[] fArr) {
        this.a = c10;
        this.b = fArr;
    }

    public static void a(Path path, float f7, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
        double d;
        double d10;
        double radians = Math.toRadians(f15);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d11 = f7;
        double d12 = f10;
        double d13 = f13;
        double d14 = ((d12 * sin) + (d11 * cos)) / d13;
        double d15 = f14;
        double d16 = ((d12 * cos) + ((-f7) * sin)) / d15;
        double d17 = f12;
        double d18 = ((d17 * sin) + (f11 * cos)) / d13;
        double d19 = ((d17 * cos) + ((-f11) * sin)) / d15;
        double d20 = d14 - d18;
        double d21 = d16 - d19;
        double d22 = (d14 + d18) / 2.0d;
        double d23 = (d16 + d19) / 2.0d;
        double d24 = (d21 * d21) + (d20 * d20);
        if (d24 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d25 = (1.0d / d24) - 0.25d;
        if (d25 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d24);
            float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
            a(path, f7, f10, f11, f12, f13 * sqrt, sqrt * f14, f15, z10, z11);
            return;
        }
        double sqrt2 = Math.sqrt(d25);
        double d26 = sqrt2 * d20;
        double d27 = sqrt2 * d21;
        if (z10 == z11) {
            d = d22 - d27;
            d10 = d23 + d26;
        } else {
            d = d22 + d27;
            d10 = d23 - d26;
        }
        double atan2 = Math.atan2(d16 - d10, d14 - d);
        double atan22 = Math.atan2(d19 - d10, d18 - d) - atan2;
        if (z11 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d28 = d * d13;
        double d29 = d10 * d15;
        double d30 = (d28 * cos) - (d29 * sin);
        double d31 = (d29 * cos) + (d28 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d32 = -d13;
        double d33 = d32 * cos2;
        double d34 = d15 * sin2;
        double d35 = (d33 * sin3) - (d34 * cos3);
        double d36 = d32 * sin2;
        double d37 = d15 * cos2;
        double d38 = atan22 / ceil;
        double d39 = (cos3 * d37) + (sin3 * d36);
        double d40 = d11;
        double d41 = d12;
        int i10 = 0;
        double d42 = atan2;
        while (i10 < ceil) {
            double d43 = d42 + d38;
            double sin4 = Math.sin(d43);
            double cos4 = Math.cos(d43);
            int i11 = ceil;
            double d44 = (((d13 * cos2) * cos4) + d30) - (d34 * sin4);
            double d45 = (d37 * sin4) + (d13 * sin2 * cos4) + d31;
            double d46 = (d33 * sin4) - (d34 * cos4);
            double d47 = (cos4 * d37) + (sin4 * d36);
            double d48 = d43 - d42;
            double tan = Math.tan(d48 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d48)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d35 * sqrt3) + d40), (float) ((d39 * sqrt3) + d41), (float) (d44 - (sqrt3 * d46)), (float) (d45 - (sqrt3 * d47)), (float) d44, (float) d45);
            i10++;
            d41 = d45;
            cos2 = cos2;
            d36 = d36;
            d42 = d43;
            d39 = d47;
            d40 = d44;
            ceil = i11;
            d35 = d46;
            d38 = d38;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(d[] dVarArr, Path path) {
        int i10;
        float[] fArr;
        int i11;
        d dVar;
        int i12;
        char c10;
        float f7;
        float f10;
        d dVar2;
        boolean z10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        d[] dVarArr2 = dVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = dVarArr2.length;
        int i13 = 0;
        int i14 = 0;
        char c11 = 'm';
        while (i14 < length) {
            d dVar3 = dVarArr2[i14];
            char c12 = dVar3.a;
            float[] fArr3 = dVar3.b;
            float f19 = fArr2[i13];
            float f20 = fArr2[1];
            float f21 = fArr2[2];
            float f22 = fArr2[3];
            float f23 = fArr2[4];
            int i15 = i13;
            float f24 = fArr2[5];
            switch (c12) {
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                case 'a':
                    i10 = 7;
                    break;
                case 'C':
                case 'c':
                    i10 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i10 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i10 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f23, f24);
                    f19 = f23;
                    f21 = f19;
                    f20 = f24;
                    f22 = f20;
                default:
                    i10 = 2;
                    break;
            }
            float f25 = f23;
            float f26 = f24;
            float f27 = f19;
            float f28 = f20;
            int i16 = i15;
            while (i16 < fArr3.length) {
                if (c12 == 'A') {
                    fArr = fArr3;
                    i11 = i16;
                    dVar = dVar3;
                    float f29 = f27;
                    float f30 = f28;
                    i12 = i14;
                    c10 = c12;
                    int i17 = i11 + 5;
                    int i18 = i11 + 6;
                    a(path, f29, f30, fArr[i17], fArr[i18], fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3] != 0.0f ? 1 : i15, fArr[i11 + 4] != 0.0f ? 1 : i15);
                    f21 = fArr[i17];
                    f7 = fArr[i18];
                    f22 = f7;
                    f10 = f21;
                } else if (c12 == 'C') {
                    fArr = fArr3;
                    i11 = i16;
                    i12 = i14;
                    dVar = dVar3;
                    c10 = c12;
                    int i19 = i11 + 2;
                    int i20 = i11 + 3;
                    int i21 = i11 + 4;
                    int i22 = i11 + 5;
                    path2.cubicTo(fArr[i11], fArr[i11 + 1], fArr[i19], fArr[i20], fArr[i21], fArr[i22]);
                    float f31 = fArr[i21];
                    float f32 = fArr[i22];
                    f21 = fArr[i19];
                    f22 = fArr[i20];
                    f7 = f32;
                    f10 = f31;
                } else if (c12 == 'H') {
                    fArr = fArr3;
                    i11 = i16;
                    dVar = dVar3;
                    c10 = c12;
                    f7 = f28;
                    i12 = i14;
                    path2.lineTo(fArr[i11], f7);
                    f10 = fArr[i11];
                } else if (c12 == 'Q') {
                    fArr = fArr3;
                    i11 = i16;
                    i12 = i14;
                    dVar = dVar3;
                    c10 = c12;
                    int i23 = i11 + 1;
                    int i24 = i11 + 2;
                    int i25 = i11 + 3;
                    path2.quadTo(fArr[i11], fArr[i23], fArr[i24], fArr[i25]);
                    float f33 = fArr[i11];
                    float f34 = fArr[i23];
                    float f35 = fArr[i24];
                    float f36 = fArr[i25];
                    f21 = f33;
                    f22 = f34;
                    f10 = f35;
                    f7 = f36;
                } else if (c12 == 'V') {
                    fArr = fArr3;
                    i11 = i16;
                    i12 = i14;
                    dVar = dVar3;
                    f10 = f27;
                    c10 = c12;
                    path2.lineTo(f10, fArr[i11]);
                    f7 = fArr[i11];
                } else if (c12 != 'a') {
                    if (c12 == 'c') {
                        fArr = fArr3;
                        i11 = i16;
                        int i26 = i11 + 2;
                        int i27 = i11 + 3;
                        int i28 = i11 + 4;
                        int i29 = i11 + 5;
                        path2.rCubicTo(fArr[i11], fArr[i11 + 1], fArr[i26], fArr[i27], fArr[i28], fArr[i29]);
                        float f37 = fArr[i26] + f27;
                        float f38 = fArr[i27] + f28;
                        f27 += fArr[i28];
                        f28 += fArr[i29];
                        f21 = f37;
                        f22 = f38;
                    } else if (c12 != 'h') {
                        if (c12 != 'q') {
                            if (c12 != 'v') {
                                if (c12 == 'L') {
                                    fArr = fArr3;
                                    i11 = i16;
                                    int i30 = i11 + 1;
                                    path2.lineTo(fArr[i11], fArr[i30]);
                                    f10 = fArr[i11];
                                    f7 = fArr[i30];
                                } else if (c12 == 'M') {
                                    fArr = fArr3;
                                    i11 = i16;
                                    f10 = fArr[i11];
                                    f7 = fArr[i11 + 1];
                                    if (i11 > 0) {
                                        path2.lineTo(f10, f7);
                                    } else {
                                        path2.moveTo(f10, f7);
                                        f25 = f10;
                                        f26 = f7;
                                    }
                                } else if (c12 != 'S') {
                                    if (c12 == 'T') {
                                        fArr = fArr3;
                                        i11 = i16;
                                        if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                            f27 = (f27 * 2.0f) - f21;
                                            f28 = (f28 * 2.0f) - f22;
                                        }
                                        int i31 = i11 + 1;
                                        path2.quadTo(f27, f28, fArr[i11], fArr[i31]);
                                        f10 = fArr[i11];
                                        f7 = fArr[i31];
                                        dVar = dVar3;
                                        f21 = f27;
                                        f22 = f28;
                                    } else if (c12 == 'l') {
                                        fArr = fArr3;
                                        i11 = i16;
                                        int i32 = i11 + 1;
                                        path2.rLineTo(fArr[i11], fArr[i32]);
                                        f27 += fArr[i11];
                                        f14 = fArr[i32];
                                    } else if (c12 == 'm') {
                                        fArr = fArr3;
                                        i11 = i16;
                                        float f39 = fArr[i11];
                                        f27 += f39;
                                        float f40 = fArr[i11 + 1];
                                        f28 += f40;
                                        if (i11 > 0) {
                                            path2.rLineTo(f39, f40);
                                        } else {
                                            path2.rMoveTo(f39, f40);
                                            dVar = dVar3;
                                            f10 = f27;
                                            f25 = f10;
                                            f7 = f28;
                                            f26 = f7;
                                        }
                                    } else if (c12 != 's') {
                                        if (c12 != 't') {
                                            fArr = fArr3;
                                            i11 = i16;
                                            dVar = dVar3;
                                            f10 = f27;
                                        } else {
                                            if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                f17 = f27 - f21;
                                                f18 = f28 - f22;
                                            } else {
                                                f18 = 0.0f;
                                                f17 = 0.0f;
                                            }
                                            int i33 = i16 + 1;
                                            path2.rQuadTo(f17, f18, fArr3[i16], fArr3[i33]);
                                            float f41 = f17 + f27;
                                            float f42 = f18 + f28;
                                            float f43 = f27 + fArr3[i16];
                                            f28 += fArr3[i33];
                                            f22 = f42;
                                            fArr = fArr3;
                                            i11 = i16;
                                            dVar = dVar3;
                                            f10 = f43;
                                            f21 = f41;
                                        }
                                        f7 = f28;
                                    } else {
                                        if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                            f15 = f28 - f22;
                                            f16 = f27 - f21;
                                        } else {
                                            f16 = 0.0f;
                                            f15 = 0.0f;
                                        }
                                        int i34 = i16;
                                        int i35 = i34 + 1;
                                        int i36 = i34 + 2;
                                        int i37 = i34 + 3;
                                        fArr = fArr3;
                                        i11 = i34;
                                        path2.rCubicTo(f16, f15, fArr3[i34], fArr3[i35], fArr3[i36], fArr3[i37]);
                                        f11 = fArr[i11] + f27;
                                        f12 = fArr[i35] + f28;
                                        f27 += fArr[i36];
                                        f13 = fArr[i37];
                                    }
                                    i12 = i14;
                                    c10 = c12;
                                } else {
                                    fArr = fArr3;
                                    i11 = i16;
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        f27 = (f27 * 2.0f) - f21;
                                        f28 = (f28 * 2.0f) - f22;
                                    }
                                    float f44 = f27;
                                    float f45 = f28;
                                    int i38 = i11 + 1;
                                    int i39 = i11 + 2;
                                    int i40 = i11 + 3;
                                    path2.cubicTo(f44, f45, fArr[i11], fArr[i38], fArr[i39], fArr[i40]);
                                    f21 = fArr[i11];
                                    f22 = fArr[i38];
                                    f10 = fArr[i39];
                                    f7 = fArr[i40];
                                }
                                i12 = i14;
                                dVar = dVar3;
                                c10 = c12;
                            } else {
                                fArr = fArr3;
                                i11 = i16;
                                path2.rLineTo(0.0f, fArr[i11]);
                                f14 = fArr[i11];
                            }
                            f28 += f14;
                        } else {
                            fArr = fArr3;
                            i11 = i16;
                            int i41 = i11 + 1;
                            int i42 = i11 + 2;
                            int i43 = i11 + 3;
                            path2.rQuadTo(fArr[i11], fArr[i41], fArr[i42], fArr[i43]);
                            f11 = fArr[i11] + f27;
                            f12 = fArr[i41] + f28;
                            f27 += fArr[i42];
                            f13 = fArr[i43];
                        }
                        f28 += f13;
                        f21 = f11;
                        f22 = f12;
                    } else {
                        fArr = fArr3;
                        i11 = i16;
                        path2.rLineTo(fArr[i11], 0.0f);
                        f27 += fArr[i11];
                    }
                    dVar = dVar3;
                    f10 = f27;
                    f7 = f28;
                    i12 = i14;
                    c10 = c12;
                } else {
                    fArr = fArr3;
                    i11 = i16;
                    int i44 = i11 + 5;
                    float f46 = fArr[i44] + f27;
                    int i45 = i11 + 6;
                    float f47 = fArr[i45] + f28;
                    float f48 = fArr[i11];
                    float f49 = fArr[i11 + 1];
                    float f50 = fArr[i11 + 2];
                    if (fArr[i11 + 3] != 0.0f) {
                        dVar2 = dVar3;
                        z10 = 1;
                    } else {
                        dVar2 = dVar3;
                        z10 = i15;
                    }
                    dVar = dVar2;
                    float f51 = f27;
                    c10 = c12;
                    float f52 = f28;
                    i12 = i14;
                    a(path, f51, f52, f46, f47, f48, f49, f50, z10, fArr[i11 + 4] != 0.0f ? 1 : i15);
                    f10 = f51 + fArr[i44];
                    f7 = f52 + fArr[i45];
                    f21 = f10;
                    f22 = f7;
                }
                i16 = i11 + i10;
                path2 = path;
                dVar3 = dVar;
                c12 = c10;
                i14 = i12;
                f27 = f10;
                f28 = f7;
                c11 = c12;
                fArr3 = fArr;
            }
            fArr2[i15] = f27;
            fArr2[1] = f28;
            fArr2[2] = f21;
            fArr2[3] = f22;
            fArr2[4] = f25;
            fArr2[5] = f26;
            c11 = dVar3.a;
            i14++;
            dVarArr2 = dVarArr;
            path2 = path;
            i13 = i15;
        }
    }

    public d(d dVar) {
        this.a = dVar.a;
        float[] fArr = dVar.b;
        this.b = c8.b(fArr, fArr.length);
    }
}
