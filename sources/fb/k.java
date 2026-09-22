package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class k implements Iterator {
    public m a;
    public m b = null;
    public int c;
    public final /* synthetic */ n d;
    public final /* synthetic */ int e;

    public k(n nVar, int i10) {
        this.e = i10;
        this.d = nVar;
        this.a = nVar.f.d;
        this.c = nVar.e;
    }

    public final Object a() {
        return b();
    }

    public final m b() {
        m mVar = this.a;
        n nVar = this.d;
        if (mVar == nVar.f) {
            throw new NoSuchElementException();
        }
        if (nVar.e != this.c) {
            throw new ConcurrentModificationException();
        }
        this.a = mVar.d;
        this.b = mVar;
        return mVar;
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
        m mVar = this.b;
        if (mVar == null) {
            throw new IllegalStateException();
        }
        n nVar = this.d;
        nVar.c(mVar, true);
        this.b = null;
        this.c = nVar.e;
    }
}
