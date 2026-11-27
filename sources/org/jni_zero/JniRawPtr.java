package org.jni_zero;

import org.jni_zero.JniPtrImplBase;
import org.jni_zero.JniTypeToken;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public interface JniRawPtr<T extends JniTypeToken> extends JniPtr<T> {

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    class 1 extends JniRawPtrImpl<JniTypeToken> {
        public 1(long j) {
            super(j);
        }

        @Override // org.jni_zero.JniRawPtrImpl, org.jni_zero.JniRawPtr
        public void release() {
            if (this.mNativePtr != 0) {
                JniPtrImplBase.Tracker tracker = this.mTracker;
                if (tracker != null) {
                    tracker.destroy();
                }
                this.mNativePtr = 0L;
            }
        }
    }

    void release();
}
