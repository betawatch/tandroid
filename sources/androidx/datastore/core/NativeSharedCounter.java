package androidx.datastore.core;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i7);

    public final native int nativeGetCounterValue(long j3);

    public final native int nativeIncrementAndGetCounterValue(long j3);

    public final native int nativeTruncateFile(int i7);
}
