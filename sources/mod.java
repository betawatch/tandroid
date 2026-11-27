// default package

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class mod extends dnd implements NavigableSet, Iterable, SortedSet {
    public final transient Comparator s;
    public transient mod w;

    public mod(Comparator comparator) {
        super((byte) 4);
        this.s = comparator;
    }

    public static pqd E(Comparator comparator) {
        if (tpd.b == comparator) {
            return pqd.y;
        }
        ukd ukdVar = omd.n;
        return new pqd(fqd.w, comparator);
    }

    @Override // java.util.NavigableSet
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final mod descendingSet() {
        mod modVar = this.w;
        if (modVar == null) {
            pqd pqdVar = (pqd) this;
            Comparator reverseOrder = Collections.reverseOrder(pqdVar.s);
            modVar = pqdVar.isEmpty() ? E(reverseOrder) : new pqd(pqdVar.x.y(), reverseOrder);
            this.w = modVar;
            modVar.w = this;
        }
        return modVar;
    }

    @Override // java.util.NavigableSet
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final pqd subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.s.compare(obj, obj2) > 0) {
            iy8.d();
            return null;
        }
        pqd pqdVar = (pqd) this;
        pqd H = pqdVar.H(pqdVar.G(obj, z), pqdVar.x.size());
        return H.H(0, H.F(obj2, z2));
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.s;
    }

    @Override // java.util.SortedSet
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
        pqd pqdVar = (pqd) this;
        return pqdVar.H(0, pqdVar.F(obj, false));
    }

    @Override // java.util.SortedSet
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
        pqd pqdVar = (pqd) this;
        return pqdVar.H(pqdVar.G(obj, true), pqdVar.x.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        pqd pqdVar = (pqd) this;
        return pqdVar.H(0, pqdVar.F(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        pqd pqdVar = (pqd) this;
        return pqdVar.H(pqdVar.G(obj, z), pqdVar.x.size());
    }
}
