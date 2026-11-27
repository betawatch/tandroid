// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ex2 implements Iterable {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public Set c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int h(mr3 mr3Var) {
        int intValue;
        synchronized (this.a) {
            intValue = this.b.containsKey(mr3Var) ? ((Integer) this.b.get(mr3Var)).intValue() : 0;
        }
        return intValue;
    }

    public final void i(mr3 mr3Var) {
        synchronized (this.a) {
            Integer num = (Integer) this.b.get(mr3Var);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.remove(mr3Var);
            this.d = DesugarCollections.unmodifiableList(arrayList);
            int intValue = num.intValue();
            HashMap hashMap = this.b;
            if (intValue == 1) {
                hashMap.remove(mr3Var);
                HashSet hashSet = new HashSet(this.c);
                hashSet.remove(mr3Var);
                this.c = DesugarCollections.unmodifiableSet(hashSet);
            } else {
                hashMap.put(mr3Var, Integer.valueOf(num.intValue() - 1));
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
