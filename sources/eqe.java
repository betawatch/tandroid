// default package

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class eqe {
    public static int a(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            byte b = byteBuffer.get();
            i |= (b & Byte.MAX_VALUE) << (i2 * 7);
            if ((b & 128) == 0) {
                return i;
            }
        }
        return i;
    }

    public static ArrayList b(ByteBuffer byteBuffer) {
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            try {
                byte b = asReadOnlyBuffer.get();
                int i = (b >> 3) & 15;
                if (((b >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                int a = ((b >> 1) & 1) != 0 ? a(asReadOnlyBuffer) : asReadOnlyBuffer.remaining();
                if (asReadOnlyBuffer.position() + a > asReadOnlyBuffer.limit()) {
                    break;
                }
                duplicate.limit(asReadOnlyBuffer.position());
                ByteBuffer duplicate2 = asReadOnlyBuffer.duplicate();
                duplicate2.limit(asReadOnlyBuffer.position() + a);
                arrayList.add(new eo7(i, duplicate2));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + a);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }
}
