package gb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class j implements Iterator {
    public l a;
    public l b = null;
    public int c;
    public final /* synthetic */ m d;
    public final /* synthetic */ int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.a = mVar.f.d;
        this.c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.a;
        m mVar = this.d;
        if (lVar == mVar.f) {
            throw new NoSuchElementException();
        }
        if (mVar.e != this.c) {
            throw new ConcurrentModificationException();
        }
        this.a = lVar.d;
        this.b = lVar;
        return lVar;
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
        l lVar = this.b;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        m mVar = this.d;
        mVar.c(lVar, true);
        this.b = null;
        this.c = mVar.e;
    }
}
