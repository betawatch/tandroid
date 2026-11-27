package org.jni_zero;

import org.jni_zero.JniTypeToken;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
abstract class JniPtrImplBase<T extends JniTypeToken> implements JniPtr<T> {
    static RawPtrReleaser sRawPtrReleaser;
    static TrackerFactory sTrackerFactory;
    long mNativePtr;

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    interface RawPtrReleaser {
        void release(long j);
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    interface Tracker {
        void destroy();
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
