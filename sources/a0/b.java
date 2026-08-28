package a0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements Iterator {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public b(int i9) {
        this.a = i9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e10;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i9 = this.b;
        switch (this.d) {
            case 0:
                e10 = ((f) this.e).e(i9);
                break;
            case 1:
                e10 = ((f) this.e).h(i9);
                break;
            default:
                e10 = ((g) this.e).b[i9];
                break;
        }
        this.b++;
        this.c = true;
        return e10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i9 = this.b - 1;
        this.b = i9;
        switch (this.d) {
            case 0:
                ((f) this.e).f(i9);
                break;
            case 1:
                ((f) this.e).f(i9);
                break;
            default:
                ((g) this.e).i(i9);
                break;
        }
        this.a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.c);
        this.d = 2;
        this.e = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i9) {
        this(fVar.c);
        this.d = i9;
        switch (i9) {
            case 1:
                this.e = fVar;
                this(fVar.c);
                break;
            default:
                this.e = fVar;
                break;
        }
    }
}
