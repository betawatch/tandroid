package com.google.android.gms.internal.cast;

import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c1 implements b0, f5 {
    public static final c1 a = new c1();
    public static final /* synthetic */ c1 b = new c1();

    public static boolean a(int i3, byte[] bArr) {
        int i10;
        int i11 = 0;
        while (i11 < i3 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 < i3) {
            while (i11 < i3) {
                int i12 = i11 + 1;
                i10 = bArr[i11];
                if (i10 < 0) {
                    if (i10 >= -32) {
                        if (i10 >= -16) {
                            if (i12 < i3 - 2) {
                                int i13 = i11 + 2;
                                int i14 = bArr[i12];
                                if (i14 <= -65) {
                                    if ((((i14 + hs.x1) + (i10 << 28)) >> 30) == 0) {
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
                            i10 = r6.a(bArr, i12, i3);
                            break;
                        }
                        if (i12 < i3 - 1) {
                            int i16 = i11 + 2;
                            char c2 = bArr[i12];
                            if (c2 <= 65471 && ((i10 != -32 || c2 >= 65440) && (i10 != -19 || c2 < 65440))) {
                                i11 += 3;
                                if (bArr[i16] > 65471) {
                                }
                            }
                            i10 = -1;
                            break;
                        }
                        i10 = r6.a(bArr, i12, i3);
                        break;
                    }
                    if (i12 < i3) {
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

    @Override // com.google.android.gms.internal.cast.b0
    public Object zza() {
        i6.b bVar = s6.n;
        i6.b bVar2 = f6.a.l;
        p6.m.d("Must be called from the main thread.");
        f6.a aVar = f6.a.n;
        p6.m.g(aVar);
        p6.m.d("Must be called from the main thread.");
        return aVar.e.a;
    }
}
