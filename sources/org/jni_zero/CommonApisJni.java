package org.jni_zero;

import org.jni_zero.CommonApis;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
