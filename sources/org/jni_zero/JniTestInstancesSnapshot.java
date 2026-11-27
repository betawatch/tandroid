package org.jni_zero;

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class JniTestInstancesSnapshot {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Object[] mValues;

    private JniTestInstancesSnapshot(Object[] objArr) {
        this.mValues = objArr;
    }

    public static void clearAllForTesting() {
        restoreSnapshotForTesting(new JniTestInstancesSnapshot(new Object[0]));
    }

    public static void restoreSnapshotForTesting(JniTestInstancesSnapshot jniTestInstancesSnapshot) {
        synchronized (JniTestInstanceHolder.class) {
            Object[] objArr = jniTestInstancesSnapshot.mValues;
            ArrayList<JniTestInstanceHolder> arrayList = JniTestInstanceHolder.sAllOverrides;
            int length = objArr.length;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < length; i++) {
                arrayList.get(i).value = objArr[i];
            }
            while (length < size) {
                arrayList.get(length).value = null;
                length++;
            }
        }
    }

    public static JniTestInstancesSnapshot snapshotOverridesForTesting() {
        synchronized (JniTestInstanceHolder.class) {
            ArrayList<JniTestInstanceHolder> arrayList = JniTestInstanceHolder.sAllOverrides;
            if (arrayList == null) {
                return new JniTestInstancesSnapshot(new Object[0]);
            }
            Object[] objArr = new Object[arrayList.size()];
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                objArr[i] = arrayList.get(i).value;
            }
            return new JniTestInstancesSnapshot(objArr);
        }
    }
}
