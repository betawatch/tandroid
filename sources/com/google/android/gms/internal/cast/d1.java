package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d1 implements b0, u, g5 {
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
                            char c10 = bArr[i13];
                            if (c10 <= 65471 && ((i11 != -32 || c10 >= 65440) && (i11 != -19 || c10 < 65440))) {
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

    @Override // com.google.android.gms.internal.cast.u
    public void zza() {
    }

    @Override // com.google.android.gms.internal.cast.b0
    public Object zza() {
        r5.b bVar = t6.n;
        r5.b bVar2 = n5.a.l;
        y5.l.e("Must be called from the main thread.");
        n5.a aVar = n5.a.n;
        y5.l.h(aVar);
        y5.l.e("Must be called from the main thread.");
        return aVar.e.a;
    }
}
