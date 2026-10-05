package o2;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class t {
    public SparseArray a;

    public void a(HashMap hashMap) {
        if (this.a == null) {
            this.a = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.a.put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }
}
