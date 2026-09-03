package n1;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b {
    public final LinkedHashMap a;
    public final AtomicBoolean b;

    public b(LinkedHashMap linkedHashMap, boolean z4) {
        this.a = linkedHashMap;
        this.b = new AtomicBoolean(z4);
    }

    public final Object a(d key) {
        j.e(key, "key");
        return this.a.get(key);
    }

    public final void b(d key, Object obj) {
        j.e(key, "key");
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            if (atomicBoolean.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            linkedHashMap.remove(key);
        } else {
            if (!(obj instanceof Set)) {
                linkedHashMap.put(key, obj);
                return;
            }
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(tc.g.p((Iterable) obj));
            j.d(unmodifiableSet, "unmodifiableSet(value.toSet())");
            linkedHashMap.put(key, unmodifiableSet);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return j.a(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tc.g.h(this.a.entrySet(), ",\n", "{\n", "\n}", a.b, 24);
    }

    public /* synthetic */ b(boolean z4) {
        this(new LinkedHashMap(), z4);
    }
}
