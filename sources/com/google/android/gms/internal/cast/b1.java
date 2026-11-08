package com.google.android.gms.internal.cast;

import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b1 implements a0, e5 {
    public static final b1 a = new b1();
    public static final /* synthetic */ b1 b = new b1();

    public static boolean a(int i7, byte[] bArr) {
        int i10;
        int i11 = 0;
        while (i11 < i7 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 < i7) {
            while (i11 < i7) {
                int i12 = i11 + 1;
                i10 = bArr[i11];
                if (i10 < 0) {
                    if (i10 >= -32) {
                        if (i10 >= -16) {
                            if (i12 < i7 - 2) {
                                int i13 = i11 + 2;
                                int i14 = bArr[i12];
                                if (i14 <= -65) {
                                    if ((((i14 + qs.x1) + (i10 << 28)) >> 30) == 0) {
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
                            i10 = q6.a(bArr, i12, i7);
                            break;
                        }
                        if (i12 < i7 - 1) {
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
                        i10 = q6.a(bArr, i12, i7);
                        break;
                    }
                    if (i12 < i7) {
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

    @Override // com.google.android.gms.internal.cast.a0
    public Object zza() {
        j6.b bVar = r6.n;
        j6.b bVar2 = g6.a.l;
        q6.m.d("Must be called from the main thread.");
        g6.a aVar = g6.a.n;
        q6.m.g(aVar);
        q6.m.d("Must be called from the main thread.");
        return aVar.e.a;
    }
}
