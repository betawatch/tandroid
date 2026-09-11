package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
