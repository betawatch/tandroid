package org.telegram.messenger;

import java.io.BufferedInputStream;
import java.io.IOException;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class mt {
    public static final long[] a;

    static {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(t0.b.getResources().getAssets().open("lottie_meta.bin"));
            try {
                int available = bufferedInputStream.available();
                if (available % 8 != 0) {
                    throw new IllegalStateException("lottie_meta.bin has invalid size: " + available);
                }
                int i3 = available / 8;
                long[] jArr = new long[i3];
                SerializedData serializedData = new SerializedData(bufferedInputStream);
                for (int i10 = 0; i10 < i3; i10++) {
                    jArr[i10] = serializedData.readInt64(true);
                }
                bufferedInputStream.close();
                a = jArr;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new RuntimeException("Unable to load lottie_meta.bin", e10);
        } catch (RuntimeException e11) {
            if (r2.a) {
                a8.e("Unable to load lottie_meta.bin", e11);
            }
            throw e11;
        }
    }
}
