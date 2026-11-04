package b8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class od {
    public static List a(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new k9.b(0, iArr.length, iArr);
    }

    public static int b(long j10) {
        int i3 = (int) j10;
        zb.d(j10, "Out of range: %s", ((long) i3) == j10);
        return i3;
    }

    public static int c(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int d(int i3, int i10, int i11, int[] iArr) {
        while (i10 < i11) {
            if (iArr[i10] == i3) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int e(long j10) {
        return j10 > 2147483647L ? ConnectionsManager.DEFAULT_DATACENTER_ID : j10 < -2147483648L ? TLObject.FLAG_31 : (int) j10;
    }

    public static int[] f(Collection collection) {
        if (collection instanceof k9.b) {
            k9.b bVar = (k9.b) collection;
            return Arrays.copyOfRange(bVar.a, bVar.b, bVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            Object obj = array[i3];
            obj.getClass();
            iArr[i3] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Integer g(String str) {
        byte b10;
        Integer num;
        Long l10;
        byte b11;
        str.getClass();
        if (!str.isEmpty()) {
            int i3 = str.charAt(0) == '-' ? 1 : 0;
            if (i3 != str.length()) {
                int i10 = i3 + 1;
                char charAt = str.charAt(i3);
                if (charAt < 128) {
                    b10 = k9.c.a[charAt];
                } else {
                    byte[] bArr = k9.c.a;
                    b10 = -1;
                }
                if (b10 >= 0 && b10 < 10) {
                    long j10 = -b10;
                    long j11 = 10;
                    long j12 = Long.MIN_VALUE / j11;
                    while (true) {
                        if (i10 < str.length()) {
                            int i11 = i10 + 1;
                            char charAt2 = str.charAt(i10);
                            if (charAt2 < 128) {
                                b11 = k9.c.a[charAt2];
                            } else {
                                byte[] bArr2 = k9.c.a;
                                b11 = -1;
                            }
                            if (b11 < 0 || b11 >= 10 || j10 < j12) {
                                break;
                            }
                            long j13 = j10 * j11;
                            num = null;
                            long j14 = b11;
                            if (j13 < j14 - Long.MIN_VALUE) {
                                break;
                            }
                            j10 = j13 - j14;
                            i10 = i11;
                        } else {
                            num = null;
                            if (i3 != 0) {
                                l10 = Long.valueOf(j10);
                            } else if (j10 != Long.MIN_VALUE) {
                                l10 = Long.valueOf(-j10);
                            }
                        }
                    }
                }
                num = null;
                l10 = num;
                return (l10 == 0 && l10.longValue() == ((long) l10.intValue())) ? Integer.valueOf(l10.intValue()) : num;
            }
        }
        l10 = 0;
        num = null;
        if (l10 == 0) {
        }
    }
}
