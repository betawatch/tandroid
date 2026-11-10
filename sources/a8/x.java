package a8;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class x implements Iterator {
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
                return ((Map.Entry) this.b.next()).getValue();
            default:
                return (String) this.b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            case 1:
                this.b.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public x(Iterator it, int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
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
