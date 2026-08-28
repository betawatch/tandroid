package f7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class t8 {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        d(r1, r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Object obj, Object obj2, int i9, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int a2 = u8.a(obj);
        int i10 = a2 & i9;
        int b10 = b(i10, obj3);
        if (b10 != 0) {
            int i11 = ~i9;
            int i12 = a2 & i11;
            int i13 = -1;
            while (true) {
                int i14 = b10 - 1;
                int i15 = iArr[i14];
                int i16 = i15 & i9;
                if ((i15 & i11) != i12 || !x8.a(obj, objArr[i14]) || (objArr2 != null && !x8.a(obj2, objArr2[i14]))) {
                    if (i16 == 0) {
                        break;
                    }
                    i13 = i14;
                    b10 = i16;
                }
            }
        }
        return -1;
    }

    public static int b(int i9, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i9] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i9] : ((int[]) obj)[i9];
    }

    public static Object c(int i9) {
        if (i9 < 2 || i9 > 1073741824 || Integer.highestOneBit(i9) != i9) {
            throw new IllegalArgumentException(j3.r0.l(i9, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i9 <= 256 ? new byte[i9] : i9 <= 65536 ? new short[i9] : new int[i9];
    }

    public static void d(int i9, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i9] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i9] = (short) i10;
        } else {
            ((int[]) obj)[i9] = i10;
        }
    }
}
