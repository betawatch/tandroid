package a8;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class o implements Iterator {
    public final /* synthetic */ int a;
    public Iterator b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return ((Map.Entry) this.b.next()).getValue();
            case 1:
                return (String) this.b.next();
            default:
                return ((Map.Entry) this.b.next()).getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            default:
                this.b.remove();
                return;
        }
    }

    public o(Iterator it, int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                it.getClass();
                this.b = it;
                break;
            default:
                it.getClass();
                this.b = it;
                break;
        }
    }
}
