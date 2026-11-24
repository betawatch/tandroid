// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class ezd extends AbstractList implements omd, RandomAccess {
    public final cmd a;

    public ezd(cmd cmdVar) {
        this.a = cmdVar;
    }

    @Override // omd
    public final List c() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        dcd dcdVar = new dcd((byte) 2);
        dcdVar.b = this.a.iterator();
        return dcdVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        fzd fzdVar = new fzd((byte) 0);
        fzdVar.b = this.a.listIterator(i);
        return fzdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // omd
    public final omd g() {
        return this;
    }
}
