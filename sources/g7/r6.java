package g7;

import java.util.Arrays;
import java.util.Collection;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class r6 {
    public static int a(long j10) {
        int i9 = (int) j10;
        if (((long) i9) == j10) {
            return i9;
        }
        throw new IllegalArgumentException(e0.a("Out of range: %s", Long.valueOf(j10)));
    }

    public static int b(int i9, int i10) {
        if (i10 <= 1073741823) {
            return Math.min(Math.max(i9, i10), 1073741823);
        }
        throw new IllegalArgumentException(e0.a("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i10), 1073741823));
    }

    public static int c(int i9, int i10, int i11, int[] iArr) {
        while (i10 < i11) {
            if (iArr[i10] == i9) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int d(long j10) {
        return j10 > 2147483647L ? ConnectionsManager.DEFAULT_DATACENTER_ID : j10 < -2147483648L ? TLObject.FLAG_31 : (int) j10;
    }

    public static int[] e(Collection collection) {
        if (collection instanceof q8.a) {
            q8.a aVar = (q8.a) collection;
            return Arrays.copyOfRange(aVar.a, aVar.b, aVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            Object obj = array[i9];
            obj.getClass();
            iArr[i9] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
