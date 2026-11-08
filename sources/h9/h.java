package h9;

import a8.kb;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class h extends kb implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ l1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l1 l1Var, SortedMap sortedMap) {
        super(l1Var, sortedMap, 2);
        this.h = l1Var;
    }

    public SortedSet c() {
        return new i(this.h, e());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override // a8.kb, java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet c10 = c();
        this.f = c10;
        return c10;
    }

    public SortedMap e() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return e().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new h(this.h, e().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new h(this.h, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new h(this.h, e().tailMap(obj));
    }
}
