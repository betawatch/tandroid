package a8;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class l implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ AbstractMap e;

    public l(o oVar) {
        this.e = oVar;
        this.b = oVar.e;
        this.c = oVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i7);

    public abstract Object b(int i7);

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
                o oVar = (o) this.e;
                if (oVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.c;
                this.d = i7;
                Object b10 = b(i7);
                int i10 = this.c + 1;
                if (i10 >= oVar.f) {
                    i10 = -1;
                }
                this.c = i10;
                return b10;
            case 1:
                c8.d dVar = (c8.d) this.e;
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
                h9.s sVar = (h9.s) this.e;
                if (sVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i13 = this.c;
                this.d = i13;
                Object a10 = a(i13);
                int i14 = this.c + 1;
                if (i14 >= sVar.f) {
                    i14 = -1;
                }
                this.c = i14;
                return a10;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                o oVar = (o) this.e;
                int i7 = oVar.e;
                int i10 = this.b;
                if (i7 != i10) {
                    throw new ConcurrentModificationException();
                }
                int i11 = this.d;
                if (!(i11 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i10 + 32;
                Object[] objArr = oVar.c;
                objArr.getClass();
                oVar.remove(objArr[i11]);
                this.c--;
                this.d = -1;
                return;
            case 1:
                c8.d dVar = (c8.d) this.e;
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
                h9.s sVar = (h9.s) this.e;
                if (sVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                ia.o("no calls to next() since the last call to remove()", this.d >= 0);
                this.b += 32;
                sVar.remove(sVar.k()[this.d]);
                this.c--;
                this.d = -1;
                return;
        }
    }

    public l(c8.d dVar) {
        this.e = dVar;
        this.b = dVar.e;
        this.c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public l(h9.s sVar) {
        this.e = sVar;
        this.b = sVar.e;
        this.c = sVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
