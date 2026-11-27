// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class l4f extends AbstractList implements vve, RandomAccess {
    public final gve a;

    public l4f(gve gveVar) {
        this.a = gveVar;
    }

    @Override // vve
    public final Object d(int i) {
        return this.a.b.get(i);
    }

    @Override // vve
    public final void e(jne jneVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        wgd wgdVar = new wgd((byte) 3);
        wgdVar.b = this.a.iterator();
        return wgdVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        v3e v3eVar = new v3e((byte) 1);
        v3eVar.b = this.a.listIterator(i);
        return v3eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // vve
    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // vve
    public final vve zze() {
        return this;
    }
}
