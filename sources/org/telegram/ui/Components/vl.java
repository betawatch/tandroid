package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class vl {
    public float a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;

    public vl(Context context, n nVar) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.h = new int[]{ConnectionsManager.DEFAULT_DATACENTER_ID, 0};
        this.e = context;
        this.f = nVar;
    }

    public static float b(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return 1000.0f / f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x0692, code lost:
    
        if (r13[2] > r13[3]) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        if (r6.equals("270") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
    
        if (r6 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        float f10;
        float f11;
        int i7;
        char c10;
        float f12;
        boolean z9;
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        ArrayList arrayList2 = (ArrayList) this.e;
        arrayList2.clear();
        HashMap hashMap = (HashMap) this.g;
        hashMap.clear();
        boolean z10 = false;
        if (size == 0) {
            this.b = 0;
            this.a = 0.0f;
            this.c = 0;
            this.d = 0;
            return;
        }
        arrayList2.ensureCapacity(size);
        char[] cArr = new char[size];
        int i10 = 0;
        boolean z11 = false;
        float f13 = 1.0f;
        while (i10 < size) {
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) arrayList.get(i10);
            org.telegram.messenger.aj ajVar = new org.telegram.messenger.aj();
            ajVar.h = i10 == size + (-1) ? true : z10;
            org.telegram.messenger.ye yeVar = gfVar.A;
            String str = gfVar.I;
            int i11 = yeVar != null ? yeVar.s : gfVar.F;
            int i12 = yeVar != null ? yeVar.t : gfVar.G;
            HashMap hashMap2 = bm.U;
            if (hashMap2.containsKey(gfVar)) {
                z9 = ((Boolean) hashMap2.get(gfVar)).booleanValue();
            } else {
                if (gfVar.b) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(str);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (extractMetadata != null) {
                        if (!extractMetadata.equals("90")) {
                        }
                    }
                    z9 = false;
                    bm.U.put(gfVar, Boolean.valueOf(z9));
                } else {
                    int c11 = new u1.g(str).c();
                    if (c11 != 6) {
                    }
                }
                z9 = true;
                bm.U.put(gfVar, Boolean.valueOf(z9));
            }
            if (z9) {
                int i13 = i11;
                i11 = i12;
                i12 = i13;
            }
            float f14 = i11 / i12;
            ajVar.g = f14;
            cArr[i10] = f14 > 1.2f ? 'w' : f14 < 0.8f ? 'n' : 'q';
            f13 += f14;
            if (f14 > 2.0f) {
                z11 = true;
            }
            hashMap.put(gfVar, ajVar);
            arrayList2.add(ajVar);
            i10++;
            z10 = false;
        }
        float f15 = 1.0f;
        String str2 = new String(cArr);
        int L = org.telegram.messenger.g0.L(120.0f);
        float L2 = org.telegram.messenger.g0.L(120.0f);
        Point point = org.telegram.messenger.g0.q;
        int min = (int) (L2 / (Math.min(point.x, point.y) / 1000.0f));
        int L3 = (int) (org.telegram.messenger.g0.L(40.0f) / (Math.min(point.x, point.y) / 1000.0f));
        float f16 = f13 / size;
        float L4 = org.telegram.messenger.g0.L(100.0f) / 814.0f;
        if (size == 1) {
            org.telegram.messenger.aj ajVar2 = (org.telegram.messenger.aj) arrayList2.get(0);
            int i14 = point.x;
            ajVar2.a((((i14 - (((bm) this.h).b.t0 * 2)) * 0.8f) / ajVar2.g) / (Math.max(i14, point.y) * 0.5f), 0, 0, 0, 0, 800, 15);
        } else {
            char c12 = 4;
            if (z11 || !(size == 2 || size == 3 || size == 4)) {
                int i15 = 2;
                int size2 = arrayList2.size();
                float[] fArr = new float[size2];
                int i16 = 0;
                while (i16 < size) {
                    if (f16 > 1.1f) {
                        f12 = f15;
                        fArr[i16] = Math.max(f12, ((org.telegram.messenger.aj) arrayList2.get(i16)).g);
                    } else {
                        f12 = f15;
                        fArr[i16] = Math.min(f12, ((org.telegram.messenger.aj) arrayList2.get(i16)).g);
                    }
                    fArr[i16] = Math.max(0.66667f, Math.min(1.7f, fArr[i16]));
                    i16++;
                    f15 = f12;
                }
                ArrayList arrayList3 = new ArrayList();
                int i17 = 1;
                while (i17 < size2) {
                    int i18 = size2 - i17;
                    if (i17 <= 3 && i18 <= 3) {
                        float b10 = b(0, i17, fArr);
                        float b11 = b(i17, size2, fArr);
                        ul ulVar = new ul();
                        ulVar.a = new int[]{i17, i18};
                        float[] fArr2 = new float[i15];
                        fArr2[0] = b10;
                        fArr2[1] = b11;
                        ulVar.b = fArr2;
                        arrayList3.add(ulVar);
                    }
                    i17++;
                    i15 = 2;
                }
                for (int i19 = 1; i19 < size2 - 1; i19++) {
                    int i20 = 1;
                    while (true) {
                        int i21 = size2 - i19;
                        if (i20 < i21) {
                            int i22 = i21 - i20;
                            if (i19 <= 3) {
                                if (i20 <= (f16 < 0.85f ? 4 : 3) && i22 <= 3) {
                                    float b12 = b(0, i19, fArr);
                                    int i23 = i19 + i20;
                                    float b13 = b(i19, i23, fArr);
                                    float b14 = b(i23, size2, fArr);
                                    ul ulVar2 = new ul();
                                    ulVar2.a = new int[]{i19, i20, i22};
                                    ulVar2.b = new float[]{b12, b13, b14};
                                    arrayList3.add(ulVar2);
                                }
                            }
                            i20++;
                        }
                    }
                }
                for (int i24 = 1; i24 < size2 - 2; i24++) {
                    int i25 = 1;
                    while (true) {
                        int i26 = size2 - i24;
                        if (i25 < i26) {
                            int i27 = 1;
                            while (true) {
                                int i28 = i26 - i25;
                                if (i27 < i28) {
                                    int i29 = i28 - i27;
                                    if (i24 > 3 || i25 > 3 || i27 > 3 || i29 > 3) {
                                        i7 = size2;
                                        c10 = c12;
                                    } else {
                                        float b15 = b(0, i24, fArr);
                                        int i30 = i24 + i25;
                                        float b16 = b(i24, i30, fArr);
                                        int i31 = i30 + i27;
                                        float b17 = b(i30, i31, fArr);
                                        float b18 = b(i31, size2, fArr);
                                        ul ulVar3 = new ul();
                                        ulVar3.a = new int[]{i24, i25, i27, i29};
                                        i7 = size2;
                                        c10 = 4;
                                        ulVar3.b = new float[]{b15, b16, b17, b18};
                                        arrayList3.add(ulVar3);
                                    }
                                    i27++;
                                    c12 = c10;
                                    size2 = i7;
                                }
                            }
                            i25++;
                        }
                    }
                }
                float f17 = 0.0f;
                ul ulVar4 = null;
                for (int i32 = 0; i32 < arrayList3.size(); i32++) {
                    ul ulVar5 = (ul) arrayList3.get(i32);
                    float f18 = Float.MAX_VALUE;
                    float f19 = 0.0f;
                    int i33 = 0;
                    while (true) {
                        float[] fArr3 = ulVar5.b;
                        if (i33 >= fArr3.length) {
                            break;
                        }
                        float f20 = fArr3[i33];
                        f19 += f20;
                        if (f20 < f18) {
                            f18 = f20;
                        }
                        i33++;
                    }
                    float abs = Math.abs(f19 - 1332.0f);
                    int[] iArr = ulVar5.a;
                    if (iArr.length > 1) {
                        int i34 = iArr[0];
                        int i35 = iArr[1];
                        if (i34 <= i35) {
                            f10 = abs;
                            if (iArr.length <= 2 || i35 <= iArr[2]) {
                                if (iArr.length > 3) {
                                }
                            }
                        } else {
                            f10 = abs;
                        }
                        f11 = f10 * 1.2f;
                        if (f18 < min) {
                            f11 *= 1.5f;
                        }
                        if (ulVar4 != null || f11 < f17) {
                            f17 = f11;
                            ulVar4 = ulVar5;
                        }
                    } else {
                        f10 = abs;
                    }
                    f11 = f10;
                    if (f18 < min) {
                    }
                    if (ulVar4 != null) {
                    }
                    f17 = f11;
                    ulVar4 = ulVar5;
                }
                if (ulVar4 == null) {
                    return;
                }
                int[] iArr2 = ulVar4.a;
                int i36 = 0;
                int i37 = 0;
                while (i36 < iArr2.length) {
                    int i38 = iArr2[i36];
                    float f21 = ulVar4.b[i36];
                    int i39 = 0;
                    org.telegram.messenger.aj ajVar3 = null;
                    int i40 = 1000;
                    while (i39 < i38) {
                        int i41 = (int) (fArr[i37] * f21);
                        i40 -= i41;
                        org.telegram.messenger.aj ajVar4 = (org.telegram.messenger.aj) arrayList2.get(i37);
                        int i42 = i36 == 0 ? 4 : 0;
                        float[] fArr4 = fArr;
                        if (i36 == iArr2.length - 1) {
                            i42 |= 8;
                        }
                        if (i39 == 0) {
                            i42 |= 1;
                            ajVar3 = ajVar4;
                        }
                        if (i39 == i38 - 1) {
                            i42 |= 2;
                            ajVar3 = ajVar4;
                        }
                        int i43 = i39;
                        ajVar4.a(Math.max(L4, f21 / 814.0f), i43, i39, i36, i36, i41, i42);
                        i37++;
                        i39 = i43 + 1;
                        fArr = fArr4;
                    }
                    int i44 = i36;
                    float[] fArr5 = fArr;
                    if (ajVar3 != null) {
                        ajVar3.e += i40;
                        ajVar3.i += i40;
                    }
                    i36 = i44 + 1;
                    fArr = fArr5;
                }
            } else if (size == 2) {
                org.telegram.messenger.aj ajVar5 = (org.telegram.messenger.aj) arrayList2.get(0);
                org.telegram.messenger.aj ajVar6 = (org.telegram.messenger.aj) arrayList2.get(1);
                if (str2.equals("ww") && f16 > 1.2285012f * 1.4d) {
                    float f22 = ajVar5.g;
                    float f23 = ajVar6.g;
                    if (f22 - f23 < 0.2d) {
                        float round = Math.round(Math.min(1000.0f / f22, Math.min(1000.0f / f23, 407.0f))) / 814.0f;
                        ajVar5.a(round, 0, 0, 0, 0, 1000, 7);
                        ajVar6.a(round, 0, 0, 1, 1, 1000, 11);
                    }
                }
                if (str2.equals("ww") || str2.equals("qq")) {
                    float f24 = 500;
                    float round2 = Math.round(Math.min(f24 / ajVar5.g, Math.min(f24 / ajVar6.g, 814.0f))) / 814.0f;
                    ajVar5.a(round2, 0, 0, 0, 0, 500, 13);
                    ajVar6.a(round2, 1, 1, 0, 0, 500, 14);
                } else {
                    float f25 = ajVar5.g;
                    int max = (int) Math.max(400.0f, Math.round((1000.0f / f25) / ((1.0f / ajVar6.g) + (1.0f / f25))));
                    int i45 = 1000 - max;
                    if (i45 < min) {
                        max -= min - i45;
                    } else {
                        min = i45;
                    }
                    float min2 = Math.min(814.0f, Math.round(Math.min(min / ajVar5.g, max / ajVar6.g))) / 814.0f;
                    ajVar5.a(min2, 0, 0, 0, 0, min, 13);
                    ajVar6.a(min2, 1, 1, 0, 0, max, 14);
                }
            } else if (size == 3) {
                org.telegram.messenger.aj ajVar7 = (org.telegram.messenger.aj) arrayList2.get(0);
                org.telegram.messenger.aj ajVar8 = (org.telegram.messenger.aj) arrayList2.get(1);
                org.telegram.messenger.aj ajVar9 = (org.telegram.messenger.aj) arrayList2.get(2);
                if (str2.charAt(0) == 'n') {
                    float f26 = ajVar8.g;
                    float min3 = Math.min(407.0f, Math.round((f26 * 1000.0f) / (ajVar9.g + f26)));
                    int max2 = (int) Math.max(min, Math.min(500.0f, Math.round(Math.min(ajVar9.g * min3, ajVar8.g * r8))));
                    float f27 = (ajVar7.g * 814.0f) + L3;
                    int i46 = 1000 - max2;
                    ajVar7.a(1.0f, 0, 0, 0, 1, Math.round(Math.min(f27, i46)), 13);
                    float f28 = (814.0f - min3) / 814.0f;
                    ajVar8.a(f28, 1, 1, 0, 0, max2, 6);
                    float f29 = min3 / 814.0f;
                    ajVar9.a(f29, 1, 1, 1, 1, max2, 10);
                    ajVar9.i = 1000;
                    ajVar7.m = new float[]{f29, f28};
                    ajVar7.i = i46;
                } else {
                    float round3 = Math.round(Math.min(1000.0f / ajVar7.g, 537.24005f)) / 814.0f;
                    ajVar7.a(round3, 0, 1, 0, 0, 1000, 7);
                    float f30 = 500;
                    float min4 = Math.min(814.0f - round3, Math.round(Math.min(f30 / ajVar8.g, f30 / ajVar9.g))) / 814.0f;
                    float f31 = min4 < L4 ? L4 : min4;
                    ajVar8.a(f31, 0, 0, 1, 1, 500, 9);
                    ajVar9.a(f31, 1, 1, 1, 1, 500, 10);
                }
            } else {
                org.telegram.messenger.aj ajVar10 = (org.telegram.messenger.aj) arrayList2.get(0);
                org.telegram.messenger.aj ajVar11 = (org.telegram.messenger.aj) arrayList2.get(1);
                org.telegram.messenger.aj ajVar12 = (org.telegram.messenger.aj) arrayList2.get(2);
                org.telegram.messenger.aj ajVar13 = (org.telegram.messenger.aj) arrayList2.get(3);
                if (str2.charAt(0) == 'w') {
                    float round4 = Math.round(Math.min(1000.0f / ajVar10.g, 537.24005f)) / 814.0f;
                    ajVar10.a(round4, 0, 2, 0, 0, 1000, 7);
                    float round5 = Math.round(1000.0f / ((ajVar11.g + ajVar12.g) + ajVar13.g));
                    float f32 = min;
                    int max3 = (int) Math.max(f32, Math.min(400.0f, ajVar11.g * round5));
                    int max4 = (int) Math.max(Math.max(f32, 330.0f), ajVar13.g * round5);
                    int i47 = (1000 - max3) - max4;
                    if (i47 < org.telegram.messenger.g0.L(58.0f)) {
                        int L5 = org.telegram.messenger.g0.L(58.0f) - i47;
                        i47 = org.telegram.messenger.g0.L(58.0f);
                        int i48 = L5 / 2;
                        max3 -= i48;
                        max4 -= L5 - i48;
                    }
                    int i49 = max3;
                    float min5 = Math.min(814.0f - round4, round5) / 814.0f;
                    float f33 = min5 < L4 ? L4 : min5;
                    ajVar11.a(f33, 0, 0, 1, 1, i49, 9);
                    ajVar12.a(f33, 1, 1, 1, 1, i47, 8);
                    ajVar13.a(f33, 2, 2, 1, 1, max4, 10);
                } else {
                    int max5 = Math.max(min, Math.round(814.0f / ((1.0f / ajVar13.g) + ((1.0f / ajVar12.g) + (1.0f / ajVar11.g)))));
                    float f34 = L;
                    float f35 = max5;
                    float min6 = Math.min(0.33f, Math.max(f34, f35 / ajVar11.g) / 814.0f);
                    float min7 = Math.min(0.33f, Math.max(f34, f35 / ajVar12.g) / 814.0f);
                    float f36 = (1.0f - min6) - min7;
                    float f37 = (ajVar10.g * 814.0f) + L3;
                    int i50 = 1000 - max5;
                    ajVar10.a(min6 + min7 + f36, 0, 0, 0, 2, Math.round(Math.min(f37, i50)), 13);
                    ajVar11.a(min6, 1, 1, 0, 0, max5, 6);
                    ajVar12.a(min7, 1, 1, 1, 1, max5, 2);
                    ajVar12.i = 1000;
                    ajVar13.a(f36, 1, 1, 2, 2, max5, 10);
                    ajVar13.i = 1000;
                    ajVar10.i = i50;
                    ajVar10.m = new float[]{min6, min7, f36};
                }
            }
        }
        int i51 = 0;
        while (i51 < size) {
            org.telegram.messenger.aj ajVar14 = (org.telegram.messenger.aj) arrayList2.get(i51);
            if (ajVar14.a == 0) {
                ajVar14.i += org.telegram.messenger.qs.e3;
            }
            if ((ajVar14.l & 2) != 0) {
                ajVar14.k = true;
            }
            this.c = Math.max(this.c, (int) ajVar14.b);
            this.d = Math.max(this.d, (int) ajVar14.d);
            byte b19 = ajVar14.c;
            byte b20 = ajVar14.d;
            byte b21 = ajVar14.a;
            int i52 = (b20 - b19) + 1;
            float[] fArr6 = new float[i52];
            Arrays.fill(fArr6, 0.0f);
            int size3 = arrayList2.size();
            int i53 = 0;
            while (i53 < size3) {
                org.telegram.messenger.aj ajVar15 = (org.telegram.messenger.aj) arrayList2.get(i53);
                if (ajVar15 != ajVar14 && ajVar15.b < b21) {
                    int min8 = Math.min((int) ajVar15.d, (int) b20) - b19;
                    int max6 = Math.max(ajVar15.c - b19, 0);
                    while (max6 <= min8) {
                        fArr6[max6] = fArr6[max6] + ajVar15.e;
                        max6++;
                        i51 = i51;
                    }
                }
                i53++;
                i51 = i51;
            }
            int i54 = i51;
            float f38 = 0.0f;
            for (int i55 = 0; i55 < i52; i55++) {
                float f39 = fArr6[i55];
                if (f38 < f39) {
                    f38 = f39;
                }
            }
            ajVar14.q = f38;
            i51 = i54 + 1;
        }
        for (int i56 = 0; i56 < size; i56++) {
            org.telegram.messenger.aj ajVar16 = (org.telegram.messenger.aj) arrayList2.get(i56);
            byte b22 = ajVar16.c;
            int i57 = this.c + 1;
            float[] fArr7 = new float[i57];
            Arrays.fill(fArr7, 0.0f);
            int size4 = arrayList2.size();
            for (int i58 = 0; i58 < size4; i58++) {
                org.telegram.messenger.aj ajVar17 = (org.telegram.messenger.aj) arrayList2.get(i58);
                if (ajVar17 != ajVar16 && ajVar17.d < b22) {
                    for (int i59 = ajVar17.a; i59 <= ajVar17.b; i59++) {
                        fArr7[i59] = fArr7[i59] + ajVar17.f;
                    }
                }
            }
            float f40 = 0.0f;
            for (int i60 = 0; i60 < i57; i60++) {
                float f41 = fArr7[i60];
                if (f40 < f41) {
                    f40 = f41;
                }
            }
            ajVar16.p = f40;
        }
        int[] iArr3 = new int[10];
        Arrays.fill(iArr3, 0);
        int size5 = arrayList2.size();
        for (int i61 = 0; i61 < size5; i61++) {
            org.telegram.messenger.aj ajVar18 = (org.telegram.messenger.aj) arrayList2.get(i61);
            int i62 = ajVar18.e;
            for (int i63 = ajVar18.c; i63 <= ajVar18.d; i63++) {
                iArr3[i63] = iArr3[i63] + i62;
            }
        }
        int i64 = iArr3[0];
        for (int i65 = 1; i65 < 10; i65++) {
            int i66 = iArr3[i65];
            if (i64 < i66) {
                i64 = i66;
            }
        }
        this.b = i64;
        float[] fArr8 = new float[10];
        Arrays.fill(fArr8, 0.0f);
        int size6 = arrayList2.size();
        for (int i67 = 0; i67 < size6; i67++) {
            org.telegram.messenger.aj ajVar19 = (org.telegram.messenger.aj) arrayList2.get(i67);
            float f42 = ajVar19.f;
            for (int i68 = ajVar19.a; i68 <= ajVar19.b; i68++) {
                fArr8[i68] = fArr8[i68] + f42;
            }
        }
        float f43 = fArr8[0];
        for (int i69 = 1; i69 < 10; i69++) {
            float f44 = fArr8[i69];
            if (f43 < f44) {
                f43 = f44;
            }
        }
        this.a = f43;
    }

    public vl(bm bmVar, ArrayList arrayList) {
        this.h = bmVar;
        this.e = new ArrayList();
        this.g = new HashMap();
        this.f = arrayList;
        a();
    }
}
