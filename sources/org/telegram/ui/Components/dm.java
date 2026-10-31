package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dm {
    public float a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;

    public dm(Context context, m2.t tVar) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.h = new int[]{ConnectionsManager.DEFAULT_DATACENTER_ID, 0};
        this.e = context;
        this.f = tVar;
    }

    public static float b(int i10, int i11, float[] fArr) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return 1000.0f / f7;
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
        float f7;
        float f10;
        int i10;
        char c10;
        float f11;
        boolean z10;
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        ArrayList arrayList2 = (ArrayList) this.e;
        arrayList2.clear();
        HashMap hashMap = (HashMap) this.g;
        hashMap.clear();
        boolean z11 = false;
        if (size == 0) {
            this.b = 0;
            this.a = 0.0f;
            this.c = 0;
            this.d = 0;
            return;
        }
        arrayList2.ensureCapacity(size);
        char[] cArr = new char[size];
        int i11 = 0;
        boolean z12 = false;
        float f12 = 1.0f;
        while (i11 < size) {
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList.get(i11);
            org.telegram.messenger.bj bjVar = new org.telegram.messenger.bj();
            bjVar.h = i11 == size + (-1) ? true : z11;
            org.telegram.messenger.ye yeVar = efVar.A;
            String str = efVar.I;
            int i12 = yeVar != null ? yeVar.s : efVar.F;
            int i13 = yeVar != null ? yeVar.t : efVar.G;
            HashMap hashMap2 = jm.U;
            if (hashMap2.containsKey(efVar)) {
                z10 = ((Boolean) hashMap2.get(efVar)).booleanValue();
            } else {
                if (efVar.b) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(str);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (extractMetadata != null) {
                        if (!extractMetadata.equals("90")) {
                        }
                    }
                    z10 = false;
                    jm.U.put(efVar, Boolean.valueOf(z10));
                } else {
                    int c11 = new r1.g(str).c();
                    if (c11 != 6) {
                    }
                }
                z10 = true;
                jm.U.put(efVar, Boolean.valueOf(z10));
            }
            if (z10) {
                int i14 = i12;
                i12 = i13;
                i13 = i14;
            }
            float f13 = i12 / i13;
            bjVar.g = f13;
            cArr[i11] = f13 > 1.2f ? 'w' : f13 < 0.8f ? 'n' : 'q';
            f12 += f13;
            if (f13 > 2.0f) {
                z12 = true;
            }
            hashMap.put(efVar, bjVar);
            arrayList2.add(bjVar);
            i11++;
            z11 = false;
        }
        float f14 = 1.0f;
        String str2 = new String(cArr);
        int L = org.telegram.messenger.i0.L(120.0f);
        float L2 = org.telegram.messenger.i0.L(120.0f);
        Point point = org.telegram.messenger.i0.q;
        int min = (int) (L2 / (Math.min(point.x, point.y) / 1000.0f));
        int L3 = (int) (org.telegram.messenger.i0.L(40.0f) / (Math.min(point.x, point.y) / 1000.0f));
        float f15 = f12 / size;
        float L4 = org.telegram.messenger.i0.L(100.0f) / 814.0f;
        if (size == 1) {
            org.telegram.messenger.bj bjVar2 = (org.telegram.messenger.bj) arrayList2.get(0);
            int i15 = point.x;
            bjVar2.a((((i15 - (((jm) this.h).b.t0 * 2)) * 0.8f) / bjVar2.g) / (Math.max(i15, point.y) * 0.5f), 0, 0, 0, 0, 800, 15);
        } else {
            char c12 = 4;
            if (z12 || !(size == 2 || size == 3 || size == 4)) {
                int i16 = 2;
                int size2 = arrayList2.size();
                float[] fArr = new float[size2];
                int i17 = 0;
                while (i17 < size) {
                    if (f15 > 1.1f) {
                        f11 = f14;
                        fArr[i17] = Math.max(f11, ((org.telegram.messenger.bj) arrayList2.get(i17)).g);
                    } else {
                        f11 = f14;
                        fArr[i17] = Math.min(f11, ((org.telegram.messenger.bj) arrayList2.get(i17)).g);
                    }
                    fArr[i17] = Math.max(0.66667f, Math.min(1.7f, fArr[i17]));
                    i17++;
                    f14 = f11;
                }
                ArrayList arrayList3 = new ArrayList();
                int i18 = 1;
                while (i18 < size2) {
                    int i19 = size2 - i18;
                    if (i18 <= 3 && i19 <= 3) {
                        float b10 = b(0, i18, fArr);
                        float b11 = b(i18, size2, fArr);
                        cm cmVar = new cm();
                        cmVar.a = new int[]{i18, i19};
                        float[] fArr2 = new float[i16];
                        fArr2[0] = b10;
                        fArr2[1] = b11;
                        cmVar.b = fArr2;
                        arrayList3.add(cmVar);
                    }
                    i18++;
                    i16 = 2;
                }
                for (int i20 = 1; i20 < size2 - 1; i20++) {
                    int i21 = 1;
                    while (true) {
                        int i22 = size2 - i20;
                        if (i21 < i22) {
                            int i23 = i22 - i21;
                            if (i20 <= 3) {
                                if (i21 <= (f15 < 0.85f ? 4 : 3) && i23 <= 3) {
                                    float b12 = b(0, i20, fArr);
                                    int i24 = i20 + i21;
                                    float b13 = b(i20, i24, fArr);
                                    float b14 = b(i24, size2, fArr);
                                    cm cmVar2 = new cm();
                                    cmVar2.a = new int[]{i20, i21, i23};
                                    cmVar2.b = new float[]{b12, b13, b14};
                                    arrayList3.add(cmVar2);
                                }
                            }
                            i21++;
                        }
                    }
                }
                for (int i25 = 1; i25 < size2 - 2; i25++) {
                    int i26 = 1;
                    while (true) {
                        int i27 = size2 - i25;
                        if (i26 < i27) {
                            int i28 = 1;
                            while (true) {
                                int i29 = i27 - i26;
                                if (i28 < i29) {
                                    int i30 = i29 - i28;
                                    if (i25 > 3 || i26 > 3 || i28 > 3 || i30 > 3) {
                                        i10 = size2;
                                        c10 = c12;
                                    } else {
                                        float b15 = b(0, i25, fArr);
                                        int i31 = i25 + i26;
                                        float b16 = b(i25, i31, fArr);
                                        int i32 = i31 + i28;
                                        float b17 = b(i31, i32, fArr);
                                        float b18 = b(i32, size2, fArr);
                                        cm cmVar3 = new cm();
                                        cmVar3.a = new int[]{i25, i26, i28, i30};
                                        i10 = size2;
                                        c10 = 4;
                                        cmVar3.b = new float[]{b15, b16, b17, b18};
                                        arrayList3.add(cmVar3);
                                    }
                                    i28++;
                                    c12 = c10;
                                    size2 = i10;
                                }
                            }
                            i26++;
                        }
                    }
                }
                float f16 = 0.0f;
                cm cmVar4 = null;
                for (int i33 = 0; i33 < arrayList3.size(); i33++) {
                    cm cmVar5 = (cm) arrayList3.get(i33);
                    float f17 = Float.MAX_VALUE;
                    float f18 = 0.0f;
                    int i34 = 0;
                    while (true) {
                        float[] fArr3 = cmVar5.b;
                        if (i34 >= fArr3.length) {
                            break;
                        }
                        float f19 = fArr3[i34];
                        f18 += f19;
                        if (f19 < f17) {
                            f17 = f19;
                        }
                        i34++;
                    }
                    float abs = Math.abs(f18 - 1332.0f);
                    int[] iArr = cmVar5.a;
                    if (iArr.length > 1) {
                        int i35 = iArr[0];
                        int i36 = iArr[1];
                        if (i35 <= i36) {
                            f7 = abs;
                            if (iArr.length <= 2 || i36 <= iArr[2]) {
                                if (iArr.length > 3) {
                                }
                            }
                        } else {
                            f7 = abs;
                        }
                        f10 = f7 * 1.2f;
                        if (f17 < min) {
                            f10 *= 1.5f;
                        }
                        if (cmVar4 != null || f10 < f16) {
                            f16 = f10;
                            cmVar4 = cmVar5;
                        }
                    } else {
                        f7 = abs;
                    }
                    f10 = f7;
                    if (f17 < min) {
                    }
                    if (cmVar4 != null) {
                    }
                    f16 = f10;
                    cmVar4 = cmVar5;
                }
                if (cmVar4 == null) {
                    return;
                }
                int[] iArr2 = cmVar4.a;
                int i37 = 0;
                int i38 = 0;
                while (i37 < iArr2.length) {
                    int i39 = iArr2[i37];
                    float f20 = cmVar4.b[i37];
                    int i40 = 0;
                    org.telegram.messenger.bj bjVar3 = null;
                    int i41 = 1000;
                    while (i40 < i39) {
                        int i42 = (int) (fArr[i38] * f20);
                        i41 -= i42;
                        org.telegram.messenger.bj bjVar4 = (org.telegram.messenger.bj) arrayList2.get(i38);
                        int i43 = i37 == 0 ? 4 : 0;
                        float[] fArr4 = fArr;
                        if (i37 == iArr2.length - 1) {
                            i43 |= 8;
                        }
                        if (i40 == 0) {
                            i43 |= 1;
                            bjVar3 = bjVar4;
                        }
                        if (i40 == i39 - 1) {
                            i43 |= 2;
                            bjVar3 = bjVar4;
                        }
                        int i44 = i40;
                        bjVar4.a(Math.max(L4, f20 / 814.0f), i44, i40, i37, i37, i42, i43);
                        i38++;
                        i40 = i44 + 1;
                        fArr = fArr4;
                    }
                    int i45 = i37;
                    float[] fArr5 = fArr;
                    if (bjVar3 != null) {
                        bjVar3.e += i41;
                        bjVar3.i += i41;
                    }
                    i37 = i45 + 1;
                    fArr = fArr5;
                }
            } else if (size == 2) {
                org.telegram.messenger.bj bjVar5 = (org.telegram.messenger.bj) arrayList2.get(0);
                org.telegram.messenger.bj bjVar6 = (org.telegram.messenger.bj) arrayList2.get(1);
                if (str2.equals("ww") && f15 > 1.2285012f * 1.4d) {
                    float f21 = bjVar5.g;
                    float f22 = bjVar6.g;
                    if (f21 - f22 < 0.2d) {
                        float round = Math.round(Math.min(1000.0f / f21, Math.min(1000.0f / f22, 407.0f))) / 814.0f;
                        bjVar5.a(round, 0, 0, 0, 0, 1000, 7);
                        bjVar6.a(round, 0, 0, 1, 1, 1000, 11);
                    }
                }
                if (str2.equals("ww") || str2.equals("qq")) {
                    float f23 = 500;
                    float round2 = Math.round(Math.min(f23 / bjVar5.g, Math.min(f23 / bjVar6.g, 814.0f))) / 814.0f;
                    bjVar5.a(round2, 0, 0, 0, 0, 500, 13);
                    bjVar6.a(round2, 1, 1, 0, 0, 500, 14);
                } else {
                    float f24 = bjVar5.g;
                    int max = (int) Math.max(400.0f, Math.round((1000.0f / f24) / ((1.0f / bjVar6.g) + (1.0f / f24))));
                    int i46 = 1000 - max;
                    if (i46 < min) {
                        max -= min - i46;
                    } else {
                        min = i46;
                    }
                    float min2 = Math.min(814.0f, Math.round(Math.min(min / bjVar5.g, max / bjVar6.g))) / 814.0f;
                    bjVar5.a(min2, 0, 0, 0, 0, min, 13);
                    bjVar6.a(min2, 1, 1, 0, 0, max, 14);
                }
            } else if (size == 3) {
                org.telegram.messenger.bj bjVar7 = (org.telegram.messenger.bj) arrayList2.get(0);
                org.telegram.messenger.bj bjVar8 = (org.telegram.messenger.bj) arrayList2.get(1);
                org.telegram.messenger.bj bjVar9 = (org.telegram.messenger.bj) arrayList2.get(2);
                if (str2.charAt(0) == 'n') {
                    float f25 = bjVar8.g;
                    float min3 = Math.min(407.0f, Math.round((f25 * 1000.0f) / (bjVar9.g + f25)));
                    int max2 = (int) Math.max(min, Math.min(500.0f, Math.round(Math.min(bjVar9.g * min3, bjVar8.g * r8))));
                    float f26 = (bjVar7.g * 814.0f) + L3;
                    int i47 = 1000 - max2;
                    bjVar7.a(1.0f, 0, 0, 0, 1, Math.round(Math.min(f26, i47)), 13);
                    float f27 = (814.0f - min3) / 814.0f;
                    bjVar8.a(f27, 1, 1, 0, 0, max2, 6);
                    float f28 = min3 / 814.0f;
                    bjVar9.a(f28, 1, 1, 1, 1, max2, 10);
                    bjVar9.i = 1000;
                    bjVar7.m = new float[]{f28, f27};
                    bjVar7.i = i47;
                } else {
                    float round3 = Math.round(Math.min(1000.0f / bjVar7.g, 537.24005f)) / 814.0f;
                    bjVar7.a(round3, 0, 1, 0, 0, 1000, 7);
                    float f29 = 500;
                    float min4 = Math.min(814.0f - round3, Math.round(Math.min(f29 / bjVar8.g, f29 / bjVar9.g))) / 814.0f;
                    float f30 = min4 < L4 ? L4 : min4;
                    bjVar8.a(f30, 0, 0, 1, 1, 500, 9);
                    bjVar9.a(f30, 1, 1, 1, 1, 500, 10);
                }
            } else {
                org.telegram.messenger.bj bjVar10 = (org.telegram.messenger.bj) arrayList2.get(0);
                org.telegram.messenger.bj bjVar11 = (org.telegram.messenger.bj) arrayList2.get(1);
                org.telegram.messenger.bj bjVar12 = (org.telegram.messenger.bj) arrayList2.get(2);
                org.telegram.messenger.bj bjVar13 = (org.telegram.messenger.bj) arrayList2.get(3);
                if (str2.charAt(0) == 'w') {
                    float round4 = Math.round(Math.min(1000.0f / bjVar10.g, 537.24005f)) / 814.0f;
                    bjVar10.a(round4, 0, 2, 0, 0, 1000, 7);
                    float round5 = Math.round(1000.0f / ((bjVar11.g + bjVar12.g) + bjVar13.g));
                    float f31 = min;
                    int max3 = (int) Math.max(f31, Math.min(400.0f, bjVar11.g * round5));
                    int max4 = (int) Math.max(Math.max(f31, 330.0f), bjVar13.g * round5);
                    int i48 = (1000 - max3) - max4;
                    if (i48 < org.telegram.messenger.i0.L(58.0f)) {
                        int L5 = org.telegram.messenger.i0.L(58.0f) - i48;
                        i48 = org.telegram.messenger.i0.L(58.0f);
                        int i49 = L5 / 2;
                        max3 -= i49;
                        max4 -= L5 - i49;
                    }
                    int i50 = max3;
                    float min5 = Math.min(814.0f - round4, round5) / 814.0f;
                    float f32 = min5 < L4 ? L4 : min5;
                    bjVar11.a(f32, 0, 0, 1, 1, i50, 9);
                    bjVar12.a(f32, 1, 1, 1, 1, i48, 8);
                    bjVar13.a(f32, 2, 2, 1, 1, max4, 10);
                } else {
                    int max5 = Math.max(min, Math.round(814.0f / ((1.0f / bjVar13.g) + ((1.0f / bjVar12.g) + (1.0f / bjVar11.g)))));
                    float f33 = L;
                    float f34 = max5;
                    float min6 = Math.min(0.33f, Math.max(f33, f34 / bjVar11.g) / 814.0f);
                    float min7 = Math.min(0.33f, Math.max(f33, f34 / bjVar12.g) / 814.0f);
                    float f35 = (1.0f - min6) - min7;
                    float f36 = (bjVar10.g * 814.0f) + L3;
                    int i51 = 1000 - max5;
                    bjVar10.a(min6 + min7 + f35, 0, 0, 0, 2, Math.round(Math.min(f36, i51)), 13);
                    bjVar11.a(min6, 1, 1, 0, 0, max5, 6);
                    bjVar12.a(min7, 1, 1, 1, 1, max5, 2);
                    bjVar12.i = 1000;
                    bjVar13.a(f35, 1, 1, 2, 2, max5, 10);
                    bjVar13.i = 1000;
                    bjVar10.i = i51;
                    bjVar10.m = new float[]{min6, min7, f35};
                }
            }
        }
        int i52 = 0;
        while (i52 < size) {
            org.telegram.messenger.bj bjVar14 = (org.telegram.messenger.bj) arrayList2.get(i52);
            if (bjVar14.a == 0) {
                bjVar14.i += org.telegram.messenger.zs.e3;
            }
            if ((bjVar14.l & 2) != 0) {
                bjVar14.k = true;
            }
            this.c = Math.max(this.c, (int) bjVar14.b);
            this.d = Math.max(this.d, (int) bjVar14.d);
            byte b19 = bjVar14.c;
            byte b20 = bjVar14.d;
            byte b21 = bjVar14.a;
            int i53 = (b20 - b19) + 1;
            float[] fArr6 = new float[i53];
            Arrays.fill(fArr6, 0.0f);
            int size3 = arrayList2.size();
            int i54 = 0;
            while (i54 < size3) {
                org.telegram.messenger.bj bjVar15 = (org.telegram.messenger.bj) arrayList2.get(i54);
                if (bjVar15 != bjVar14 && bjVar15.b < b21) {
                    int min8 = Math.min((int) bjVar15.d, (int) b20) - b19;
                    int max6 = Math.max(bjVar15.c - b19, 0);
                    while (max6 <= min8) {
                        fArr6[max6] = fArr6[max6] + bjVar15.e;
                        max6++;
                        i52 = i52;
                    }
                }
                i54++;
                i52 = i52;
            }
            int i55 = i52;
            float f37 = 0.0f;
            for (int i56 = 0; i56 < i53; i56++) {
                float f38 = fArr6[i56];
                if (f37 < f38) {
                    f37 = f38;
                }
            }
            bjVar14.q = f37;
            i52 = i55 + 1;
        }
        for (int i57 = 0; i57 < size; i57++) {
            org.telegram.messenger.bj bjVar16 = (org.telegram.messenger.bj) arrayList2.get(i57);
            byte b22 = bjVar16.c;
            int i58 = this.c + 1;
            float[] fArr7 = new float[i58];
            Arrays.fill(fArr7, 0.0f);
            int size4 = arrayList2.size();
            for (int i59 = 0; i59 < size4; i59++) {
                org.telegram.messenger.bj bjVar17 = (org.telegram.messenger.bj) arrayList2.get(i59);
                if (bjVar17 != bjVar16 && bjVar17.d < b22) {
                    for (int i60 = bjVar17.a; i60 <= bjVar17.b; i60++) {
                        fArr7[i60] = fArr7[i60] + bjVar17.f;
                    }
                }
            }
            float f39 = 0.0f;
            for (int i61 = 0; i61 < i58; i61++) {
                float f40 = fArr7[i61];
                if (f39 < f40) {
                    f39 = f40;
                }
            }
            bjVar16.p = f39;
        }
        int[] iArr3 = new int[10];
        Arrays.fill(iArr3, 0);
        int size5 = arrayList2.size();
        for (int i62 = 0; i62 < size5; i62++) {
            org.telegram.messenger.bj bjVar18 = (org.telegram.messenger.bj) arrayList2.get(i62);
            int i63 = bjVar18.e;
            for (int i64 = bjVar18.c; i64 <= bjVar18.d; i64++) {
                iArr3[i64] = iArr3[i64] + i63;
            }
        }
        int i65 = iArr3[0];
        for (int i66 = 1; i66 < 10; i66++) {
            int i67 = iArr3[i66];
            if (i65 < i67) {
                i65 = i67;
            }
        }
        this.b = i65;
        float[] fArr8 = new float[10];
        Arrays.fill(fArr8, 0.0f);
        int size6 = arrayList2.size();
        for (int i68 = 0; i68 < size6; i68++) {
            org.telegram.messenger.bj bjVar19 = (org.telegram.messenger.bj) arrayList2.get(i68);
            float f41 = bjVar19.f;
            for (int i69 = bjVar19.a; i69 <= bjVar19.b; i69++) {
                fArr8[i69] = fArr8[i69] + f41;
            }
        }
        float f42 = fArr8[0];
        for (int i70 = 1; i70 < 10; i70++) {
            float f43 = fArr8[i70];
            if (f42 < f43) {
                f42 = f43;
            }
        }
        this.a = f42;
    }

    public dm(jm jmVar, ArrayList arrayList) {
        this.h = jmVar;
        this.e = new ArrayList();
        this.g = new HashMap();
        this.f = arrayList;
        a();
    }
}
