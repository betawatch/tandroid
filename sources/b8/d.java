package b8;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public abstract Object a(int i3);

    public abstract Object b(int i3);

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
                int i3 = this.c;
                this.d = i3;
                Object b10 = b(i3);
                int i10 = this.c + 1;
                if (i10 >= gVar.f) {
                    i10 = -1;
                }
                this.c = i10;
                return b10;
            case 1:
                g9.s sVar = (g9.s) this.e;
                if (sVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i11 = this.c;
                this.d = i11;
                Object a10 = a(i11);
                int i12 = this.c + 1;
                if (i12 >= sVar.f) {
                    i12 = -1;
                }
                this.c = i12;
                return a10;
            default:
                z7.i iVar = (z7.i) this.e;
                if (iVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i13 = this.c;
                this.d = i13;
                Object b11 = b(i13);
                int i14 = this.c + 1;
                if (i14 >= iVar.f) {
                    i14 = -1;
                }
                this.c = i14;
                return b11;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                g gVar = (g) this.e;
                int i3 = gVar.e;
                int i10 = this.b;
                if (i3 != i10) {
                    throw new ConcurrentModificationException();
                }
                int i11 = this.d;
                if (!(i11 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i10 + 32;
                Object[] objArr = gVar.c;
                objArr.getClass();
                gVar.remove(objArr[i11]);
                this.c--;
                this.d = -1;
                return;
            case 1:
                g9.s sVar = (g9.s) this.e;
                if (sVar.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                zb.o("no calls to next() since the last call to remove()", this.d >= 0);
                this.b += 32;
                sVar.remove(sVar.k()[this.d]);
                this.c--;
                this.d = -1;
                return;
            default:
                z7.i iVar = (z7.i) this.e;
                int i12 = iVar.e;
                int i13 = this.b;
                if (i12 != i13) {
                    throw new ConcurrentModificationException();
                }
                int i14 = this.d;
                if (!(i14 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i13 + 32;
                Object[] objArr2 = iVar.c;
                objArr2.getClass();
                iVar.remove(objArr2[i14]);
                this.c--;
                this.d = -1;
                return;
        }
    }

    public d(z7.i iVar) {
        this.e = iVar;
        this.b = iVar.e;
        this.c = iVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public d(g9.s sVar) {
        this.e = sVar;
        this.b = sVar.e;
        this.c = sVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
