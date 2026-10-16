package gb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class l implements Iterator {
    public n a;
    public n b = null;
    public int c;
    public final /* synthetic */ o d;
    public final /* synthetic */ int e;

    public l(o oVar, int i10) {
        this.e = i10;
        this.d = oVar;
        this.a = oVar.f.d;
        this.c = oVar.e;
    }

    public final Object a() {
        return b();
    }

    public final n b() {
        n nVar = this.a;
        o oVar = this.d;
        if (nVar == oVar.f) {
            throw new NoSuchElementException();
        }
        if (oVar.e != this.c) {
            throw new ConcurrentModificationException();
        }
        this.a = nVar.d;
        this.b = nVar;
        return nVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        n nVar = this.b;
        if (nVar == null) {
            throw new IllegalStateException();
        }
        o oVar = this.d;
        oVar.c(nVar, true);
        this.b = null;
        this.c = oVar.e;
    }
}
