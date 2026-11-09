package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        int i7 = this.c;
        if (i7 == 0) {
            this.a = 2;
        } else {
            t tVar = this.e;
            Object[] objArr = tVar.a;
            int i10 = this.d;
            this.b = objArr[i10];
            this.a = 1;
            this.d = (i10 + 1) % tVar.b;
            this.c = i7 - 1;
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.a;
        if (i7 == 0) {
            return a();
        }
        if (i7 == 1) {
            return true;
        }
        if (i7 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.a;
        if (i7 == 1) {
            this.a = 0;
            return this.b;
        }
        if (i7 == 2 || !a()) {
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
