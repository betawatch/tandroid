package m1;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.k implements rd.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ t0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(t0 t0Var, int i7) {
        super(0);
        this.b = i7;
        this.c = t0Var;
    }

    @Override // rd.a
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
                        NativeSharedCounter nativeSharedCounter = z0.b;
                        if (nativeSharedCounter.nativeTruncateFile(fd2) != 0) {
                            throw new IOException("Failed to truncate counter file");
                        }
                        long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd2);
                        if (nativeCreateSharedCounter < 0) {
                            throw new IOException("Failed to mmap counter file");
                        }
                        z0 z0Var = new z0(nativeCreateSharedCounter);
                        parcelFileDescriptor.close();
                        return z0Var;
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
