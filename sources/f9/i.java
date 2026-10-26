package f9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class i extends d implements SortedSet {
    public final /* synthetic */ k1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k1 k1Var, SortedMap sortedMap) {
        super(k1Var, sortedMap);
        this.d = k1Var;
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
        return new i(this.d, h().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return h().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new i(this.d, h().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new i(this.d, h().tailMap(obj));
    }
}
