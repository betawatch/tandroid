package a0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b implements Iterator {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public b(int i7) {
        this.a = i7;
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
        int i7 = this.b;
        switch (this.d) {
            case 0:
                f10 = ((f) this.e).f(i7);
                break;
            case 1:
                f10 = ((f) this.e).i(i7);
                break;
            default:
                f10 = ((g) this.e).b[i7];
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
        int i7 = this.b - 1;
        this.b = i7;
        switch (this.d) {
            case 0:
                ((f) this.e).g(i7);
                break;
            case 1:
                ((f) this.e).g(i7);
                break;
            default:
                ((g) this.e).f(i7);
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
    public b(f fVar, int i7) {
        this(fVar.c);
        this.d = i7;
        switch (i7) {
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
