package j7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class y8 {
    public static int a(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int a2 = g9.a(obj);
        int i13 = a2 & i10;
        int b10 = b(i13, obj3);
        if (b10 != 0) {
            int i14 = ~i10;
            int i15 = a2 & i14;
            int i16 = -1;
            while (true) {
                i11 = b10 - 1;
                i12 = iArr[i11];
                if ((i12 & i14) != i15 || !k7.i.a(obj, objArr[i11]) || (objArr2 != null && !k7.i.a(obj2, objArr2[i11]))) {
                    int i17 = i12 & i10;
                    if (i17 == 0) {
                        break;
                    }
                    i16 = i11;
                    b10 = i17;
                }
            }
            int i18 = i12 & i10;
            if (i16 == -1) {
                d(i13, i18, obj3);
                return i11;
            }
            iArr[i16] = (i18 & i10) | (iArr[i16] & i14);
            return i11;
        }
        return -1;
    }

    public static int b(int i10, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    public static Object c(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(kh.a2.j(i10, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static void d(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
