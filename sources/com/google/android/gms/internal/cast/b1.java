package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b1 implements a0, f5 {
    public static final b1 a = new b1();
    public static final /* synthetic */ b1 b = new b1();

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
                            i11 = r6.a(bArr, i13, i10);
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
                        i11 = r6.a(bArr, i13, i10);
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

    @Override // com.google.android.gms.internal.cast.a0
    public Object zza() {
        h6.b bVar = s6.n;
        h6.b bVar2 = e6.a.l;
        o6.l.e("Must be called from the main thread.");
        e6.a aVar = e6.a.n;
        o6.l.h(aVar);
        o6.l.e("Must be called from the main thread.");
        return aVar.e.a;
    }
}
