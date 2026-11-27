package org.jni_zero;

import org.jni_zero.JniPtrImplBase;
import org.jni_zero.JniTypeToken;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public interface JniRawPtr<T extends JniTypeToken> extends JniPtr<T> {

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
