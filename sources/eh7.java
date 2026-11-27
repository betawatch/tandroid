// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class eh7 {
    public final float[] a;
    public final float[] b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final float[] g;
    public final float[] h;
    public final float[] i;
    public final float[] j = new float[3];

    public eh7(float[] fArr, float[] fArr2, float f, float f2, float f3) {
        this.a = fArr;
        this.b = fArr2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f2 > f;
        this.g = new float[fArr.length];
        this.h = new float[fArr.length];
        this.i = new float[fArr.length];
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int[] iArr, int[] iArr2, float f, fh7 fh7Var, boolean z) {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        int i;
        int i2;
        float f2;
        int i3;
        int i4;
        float[] fArr5;
        float f3;
        float min;
        int i5;
        float f4;
        float f5;
        int i6;
        int i7;
        eh7 eh7Var = this;
        int length = iArr.length;
        int length2 = iArr2.length;
        int i8 = 0;
        int i9 = 0;
        float f6 = 0.0f;
        while (true) {
            fArr = eh7Var.h;
            fArr2 = eh7Var.a;
            fArr3 = eh7Var.g;
            if (i8 >= length2) {
                break;
            }
            int i10 = iArr2[i8];
            int i11 = 0;
            int i12 = 0;
            double d = 0.0d;
            while (i12 < i10) {
                float[] fArr6 = fArr3;
                float f7 = fArr2[iArr[i9 + i12]];
                if (f7 > 0.0f) {
                    i6 = i8;
                    i7 = i9;
                    i11++;
                    d = Math.log(f7) + d;
                } else {
                    i6 = i8;
                    i7 = i9;
                }
                i12++;
                i8 = i6;
                fArr3 = fArr6;
                i9 = i7;
            }
            float[] fArr7 = fArr3;
            int i13 = i8;
            int i14 = i9;
            float exp = i11 > 0 ? (float) Math.exp(d / i11) : 1.0f;
            float f8 = 0.0f;
            int i15 = 0;
            while (i15 < i10) {
                int i16 = i14 + i15;
                float f9 = fArr2[iArr[i16]];
                if (f9 > 0.0f) {
                    i5 = i15;
                    f4 = f8;
                    f5 = qu6.w(f9, exp, 1.22f, 0.8196721f);
                } else {
                    i5 = i15;
                    f4 = f8;
                    f5 = 1.0f;
                }
                fArr7[i16] = f5;
                f8 = f4 + f5;
                i15 = i5 + 1;
            }
            float f10 = f8;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = i14 + i17;
                fArr7[i18] = fArr7[i18] / f10;
            }
            float f11 = 1.0f / (exp * f10);
            fArr[i13] = f11;
            f6 += f11;
            i9 = i14 + iArr2[i13];
            i8 = i13 + 1;
        }
        float f12 = 1.0f;
        int i19 = 0;
        while (i19 <= 8) {
            float f13 = 8.0f;
            float f14 = i19 / 8.0f;
            float f15 = 0.0f;
            int i20 = 0;
            while (true) {
                fArr4 = eh7Var.i;
                if (i20 >= length2) {
                    break;
                }
                float f16 = f13;
                int i21 = i20;
                int i22 = length;
                float pow = (float) (Math.pow(iArr2[i20] / length, f14) * Math.pow(fArr[i20] / f6, f12 - f14));
                fArr4[i21] = pow;
                f15 += pow;
                i20 = i21 + 1;
                i19 = i19;
                f13 = f16;
                length = i22;
                f6 = f6;
                fArr = fArr;
            }
            int i23 = length;
            int i24 = i19;
            float f17 = f13;
            float f18 = f6;
            float[] fArr8 = fArr;
            for (int i25 = 0; i25 < length2; i25++) {
                fArr4[i25] = fArr4[i25] / f15;
            }
            float f19 = eh7Var.e;
            float[] fArr9 = eh7Var.b;
            boolean z2 = eh7Var.f;
            float f20 = eh7Var.c;
            float[] fArr10 = eh7Var.j;
            if (z2) {
                int i26 = 0;
                int i27 = 0;
                double d2 = 0.0d;
                double d3 = 0.0d;
                i2 = 1;
                while (i26 < iArr2.length) {
                    int i28 = 0;
                    while (i28 < iArr2[i26]) {
                        int i29 = iArr[i27];
                        float f21 = fArr2[i29];
                        int i30 = i26;
                        int i31 = length2;
                        double d4 = f21 > 0.0f ? fArr9[i29] : 0.3f;
                        if (f21 <= 0.0f) {
                            f21 = f12;
                        }
                        d2 = (Math.log((f21 * fArr4[i30]) / fArr3[i27]) * d4) + d2;
                        d3 += d4;
                        i28++;
                        i27++;
                        length2 = i31;
                        i26 = i30;
                    }
                    i26++;
                }
                i = length2;
                f2 = 0.3f;
                float exp2 = (float) Math.exp(d2 / d3);
                float f22 = eh7Var.d;
                fArr10[0] = Math.max(f20, Math.min(f22, exp2));
                if (f19 >= f20 && f19 <= f22) {
                    fArr10[1] = f19;
                    i3 = 2;
                    i4 = 0;
                    while (i4 < i3) {
                        float f23 = fArr10[i4];
                        int i32 = i3;
                        int i33 = i4;
                        float log = (float) Math.log(f23);
                        if (f19 > 0.0f) {
                            fArr5 = fArr9;
                            f3 = (Math.abs(log - ((float) Math.log(f19))) * 0.08f) + 0.0f;
                        } else {
                            fArr5 = fArr9;
                            f3 = 0.0f;
                        }
                        if (z2) {
                            f3 = c00.x(log, 0.4f, log, f3);
                        }
                        float f24 = f + f3;
                        int length3 = iArr.length;
                        float f25 = Float.MAX_VALUE;
                        float[] fArr11 = fArr5;
                        float f26 = 0.0f;
                        float f27 = 0.0f;
                        int i34 = 0;
                        int i35 = 0;
                        while (i34 < iArr2.length) {
                            float f28 = fArr4[i34];
                            int i36 = i35;
                            int i37 = i34;
                            float f29 = f26;
                            int i38 = i36;
                            float f30 = f19;
                            int i39 = 0;
                            while (i39 < iArr2[i37]) {
                                float f31 = fArr3[i38] * f28;
                                f25 = Math.min(f25, f31);
                                float max = Math.max(f29, f31);
                                float f32 = fArr2[iArr[i38]];
                                int i40 = i39;
                                float f33 = (fArr3[i38] * f23) / f28;
                                if (f32 > 0.0f) {
                                    float min2 = f12 - (Math.min(f32, f33) / Math.max(f32, f33));
                                    min = (((min2 * 1.5f * min2) + min2) * fArr11[iArr[i38]]) + f27;
                                } else {
                                    float f34 = f12;
                                    min = ((f34 - (Math.min(f34, f33) / Math.max(f34, f33))) * f2) + f27;
                                }
                                float f35 = min;
                                float log2 = (float) Math.log(f31 * length3);
                                f27 = c00.x(log2, f2, log2, f35);
                                i39 = i40 + 1;
                                i38++;
                                f29 = max;
                                f12 = 1.0f;
                            }
                            int i41 = i37 + 1;
                            i35 = i38;
                            f19 = f30;
                            f12 = 1.0f;
                            f26 = f29;
                            i34 = i41;
                        }
                        float f36 = f19;
                        float log3 = (float) Math.log((f26 / f25) / 1.5f);
                        if (log3 > 0.0f) {
                            f27 = (log3 * f17) + f27;
                        }
                        float f37 = f24 + f27;
                        if (f37 < fh7Var.f - 1.0E-5f) {
                            int length4 = iArr.length;
                            fh7Var.f = f37;
                            fh7Var.d = z;
                            fh7Var.c = (int[]) iArr.clone();
                            fh7Var.e = (int[]) iArr2.clone();
                            f12 = 1.0f;
                            fh7Var.a = z ? 1.0f / f23 : f23;
                            fh7Var.b = new float[length4 << 2];
                            float f38 = 0.0f;
                            int i42 = 0;
                            int i43 = 0;
                            while (i42 < iArr2.length) {
                                float f39 = i42 == iArr2.length + (-1) ? 1.0f : fArr4[i42] + f38;
                                float f40 = 0.0f;
                                int i44 = 0;
                                while (true) {
                                    int i45 = iArr2[i42];
                                    if (i44 < i45) {
                                        float f41 = i44 == i45 + (-1) ? 1.0f : f40 + fArr3[i43];
                                        int i46 = iArr[i43];
                                        int i47 = i42;
                                        float[] fArr12 = fh7Var.b;
                                        int i48 = i46 << 2;
                                        if (z) {
                                            fArr12[i48] = f38;
                                            fArr12[i48 + 1] = f40;
                                            fArr12[i48 + 2] = f39;
                                            fArr12[i48 + 3] = f41;
                                        } else {
                                            fArr12[i48] = f40;
                                            fArr12[i48 + 1] = f38;
                                            fArr12[i48 + 2] = f41;
                                            fArr12[i48 + 3] = f39;
                                        }
                                        i44++;
                                        i43++;
                                        f40 = f41;
                                        i42 = i47;
                                    }
                                }
                                i42++;
                                f38 = f39;
                            }
                        } else {
                            f12 = 1.0f;
                        }
                        i4 = i33 + 1;
                        f2 = 0.3f;
                        i3 = i32;
                        fArr9 = fArr11;
                        f19 = f36;
                    }
                    i19 = i24 + 1;
                    eh7Var = this;
                    length = i23;
                    f6 = f18;
                    fArr = fArr8;
                    length2 = i;
                }
            } else {
                i = length2;
                i2 = 1;
                f2 = 0.3f;
                fArr10[0] = f20;
            }
            i3 = i2;
            i4 = 0;
            while (i4 < i3) {
            }
            i19 = i24 + 1;
            eh7Var = this;
            length = i23;
            f6 = f18;
            fArr = fArr8;
            length2 = i;
        }
    }
}
