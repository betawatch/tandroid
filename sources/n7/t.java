package n7;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class t extends p implements NavigableSet, d0, SortedSet {
    public final transient Comparator d;
    public transient t e;

    public t(Comparator comparator) {
        this.d = comparator;
    }

    public static a0 x(Comparator comparator) {
        if (w.b.equals(comparator)) {
            return a0.h;
        }
        j jVar = n.b;
        return new a0(y.e, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.d;
    }

    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet headSet(Object obj) {
        obj.getClass();
        a0 a0Var = (a0) this;
        return a0Var.A(0, a0Var.y(obj, false));
    }

    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet tailSet(Object obj) {
        obj.getClass();
        a0 a0Var = (a0) this;
        return a0Var.A(a0Var.z(obj, true), a0Var.f.size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final t descendingSet() {
        t tVar = this.e;
        if (tVar == null) {
            a0 a0Var = (a0) this;
            Comparator reverseOrder = Collections.reverseOrder(a0Var.d);
            tVar = a0Var.isEmpty() ? x(reverseOrder) : new a0(a0Var.f.r(), reverseOrder);
            this.e = tVar;
            tVar.e = this;
        }
        return tVar;
    }

    @Override // java.util.NavigableSet
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final a0 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        a0 a0Var = (a0) this;
        a0 A = a0Var.A(a0Var.z(obj, z10), a0Var.f.size());
        return A.A(0, A.y(obj2, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        a0 a0Var = (a0) this;
        return a0Var.A(0, a0Var.y(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        a0 a0Var = (a0) this;
        return a0Var.A(a0Var.z(obj, z10), a0Var.f.size());
    }
}
