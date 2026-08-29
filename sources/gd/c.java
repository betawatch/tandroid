package gd;

import i7.c7;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
import sc.i;
import uc.h;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements Iterator, sc.c {
    public int a;
    public Object b;
    public sc.c c;

    public final RuntimeException b() {
        int i10 = this.a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    public final void c(Object obj, h hVar) {
        this.b = obj;
        this.a = 3;
        this.c = hVar;
        tc.a aVar = tc.a.a;
    }

    @Override // sc.c
    public final sc.h getContext() {
        return i.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.a;
            if (i10 != 0) {
                break;
            }
            this.a = 5;
            sc.c cVar = this.c;
            j.b(cVar);
            this.c = null;
            cVar.resumeWith(qc.i.a);
        }
        if (i10 == 1) {
            j.b(null);
            throw null;
        }
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.a;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.a = 1;
            j.b(null);
            throw null;
        }
        if (i10 != 3) {
            throw b();
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

    @Override // sc.c
    public final void resumeWith(Object obj) {
        c7.b(obj);
        this.a = 4;
    }
}
