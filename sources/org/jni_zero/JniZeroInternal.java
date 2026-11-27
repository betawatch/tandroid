package org.jni_zero;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
