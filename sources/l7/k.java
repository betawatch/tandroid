package l7;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
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
                Object a2 = a(i10);
                int i11 = this.c + 1;
                if (i11 >= nVar.f) {
                    i11 = -1;
                }
                this.c = i11;
                return a2;
            default:
                n7.d dVar = (n7.d) this.e;
                if (dVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i12 = this.c;
                this.d = i12;
                Object a10 = a(i12);
                int i13 = this.c + 1;
                if (i13 >= dVar.f) {
                    i13 = -1;
                }
                this.c = i13;
                return a10;
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
            default:
                n7.d dVar = (n7.d) this.e;
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
        }
    }

    public k(n7.d dVar) {
        this.e = dVar;
        this.b = dVar.e;
        this.c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
