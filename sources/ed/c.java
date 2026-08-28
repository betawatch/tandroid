package ed;

import g7.y5;
import java.util.Iterator;
import java.util.NoSuchElementException;
import qc.i;
import sc.h;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements Iterator, qc.c {
    public int a;
    public Object b;
    public qc.c c;

    public final RuntimeException a() {
        int i9 = this.a;
        if (i9 == 4) {
            return new NoSuchElementException();
        }
        if (i9 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    public final void c(Object obj, h hVar) {
        this.b = obj;
        this.a = 3;
        this.c = hVar;
        rc.a aVar = rc.a.a;
    }

    @Override // qc.c
    public final qc.h getContext() {
        return i.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i9;
        while (true) {
            i9 = this.a;
            if (i9 != 0) {
                break;
            }
            this.a = 5;
            qc.c cVar = this.c;
            kotlin.jvm.internal.i.b(cVar);
            this.c = null;
            cVar.resumeWith(oc.i.a);
        }
        if (i9 == 1) {
            kotlin.jvm.internal.i.b(null);
            throw null;
        }
        if (i9 == 2 || i9 == 3) {
            return true;
        }
        if (i9 == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i9 = this.a;
        if (i9 == 0 || i9 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i9 == 2) {
            this.a = 1;
            kotlin.jvm.internal.i.b(null);
            throw null;
        }
        if (i9 != 3) {
            throw a();
        }
        this.a = 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // qc.c
    public final void resumeWith(Object obj) {
        y5.b(obj);
        this.a = 4;
    }
}
