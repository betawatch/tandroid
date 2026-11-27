package org.jni_zero;

import org.jni_zero.JniPtrImplBase;
import org.jni_zero.JniTypeToken;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
class JniUniquePtrImpl<T extends JniTypeToken> extends JniPtrImplBase<T> implements JniUniquePtr<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long mDeleter;
    private final JniPtrImplBase.Tracker mTracker;

    public JniUniquePtrImpl(long j, long j2, String str) {
        super(j);
        this.mDeleter = j2;
        JniPtrImplBase.TrackerFactory trackerFactory = JniPtrImplBase.sTrackerFactory;
        this.mTracker = trackerFactory == null ? null : trackerFactory.create(this, str);
    }

    @Override // org.jni_zero.JniUniquePtr
    public void destroy() {
        if (this.mNativePtr != 0) {
            JniPtrImplBase.Tracker tracker = this.mTracker;
            if (tracker != null) {
                tracker.destroy();
            }
            long j = this.mNativePtr;
            this.mNativePtr = 0L;
            if (this.mDeleter != 0) {
                CommonApisJni.get().deleteDeleterBasePtr(j, this.mDeleter);
            }
        }
    }

    @Override // org.jni_zero.JniPtrImplBase
    public long getNativePtr() {
        long j = this.mNativePtr;
        if (j != 0) {
            return j;
        }
        grb.i("Safe JNI Pointer violation: Attempted to access a JniUniquePtr after it was destroyed.");
        return 0L;
    }

    public JniUniquePtrImpl(long j, long j2) {
        this(j, j2, null);
    }
}
