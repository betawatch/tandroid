package a8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class v7 {
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
    public static int a(Object obj, Object obj2, int i7, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int a10 = w7.a(obj);
        int i10 = a10 & i7;
        int b10 = b(i10, obj3);
        if (b10 != 0) {
            int i11 = ~i7;
            int i12 = a10 & i11;
            int i13 = -1;
            while (true) {
                int i14 = b10 - 1;
                int i15 = iArr[i14];
                int i16 = i15 & i7;
                if ((i15 & i11) != i12 || !e8.a(obj, objArr[i14]) || (objArr2 != null && !e8.a(obj2, objArr2[i14]))) {
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

    public static int b(int i7, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i7] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i7] : ((int[]) obj)[i7];
    }

    public static Object c(int i7) {
        if (i7 < 2 || i7 > 1073741824 || Integer.highestOneBit(i7) != i7) {
            throw new IllegalArgumentException(jg.g.j(i7, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i7 <= 256 ? new byte[i7] : i7 <= 65536 ? new short[i7] : new int[i7];
    }

    public static void d(int i7, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i10;
        } else {
            ((int[]) obj)[i7] = i10;
        }
    }
}
