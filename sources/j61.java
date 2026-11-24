// default package

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j61 implements Iterator {
    public final /* synthetic */ byte a = 2;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Object d;

    public j61(efd efdVar) {
        this.d = efdVar;
        this.c = efdVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < this.c) {
                }
                break;
            case 1:
                if (this.b < this.c) {
                }
                break;
            case 2:
                if (this.b < this.c) {
                }
                break;
            case 3:
                if (this.b < this.c) {
                }
                break;
            case 4:
                if (this.b < this.c) {
                }
                break;
            default:
                if (this.b < this.c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        int i = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                int i2 = this.b;
                if (i2 < i) {
                    this.b = i2 + 1;
                    return Byte.valueOf(((m61) obj).m(i2));
                }
                u36.g();
                return null;
            case 1:
                try {
                    int i3 = this.b;
                    this.b = i3 + 1;
                    return Byte.valueOf(((efd) obj).j(i3));
                } catch (IndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                int i4 = this.b;
                if (i4 < i) {
                    this.b = i4 + 1;
                    return Byte.valueOf(((cxd) obj).i(i4));
                }
                u36.g();
                return null;
            case 3:
                int i5 = this.b;
                if (i5 < i) {
                    this.b = i5 + 1;
                    return Byte.valueOf(((rce) obj).i(i5));
                }
                u36.g();
                return null;
            case 4:
                int i6 = this.b;
                if (i6 < i) {
                    this.b = i6 + 1;
                    return Byte.valueOf(((tke) obj).k(i6));
                }
                u36.g();
                return null;
            default:
                int i7 = this.b;
                if (i7 < i) {
                    this.b = i7 + 1;
                    return Byte.valueOf(((yff) obj).i(i7));
                }
                u36.g();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public j61(cxd cxdVar) {
        this.d = cxdVar;
        this.c = cxdVar.j();
    }

    public j61(rce rceVar) {
        this.d = rceVar;
        this.c = rceVar.k();
    }

    public j61(yff yffVar) {
        this.d = yffVar;
        this.c = yffVar.j();
    }

    public j61(tke tkeVar) {
        this.d = tkeVar;
        this.c = tkeVar.i();
    }

    public j61(m61 m61Var) {
        this.d = m61Var;
        this.c = m61Var.size();
    }
}
