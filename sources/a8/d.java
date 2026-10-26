package a8;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class d implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ AbstractMap e;

    public d(g gVar) {
        this.e = gVar;
        this.b = gVar.e;
        this.c = gVar.isEmpty() ? -1 : 0;
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
                g gVar = (g) this.e;
                if (gVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.c;
                this.d = i10;
                Object b10 = b(i10);
                int i11 = this.c + 1;
                if (i11 >= gVar.f) {
                    i11 = -1;
                }
                this.c = i11;
                return b10;
            case 1:
                f9.s sVar = (f9.s) this.e;
                if (sVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i12 = this.c;
                this.d = i12;
                Object a2 = a(i12);
                int i13 = this.c + 1;
                if (i13 >= sVar.f) {
                    i13 = -1;
                }
                this.c = i13;
                return a2;
            default:
                y7.i iVar = (y7.i) this.e;
                if (iVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i14 = this.c;
                this.d = i14;
                Object b11 = b(i14);
                int i15 = this.c + 1;
                if (i15 >= iVar.f) {
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
                g gVar = (g) this.e;
                int i10 = gVar.e;
                int i11 = this.b;
                if (i10 != i11) {
                    throw new ConcurrentModificationException();
                }
                int i12 = this.d;
                if (!(i12 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i11 + 32;
                Object[] objArr = gVar.c;
                objArr.getClass();
                gVar.remove(objArr[i12]);
                this.c--;
                this.d = -1;
                return;
            case 1:
                f9.s sVar = (f9.s) this.e;
                if (sVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                yb.o("no calls to next() since the last call to remove()", this.d >= 0);
                this.b += 32;
                sVar.remove(sVar.j()[this.d]);
                this.c--;
                this.d = -1;
                return;
            default:
                y7.i iVar = (y7.i) this.e;
                int i13 = iVar.e;
                int i14 = this.b;
                if (i13 != i14) {
                    throw new ConcurrentModificationException();
                }
                int i15 = this.d;
                if (!(i15 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i14 + 32;
                Object[] objArr2 = iVar.c;
                objArr2.getClass();
                iVar.remove(objArr2[i15]);
                this.c--;
                this.d = -1;
                return;
        }
    }

    public d(y7.i iVar) {
        this.e = iVar;
        this.b = iVar.e;
        this.c = iVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public d(f9.s sVar) {
        this.e = sVar;
        this.b = sVar.e;
        this.c = sVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
