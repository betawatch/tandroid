package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class i1 {
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
    public static int a(Object obj, Object obj2, int i3, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int a10 = j1.a(obj);
        int i10 = a10 & i3;
        int b10 = b(i10, obj3);
        if (b10 != 0) {
            int i11 = ~i3;
            int i12 = a10 & i11;
            int i13 = -1;
            while (true) {
                int i14 = b10 - 1;
                int i15 = iArr[i14];
                int i16 = i15 & i3;
                if ((i15 & i11) != i12 || !m1.a(obj, objArr[i14]) || (objArr2 != null && !m1.a(obj2, objArr2[i14]))) {
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

    public static int b(int i3, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i3] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i3] : ((int[]) obj)[i3];
    }

    public static Object c(int i3) {
        if (i3 < 2 || i3 > 1073741824 || Integer.highestOneBit(i3) != i3) {
            throw new IllegalArgumentException(k2.p1.i(i3, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i3 <= 256 ? new byte[i3] : i3 <= 65536 ? new short[i3] : new int[i3];
    }

    public static void d(int i3, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i3] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i3] = (short) i10;
        } else {
            ((int[]) obj)[i3] = i10;
        }
    }
}
