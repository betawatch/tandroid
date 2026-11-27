// default package

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class g8a implements Iterator, zw2 {
    public byte a;
    public Object b;
    public zw2 c;

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

    public final void c(Object obj, fe9 fe9Var) {
        this.b = obj;
        this.a = (byte) 3;
        this.c = fe9Var;
    }

    @Override // zw2
    public final mx2 getContext() {
        return u24.a;
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
            zw2 zw2Var = this.c;
            zw2Var.getClass();
            this.c = null;
            zw2Var.resumeWith(f9c.a);
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
            lq5.n();
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

    @Override // zw2
    public final void resumeWith(Object obj) {
        ixe.b(obj);
        this.a = (byte) 4;
    }
}
