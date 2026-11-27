// default package

import java.io.BufferedInputStream;
import java.io.IOException;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class ac9 {
    public static final long[] a;

    static {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(a.b.getResources().getAssets().open("lottie_meta.bin"));
            try {
                int available = bufferedInputStream.available();
                if (available % 8 != 0) {
                    throw new IllegalStateException("lottie_meta.bin has invalid size: " + available);
                }
                int i = available / 8;
                long[] jArr = new long[i];
                SerializedData serializedData = new SerializedData(bufferedInputStream);
                for (int i2 = 0; i2 < i; i2++) {
                    jArr[i2] = serializedData.readInt64(true);
                }
                bufferedInputStream.close();
                a = jArr;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            grb.j("Unable to load lottie_meta.bin", e);
        } catch (RuntimeException e2) {
            if (f11.a) {
                cc4.e("Unable to load lottie_meta.bin", e2);
            }
            throw e2;
        }
    }
}
