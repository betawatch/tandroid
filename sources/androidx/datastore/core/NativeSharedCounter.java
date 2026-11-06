package androidx.datastore.core;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i7);

    public final native int nativeGetCounterValue(long j3);

    public final native int nativeIncrementAndGetCounterValue(long j3);

    public final native int nativeTruncateFile(int i7);
}
