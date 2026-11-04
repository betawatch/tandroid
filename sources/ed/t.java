package ed;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t implements Iterator {
    public int a;
    public Object b;
    public int c;
    public int d;
    public final /* synthetic */ u e;

    public t(u uVar) {
        this.e = uVar;
        this.c = uVar.d;
        this.d = uVar.c;
    }

    public final boolean a() {
        this.a = 3;
        int i3 = this.c;
        if (i3 == 0) {
            this.a = 2;
        } else {
            u uVar = this.e;
            Object[] objArr = uVar.a;
            int i10 = this.d;
            this.b = objArr[i10];
            this.a = 1;
            this.d = (i10 + 1) % uVar.b;
            this.c = i3 - 1;
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3 = this.a;
        if (i3 == 0) {
            return a();
        }
        if (i3 == 1) {
            return true;
        }
        if (i3 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.a;
        if (i3 == 1) {
            this.a = 0;
            return this.b;
        }
        if (i3 == 2 || !a()) {
            throw new NoSuchElementException();
        }
        this.a = 0;
        return this.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
