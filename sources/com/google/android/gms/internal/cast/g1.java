package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g1 implements e0, w, k5 {
    public static final g1 a = new g1();
    public static final /* synthetic */ g1 b = new g1();

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
                            i11 = w6.a(bArr, i13, i10);
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
                        i11 = w6.a(bArr, i13, i10);
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

    @Override // com.google.android.gms.internal.cast.w
    public void zza() {
    }

    @Override // com.google.android.gms.internal.cast.e0
    public Object zza() {
        g6.b bVar = x6.n;
        g6.b bVar2 = d6.a.l;
        n6.l.e("Must be called from the main thread.");
        d6.a aVar = d6.a.n;
        n6.l.h(aVar);
        n6.l.e("Must be called from the main thread.");
        return aVar.e.a;
    }
}
