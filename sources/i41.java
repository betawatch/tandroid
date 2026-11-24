// default package

import android.os.Bundle;
import android.os.SharedMemory;
import android.system.OsConstants;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class i41 {
    public final SharedMemory a;

    public i41(SharedMemory sharedMemory) {
        this.a = sharedMemory;
    }

    public static i41 a(byte[] bArr) {
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
            return new i41(sharedMemory);
        } catch (Exception e2) {
            e = e2;
            ncd.g("BundleableByteArray", "Failed to allocate shared memory for byte array, size=" + bArr.length, e);
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
        SharedMemory sharedMemory = (SharedMemory) bundle.getParcelable(k41.f);
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
                    ncd.g("BundleableByteArray", "Failed to read byte array from shared memory", e);
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
