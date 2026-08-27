package oa;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i implements Iterator {
    public k a;
    public k b = null;
    public int c;
    public final /* synthetic */ l d;
    public final /* synthetic */ int e;

    public i(l lVar, int i10) {
        this.e = i10;
        this.d = lVar;
        this.a = lVar.f.d;
        this.c = lVar.e;
    }

    public final Object a() {
        return b();
    }

    public final k b() {
        k kVar = this.a;
        l lVar = this.d;
        if (kVar == lVar.f) {
            throw new NoSuchElementException();
        }
        if (lVar.e != this.c) {
            throw new ConcurrentModificationException();
        }
        this.a = kVar.d;
        this.b = kVar;
        return kVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        k kVar = this.b;
        if (kVar == null) {
            throw new IllegalStateException();
        }
        l lVar = this.d;
        lVar.c(kVar, true);
        this.b = null;
        this.c = lVar.e;
    }
}
