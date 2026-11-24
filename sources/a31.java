// default package

import android.os.Bundle;
import android.os.SharedMemory;
import android.system.OsConstants;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class a31 {
    public final SharedMemory a;

    public a31(SharedMemory sharedMemory) {
        this.a = sharedMemory;
    }

    public static a31 a(byte[] bArr) {
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
            return new a31(sharedMemory);
        } catch (Exception e2) {
            e = e2;
            lad.g("BundleableByteArray", "Failed to allocate shared memory for byte array, size=" + bArr.length, e);
            if (sharedMemory != null) {
                sharedMemory.close();
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] b(Bundle bundle) {
        ByteBuffer byteBuffer;
        Throwable th;
        SharedMemory sharedMemory = (SharedMemory) bundle.getParcelable(c31.f);
        if (sharedMemory == null) {
            return null;
        }
        try {
            byteBuffer = sharedMemory.mapReadOnly();
            try {
                try {
                    byte[] bArr = new byte[sharedMemory.getSize()];
                    byteBuffer.get(bArr);
                    SharedMemory.unmap(byteBuffer);
                    sharedMemory.close();
                    return bArr;
                } catch (Exception e) {
                    e = e;
                    lad.g("BundleableByteArray", "Failed to read byte array from shared memory", e);
                    if (byteBuffer != null) {
                        SharedMemory.unmap(byteBuffer);
                    }
                    sharedMemory.close();
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                sharedMemory.close();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            byteBuffer = null;
        } catch (Throwable th3) {
            byteBuffer = null;
            th = th3;
            if (byteBuffer != null) {
            }
            sharedMemory.close();
            throw th;
        }
    }
}
