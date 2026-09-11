package e9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class i extends d implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ v0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v0 v0Var, SortedMap sortedMap) {
        super(v0Var, sortedMap, 0);
        this.h = v0Var;
    }

    public SortedSet b() {
        return new j(this.h, d());
    }

    @Override // e9.d, java.util.AbstractMap, java.util.Map
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
        return new i(this.h, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new i(this.h, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new i(this.h, d().tailMap(obj));
    }
}
