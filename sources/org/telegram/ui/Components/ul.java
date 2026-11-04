package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ul {
    public float a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;

    public ul(Context context, i9 i9Var) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.h = new int[]{ConnectionsManager.DEFAULT_DATACENTER_ID, 0};
        this.e = context;
        this.f = i9Var;
    }

    public static float b(int i3, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i3 < i10) {
            f10 += fArr[i3];
            i3++;
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
        int i3;
        char c2;
        float f12;
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
        int i10 = 0;
        boolean z12 = false;
        float f13 = 1.0f;
        while (i10 < size) {
            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) arrayList.get(i10);
            org.telegram.messenger.ri riVar = new org.telegram.messenger.ri();
            riVar.h = i10 == size + (-1) ? true : z11;
            org.telegram.messenger.re reVar = yeVar.A;
            String str = yeVar.I;
            int i11 = reVar != null ? reVar.s : yeVar.F;
            int i12 = reVar != null ? reVar.t : yeVar.G;
            HashMap hashMap2 = am.V;
            if (hashMap2.containsKey(yeVar)) {
                z10 = ((Boolean) hashMap2.get(yeVar)).booleanValue();
            } else {
                if (yeVar.b) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(str);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (extractMetadata != null) {
                        if (!extractMetadata.equals("90")) {
                        }
                    }
                    z10 = false;
                    am.V.put(yeVar, Boolean.valueOf(z10));
                } else {
                    int c10 = new t1.g(str).c();
                    if (c10 != 6) {
                    }
                }
                z10 = true;
                am.V.put(yeVar, Boolean.valueOf(z10));
            }
            if (z10) {
                int i13 = i11;
                i11 = i12;
                i12 = i13;
            }
            float f14 = i11 / i12;
            riVar.g = f14;
            cArr[i10] = f14 > 1.2f ? 'w' : f14 < 0.8f ? 'n' : 'q';
            f13 += f14;
            if (f14 > 2.0f) {
                z12 = true;
            }
            hashMap.put(yeVar, riVar);
            arrayList2.add(riVar);
            i10++;
            z11 = false;
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
            org.telegram.messenger.ri riVar2 = (org.telegram.messenger.ri) arrayList2.get(0);
            int i14 = point.x;
            riVar2.a((((i14 - (((am) this.h).b.u0 * 2)) * 0.8f) / riVar2.g) / (Math.max(i14, point.y) * 0.5f), 0, 0, 0, 0, 800, 15);
        } else {
            char c11 = 4;
            if (z12 || !(size == 2 || size == 3 || size == 4)) {
                int i15 = 2;
                int size2 = arrayList2.size();
                float[] fArr = new float[size2];
                int i16 = 0;
                while (i16 < size) {
                    if (f16 > 1.1f) {
                        f12 = f15;
                        fArr[i16] = Math.max(f12, ((org.telegram.messenger.ri) arrayList2.get(i16)).g);
                    } else {
                        f12 = f15;
                        fArr[i16] = Math.min(f12, ((org.telegram.messenger.ri) arrayList2.get(i16)).g);
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
                        tl tlVar = new tl();
                        tlVar.a = new int[]{i17, i18};
                        float[] fArr2 = new float[i15];
                        fArr2[0] = b10;
                        fArr2[1] = b11;
                        tlVar.b = fArr2;
                        arrayList3.add(tlVar);
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
                                    tl tlVar2 = new tl();
                                    tlVar2.a = new int[]{i19, i20, i22};
                                    tlVar2.b = new float[]{b12, b13, b14};
                                    arrayList3.add(tlVar2);
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
                                        i3 = size2;
                                        c2 = c11;
                                    } else {
                                        float b15 = b(0, i24, fArr);
                                        int i30 = i24 + i25;
                                        float b16 = b(i24, i30, fArr);
                                        int i31 = i30 + i27;
                                        float b17 = b(i30, i31, fArr);
                                        float b18 = b(i31, size2, fArr);
                                        tl tlVar3 = new tl();
                                        tlVar3.a = new int[]{i24, i25, i27, i29};
                                        i3 = size2;
                                        c2 = 4;
                                        tlVar3.b = new float[]{b15, b16, b17, b18};
                                        arrayList3.add(tlVar3);
                                    }
                                    i27++;
                                    c11 = c2;
                                    size2 = i3;
                                }
                            }
                            i25++;
                        }
                    }
                }
                float f17 = 0.0f;
                tl tlVar4 = null;
                for (int i32 = 0; i32 < arrayList3.size(); i32++) {
                    tl tlVar5 = (tl) arrayList3.get(i32);
                    float f18 = Float.MAX_VALUE;
                    float f19 = 0.0f;
                    int i33 = 0;
                    while (true) {
                        float[] fArr3 = tlVar5.b;
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
                    int[] iArr = tlVar5.a;
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
                        if (tlVar4 != null || f11 < f17) {
                            f17 = f11;
                            tlVar4 = tlVar5;
                        }
                    } else {
                        f10 = abs;
                    }
                    f11 = f10;
                    if (f18 < min) {
                    }
                    if (tlVar4 != null) {
                    }
                    f17 = f11;
                    tlVar4 = tlVar5;
                }
                if (tlVar4 == null) {
                    return;
                }
                int[] iArr2 = tlVar4.a;
                int i36 = 0;
                int i37 = 0;
                while (i36 < iArr2.length) {
                    int i38 = iArr2[i36];
                    float f21 = tlVar4.b[i36];
                    int i39 = 0;
                    org.telegram.messenger.ri riVar3 = null;
                    int i40 = 1000;
                    while (i39 < i38) {
                        int i41 = (int) (fArr[i37] * f21);
                        i40 -= i41;
                        org.telegram.messenger.ri riVar4 = (org.telegram.messenger.ri) arrayList2.get(i37);
                        int i42 = i36 == 0 ? 4 : 0;
                        float[] fArr4 = fArr;
                        if (i36 == iArr2.length - 1) {
                            i42 |= 8;
                        }
                        if (i39 == 0) {
                            i42 |= 1;
                            riVar3 = riVar4;
                        }
                        if (i39 == i38 - 1) {
                            i42 |= 2;
                            riVar3 = riVar4;
                        }
                        int i43 = i39;
                        riVar4.a(Math.max(L4, f21 / 814.0f), i43, i39, i36, i36, i41, i42);
                        i37++;
                        i39 = i43 + 1;
                        fArr = fArr4;
                    }
                    int i44 = i36;
                    float[] fArr5 = fArr;
                    if (riVar3 != null) {
                        riVar3.e += i40;
                        riVar3.i += i40;
                    }
                    i36 = i44 + 1;
                    fArr = fArr5;
                }
            } else if (size == 2) {
                org.telegram.messenger.ri riVar5 = (org.telegram.messenger.ri) arrayList2.get(0);
                org.telegram.messenger.ri riVar6 = (org.telegram.messenger.ri) arrayList2.get(1);
                if (str2.equals("ww") && f16 > 1.2285012f * 1.4d) {
                    float f22 = riVar5.g;
                    float f23 = riVar6.g;
                    if (f22 - f23 < 0.2d) {
                        float round = Math.round(Math.min(1000.0f / f22, Math.min(1000.0f / f23, 407.0f))) / 814.0f;
                        riVar5.a(round, 0, 0, 0, 0, 1000, 7);
                        riVar6.a(round, 0, 0, 1, 1, 1000, 11);
                    }
                }
                if (str2.equals("ww") || str2.equals("qq")) {
                    float f24 = 500;
                    float round2 = Math.round(Math.min(f24 / riVar5.g, Math.min(f24 / riVar6.g, 814.0f))) / 814.0f;
                    riVar5.a(round2, 0, 0, 0, 0, 500, 13);
                    riVar6.a(round2, 1, 1, 0, 0, 500, 14);
                } else {
                    float f25 = riVar5.g;
                    int max = (int) Math.max(400.0f, Math.round((1000.0f / f25) / ((1.0f / riVar6.g) + (1.0f / f25))));
                    int i45 = 1000 - max;
                    if (i45 < min) {
                        max -= min - i45;
                    } else {
                        min = i45;
                    }
                    float min2 = Math.min(814.0f, Math.round(Math.min(min / riVar5.g, max / riVar6.g))) / 814.0f;
                    riVar5.a(min2, 0, 0, 0, 0, min, 13);
                    riVar6.a(min2, 1, 1, 0, 0, max, 14);
                }
            } else if (size == 3) {
                org.telegram.messenger.ri riVar7 = (org.telegram.messenger.ri) arrayList2.get(0);
                org.telegram.messenger.ri riVar8 = (org.telegram.messenger.ri) arrayList2.get(1);
                org.telegram.messenger.ri riVar9 = (org.telegram.messenger.ri) arrayList2.get(2);
                if (str2.charAt(0) == 'n') {
                    float f26 = riVar8.g;
                    float min3 = Math.min(407.0f, Math.round((f26 * 1000.0f) / (riVar9.g + f26)));
                    int max2 = (int) Math.max(min, Math.min(500.0f, Math.round(Math.min(riVar9.g * min3, riVar8.g * r8))));
                    float f27 = (riVar7.g * 814.0f) + L3;
                    int i46 = 1000 - max2;
                    riVar7.a(1.0f, 0, 0, 0, 1, Math.round(Math.min(f27, i46)), 13);
                    float f28 = (814.0f - min3) / 814.0f;
                    riVar8.a(f28, 1, 1, 0, 0, max2, 6);
                    float f29 = min3 / 814.0f;
                    riVar9.a(f29, 1, 1, 1, 1, max2, 10);
                    riVar9.i = 1000;
                    riVar7.m = new float[]{f29, f28};
                    riVar7.i = i46;
                } else {
                    float round3 = Math.round(Math.min(1000.0f / riVar7.g, 537.24005f)) / 814.0f;
                    riVar7.a(round3, 0, 1, 0, 0, 1000, 7);
                    float f30 = 500;
                    float min4 = Math.min(814.0f - round3, Math.round(Math.min(f30 / riVar8.g, f30 / riVar9.g))) / 814.0f;
                    float f31 = min4 < L4 ? L4 : min4;
                    riVar8.a(f31, 0, 0, 1, 1, 500, 9);
                    riVar9.a(f31, 1, 1, 1, 1, 500, 10);
                }
            } else {
                org.telegram.messenger.ri riVar10 = (org.telegram.messenger.ri) arrayList2.get(0);
                org.telegram.messenger.ri riVar11 = (org.telegram.messenger.ri) arrayList2.get(1);
                org.telegram.messenger.ri riVar12 = (org.telegram.messenger.ri) arrayList2.get(2);
                org.telegram.messenger.ri riVar13 = (org.telegram.messenger.ri) arrayList2.get(3);
                if (str2.charAt(0) == 'w') {
                    float round4 = Math.round(Math.min(1000.0f / riVar10.g, 537.24005f)) / 814.0f;
                    riVar10.a(round4, 0, 2, 0, 0, 1000, 7);
                    float round5 = Math.round(1000.0f / ((riVar11.g + riVar12.g) + riVar13.g));
                    float f32 = min;
                    int max3 = (int) Math.max(f32, Math.min(400.0f, riVar11.g * round5));
                    int max4 = (int) Math.max(Math.max(f32, 330.0f), riVar13.g * round5);
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
                    riVar11.a(f33, 0, 0, 1, 1, i49, 9);
                    riVar12.a(f33, 1, 1, 1, 1, i47, 8);
                    riVar13.a(f33, 2, 2, 1, 1, max4, 10);
                } else {
                    int max5 = Math.max(min, Math.round(814.0f / ((1.0f / riVar13.g) + ((1.0f / riVar12.g) + (1.0f / riVar11.g)))));
                    float f34 = L;
                    float f35 = max5;
                    float min6 = Math.min(0.33f, Math.max(f34, f35 / riVar11.g) / 814.0f);
                    float min7 = Math.min(0.33f, Math.max(f34, f35 / riVar12.g) / 814.0f);
                    float f36 = (1.0f - min6) - min7;
                    float f37 = (riVar10.g * 814.0f) + L3;
                    int i50 = 1000 - max5;
                    riVar10.a(min6 + min7 + f36, 0, 0, 0, 2, Math.round(Math.min(f37, i50)), 13);
                    riVar11.a(min6, 1, 1, 0, 0, max5, 6);
                    riVar12.a(min7, 1, 1, 1, 1, max5, 2);
                    riVar12.i = 1000;
                    riVar13.a(f36, 1, 1, 2, 2, max5, 10);
                    riVar13.i = 1000;
                    riVar10.i = i50;
                    riVar10.m = new float[]{min6, min7, f36};
                }
            }
        }
        int i51 = 0;
        while (i51 < size) {
            org.telegram.messenger.ri riVar14 = (org.telegram.messenger.ri) arrayList2.get(i51);
            if (riVar14.a == 0) {
                riVar14.i += org.telegram.messenger.hs.e3;
            }
            if ((riVar14.l & 2) != 0) {
                riVar14.k = true;
            }
            this.c = Math.max(this.c, (int) riVar14.b);
            this.d = Math.max(this.d, (int) riVar14.d);
            byte b19 = riVar14.c;
            byte b20 = riVar14.d;
            byte b21 = riVar14.a;
            int i52 = (b20 - b19) + 1;
            float[] fArr6 = new float[i52];
            Arrays.fill(fArr6, 0.0f);
            int size3 = arrayList2.size();
            int i53 = 0;
            while (i53 < size3) {
                org.telegram.messenger.ri riVar15 = (org.telegram.messenger.ri) arrayList2.get(i53);
                if (riVar15 != riVar14 && riVar15.b < b21) {
                    int min8 = Math.min((int) riVar15.d, (int) b20) - b19;
                    int max6 = Math.max(riVar15.c - b19, 0);
                    while (max6 <= min8) {
                        fArr6[max6] = fArr6[max6] + riVar15.e;
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
            riVar14.q = f38;
            i51 = i54 + 1;
        }
        for (int i56 = 0; i56 < size; i56++) {
            org.telegram.messenger.ri riVar16 = (org.telegram.messenger.ri) arrayList2.get(i56);
            byte b22 = riVar16.c;
            int i57 = this.c + 1;
            float[] fArr7 = new float[i57];
            Arrays.fill(fArr7, 0.0f);
            int size4 = arrayList2.size();
            for (int i58 = 0; i58 < size4; i58++) {
                org.telegram.messenger.ri riVar17 = (org.telegram.messenger.ri) arrayList2.get(i58);
                if (riVar17 != riVar16 && riVar17.d < b22) {
                    for (int i59 = riVar17.a; i59 <= riVar17.b; i59++) {
                        fArr7[i59] = fArr7[i59] + riVar17.f;
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
            riVar16.p = f40;
        }
        int[] iArr3 = new int[10];
        Arrays.fill(iArr3, 0);
        int size5 = arrayList2.size();
        for (int i61 = 0; i61 < size5; i61++) {
            org.telegram.messenger.ri riVar18 = (org.telegram.messenger.ri) arrayList2.get(i61);
            int i62 = riVar18.e;
            for (int i63 = riVar18.c; i63 <= riVar18.d; i63++) {
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
            org.telegram.messenger.ri riVar19 = (org.telegram.messenger.ri) arrayList2.get(i67);
            float f42 = riVar19.f;
            for (int i68 = riVar19.a; i68 <= riVar19.b; i68++) {
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

    public ul(am amVar, ArrayList arrayList) {
        this.h = amVar;
        this.e = new ArrayList();
        this.g = new HashMap();
        this.f = arrayList;
        a();
    }
}
