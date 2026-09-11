package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class t0 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        for (p0 p0Var : this.a.values()) {
            p0Var.c = true;
            HashMap hashMap = p0Var.a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        Iterator it = p0Var.a.values().iterator();
                        while (it.hasNext()) {
                            p0.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = p0Var.b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = p0Var.b.iterator();
                        while (it2.hasNext()) {
                            p0.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            p0Var.b();
        }
        this.a.clear();
    }
}
