// default package

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class j3 extends e3 implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ fj7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(fj7 fj7Var, SortedMap sortedMap) {
        super(fj7Var, sortedMap, (byte) 0);
        this.h = fj7Var;
    }

    public SortedSet c() {
        return new k3(this.h, e());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override // e3, java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet c = c();
        this.f = c;
        return c;
    }

    public SortedMap e() {
        return (SortedMap) this.d;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return e().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new j3(this.h, e().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new j3(this.h, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new j3(this.h, e().tailMap(obj));
    }
}
