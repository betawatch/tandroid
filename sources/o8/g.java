package o8;

import h7.wa;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class g extends wa implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ h0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h0 h0Var, SortedMap sortedMap) {
        super(h0Var, sortedMap, 2);
        this.h = h0Var;
    }

    public SortedSet b() {
        return new h(this.h, d());
    }

    @Override // h7.wa, java.util.AbstractMap, java.util.Map
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
        return new g(this.h, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new g(this.h, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new g(this.h, d().tailMap(obj));
    }
}
