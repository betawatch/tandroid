// default package

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class k3 extends f3 implements SortedSet {
    public final /* synthetic */ fj7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(fj7 fj7Var, SortedMap sortedMap) {
        super(fj7Var, sortedMap);
        this.d = fj7Var;
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
        return new k3(this.d, h().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return h().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new k3(this.d, h().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new k3(this.d, h().tailMap(obj));
    }
}
