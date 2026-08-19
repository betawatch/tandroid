package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class k implements Iterator, w {
    public final /* synthetic */ int a = 0;
    public final Iterator b;

    public k(l lVar) {
        this.b = lVar.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.w
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                j$.com.android.tools.r8.a.M(this.b, consumer);
                break;
            default:
                j$.com.android.tools.r8.a.M(this.b, new j$.time.t(1, consumer));
                break;
        }
    }

    public k(q qVar) {
        this.b = qVar.a.iterator();
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
                return new o((Map.Entry) this.b.next());
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
