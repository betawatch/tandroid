package org.telegram.messenger.video;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
