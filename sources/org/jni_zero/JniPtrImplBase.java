package org.jni_zero;

import org.jni_zero.JniTypeToken;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
abstract class JniPtrImplBase<T extends JniTypeToken> implements JniPtr<T> {
    static RawPtrReleaser sRawPtrReleaser;
    static TrackerFactory sTrackerFactory;
    long mNativePtr;

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    interface RawPtrReleaser {
        void release(long j);
    }

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    interface Tracker {
        void destroy();
    }

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
