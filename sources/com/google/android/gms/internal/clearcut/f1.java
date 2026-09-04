package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class f1 implements Iterator {
    public final /* synthetic */ int a;
    public Iterator b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
        }
        return ((Map.Entry) this.b.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                this.b.remove();
                return;
            default:
                this.b.remove();
                return;
        }
    }

    public f1(Iterator it, int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                it.getClass();
                this.b = it;
                break;
            default:
                it.getClass();
                this.b = it;
                break;
        }
    }
}
