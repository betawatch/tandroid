package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
