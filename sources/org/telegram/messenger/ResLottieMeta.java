package org.telegram.messenger;

import java.io.BufferedInputStream;
import java.io.IOException;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class ResLottieMeta {
    private static final String ASSET_NAME = "lottie_meta.bin";
    private static final int ENTRY_SIZE = 8;
    public static final long NOT_FOUND = -1;

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static final class Holder {
        private static final long[] DATA = ResLottieMeta.load();

        private Holder() {
        }
    }

    private ResLottieMeta() {
    }

    public static long find(int i10) {
        long[] jArr = Holder.DATA;
        int length = jArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            long j3 = jArr[i12];
            int resIdOf = resIdOf(j3);
            if (resIdOf < i10) {
                i11 = i12 + 1;
            } else {
                if (resIdOf <= i10) {
                    return j3;
                }
                length = i12 - 1;
            }
        }
        return -1L;
    }

    public static int fpsOf(long j3) {
        return (int) ((j3 >>> 24) & 255);
    }

    public static int frameCountOf(long j3) {
        return (int) (j3 & 8388607);
    }

    public static boolean isMonoColorOf(long j3) {
        return (j3 & 8388608) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long[] load() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(ApplicationLoader.applicationContext.getResources().getAssets().open(ASSET_NAME));
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
                return jArr;
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException("Unable to load lottie_meta.bin", e);
        } catch (RuntimeException e7) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Unable to load lottie_meta.bin", e7);
            }
            throw e7;
        }
    }

    public static int resIdOf(long j3) {
        return (int) (j3 >>> 32);
    }
}
