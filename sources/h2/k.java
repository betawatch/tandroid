package h2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class k implements Iterable {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public Set c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int f(q2.k kVar) {
        int intValue;
        synchronized (this.a) {
            try {
                intValue = this.b.containsKey(kVar) ? ((Integer) this.b.get(kVar)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return intValue;
    }

    public final void i(q2.k kVar) {
        synchronized (this.a) {
            try {
                Integer num = (Integer) this.b.get(kVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(kVar);
                this.d = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.b.remove(kVar);
                    HashSet hashSet = new HashSet(this.c);
                    hashSet.remove(kVar);
                    this.c = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.b.put(kVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }
}
