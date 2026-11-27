// default package

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class gk1 implements Iterator {
    public final int a;
    public boolean b;
    public int c;

    public gk1(char c, char c2) {
        this.a = c2;
        boolean z = ur5.b(c, c2) <= 0;
        this.b = z;
        this.c = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        if (i != this.a) {
            this.c = i + 1;
        } else {
            if (!this.b) {
                lq5.n();
                return null;
            }
            this.b = false;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
