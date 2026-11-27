// default package

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class lwe {
    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length << 4) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static sx8 b(byte[] bArr) {
        UUID[] uuidArr;
        ey7 ey7Var = new ey7(bArr);
        if (ey7Var.c < 32) {
            return null;
        }
        ey7Var.N(0);
        int a = ey7Var.a();
        int m = ey7Var.m();
        if (m != a) {
            efd.f("PsshAtomUtil", "Advertised atom size (" + m + ") does not match buffer size: " + a);
            return null;
        }
        int m2 = ey7Var.m();
        if (m2 != 1886614376) {
            c00.p(m2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e = zy0.e(ey7Var.m());
        if (e > 1) {
            c00.p(e, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(ey7Var.u(), ey7Var.u());
        if (e == 1) {
            int E = ey7Var.E();
            uuidArr = new UUID[E];
            for (int i = 0; i < E; i++) {
                uuidArr[i] = new UUID(ey7Var.u(), ey7Var.u());
            }
        } else {
            uuidArr = null;
        }
        int E2 = ey7Var.E();
        int a2 = ey7Var.a();
        if (E2 == a2) {
            byte[] bArr2 = new byte[E2];
            ey7Var.k(0, E2, bArr2);
            return new sx8(uuid, e, bArr2, uuidArr);
        }
        efd.f("PsshAtomUtil", "Atom data size (" + E2 + ") does not match the bytes left: " + a2);
        return null;
    }

    public static byte[] c(UUID uuid, byte[] bArr) {
        sx8 b = b(bArr);
        if (b == null) {
            return null;
        }
        UUID uuid2 = (UUID) b.c;
        if (uuid.equals(uuid2)) {
            return b.b;
        }
        efd.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }
}
