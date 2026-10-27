package b2;

import android.os.Bundle;
import android.os.SharedMemory;
import android.system.OsConstants;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k {
    public final SharedMemory a;

    public k(SharedMemory sharedMemory) {
        this.a = sharedMemory;
    }

    public static k a(byte[] bArr) {
        SharedMemory sharedMemory;
        try {
            sharedMemory = SharedMemory.create("BundleableByteArray", bArr.length);
        } catch (Exception e) {
            e = e;
            sharedMemory = null;
        }
        try {
            ByteBuffer mapReadWrite = sharedMemory.mapReadWrite();
            mapReadWrite.put(bArr);
            SharedMemory.unmap(mapReadWrite);
            sharedMemory.setProtect(OsConstants.PROT_READ);
            return new k(sharedMemory);
        } catch (Exception e10) {
            e = e10;
            e2.a.m("BundleableByteArray", "Failed to allocate shared memory for byte array, size=" + bArr.length, e);
            if (sharedMemory != null) {
                sharedMemory.close();
            }
            return null;
        }
    }

    public static byte[] b(Bundle bundle) {
        ByteBuffer byteBuffer;
        SharedMemory sharedMemory = (SharedMemory) bundle.getParcelable(m.f);
        try {
            if (sharedMemory == null) {
                return null;
            }
            try {
                byteBuffer = sharedMemory.mapReadOnly();
                try {
                    byte[] bArr = new byte[sharedMemory.getSize()];
                    byteBuffer.get(bArr);
                    SharedMemory.unmap(byteBuffer);
                    sharedMemory.close();
                    return bArr;
                } catch (Exception e) {
                    e = e;
                    e2.a.m("BundleableByteArray", "Failed to read byte array from shared memory", e);
                    if (byteBuffer != null) {
                        SharedMemory.unmap(byteBuffer);
                    }
                    sharedMemory.close();
                    return null;
                }
            } catch (Exception e10) {
                e = e10;
                byteBuffer = null;
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    SharedMemory.unmap(null);
                }
                sharedMemory.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
