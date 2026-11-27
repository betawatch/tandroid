package org.jni_zero;

import org.jni_zero.JniPtrImplBase;
import org.jni_zero.JniTypeToken;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public interface JniRawPtr<T extends JniTypeToken> extends JniPtr<T> {

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
