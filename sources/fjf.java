// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fjf extends AbstractList implements RandomAccess, thf {
    public final rhf a;

    public fjf(rhf rhfVar) {
        this.a = rhfVar;
    }

    @Override // thf
    public final Object b(int i) {
        return this.a.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new fed(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new i1e(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.b.size();
    }

    @Override // thf
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // thf
    public final thf zzd() {
        return this;
    }
}
