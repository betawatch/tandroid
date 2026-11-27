package org.jni_zero;

import org.jni_zero.CommonApis;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
class CommonApisJni implements CommonApis.Natives {
    private static JniTestInstanceHolder sOverride;

    public static CommonApis.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new CommonApisJni() : (CommonApis.Natives) obj;
    }

    public static void setInstanceForTesting(CommonApis.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.jni_zero.CommonApis.Natives
    public void deleteDeleterBasePtr(long j, long j2) {
        GEN_JNI.org_jni_1zero_CommonApis_deleteDeleterBasePtr(j, j2);
    }

    @Override // org.jni_zero.CommonApis.Natives
    public void releaseRawPtr(long j) {
        GEN_JNI.org_jni_1zero_CommonApis_releaseRawPtr(j);
    }
}
