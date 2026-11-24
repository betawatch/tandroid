// default package

import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ej9 implements Iterator {
    public byte a;
    public Object b;
    public int c;
    public int d;
    public final /* synthetic */ fj9 e;

    public ej9(fj9 fj9Var) {
        this.e = fj9Var;
        this.c = fj9Var.d;
        this.d = fj9Var.c;
    }

    public final boolean a() {
        this.a = (byte) 3;
        int i = this.c;
        if (i == 0) {
            this.a = (byte) 2;
            return false;
        }
        fj9 fj9Var = this.e;
        Object[] objArr = fj9Var.a;
        int i2 = this.d;
        this.b = objArr[i2];
        this.a = (byte) 1;
        this.d = (i2 + 1) % fj9Var.b;
        this.c = i - 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        if (b == 0) {
            return a();
        }
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        w26.j("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        if (b == 1) {
            this.a = (byte) 0;
            return this.b;
        }
        if (b == 2 || !a()) {
            w26.g();
            return null;
        }
        this.a = (byte) 0;
        return this.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
