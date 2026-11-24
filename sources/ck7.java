// default package

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ck7 implements Iterable {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();

    public ck7(HashMap hashMap) {
        String str = (String) hashMap.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    this.a.put(split[0], split[1]);
                }
            }
        }
    }

    public final void h() {
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            throw kt6.l(it);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.keySet().iterator();
    }
}
