// default package

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class k3 extends f3 implements SortedSet {
    public final /* synthetic */ gj7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(gj7 gj7Var, SortedMap sortedMap) {
        super(gj7Var, sortedMap);
        this.d = gj7Var;
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
