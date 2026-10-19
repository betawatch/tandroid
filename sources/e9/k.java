package e9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public class k extends f implements SortedSet {
    public final /* synthetic */ p1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p1 p1Var, SortedMap sortedMap) {
        super(p1Var, sortedMap);
        this.d = p1Var;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return h().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return h().firstKey();
    }

    public SortedMap h() {
        return (SortedMap) this.b;
    }

    public SortedSet headSet(Object obj) {
        return new k(this.d, h().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return h().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new k(this.d, h().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new k(this.d, h().tailMap(obj));
    }
}
