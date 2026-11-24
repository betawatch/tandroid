package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
