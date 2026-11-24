// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ehf extends AbstractList implements RandomAccess, sff {
    public final qff a;

    public ehf(qff qffVar) {
        this.a = qffVar;
    }

    @Override // sff
    public final Object b(int i) {
        return this.a.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new dcd(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new fzd(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.b.size();
    }

    @Override // sff
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // sff
    public final sff zzd() {
        return this;
    }
}
