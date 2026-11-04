package g9;

import b8.mb;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class h extends mb implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ k1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k1 k1Var, SortedMap sortedMap) {
        super(k1Var, sortedMap, 1);
        this.h = k1Var;
    }

    public SortedSet c() {
        return new i(this.h, e());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override // b8.mb, java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet c2 = c();
        this.f = c2;
        return c2;
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
