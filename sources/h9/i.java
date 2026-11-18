package h9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public class i extends d implements SortedSet {
    public final /* synthetic */ l1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l1 l1Var, SortedMap sortedMap) {
        super(l1Var, sortedMap);
        this.d = l1Var;
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
