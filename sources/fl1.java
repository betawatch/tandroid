// default package

import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fl1 implements Iterator {
    public final int a;
    public boolean b;
    public int c;

    public fl1(char c, char c2) {
        this.a = c2;
        boolean z = rr5.b(c, c2) <= 0;
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
                u36.g();
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
