package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class h extends a implements Iterator, Enumeration {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap, int i3) {
        super(lVarArr, i, i2, concurrentHashMap);
        this.k = i3;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.k) {
            case 0:
                l lVar = this.b;
                if (lVar == null) {
                    throw new NoSuchElementException();
                }
                this.j = lVar;
                a();
                return lVar.b;
            default:
                l lVar2 = this.b;
                if (lVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = lVar2.c;
                this.j = lVar2;
                a();
                return obj;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.k) {
        }
        return next();
    }
}
