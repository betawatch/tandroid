// default package

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ih7 {
    public final LinkedHashMap a;
    public final l69 b;

    public ih7(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new l69(z);
    }

    public final Map a() {
        ku7 ku7Var;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int b = qi6.b(al2.c(entrySet, 10));
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                ku7Var = new ku7(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                ku7Var = new ku7(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(ku7Var.a, ku7Var.b);
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.b).get()) {
            sc8.j("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(lg8 lg8Var, Object obj) {
        lg8Var.getClass();
        d(lg8Var, obj);
    }

    public final void d(lg8 lg8Var, Object obj) {
        lg8Var.getClass();
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(lg8Var);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(yk2.m((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(lg8Var, unmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(lg8Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(lg8Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x0026->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof ih7) {
            LinkedHashMap linkedHashMap = ((ih7) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = rp5.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final String toString() {
        return yk2.f(this.a.entrySet(), ",\n", "{\n", "\n}", cb4.d, 24);
    }

    public /* synthetic */ ih7(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
