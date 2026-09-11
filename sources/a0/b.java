package a0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class b implements Iterator {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public b(int i10) {
        this.a = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e7;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.b;
        switch (this.d) {
            case 0:
                e7 = ((f) this.e).e(i10);
                break;
            case 1:
                e7 = ((f) this.e).h(i10);
                break;
            default:
                e7 = ((g) this.e).b[i10];
                break;
        }
        this.b++;
        this.c = true;
        return e7;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.b - 1;
        this.b = i10;
        switch (this.d) {
            case 0:
                ((f) this.e).f(i10);
                break;
            case 1:
                ((f) this.e).f(i10);
                break;
            default:
                ((g) this.e).i(i10);
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
    public b(f fVar, int i10) {
        this(fVar.c);
        this.d = i10;
        switch (i10) {
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
