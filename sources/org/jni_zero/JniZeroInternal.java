package org.jni_zero;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
