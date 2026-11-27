package org.jni_zero;

import org.jni_zero.JniZero;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
