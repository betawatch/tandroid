// default package

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class j3 extends e3 implements SortedSet {
    public final /* synthetic */ wg7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(wg7 wg7Var, SortedMap sortedMap) {
        super(wg7Var, sortedMap);
        this.d = wg7Var;
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
        return new j3(this.d, h().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return h().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new j3(this.d, h().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new j3(this.d, h().tailMap(obj));
    }
}
