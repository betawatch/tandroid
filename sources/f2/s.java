package f2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class s {
    public static final d2.a a = new d2.a(1);

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0185, code lost:
    
        r0 = r25 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0161, code lost:
    
        r25 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x013c, code lost:
    
        r10 = r22[(r18 + r5) - 1];
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x018a, code lost:
    
        r8 = r8 + 1;
        r0 = r19;
        r10 = r20;
        r5 = r21;
        r2 = r22;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        if (r5[r20 - 1] < r21[r20 + 1]) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010f, code lost:
    
        r22 = r2;
        r21 = r5;
        r20 = r10;
        r24 = r11;
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0119, code lost:
    
        if (r0 > r8) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011b, code lost:
    
        r5 = r0 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011f, code lost:
    
        if (r5 == (r8 + r14)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0123, code lost:
    
        if (r5 == (r6 + r14)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0125, code lost:
    
        r10 = r18 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012f, code lost:
    
        if (r22[r10 - 1] >= r22[r10 + 1]) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0132, code lost:
    
        r10 = r22[(r18 + r5) + 1] - 1;
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0143, code lost:
    
        r16 = r10 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        if (r10 <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0147, code lost:
    
        if (r16 <= 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0149, code lost:
    
        r25 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0157, code lost:
    
        if (r27.b((r20 + r10) - 1, (r12 + r16) - 1) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0159, code lost:
    
        r10 = r10 - 1;
        r16 = r16 - 1;
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0163, code lost:
    
        r0 = r18 + r5;
        r22[r0] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0167, code lost:
    
        if (r19 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0169, code lost:
    
        if (r5 < r6) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016b, code lost:
    
        if (r5 > r8) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016d, code lost:
    
        r0 = r21[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016f, code lost:
    
        if (r0 < r10) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0171, code lost:
    
        r6 = new f2.r();
        r6.a = r10;
        r6.b = r10 - r5;
        r6.c = r0 - r10;
        r6.d = r11;
        r6.e = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce A[LOOP:3: B:20:0x00bc->B:24:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7 A[EDGE_INSN: B:25:0x00d7->B:26:0x00d7 BREAK  A[LOOP:3: B:20:0x00bc->B:24:0x00ce], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o c(s sVar, boolean z10) {
        int i9;
        int[] iArr;
        int[] iArr2;
        r rVar;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int e10 = sVar.e();
        int d = sVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        q qVar = new q();
        int i16 = 0;
        qVar.a = 0;
        qVar.b = e10;
        qVar.c = 0;
        qVar.d = d;
        arrayList2.add(qVar);
        int abs = Math.abs(e10 - d) + e10 + d;
        int i17 = abs * 2;
        int[] iArr3 = new int[i17];
        int[] iArr4 = new int[i17];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            q qVar2 = (q) e2.c.k(1, arrayList2);
            int i18 = qVar2.a;
            int i19 = qVar2.b;
            int i20 = qVar2.c;
            int i21 = i19 - i18;
            int i22 = qVar2.d - i20;
            if (i21 >= 1 && i22 >= 1) {
                int i23 = i21 - i22;
                int i24 = ((i21 + i22) + 1) / 2;
                int i25 = (abs - i24) - 1;
                i9 = abs;
                int i26 = abs + i24 + 1;
                Arrays.fill(iArr3, i25, i26, i16);
                Arrays.fill(iArr4, i25 + i23, i26 + i23, i21);
                boolean z12 = i23 % 2 != 0;
                int i27 = 0;
                while (i27 <= i24) {
                    int i28 = -i27;
                    boolean z13 = z12;
                    int i29 = i28;
                    while (true) {
                        if (i29 > i27) {
                            break;
                        }
                        if (i29 != i28) {
                            if (i29 != i27) {
                                int i30 = i9 + i29;
                                iArr = iArr4;
                                iArr2 = iArr3;
                            } else {
                                iArr = iArr4;
                                iArr2 = iArr3;
                            }
                            i10 = iArr2[(i9 + i29) - 1] + 1;
                            z11 = true;
                            i11 = i18;
                            i12 = i10 - i29;
                            while (i10 < i21 && i12 < i22) {
                                i15 = i12;
                                i13 = i21;
                                if (sVar.b(i11 + i10, i20 + i15)) {
                                    break;
                                }
                                i10++;
                                i12 = i15 + 1;
                                i21 = i13;
                            }
                            i13 = i21;
                            int i31 = i9 + i29;
                            iArr2[i31] = i10;
                            if (!z13 && i29 >= (i23 - i27) + 1 && i29 <= (i23 + i27) - 1 && i10 >= (i14 = iArr[i31])) {
                                rVar = new r();
                                rVar.a = i14;
                                rVar.b = i14 - i29;
                                rVar.c = i10 - i14;
                                rVar.d = z11;
                                rVar.e = false;
                                break;
                            }
                            i29 += 2;
                            i18 = i11;
                            iArr3 = iArr2;
                            iArr4 = iArr;
                            i21 = i13;
                        } else {
                            iArr = iArr4;
                            iArr2 = iArr3;
                        }
                        i10 = iArr2[i9 + i29 + 1];
                        z11 = false;
                        i11 = i18;
                        i12 = i10 - i29;
                        while (i10 < i21) {
                            i15 = i12;
                            i13 = i21;
                            if (sVar.b(i11 + i10, i20 + i15)) {
                            }
                        }
                        i13 = i21;
                        int i312 = i9 + i29;
                        iArr2[i312] = i10;
                        if (!z13) {
                        }
                        i29 += 2;
                        i18 = i11;
                        iArr3 = iArr2;
                        iArr4 = iArr;
                        i21 = i13;
                    }
                }
                throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
            }
            i9 = abs;
            iArr = iArr4;
            iArr2 = iArr3;
            rVar = null;
            if (rVar != null) {
                if (rVar.c > 0) {
                    arrayList.add(rVar);
                }
                rVar.a += qVar2.a;
                rVar.b += qVar2.c;
                q qVar3 = arrayList3.isEmpty() ? new q() : (q) e2.c.k(1, arrayList3);
                qVar3.a = qVar2.a;
                qVar3.c = qVar2.c;
                if (rVar.e) {
                    qVar3.b = rVar.a;
                    qVar3.d = rVar.b;
                } else if (rVar.d) {
                    qVar3.b = rVar.a - 1;
                    qVar3.d = rVar.b;
                } else {
                    qVar3.b = rVar.a;
                    qVar3.d = rVar.b - 1;
                }
                arrayList2.add(qVar3);
                if (!rVar.e) {
                    int i32 = rVar.a;
                    int i33 = rVar.c;
                    qVar2.a = i32 + i33;
                    qVar2.c = rVar.b + i33;
                } else if (rVar.d) {
                    int i34 = rVar.a;
                    int i35 = rVar.c;
                    qVar2.a = i34 + i35 + 1;
                    qVar2.c = rVar.b + i35;
                } else {
                    int i36 = rVar.a;
                    int i37 = rVar.c;
                    qVar2.a = i36 + i37;
                    qVar2.c = rVar.b + i37 + 1;
                }
                arrayList2.add(qVar2);
            } else {
                arrayList3.add(qVar2);
            }
            abs = i9;
            iArr3 = iArr2;
            iArr4 = iArr;
            i16 = 0;
        }
        int[] iArr5 = iArr3;
        Collections.sort(arrayList, a);
        return new o(sVar, arrayList, iArr5, iArr4, z10);
    }

    public abstract boolean a(int i9, int i10);

    public abstract boolean b(int i9, int i10);

    public abstract int d();

    public abstract int e();
}
