package org.telegram.messenger.video;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    public static int usToBytes(long j3, int i10, int i11) {
        return (int) Math.ceil((j3 * ((i10 * 2) * i11)) / 1000000.0d);
    }

    public static int usToShorts(long j3, int i10, int i11) {
        return usToBytes(j3, i10, i11) / 2;
    }
}
