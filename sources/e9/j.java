package e9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class j extends e implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ p1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p1 p1Var, SortedMap sortedMap) {
        super(p1Var, sortedMap, 0);
        this.h = p1Var;
    }

    public SortedSet b() {
        return new k(this.h, d());
    }

    @Override // e9.e, java.util.AbstractMap, java.util.Map
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
        return new j(this.h, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new j(this.h, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new j(this.h, d().tailMap(obj));
    }
}
