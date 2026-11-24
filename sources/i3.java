// default package

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class i3 extends d3 implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ wg7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(wg7 wg7Var, SortedMap sortedMap) {
        super(wg7Var, sortedMap, (byte) 0);
        this.h = wg7Var;
    }

    public SortedSet c() {
        return new j3(this.h, e());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override // d3, java.util.AbstractMap, java.util.Map
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
        return new i3(this.h, e().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new i3(this.h, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new i3(this.h, e().tailMap(obj));
    }
}
