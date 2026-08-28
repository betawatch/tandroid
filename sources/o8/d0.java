package o8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d0 extends x0 {
    public int a;
    public Object b;
    public final /* synthetic */ int c;
    public final Iterator d;
    public final /* synthetic */ Object e;

    public d0() {
        this.a = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i9 = this.a;
        if (i9 == 4) {
            throw new IllegalStateException();
        }
        int b10 = m1.j.b(i9);
        if (b10 == 0) {
            return true;
        }
        if (b10 == 2) {
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
                } while (!((n8.f) this.e).apply(next));
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
                } while (!((t0) this.e).b.contains(next));
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
    public d0(Iterator it, n8.f fVar) {
        this();
        this.c = 0;
        this.d = it;
        this.e = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(t0 t0Var) {
        this();
        this.c = 1;
        this.e = t0Var;
        this.d = t0Var.a.iterator();
    }
}
