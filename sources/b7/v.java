package b7;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class v extends q implements NavigableSet, f0, SortedSet {
    public final transient Comparator d;
    public transient v e;

    public v(Comparator comparator) {
        this.d = comparator;
    }

    public static c0 x(Comparator comparator) {
        if (y.b.equals(comparator)) {
            return c0.h;
        }
        k kVar = o.b;
        return new c0(a0.e, comparator);
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
        c0 c0Var = (c0) this;
        return c0Var.A(0, c0Var.y(obj, false));
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
        c0 c0Var = (c0) this;
        return c0Var.A(c0Var.z(obj, true), c0Var.f.size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final v descendingSet() {
        v vVar = this.e;
        if (vVar == null) {
            c0 c0Var = (c0) this;
            Comparator reverseOrder = Collections.reverseOrder(c0Var.d);
            vVar = c0Var.isEmpty() ? x(reverseOrder) : new c0(c0Var.f.r(), reverseOrder);
            this.e = vVar;
            vVar.e = this;
        }
        return vVar;
    }

    @Override // java.util.NavigableSet
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final c0 subSet(Object obj, boolean z4, Object obj2, boolean z10) {
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        c0 c0Var = (c0) this;
        c0 A = c0Var.A(c0Var.z(obj, z4), c0Var.f.size());
        return A.A(0, A.y(obj2, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z4) {
        obj.getClass();
        c0 c0Var = (c0) this;
        return c0Var.A(0, c0Var.y(obj, z4));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z4) {
        obj.getClass();
        c0 c0Var = (c0) this;
        return c0Var.A(c0Var.z(obj, z4), c0Var.f.size());
    }
}
