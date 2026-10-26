package f9;

import a8.pb;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class h extends pb implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ k1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k1 k1Var, SortedMap sortedMap) {
        super(k1Var, sortedMap, 1);
        this.h = k1Var;
    }

    public SortedSet b() {
        return new i(this.h, d());
    }

    @Override // a8.pb, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b10 = b();
        this.f = b10;
        return b10;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new h(this.h, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new h(this.h, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new h(this.h, d().tailMap(obj));
    }
}
