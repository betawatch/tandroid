package ja;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final c b;

    public b(Set set, c cVar) {
        this.a = b(set);
        this.b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.a);
            sb.append('/');
            sb.append(aVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.a;
        c cVar = this.b;
        synchronized (((HashSet) cVar.a)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.a);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.B());
    }
}
