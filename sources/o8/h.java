package o8;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class h extends c implements SortedSet {
    public final /* synthetic */ h0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(h0 h0Var, SortedMap sortedMap) {
        super(h0Var, sortedMap);
        this.d = h0Var;
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
        return new h(this.d, i().headMap(obj));
    }

    public SortedMap i() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return i().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new h(this.d, i().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new h(this.d, i().tailMap(obj));
    }
}
