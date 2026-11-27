package org.jni_zero;

import org.jni_zero.JniPtrImplBase;
import org.jni_zero.JniTypeToken;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
class JniRawPtrImpl<T extends JniTypeToken> extends JniPtrImplBase<T> implements JniRawPtr<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    final JniPtrImplBase.Tracker mTracker;

    public JniRawPtrImpl(long j, String str) {
        super(j);
        JniPtrImplBase.TrackerFactory trackerFactory = JniPtrImplBase.sTrackerFactory;
        this.mTracker = trackerFactory == null ? null : trackerFactory.create(this, str);
    }

    @Override // org.jni_zero.JniPtrImplBase
    public long getNativePtr() {
        long j = this.mNativePtr;
        if (j != 0) {
            return j;
        }
        grb.i("Safe JNI Pointer violation: Attempted to use a JniRawPtr after it has already been released.");
        return 0L;
    }

    public void release() {
        if (this.mNativePtr != 0) {
            JniPtrImplBase.Tracker tracker = this.mTracker;
            if (tracker != null) {
                tracker.destroy();
            }
            long j = this.mNativePtr;
            this.mNativePtr = 0L;
            JniPtrImplBase.RawPtrReleaser rawPtrReleaser = JniPtrImplBase.sRawPtrReleaser;
            if (rawPtrReleaser != null) {
                rawPtrReleaser.release(j);
            }
        }
    }

    public JniRawPtrImpl(long j) {
        this(j, null);
    }
}
