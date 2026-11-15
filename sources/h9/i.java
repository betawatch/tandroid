package h9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class i extends d implements SortedSet {
    public final /* synthetic */ k1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k1 k1Var, SortedMap sortedMap) {
        super(k1Var, sortedMap);
        this.d = k1Var;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return f().comparator();
    }

    public SortedMap f() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return f().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new i(this.d, f().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return f().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new i(this.d, f().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new i(this.d, f().tailMap(obj));
    }
}
