package androidx.datastore.core;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i);

    public final native int nativeGetCounterValue(long j);

    public final native int nativeIncrementAndGetCounterValue(long j);

    public final native int nativeTruncateFile(int i);
}
