// default package

import android.content.Context;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class g52 {
    public float a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;

    public g52(Context context, s34 s34Var) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.h = new int[]{ConnectionsManager.DEFAULT_DATACENTER_ID, 0};
        this.e = context;
        this.f = s34Var;
    }

    public static float b(int i, int i2, float[] fArr) {
        float f = 0.0f;
        while (i < i2) {
            f += fArr[i];
            i++;
        }
        return 1000.0f / f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:0x066e, code lost:
    
        if (r13[2] > r13[r15]) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a1, code lost:
    
        if (r6 != 8) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0682  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        float f;
        int i;
        float f2;
        int i2;
        int i3;
        float f3;
        int i4;
        int i5;
        boolean z;
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        ArrayList arrayList2 = (ArrayList) this.e;
        arrayList2.clear();
        HashMap hashMap = (HashMap) this.g;
        hashMap.clear();
        boolean z2 = false;
        if (size == 0) {
            this.b = 0;
            this.a = 0.0f;
            this.c = 0;
            this.d = 0;
            return;
        }
        arrayList2.ensureCapacity(size);
        char[] cArr = new char[size];
        int i6 = 0;
        boolean z3 = false;
        float f4 = 1.0f;
        while (i6 < size) {
            jm6 jm6Var = (jm6) arrayList.get(i6);
            c27 c27Var = new c27();
            c27Var.h = i6 == size + (-1) ? true : z2;
            zl6 zl6Var = jm6Var.A;
            String str = jm6Var.I;
            if (zl6Var != null) {
                i4 = zl6Var.s;
                i5 = zl6Var.t;
            } else {
                i4 = jm6Var.F;
                i5 = jm6Var.G;
            }
            HashMap hashMap2 = m52.V;
            if (hashMap2.containsKey(jm6Var)) {
                z = ((Boolean) hashMap2.get(jm6Var)).booleanValue();
            } else {
                if (jm6Var.b) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(str);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (extractMetadata != null) {
                        if (!extractMetadata.equals("90")) {
                            if (extractMetadata.equals("270")) {
                            }
                        }
                    }
                    z = false;
                    m52.V.put(jm6Var, Boolean.valueOf(z));
                } else {
                    int c = new d54(str).c();
                    if (c != 6) {
                    }
                }
                z = true;
                m52.V.put(jm6Var, Boolean.valueOf(z));
            }
            if (!z) {
                int i7 = i4;
                i4 = i5;
                i5 = i7;
            }
            float f5 = i5 / i4;
            c27Var.g = f5;
            cArr[i6] = f5 > 1.2f ? 'w' : f5 < 0.8f ? 'n' : 'q';
            f4 += f5;
            if (f5 > 2.0f) {
                z3 = true;
            }
            hashMap.put(jm6Var, c27Var);
            arrayList2.add(c27Var);
            i6++;
            z2 = false;
        }
        float f6 = 1.0f;
        String str2 = new String(cArr);
        int L = gl.L(120.0f);
        float L2 = gl.L(120.0f);
        Point point = gl.q;
        int min = (int) (L2 / (Math.min(point.x, point.y) / 1000.0f));
        int L3 = (int) (gl.L(40.0f) / (Math.min(point.x, point.y) / 1000.0f));
        float f7 = f4 / size;
        float L4 = gl.L(100.0f) / 814.0f;
        if (size == 1) {
            c27 c27Var2 = (c27) arrayList2.get(0);
            int i8 = point.x;
            c27Var2.a((((i8 - (((m52) this.h).b.u0 << 1)) * 0.8f) / c27Var2.g) / (Math.max(i8, point.y) * 0.5f), 0, 0, 0, 0, 800, 15);
        } else {
            int i9 = 3;
            if (z3 || !(size == 2 || size == 3 || size == 4)) {
                int size2 = arrayList2.size();
                float[] fArr = new float[size2];
                int i10 = 0;
                while (i10 < size) {
                    if (f7 > 1.1f) {
                        f3 = f6;
                        fArr[i10] = Math.max(f3, ((c27) arrayList2.get(i10)).g);
                    } else {
                        f3 = f6;
                        fArr[i10] = Math.min(f3, ((c27) arrayList2.get(i10)).g);
                    }
                    fArr[i10] = Math.max(0.66667f, Math.min(1.7f, fArr[i10]));
                    i10++;
                    f6 = f3;
                }
                ArrayList arrayList3 = new ArrayList();
                for (int i11 = 1; i11 < size2; i11++) {
                    int i12 = size2 - i11;
                    if (i11 <= 3 && i12 <= 3) {
                        float b = b(0, i11, fArr);
                        float b2 = b(i11, size2, fArr);
                        f52 f52Var = new f52();
                        f52Var.a = new int[]{i11, i12};
                        f52Var.b = new float[]{b, b2};
                        arrayList3.add(f52Var);
                    }
                }
                for (int i13 = 1; i13 < size2 - 1; i13++) {
                    int i14 = 1;
                    while (true) {
                        int i15 = size2 - i13;
                        if (i14 < i15) {
                            int i16 = i15 - i14;
                            if (i13 <= 3) {
                                if (i14 <= (f7 < 0.85f ? 4 : 3) && i16 <= 3) {
                                    float b3 = b(0, i13, fArr);
                                    int i17 = i13 + i14;
                                    float b4 = b(i13, i17, fArr);
                                    float b5 = b(i17, size2, fArr);
                                    f52 f52Var2 = new f52();
                                    f52Var2.a = new int[]{i13, i14, i16};
                                    f52Var2.b = new float[]{b3, b4, b5};
                                    arrayList3.add(f52Var2);
                                }
                            }
                            i14++;
                        }
                    }
                }
                int i18 = 1;
                while (i18 < size2 - 2) {
                    int i19 = 1;
                    while (true) {
                        int i20 = size2 - i18;
                        if (i19 < i20) {
                            int i21 = 1;
                            while (true) {
                                int i22 = i20 - i19;
                                if (i21 < i22) {
                                    int i23 = i22 - i21;
                                    if (i18 > i9 || i19 > i9 || i21 > i9 || i23 > i9) {
                                        i2 = i18;
                                        i3 = i9;
                                    } else {
                                        i3 = i9;
                                        float b6 = b(0, i18, fArr);
                                        int i24 = i18 + i19;
                                        float b7 = b(i18, i24, fArr);
                                        int i25 = i24 + i21;
                                        float b8 = b(i24, i25, fArr);
                                        float b9 = b(i25, size2, fArr);
                                        f52 f52Var3 = new f52();
                                        f52Var3.a = new int[]{i18, i19, i21, i23};
                                        i2 = i18;
                                        float[] fArr2 = new float[4];
                                        fArr2[0] = b6;
                                        fArr2[1] = b7;
                                        fArr2[2] = b8;
                                        fArr2[i3] = b9;
                                        f52Var3.b = fArr2;
                                        arrayList3.add(f52Var3);
                                    }
                                    i21++;
                                    i9 = i3;
                                    i18 = i2;
                                }
                            }
                            i19++;
                        }
                    }
                    i18++;
                }
                int i26 = i9;
                float f8 = 0.0f;
                int i27 = 0;
                f52 f52Var4 = null;
                while (i27 < arrayList3.size()) {
                    f52 f52Var5 = (f52) arrayList3.get(i27);
                    float f9 = Float.MAX_VALUE;
                    float f10 = 0.0f;
                    int i28 = 0;
                    while (true) {
                        float[] fArr3 = f52Var5.b;
                        if (i28 >= fArr3.length) {
                            break;
                        }
                        float f11 = fArr3[i28];
                        f10 += f11;
                        if (f11 < f9) {
                            f9 = f11;
                        }
                        i28++;
                    }
                    float abs = Math.abs(f10 - 1332.0f);
                    int[] iArr = f52Var5.a;
                    if (iArr.length > 1) {
                        int i29 = iArr[0];
                        int i30 = iArr[1];
                        if (i29 <= i30) {
                            f = abs;
                            if (iArr.length <= 2 || i30 <= iArr[2]) {
                                i = i26;
                                if (iArr.length > i) {
                                }
                            }
                        } else {
                            f = abs;
                        }
                        i = i26;
                        f2 = f * 1.2f;
                        if (f9 < min) {
                            f2 *= 1.5f;
                        }
                        if (f52Var4 != null || f2 < f8) {
                            f8 = f2;
                            f52Var4 = f52Var5;
                        }
                        i27++;
                        i26 = i;
                    } else {
                        f = abs;
                        i = i26;
                    }
                    f2 = f;
                    if (f9 < min) {
                    }
                    if (f52Var4 != null) {
                    }
                    f8 = f2;
                    f52Var4 = f52Var5;
                    i27++;
                    i26 = i;
                }
                if (f52Var4 == null) {
                    return;
                }
                int[] iArr2 = f52Var4.a;
                int i31 = 0;
                int i32 = 0;
                while (i31 < iArr2.length) {
                    int i33 = iArr2[i31];
                    float f12 = f52Var4.b[i31];
                    int i34 = i32;
                    int i35 = 1000;
                    int i36 = 0;
                    c27 c27Var3 = null;
                    while (i36 < i33) {
                        int i37 = (int) (fArr[i34] * f12);
                        int i38 = i35 - i37;
                        c27 c27Var4 = (c27) arrayList2.get(i34);
                        int i39 = i31 == 0 ? 4 : 0;
                        if (i31 == iArr2.length - 1) {
                            i39 |= 8;
                        }
                        if (i36 == 0) {
                            i39 |= 1;
                            c27Var3 = c27Var4;
                        }
                        if (i36 == i33 - 1) {
                            i39 |= 2;
                            c27Var3 = c27Var4;
                        }
                        int i40 = i36;
                        c27Var4.a(Math.max(L4, f12 / 814.0f), i40, i36, i31, i31, i37, i39);
                        i34++;
                        i36 = i40 + 1;
                        i35 = i38;
                    }
                    int i41 = i31;
                    if (c27Var3 != null) {
                        c27Var3.e += i35;
                        c27Var3.i += i35;
                    }
                    i31 = i41 + 1;
                    i32 = i34;
                }
            } else if (size == 2) {
                c27 c27Var5 = (c27) arrayList2.get(0);
                c27 c27Var6 = (c27) arrayList2.get(1);
                if (str2.equals("ww") && f7 > 1.71990168094635d) {
                    float f13 = c27Var5.g;
                    float f14 = c27Var6.g;
                    if (f13 - f14 < 0.2d) {
                        float round = Math.round(Math.min(1000.0f / f13, Math.min(1000.0f / f14, 407.0f))) / 814.0f;
                        c27Var5.a(round, 0, 0, 0, 0, 1000, 7);
                        c27Var6.a(round, 0, 0, 1, 1, 1000, 11);
                    }
                }
                if (str2.equals("ww") || str2.equals("qq")) {
                    float round2 = Math.round(Math.min(500.0f / c27Var5.g, Math.min(500.0f / c27Var6.g, 814.0f))) / 814.0f;
                    c27Var5.a(round2, 0, 0, 0, 0, 500, 13);
                    c27Var6.a(round2, 1, 1, 0, 0, 500, 14);
                } else {
                    float f15 = c27Var5.g;
                    int max = (int) Math.max(400.0f, Math.round((1000.0f / f15) / ((1.0f / c27Var6.g) + (1.0f / f15))));
                    int i42 = 1000 - max;
                    if (i42 < min) {
                        max -= min - i42;
                    } else {
                        min = i42;
                    }
                    float min2 = Math.min(814.0f, Math.round(Math.min(min / c27Var5.g, max / c27Var6.g))) / 814.0f;
                    c27Var5.a(min2, 0, 0, 0, 0, min, 13);
                    c27Var6.a(min2, 1, 1, 0, 0, max, 14);
                }
            } else if (size == 3) {
                c27 c27Var7 = (c27) arrayList2.get(0);
                c27 c27Var8 = (c27) arrayList2.get(1);
                c27 c27Var9 = (c27) arrayList2.get(2);
                if (str2.charAt(0) == 'n') {
                    float f16 = c27Var8.g;
                    float min3 = Math.min(407.0f, Math.round((f16 * 1000.0f) / (c27Var9.g + f16)));
                    int max2 = (int) Math.max(min, Math.min(500.0f, Math.round(Math.min(c27Var9.g * min3, c27Var8.g * r6))));
                    float f17 = (c27Var7.g * 814.0f) + L3;
                    int i43 = 1000 - max2;
                    c27Var7.a(1.0f, 0, 0, 0, 1, Math.round(Math.min(f17, i43)), 13);
                    float f18 = (814.0f - min3) / 814.0f;
                    c27Var8.a(f18, 1, 1, 0, 0, max2, 6);
                    float f19 = min3 / 814.0f;
                    c27Var9.a(f19, 1, 1, 1, 1, max2, 10);
                    c27Var9.i = 1000;
                    c27Var7.m = new float[]{f19, f18};
                    c27Var7.i = i43;
                } else {
                    float round3 = Math.round(Math.min(1000.0f / c27Var7.g, 537.24005f)) / 814.0f;
                    c27Var7.a(round3, 0, 1, 0, 0, 1000, 7);
                    float min4 = Math.min(814.0f - round3, Math.round(Math.min(500.0f / c27Var8.g, 500.0f / c27Var9.g))) / 814.0f;
                    float f20 = min4 < L4 ? L4 : min4;
                    c27Var8.a(f20, 0, 0, 1, 1, 500, 9);
                    c27Var9.a(f20, 1, 1, 1, 1, 500, 10);
                }
            } else {
                c27 c27Var10 = (c27) arrayList2.get(0);
                c27 c27Var11 = (c27) arrayList2.get(1);
                c27 c27Var12 = (c27) arrayList2.get(2);
                c27 c27Var13 = (c27) arrayList2.get(3);
                if (str2.charAt(0) == 'w') {
                    float round4 = Math.round(Math.min(1000.0f / c27Var10.g, 537.24005f)) / 814.0f;
                    c27Var10.a(round4, 0, 2, 0, 0, 1000, 7);
                    float round5 = Math.round(1000.0f / ((c27Var11.g + c27Var12.g) + c27Var13.g));
                    float f21 = min;
                    int max3 = (int) Math.max(f21, Math.min(400.0f, c27Var11.g * round5));
                    int max4 = (int) Math.max(Math.max(f21, 330.0f), c27Var13.g * round5);
                    int i44 = (1000 - max3) - max4;
                    if (i44 < gl.L(58.0f)) {
                        int L5 = gl.L(58.0f) - i44;
                        i44 = gl.L(58.0f);
                        int i45 = L5 / 2;
                        max3 -= i45;
                        max4 -= L5 - i45;
                    }
                    int i46 = max3;
                    float min5 = Math.min(814.0f - round4, round5) / 814.0f;
                    float f22 = min5 < L4 ? L4 : min5;
                    c27Var11.a(f22, 0, 0, 1, 1, i46, 9);
                    c27Var12.a(f22, 1, 1, 1, 1, i44, 8);
                    c27Var13.a(f22, 2, 2, 1, 1, max4, 10);
                } else {
                    int max5 = Math.max(min, Math.round(814.0f / ((1.0f / c27Var13.g) + ((1.0f / c27Var12.g) + (1.0f / c27Var11.g)))));
                    float f23 = L;
                    float f24 = max5;
                    float min6 = Math.min(0.33f, Math.max(f23, f24 / c27Var11.g) / 814.0f);
                    float min7 = Math.min(0.33f, Math.max(f23, f24 / c27Var12.g) / 814.0f);
                    float f25 = (1.0f - min6) - min7;
                    float f26 = (c27Var10.g * 814.0f) + L3;
                    int i47 = 1000 - max5;
                    c27Var10.a(min6 + min7 + f25, 0, 0, 0, 2, Math.round(Math.min(f26, i47)), 13);
                    c27Var11.a(min6, 1, 1, 0, 0, max5, 6);
                    c27Var12.a(min7, 1, 1, 1, 1, max5, 2);
                    c27Var12.i = 1000;
                    c27Var13.a(f25, 1, 1, 2, 2, max5, 10);
                    c27Var13.i = 1000;
                    c27Var10.i = i47;
                    c27Var10.m = new float[]{min6, min7, f25};
                }
            }
        }
        int i48 = 0;
        while (i48 < size) {
            c27 c27Var14 = (c27) arrayList2.get(i48);
            if (c27Var14.a == 0) {
                c27Var14.i += kk7.d3;
            }
            if ((c27Var14.l & 2) != 0) {
                c27Var14.k = true;
            }
            this.c = Math.max(this.c, (int) c27Var14.b);
            this.d = Math.max(this.d, (int) c27Var14.d);
            byte b10 = c27Var14.c;
            byte b11 = c27Var14.d;
            byte b12 = c27Var14.a;
            int i49 = (b11 - b10) + 1;
            float[] fArr4 = new float[i49];
            Arrays.fill(fArr4, 0.0f);
            int size3 = arrayList2.size();
            int i50 = 0;
            while (i50 < size3) {
                c27 c27Var15 = (c27) arrayList2.get(i50);
                if (c27Var15 != c27Var14 && c27Var15.b < b12) {
                    int min8 = Math.min((int) c27Var15.d, (int) b11) - b10;
                    int max6 = Math.max(c27Var15.c - b10, 0);
                    while (max6 <= min8) {
                        fArr4[max6] = fArr4[max6] + c27Var15.e;
                        max6++;
                        i48 = i48;
                    }
                }
                i50++;
                i48 = i48;
            }
            int i51 = i48;
            float f27 = 0.0f;
            for (int i52 = 0; i52 < i49; i52++) {
                float f28 = fArr4[i52];
                if (f27 < f28) {
                    f27 = f28;
                }
            }
            c27Var14.o = f27;
            i48 = i51 + 1;
        }
        for (int i53 = 0; i53 < size; i53++) {
            c27 c27Var16 = (c27) arrayList2.get(i53);
            byte b13 = c27Var16.c;
            int i54 = this.c + 1;
            float[] fArr5 = new float[i54];
            Arrays.fill(fArr5, 0.0f);
            int size4 = arrayList2.size();
            for (int i55 = 0; i55 < size4; i55++) {
                c27 c27Var17 = (c27) arrayList2.get(i55);
                if (c27Var17 != c27Var16 && c27Var17.d < b13) {
                    for (int i56 = c27Var17.a; i56 <= c27Var17.b; i56++) {
                        fArr5[i56] = fArr5[i56] + c27Var17.f;
                    }
                }
            }
            float f29 = 0.0f;
            for (int i57 = 0; i57 < i54; i57++) {
                float f30 = fArr5[i57];
                if (f29 < f30) {
                    f29 = f30;
                }
            }
            c27Var16.n = f29;
        }
        int[] iArr3 = new int[10];
        Arrays.fill(iArr3, 0);
        int size5 = arrayList2.size();
        for (int i58 = 0; i58 < size5; i58++) {
            c27 c27Var18 = (c27) arrayList2.get(i58);
            int i59 = c27Var18.e;
            for (int i60 = c27Var18.c; i60 <= c27Var18.d; i60++) {
                iArr3[i60] = iArr3[i60] + i59;
            }
        }
        int i61 = iArr3[0];
        for (int i62 = 1; i62 < 10; i62++) {
            int i63 = iArr3[i62];
            if (i61 < i63) {
                i61 = i63;
            }
        }
        this.b = i61;
        float[] fArr6 = new float[10];
        Arrays.fill(fArr6, 0.0f);
        int size6 = arrayList2.size();
        for (int i64 = 0; i64 < size6; i64++) {
            c27 c27Var19 = (c27) arrayList2.get(i64);
            float f31 = c27Var19.f;
            for (int i65 = c27Var19.a; i65 <= c27Var19.b; i65++) {
                fArr6[i65] = fArr6[i65] + f31;
            }
        }
        float f32 = fArr6[0];
        for (int i66 = 1; i66 < 10; i66++) {
            float f33 = fArr6[i66];
            if (f32 < f33) {
                f32 = f33;
            }
        }
        this.a = f32;
    }

    public g52(m52 m52Var, ArrayList arrayList) {
        this.h = m52Var;
        this.e = new ArrayList();
        this.g = new HashMap();
        this.f = arrayList;
        a();
    }
}
