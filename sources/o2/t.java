package o2;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
