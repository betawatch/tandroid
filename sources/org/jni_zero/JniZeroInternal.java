package org.jni_zero;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class JniZeroInternal {
    private JniZeroInternal() {
    }

    public static JniRawPtr<?> createRawPtr(long j) {
        if (j == 0) {
            return null;
        }
        return new JniRawPtrImpl(j);
    }

    public static long getNativePtr(JniPtr<?> jniPtr) {
        if (jniPtr == null) {
            return 0L;
        }
        return ((JniPtrImplBase) jniPtr).getNativePtr();
    }
}
