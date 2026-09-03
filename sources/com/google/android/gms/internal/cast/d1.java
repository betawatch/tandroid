package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d1 implements a0, t, g5 {
    public static final d1 a = new d1();
    public static final /* synthetic */ d1 b = new d1();

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
                            i11 = s6.a(bArr, i13, i10);
                            break;
                        }
                        if (i13 < i10 - 1) {
                            int i17 = i12 + 2;
                            char c3 = bArr[i13];
                            if (c3 <= 65471 && ((i11 != -32 || c3 >= 65440) && (i11 != -19 || c3 < 65440))) {
                                i12 += 3;
                                if (bArr[i17] > 65471) {
                                }
                            }
                            i11 = -1;
                            break;
                        }
                        i11 = s6.a(bArr, i13, i10);
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

    @Override // com.google.android.gms.internal.cast.t
    public void zza() {
    }

    @Override // com.google.android.gms.internal.cast.a0
    public Object zza() {
        u5.b bVar = t6.n;
        u5.b bVar2 = r5.a.l;
        b6.m.e("Must be called from the main thread.");
        r5.a aVar = r5.a.n;
        b6.m.h(aVar);
        b6.m.e("Must be called from the main thread.");
        return aVar.e.a;
    }
}
