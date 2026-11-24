package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class m implements Iterator, y {
    public final /* synthetic */ byte a = 0;
    public final Iterator b;

    public m(n nVar) {
        this.b = nVar.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.y
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                j$.time.a.L(this.b, consumer);
                break;
            default:
                j$.time.a.L(this.b, new j$.time.v((byte) 1, consumer));
                break;
        }
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

    public m(s sVar) {
        this.b = sVar.a.iterator();
    }
}
