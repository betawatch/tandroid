package k7;

import java.util.Arrays;
import java.util.Collection;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class y7 {
    public static int a(long j10) {
        int i10 = (int) j10;
        c7.b(j10, "Out of range: %s", ((long) i10) == j10);
        return i10;
    }

    public static int b(int i10, int i11, int i12, int[] iArr) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int c(long j10) {
        return j10 > 2147483647L ? ConnectionsManager.DEFAULT_DATACENTER_ID : j10 < -2147483648L ? TLObject.FLAG_31 : (int) j10;
    }

    public static int[] d(Collection collection) {
        if (collection instanceof u8.a) {
            u8.a aVar = (u8.a) collection;
            return Arrays.copyOfRange(aVar.a, aVar.b, aVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
