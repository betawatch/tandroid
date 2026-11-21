package androidx.datastore.core;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i7);

    public final native int nativeGetCounterValue(long j3);

    public final native int nativeIncrementAndGetCounterValue(long j3);

    public final native int nativeTruncateFile(int i7);
}
