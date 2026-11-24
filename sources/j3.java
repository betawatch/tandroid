// default package

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class j3 extends e3 implements SortedSet {
    public final /* synthetic */ zi7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(zi7 zi7Var, SortedMap sortedMap) {
        super(zi7Var, sortedMap);
        this.d = zi7Var;
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
