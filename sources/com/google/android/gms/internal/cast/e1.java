package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e1 implements c0, i5 {
    public static final e1 a = new e1();
    public static final /* synthetic */ e1 b = new e1();

    public static boolean a(int i10, byte[] bArr) {
        int i11;
        int i12 = 0;
        while (i12 < i10 && bArr[i12] >= 0) {
            i12++;
        }
        if (i12 < i10) {
            while (i12 < i10) {
                int i13 = i12 + 1;
                i11 = bArr[i12];
                if (i11 < 0) {
                    if (i11 >= -32) {
                        if (i11 >= -16) {
                            if (i13 < i10 - 2) {
                                int i14 = i12 + 2;
                                int i15 = bArr[i13];
                                if (i15 <= -65) {
                                    if ((((i15 + 112) + (i11 << 28)) >> 30) == 0) {
                                        int i16 = i12 + 3;
                                        if (bArr[i14] <= 65471) {
                                            i12 += 4;
                                            if (bArr[i16] > 65471) {
                                            }
                                        }
                                    }
                                }
                                i11 = -1;
                                break;
                            }
                            i11 = u6.a(bArr, i13, i10);
                            break;
                        }
                        if (i13 < i10 - 1) {
                            int i17 = i12 + 2;
                            char c10 = bArr[i13];
                            if (c10 <= 65471 && ((i11 != -32 || c10 >= 65440) && (i11 != -19 || c10 < 65440))) {
                                i12 += 3;
                                if (bArr[i17] > 65471) {
                                }
                            }
                            i11 = -1;
                            break;
                        }
                        i11 = u6.a(bArr, i13, i10);
                        break;
                    }
                    if (i13 < i10) {
                        if (i11 >= -62) {
                            i12 += 2;
                            if (bArr[i13] > 65471) {
                            }
                        }
                        i11 = -1;
                        break;
                    }
                    break;
                }
                i12 = i13;
            }
        }
        i11 = 0;
        return i11 == 0;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public Object zza() {
        g6.b bVar = v6.n;
        g6.b bVar2 = d6.a.l;
        n6.l.e("Must be called from the main thread.");
        d6.a aVar = d6.a.n;
        n6.l.h(aVar);
        n6.l.e("Must be called from the main thread.");
        return aVar.e.a;
    }
}
