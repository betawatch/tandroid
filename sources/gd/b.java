package gd;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b implements Iterator {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final int c;
    public boolean d;
    public int e;

    public b(char c3, char c10, int i10) {
        boolean z4 = false;
        this.b = i10;
        this.c = c10;
        if (i10 <= 0 ? c3 >= c10 : c3 < c10 || c3 == c10) {
            z4 = true;
        }
        this.d = z4;
        this.e = z4 ? c3 : c10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                int i10 = this.e;
                if (i10 != this.c) {
                    this.e = this.b + i10;
                } else {
                    if (!this.d) {
                        throw new NoSuchElementException();
                    }
                    this.d = false;
                }
                return Character.valueOf((char) i10);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i10 = this.e;
        if (i10 != this.c) {
            this.e = this.b + i10;
            return i10;
        }
        if (!this.d) {
            throw new NoSuchElementException();
        }
        this.d = false;
        return i10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(int i10, int i11, int i12) {
        this.b = i12;
        this.c = i11;
        boolean z4 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z4 = true;
        }
        this.d = z4;
        this.e = z4 ? i10 : i11;
    }
}
