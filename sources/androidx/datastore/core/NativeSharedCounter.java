package androidx.datastore.core;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i7);

    public final native int nativeGetCounterValue(long j3);

    public final native int nativeIncrementAndGetCounterValue(long j3);

    public final native int nativeTruncateFile(int i7);
}
