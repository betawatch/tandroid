package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class h extends a implements Iterator, Enumeration {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(k[] kVarArr, int i7, int i10, ConcurrentHashMap concurrentHashMap, int i11) {
        super(kVarArr, i7, i10, concurrentHashMap);
        this.k = i11;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.k) {
            case 0:
                k kVar = this.b;
                if (kVar == null) {
                    throw new NoSuchElementException();
                }
                Object obj = kVar.b;
                this.j = kVar;
                a();
                return obj;
            default:
                k kVar2 = this.b;
                if (kVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj2 = kVar2.c;
                this.j = kVar2;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.k) {
        }
        return next();
    }
}
