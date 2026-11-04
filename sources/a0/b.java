package a0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements Iterator {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public b(int i3) {
        this.a = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f10;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.b;
        switch (this.d) {
            case 0:
                f10 = ((f) this.e).f(i3);
                break;
            case 1:
                f10 = ((f) this.e).i(i3);
                break;
            default:
                f10 = ((g) this.e).b[i3];
                break;
        }
        this.b++;
        this.c = true;
        return f10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i3 = this.b - 1;
        this.b = i3;
        switch (this.d) {
            case 0:
                ((f) this.e).g(i3);
                break;
            case 1:
                ((f) this.e).g(i3);
                break;
            default:
                ((g) this.e).h(i3);
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
    public b(f fVar, int i3) {
        this(fVar.c);
        this.d = i3;
        switch (i3) {
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
