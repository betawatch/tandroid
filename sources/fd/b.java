package fd;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements Iterator {
    public final String a;
    public int b;
    public int c;
    public int d;
    public int e;

    public b(String str) {
        this.a = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i9;
        int i10;
        int i11 = this.b;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.e < 0) {
            this.b = 2;
            return false;
        }
        String str = this.a;
        int length = str.length();
        int length2 = str.length();
        for (int i12 = this.c; i12 < length2; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '\n' || charAt == '\r') {
                i9 = (charAt == '\r' && (i10 = i12 + 1) < str.length() && str.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.b = 1;
                this.e = i9;
                this.d = length;
                return true;
            }
        }
        i9 = -1;
        this.b = 1;
        this.e = i9;
        this.d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 0;
        int i9 = this.d;
        int i10 = this.c;
        this.c = this.e + i9;
        return this.a.subSequence(i10, i9).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
