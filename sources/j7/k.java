package j7;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public abstract Object a(int i10);

    public abstract Object b(int i10);

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
                int i10 = this.c;
                this.d = i10;
                Object b10 = b(i10);
                int i11 = this.c + 1;
                if (i11 >= nVar.f) {
                    i11 = -1;
                }
                this.c = i11;
                return b10;
            case 1:
                l7.d dVar = (l7.d) this.e;
                if (dVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i12 = this.c;
                this.d = i12;
                Object b11 = b(i12);
                int i13 = this.c + 1;
                if (i13 >= dVar.f) {
                    i13 = -1;
                }
                this.c = i13;
                return b11;
            default:
                q8.p pVar = (q8.p) this.e;
                if (pVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i14 = this.c;
                this.d = i14;
                Object a2 = a(i14);
                int i15 = this.c + 1;
                if (i15 >= pVar.f) {
                    i15 = -1;
                }
                this.c = i15;
                return a2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                n nVar = (n) this.e;
                int i10 = nVar.e;
                int i11 = this.b;
                if (i10 != i11) {
                    throw new ConcurrentModificationException();
                }
                int i12 = this.d;
                if (!(i12 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i11 + 32;
                Object[] objArr = nVar.c;
                objArr.getClass();
                nVar.remove(objArr[i12]);
                this.c--;
                this.d = -1;
                return;
            case 1:
                l7.d dVar = (l7.d) this.e;
                int i13 = dVar.e;
                int i14 = this.b;
                if (i13 != i14) {
                    throw new ConcurrentModificationException();
                }
                int i15 = this.d;
                if (!(i15 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i14 + 32;
                Object[] objArr2 = dVar.c;
                objArr2.getClass();
                dVar.remove(objArr2[i15]);
                this.c--;
                this.d = -1;
                return;
            default:
                q8.p pVar = (q8.p) this.e;
                int i16 = pVar.e;
                int i17 = this.b;
                if (i16 != i17) {
                    throw new ConcurrentModificationException();
                }
                int i18 = this.d;
                if (!(i18 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i17 + 32;
                pVar.remove(pVar.i()[i18]);
                this.c--;
                this.d = -1;
                return;
        }
    }

    public k(l7.d dVar) {
        this.e = dVar;
        this.b = dVar.e;
        this.c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public k(q8.p pVar) {
        this.e = pVar;
        this.b = pVar.e;
        this.c = pVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
