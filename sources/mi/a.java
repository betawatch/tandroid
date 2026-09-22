package mi;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class a {
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
