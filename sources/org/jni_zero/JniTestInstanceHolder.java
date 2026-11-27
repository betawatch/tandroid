package org.jni_zero;

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class JniTestInstanceHolder {
    static ArrayList<JniTestInstanceHolder> sAllOverrides;
    public Object value;

    private JniTestInstanceHolder() {
    }

    public static synchronized JniTestInstanceHolder create() {
        JniTestInstanceHolder jniTestInstanceHolder;
        synchronized (JniTestInstanceHolder.class) {
            if (sAllOverrides == null) {
                sAllOverrides = new ArrayList<>();
            }
            jniTestInstanceHolder = new JniTestInstanceHolder();
            sAllOverrides.add(jniTestInstanceHolder);
        }
        return jniTestInstanceHolder;
    }
}
