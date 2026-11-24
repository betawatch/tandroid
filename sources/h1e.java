// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class h1e extends AbstractList implements rod, RandomAccess {
    public final fod a;

    public h1e(fod fodVar) {
        this.a = fodVar;
    }

    @Override // rod
    public final List c() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        fed fedVar = new fed((byte) 2);
        fedVar.b = this.a.iterator();
        return fedVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        i1e i1eVar = new i1e((byte) 0);
        i1eVar.b = this.a.listIterator(i);
        return i1eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // rod
    public final rod g() {
        return this;
    }
}
