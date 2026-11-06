package c8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class e1 {
    public static List a(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new l9.b(0, iArr.length, iArr);
    }

    public static int b(long j3) {
        int i7 = (int) j3;
        a8.ia.d(j3, "Out of range: %s", ((long) i7) == j3);
        return i7;
    }

    public static int c(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int d(int i7, int i10, int i11, int[] iArr) {
        while (i10 < i11) {
            if (iArr[i10] == i7) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int e(long j3) {
        return j3 > 2147483647L ? ConnectionsManager.DEFAULT_DATACENTER_ID : j3 < -2147483648L ? TLObject.FLAG_31 : (int) j3;
    }

    public static int[] f(Collection collection) {
        if (collection instanceof l9.b) {
            l9.b bVar = (l9.b) collection;
            return Arrays.copyOfRange(bVar.a, bVar.b, bVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = array[i7];
            obj.getClass();
            iArr[i7] = ((Number) obj).intValue();
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
            int i7 = str.charAt(0) == '-' ? 1 : 0;
            if (i7 != str.length()) {
                int i10 = i7 + 1;
                char charAt = str.charAt(i7);
                if (charAt < 128) {
                    b10 = l9.c.a[charAt];
                } else {
                    byte[] bArr = l9.c.a;
                    b10 = -1;
                }
                if (b10 >= 0 && b10 < 10) {
                    long j3 = -b10;
                    long j10 = 10;
                    long j11 = Long.MIN_VALUE / j10;
                    while (true) {
                        if (i10 < str.length()) {
                            int i11 = i10 + 1;
                            char charAt2 = str.charAt(i10);
                            if (charAt2 < 128) {
                                b11 = l9.c.a[charAt2];
                            } else {
                                byte[] bArr2 = l9.c.a;
                                b11 = -1;
                            }
                            if (b11 < 0 || b11 >= 10 || j3 < j11) {
                                break;
                            }
                            long j12 = j3 * j10;
                            num = null;
                            long j13 = b11;
                            if (j12 < j13 - Long.MIN_VALUE) {
                                break;
                            }
                            j3 = j12 - j13;
                            i10 = i11;
                        } else {
                            num = null;
                            if (i7 != 0) {
                                l10 = Long.valueOf(j3);
                            } else if (j3 != Long.MIN_VALUE) {
                                l10 = Long.valueOf(-j3);
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
