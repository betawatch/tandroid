package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
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
