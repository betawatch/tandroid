package ji;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
