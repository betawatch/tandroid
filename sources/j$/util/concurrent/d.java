package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class d extends a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        k kVar = this.b;
        if (kVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = kVar.b;
        Object obj2 = kVar.c;
        this.j = kVar;
        a();
        return new j(obj, obj2, this.i);
    }
}
