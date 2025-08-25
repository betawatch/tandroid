package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class l implements Iterator, y {
    public final /* synthetic */ int a = 0;
    private final Iterator b;

    public l(m mVar) {
        this.b = mVar.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.y
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                S.q(this.b, consumer);
                break;
            default:
                S.q(this.b, new p(consumer));
                break;
        }
    }

    public l(s sVar) {
        this.b = sVar.a.iterator();
    }

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
                return this.b.next();
            default:
                return new q((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
