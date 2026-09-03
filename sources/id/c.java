package id;

import java.util.Iterator;
import java.util.NoSuchElementException;
import k7.p7;
import kotlin.jvm.internal.j;
import uc.i;
import wc.h;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c implements Iterator, uc.c {
    public int a;
    public Object b;
    public uc.c c;

    public final RuntimeException a() {
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
        vc.a aVar = vc.a.a;
    }

    @Override // uc.c
    public final uc.h getContext() {
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
            uc.c cVar = this.c;
            j.b(cVar);
            this.c = null;
            cVar.resumeWith(sc.i.a);
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
        throw a();
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

    @Override // uc.c
    public final void resumeWith(Object obj) {
        p7.b(obj);
        this.a = 4;
    }
}
