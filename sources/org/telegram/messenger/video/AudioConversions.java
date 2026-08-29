package org.telegram.messenger.video;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class AudioConversions {
    private static final int BYTES_PER_SAMPLE_PER_CHANNEL = 2;
    private static final int BYTES_PER_SHORT = 2;
    private static final long MICROSECONDS_PER_SECOND = 1000000;

    public static long bytesToUs(int i10, int i11, int i12) {
        return (i10 * MICROSECONDS_PER_SECOND) / ((i11 * 2) * i12);
    }

    public static long shortsToUs(int i10, int i11, int i12) {
        return bytesToUs(i10 * 2, i11, i12);
    }

    public static int usToBytes(long j10, int i10, int i11) {
        return (int) Math.ceil((j10 * ((i10 * 2) * i11)) / 1000000.0d);
    }

    public static int usToShorts(long j10, int i10, int i11) {
        return usToBytes(j10, i10, i11) / 2;
    }
}
