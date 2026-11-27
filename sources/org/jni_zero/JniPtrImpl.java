package org.jni_zero;

import org.jni_zero.JniTypeToken;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
class JniPtrImpl<T extends JniTypeToken> extends JniPtrImplBase<T> {
    public JniPtrImpl(long j) {
        super(j);
        if (j != 0) {
            return;
        }
        lq5.j("JNI Zero internal error: if the pointer is 0, it should be converted to null");
        throw null;
    }

    @Override // org.jni_zero.JniPtrImplBase
    public long getNativePtr() {
        long j = this.mNativePtr;
        if (j != 0) {
            return j;
        }
        grb.i("Safe JNI Pointer violation: Attempted to access a JniPtr after it was released.");
        return 0L;
    }

    public void release() {
        this.mNativePtr = 0L;
    }
}
