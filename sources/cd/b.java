package cd;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements Iterator {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final int c;
    public boolean d;
    public int e;

    public b(char c10, char c11, int i9) {
        boolean z10 = false;
        this.b = i9;
        this.c = c11;
        if (i9 <= 0 ? c10 >= c11 : c10 < c11 || c10 == c11) {
            z10 = true;
        }
        this.d = z10;
        this.e = z10 ? c10 : c11;
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
                int i9 = this.e;
                if (i9 != this.c) {
                    this.e = this.b + i9;
                } else {
                    if (!this.d) {
                        throw new NoSuchElementException();
                    }
                    this.d = false;
                }
                return Character.valueOf((char) i9);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i9 = this.e;
        if (i9 != this.c) {
            this.e = this.b + i9;
            return i9;
        }
        if (!this.d) {
            throw new NoSuchElementException();
        }
        this.d = false;
        return i9;
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

    public b(int i9, int i10, int i11) {
        this.b = i11;
        this.c = i10;
        boolean z10 = false;
        if (i11 <= 0 ? i9 >= i10 : i9 <= i10) {
            z10 = true;
        }
        this.d = z10;
        this.e = z10 ? i9 : i10;
    }
}
