package org.telegram.messenger.video;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class AudioConversions {
    private static final int BYTES_PER_SAMPLE_PER_CHANNEL = 2;
    private static final int BYTES_PER_SHORT = 2;
    private static final long MICROSECONDS_PER_SECOND = 1000000;

    public static long bytesToUs(int i, int i2, int i3) {
        return (i * MICROSECONDS_PER_SECOND) / ((i2 << 1) * i3);
    }

    public static long shortsToUs(int i, int i2, int i3) {
        return bytesToUs(i << 1, i2, i3);
    }

    public static int usToBytes(long j, int i, int i2) {
        return (int) Math.ceil((j * ((i << 1) * i2)) / 1000000.0d);
    }

    public static int usToShorts(long j, int i, int i2) {
        return usToBytes(j, i, i2) / 2;
    }
}
