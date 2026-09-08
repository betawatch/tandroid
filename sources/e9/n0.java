package e9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class n0 extends o1 {
    public int a;
    public Object b;
    public final /* synthetic */ int c;
    public final Iterator d;
    public final /* synthetic */ Object e;

    public n0() {
        this.a = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i10 = this.a;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int c10 = m1.j.c(i10);
        if (c10 == 0) {
            return true;
        }
        if (c10 == 2) {
            return false;
        }
        this.a = 4;
        switch (this.c) {
            case 0:
                do {
                    Iterator it = this.d;
                    if (!it.hasNext()) {
                        this.a = 3;
                        next = null;
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!((d9.g) this.e).apply(next));
            default:
                do {
                    Iterator it2 = this.d;
                    if (!it2.hasNext()) {
                        this.a = 3;
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!((i1) this.e).b.contains(next));
        }
        this.b = next;
        if (this.a == 3) {
            return false;
        }
        this.a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(Iterator it, d9.g gVar) {
        this();
        this.c = 0;
        this.d = it;
        this.e = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(i1 i1Var) {
        this();
        this.c = 1;
        this.e = i1Var;
        this.d = i1Var.a.iterator();
    }
}
