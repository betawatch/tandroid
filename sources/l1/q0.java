package l1;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.k implements od.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ t0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(t0 t0Var, int i3) {
        super(0);
        this.b = i3;
        this.c = t0Var;
    }

    @Override // od.a
    public final Object invoke() {
        ParcelFileDescriptor parcelFileDescriptor;
        switch (this.b) {
            case 0:
                System.loadLibrary("datastore_shared_counter");
                t0 t0Var = this.c;
                File file = new File(t0Var.b.getAbsolutePath() + t0Var.e);
                t0.f(t0Var, file);
                try {
                    parcelFileDescriptor = ParcelFileDescriptor.open(file, 939524096);
                    try {
                        int fd2 = parcelFileDescriptor.getFd();
                        NativeSharedCounter nativeSharedCounter = a1.b;
                        if (nativeSharedCounter.nativeTruncateFile(fd2) != 0) {
                            throw new IOException("Failed to truncate counter file");
                        }
                        long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd2);
                        if (nativeCreateSharedCounter < 0) {
                            throw new IOException("Failed to mmap counter file");
                        }
                        a1 a1Var = new a1(nativeCreateSharedCounter);
                        parcelFileDescriptor.close();
                        return a1Var;
                    } catch (Throwable th2) {
                        th = th2;
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptor = null;
                }
            default:
                t0 t0Var2 = this.c;
                File file2 = new File(t0Var2.b.getAbsolutePath() + t0Var2.d);
                t0.f(t0Var2, file2);
                return file2;
        }
    }
}
