// default package

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class o4a implements Iterator, fw2 {
    public byte a;
    public Object b;
    public fw2 c;

    public final RuntimeException a() {
        byte b = this.a;
        if (b == 4) {
            return new NoSuchElementException();
        }
        if (b == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + ((int) this.a));
    }

    public final void c(Object obj, ra9 ra9Var) {
        this.b = obj;
        this.a = (byte) 3;
        this.c = ra9Var;
    }

    @Override // fw2
    public final sw2 getContext() {
        return z14.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b;
        while (true) {
            b = this.a;
            if (b != 0) {
                break;
            }
            this.a = (byte) 5;
            fw2 fw2Var = this.c;
            fw2Var.getClass();
            this.c = null;
            fw2Var.resumeWith(g5c.a);
        }
        if (b == 1) {
            throw null;
        }
        if (b == 2 || b == 3) {
            return true;
        }
        if (b == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        if (b == 0 || b == 1) {
            if (hasNext()) {
                return next();
            }
            w26.g();
            return null;
        }
        if (b == 2) {
            this.a = (byte) 1;
            throw null;
        }
        if (b != 3) {
            throw a();
        }
        this.a = (byte) 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // fw2
    public final void resumeWith(Object obj) {
        qse.b(obj);
        this.a = (byte) 4;
    }
}
