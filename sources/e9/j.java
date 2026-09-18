package e9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public class j extends e implements SortedSet {
    public final /* synthetic */ v0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v0 v0Var, SortedMap sortedMap) {
        super(v0Var, sortedMap);
        this.d = v0Var;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return i().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return i().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new j(this.d, i().headMap(obj));
    }

    public SortedMap i() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return i().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new j(this.d, i().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new j(this.d, i().tailMap(obj));
    }
}
