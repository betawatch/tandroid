package jd;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class s implements Iterator {
    public int a;
    public Object b;
    public int c;
    public int d;
    public final /* synthetic */ t e;

    public s(t tVar) {
        this.e = tVar;
        this.c = tVar.d;
        this.d = tVar.c;
    }

    public final boolean a() {
        this.a = 3;
        int i10 = this.c;
        if (i10 == 0) {
            this.a = 2;
        } else {
            t tVar = this.e;
            Object[] objArr = tVar.a;
            int i11 = this.d;
            this.b = objArr[i11];
            this.a = 1;
            this.d = (i11 + 1) % tVar.b;
            this.c = i10 - 1;
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.a;
        if (i10 == 0) {
            return a();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.a;
        if (i10 == 1) {
            this.a = 0;
            return this.b;
        }
        if (i10 == 2 || !a()) {
            throw new NoSuchElementException();
        }
        this.a = 0;
        return this.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
