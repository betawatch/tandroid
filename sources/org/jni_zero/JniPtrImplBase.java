package org.jni_zero;

import org.jni_zero.JniTypeToken;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
abstract class JniPtrImplBase<T extends JniTypeToken> implements JniPtr<T> {
    static RawPtrReleaser sRawPtrReleaser;
    static TrackerFactory sTrackerFactory;
    long mNativePtr;

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    interface RawPtrReleaser {
        void release(long j);
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    interface Tracker {
        void destroy();
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    interface TrackerFactory {
        Tracker create(Object obj, String str);
    }

    public JniPtrImplBase(long j) {
        this.mNativePtr = j;
    }

    public boolean equals(Object obj) {
        return (obj instanceof JniPtrImplBase) && this.mNativePtr == ((JniPtrImplBase) obj).mNativePtr;
    }

    public abstract long getNativePtr();

    public int hashCode() {
        long j = this.mNativePtr;
        return (int) (j ^ (j >>> 32));
    }
}
