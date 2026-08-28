package f7;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class x {
    public static p1.b a(MappedByteBuffer mappedByteBuffer) {
        long j10;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i9 = duplicate.getShort() & 65535;
        if (i9 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                j10 = -1;
                break;
            }
            int i11 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j10 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i11) {
                break;
            }
            i10++;
        }
        if (j10 != -1) {
            duplicate.position(duplicate.position() + ((int) (j10 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j11 = duplicate.getInt() & 4294967295L;
            for (int i12 = 0; i12 < j11; i12++) {
                int i13 = duplicate.getInt();
                long j12 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i13 || 1701669481 == i13) {
                    duplicate.position((int) (j12 + j10));
                    p1.b bVar = new p1.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.d = duplicate;
                    bVar.a = position;
                    int i14 = position - duplicate.getInt(position);
                    bVar.b = i14;
                    bVar.c = ((ByteBuffer) bVar.d).getShort(i14);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
