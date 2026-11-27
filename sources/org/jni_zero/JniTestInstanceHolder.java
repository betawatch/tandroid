package org.jni_zero;

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
