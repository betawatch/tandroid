package org.jni_zero;

import org.jni_zero.JniZero;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
class JniZeroJni implements JniZero.Natives {
    private static JniTestInstanceHolder sOverride;

    public static JniZero.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new JniZeroJni() : (JniZero.Natives) obj;
    }

    public static void setInstanceForTesting(JniZero.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.jni_zero.JniZero.Natives
    public void setJniClassLoader(ClassLoader classLoader) {
        GEN_JNI.org_jni_1zero_JniZero_setJniClassLoader(classLoader);
    }
}
