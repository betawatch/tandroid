package o2;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
