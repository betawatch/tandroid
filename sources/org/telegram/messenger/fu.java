package org.telegram.messenger;

import java.io.BufferedInputStream;
import java.io.IOException;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class fu {
    public static final long[] a;

    static {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(w0.b.getResources().getAssets().open("lottie_meta.bin"));
            try {
                int available = bufferedInputStream.available();
                if (available % 8 != 0) {
                    throw new IllegalStateException("lottie_meta.bin has invalid size: " + available);
                }
                int i10 = available / 8;
                long[] jArr = new long[i10];
                SerializedData serializedData = new SerializedData(bufferedInputStream);
                for (int i11 = 0; i11 < i10; i11++) {
                    jArr[i11] = serializedData.readInt64(true);
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
        } catch (IOException e) {
            throw new RuntimeException("Unable to load lottie_meta.bin", e);
        } catch (RuntimeException e7) {
            if (v2.a) {
                f8.e("Unable to load lottie_meta.bin", e7);
            }
            throw e7;
        }
    }
}
