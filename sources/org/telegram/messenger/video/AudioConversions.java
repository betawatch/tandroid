package org.telegram.messenger.video;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class AudioConversions {
    private static final int BYTES_PER_SAMPLE_PER_CHANNEL = 2;
    private static final int BYTES_PER_SHORT = 2;
    private static final long MICROSECONDS_PER_SECOND = 1000000;

    public static long bytesToUs(int i7, int i10, int i11) {
        return (i7 * MICROSECONDS_PER_SECOND) / ((i10 * 2) * i11);
    }

    public static long shortsToUs(int i7, int i10, int i11) {
        return bytesToUs(i7 * 2, i10, i11);
    }

    public static int usToBytes(long j3, int i7, int i10) {
        return (int) Math.ceil((j3 * ((i7 * 2) * i10)) / 1000000.0d);
    }

    public static int usToShorts(long j3, int i7, int i10) {
        return usToBytes(j3, i7, i10) / 2;
    }
}
