package e9;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class t implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ AbstractMap e;

    public t(x7.j jVar) {
        this.e = jVar;
        this.b = jVar.e;
        this.c = jVar.isEmpty() ? -1 : 0;
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
                v vVar = (v) this.e;
                if (vVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.c;
                this.d = i10;
                Object a2 = a(i10);
                int i11 = this.c + 1;
                if (i11 >= vVar.f) {
                    i11 = -1;
                }
                this.c = i11;
                return a2;
            case 1:
                x7.j jVar = (x7.j) this.e;
                if (jVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i12 = this.c;
                this.d = i12;
                Object b10 = b(i12);
                int i13 = this.c + 1;
                if (i13 >= jVar.f) {
                    i13 = -1;
                }
                this.c = i13;
                return b10;
            default:
                z7.d dVar = (z7.d) this.e;
                if (dVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i14 = this.c;
                this.d = i14;
                Object b11 = b(i14);
                int i15 = this.c + 1;
                if (i15 >= dVar.f) {
                    i15 = -1;
                }
                this.c = i15;
                return b11;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                v vVar = (v) this.e;
                int i10 = vVar.e;
                int i11 = this.b;
                if (i10 != i11) {
                    throw new ConcurrentModificationException();
                }
                int i12 = this.d;
                if (!(i12 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i11 + 32;
                vVar.remove(vVar.i()[i12]);
                this.c--;
                this.d = -1;
                return;
            case 1:
                x7.j jVar = (x7.j) this.e;
                int i13 = jVar.e;
                int i14 = this.b;
                if (i13 != i14) {
                    throw new ConcurrentModificationException();
                }
                int i15 = this.d;
                if (!(i15 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i14 + 32;
                Object[] objArr = jVar.c;
                objArr.getClass();
                jVar.remove(objArr[i15]);
                this.c--;
                this.d = -1;
                return;
            default:
                z7.d dVar = (z7.d) this.e;
                int i16 = dVar.e;
                int i17 = this.b;
                if (i16 != i17) {
                    throw new ConcurrentModificationException();
                }
                int i18 = this.d;
                if (!(i18 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i17 + 32;
                Object[] objArr2 = dVar.c;
                objArr2.getClass();
                dVar.remove(objArr2[i18]);
                this.c--;
                this.d = -1;
                return;
        }
    }

    public t(z7.d dVar) {
        this.e = dVar;
        this.b = dVar.e;
        this.c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public t(v vVar) {
        this.e = vVar;
        this.b = vVar.e;
        this.c = vVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
