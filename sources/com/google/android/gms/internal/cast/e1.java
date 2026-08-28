package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e1 implements c0, v, i5 {
    public static final e1 a = new e1();
    public static final /* synthetic */ e1 b = new e1();

    public static boolean a(int i9, byte[] bArr) {
        int i10;
        int i11 = 0;
        while (i11 < i9 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 < i9) {
            while (i11 < i9) {
                int i12 = i11 + 1;
                i10 = bArr[i11];
                if (i10 < 0) {
                    if (i10 >= -32) {
                        if (i10 >= -16) {
                            if (i12 < i9 - 2) {
                                int i13 = i11 + 2;
                                int i14 = bArr[i12];
                                if (i14 <= -65) {
                                    if ((((i14 + 112) + (i10 << 28)) >> 30) == 0) {
                                        int i15 = i11 + 3;
                                        if (bArr[i13] <= 65471) {
                                            i11 += 4;
                                            if (bArr[i15] > 65471) {
                                            }
                                        }
                                    }
                                }
                                i10 = -1;
                                break;
                            }
                            i10 = u6.a(bArr, i12, i9);
                            break;
                        }
                        if (i12 < i9 - 1) {
                            int i16 = i11 + 2;
                            char c10 = bArr[i12];
                            if (c10 <= 65471 && ((i10 != -32 || c10 >= 65440) && (i10 != -19 || c10 < 65440))) {
                                i11 += 3;
                                if (bArr[i16] > 65471) {
                                }
                            }
                            i10 = -1;
                            break;
                        }
                        i10 = u6.a(bArr, i12, i9);
                        break;
                    }
                    if (i12 < i9) {
                        if (i10 >= -62) {
                            i11 += 2;
                            if (bArr[i12] > 65471) {
                            }
                        }
                        i10 = -1;
                        break;
                    }
                    break;
                }
                i11 = i12;
            }
        }
        i10 = 0;
        return i10 == 0;
    }

    @Override // com.google.android.gms.internal.cast.v
    public void zza() {
    }

    @Override // com.google.android.gms.internal.cast.c0
    public Object zza() {
        q5.b bVar = v6.n;
        q5.b bVar2 = n5.a.l;
        x5.l.e("Must be called from the main thread.");
        n5.a aVar = n5.a.n;
        x5.l.h(aVar);
        x5.l.e("Must be called from the main thread.");
        return aVar.e.a;
    }
}
