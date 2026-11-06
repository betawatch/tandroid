package a8;

import java.util.ArrayDeque;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class a1 {
    public static byte[] a(ArrayDeque arrayDeque, int i7) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i7) {
            return bArr;
        }
        int length = i7 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i7);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i7 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(ab.d dVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(TLObject.FLAG_13, Math.max(128, Integer.highestOneBit(0) * 2));
        int i7 = 0;
        while (i7 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i7);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < min2) {
                int read = dVar.read(bArr, i10, min2 - i10);
                if (read == -1) {
                    return a(arrayDeque, i7);
                }
                i10 += read;
                i7 += read;
            }
            long j3 = min * (min < 4096 ? 4 : 2);
            min = j3 > 2147483647L ? ConnectionsManager.DEFAULT_DATACENTER_ID : j3 < -2147483648L ? TLObject.FLAG_31 : (int) j3;
        }
        if (dVar.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
