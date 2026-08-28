package f7;

import java.util.ArrayDeque;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class n6 {
    public static byte[] a(ArrayDeque arrayDeque, int i9) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i9) {
            return bArr;
        }
        int length = i9 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i9);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i9 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(com.google.firebase.messaging.d dVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i9 = 0;
        while (i9 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i9);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < min2) {
                int read = dVar.read(bArr, i10, min2 - i10);
                if (read == -1) {
                    return a(arrayDeque, i9);
                }
                i10 += read;
                i9 += read;
            }
            long j10 = min * (min < 4096 ? 4 : 2);
            min = j10 > 2147483647L ? ConnectionsManager.DEFAULT_DATACENTER_ID : j10 < -2147483648L ? TLObject.FLAG_31 : (int) j10;
        }
        if (dVar.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
