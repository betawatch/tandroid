package h7;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class k implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ AbstractMap e;

    public k(n nVar) {
        this.e = nVar;
        this.b = nVar.e;
        this.c = nVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i9);

    public abstract Object b(int i9);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c >= 0) {
                }
                break;
            case 1:
                if (this.c >= 0) {
                }
                break;
            default:
                if (this.c >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                n nVar = (n) this.e;
                if (nVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i9 = this.c;
                this.d = i9;
                Object b10 = b(i9);
                int i10 = this.c + 1;
                if (i10 >= nVar.f) {
                    i10 = -1;
                }
                this.c = i10;
                return b10;
            case 1:
                j7.d dVar = (j7.d) this.e;
                if (dVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i11 = this.c;
                this.d = i11;
                Object b11 = b(i11);
                int i12 = this.c + 1;
                if (i12 >= dVar.f) {
                    i12 = -1;
                }
                this.c = i12;
                return b11;
            default:
                o8.p pVar = (o8.p) this.e;
                if (pVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i13 = this.c;
                this.d = i13;
                Object a2 = a(i13);
                int i14 = this.c + 1;
                if (i14 >= pVar.f) {
                    i14 = -1;
                }
                this.c = i14;
                return a2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                n nVar = (n) this.e;
                int i9 = nVar.e;
                int i10 = this.b;
                if (i9 != i10) {
                    throw new ConcurrentModificationException();
                }
                int i11 = this.d;
                if (!(i11 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i10 + 32;
                Object[] objArr = nVar.c;
                objArr.getClass();
                nVar.remove(objArr[i11]);
                this.c--;
                this.d = -1;
                return;
            case 1:
                j7.d dVar = (j7.d) this.e;
                int i12 = dVar.e;
                int i13 = this.b;
                if (i12 != i13) {
                    throw new ConcurrentModificationException();
                }
                int i14 = this.d;
                if (!(i14 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i13 + 32;
                Object[] objArr2 = dVar.c;
                objArr2.getClass();
                dVar.remove(objArr2[i14]);
                this.c--;
                this.d = -1;
                return;
            default:
                o8.p pVar = (o8.p) this.e;
                int i15 = pVar.e;
                int i16 = this.b;
                if (i15 != i16) {
                    throw new ConcurrentModificationException();
                }
                int i17 = this.d;
                if (!(i17 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i16 + 32;
                pVar.remove(pVar.i()[i17]);
                this.c--;
                this.d = -1;
                return;
        }
    }

    public k(j7.d dVar) {
        this.e = dVar;
        this.b = dVar.e;
        this.c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public k(o8.p pVar) {
        this.e = pVar;
        this.b = pVar.e;
        this.c = pVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
