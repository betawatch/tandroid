package org.telegram.messenger.video;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class AudioConversions {
    private static final int BYTES_PER_SAMPLE_PER_CHANNEL = 2;
    private static final int BYTES_PER_SHORT = 2;
    private static final long MICROSECONDS_PER_SECOND = 1000000;

    public static long bytesToUs(int i9, int i10, int i11) {
        return (i9 * MICROSECONDS_PER_SECOND) / ((i10 * 2) * i11);
    }

    public static long shortsToUs(int i9, int i10, int i11) {
        return bytesToUs(i9 * 2, i10, i11);
    }

    public static int usToBytes(long j10, int i9, int i10) {
        return (int) Math.ceil((j10 * ((i9 * 2) * i10)) / 1000000.0d);
    }

    public static int usToShorts(long j10, int i9, int i10) {
        return usToBytes(j10, i9, i10) / 2;
    }
}
