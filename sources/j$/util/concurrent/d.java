package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d extends a implements Iterator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(k[] kVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i, i2, concurrentHashMap);
    }

    @Override // java.util.Iterator
    public final Object next() {
        k kVar = this.b;
        if (kVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = kVar.b;
        Object obj2 = kVar.c;
        this.j = kVar;
        b();
        return new j(obj, obj2, this.i);
    }
}
