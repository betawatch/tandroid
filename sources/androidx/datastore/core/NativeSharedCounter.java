package androidx.datastore.core;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i7);

    public final native int nativeGetCounterValue(long j3);

    public final native int nativeIncrementAndGetCounterValue(long j3);

    public final native int nativeTruncateFile(int i7);
}
