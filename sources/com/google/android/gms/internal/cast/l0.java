package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class l0 extends a9.o {
    public boolean b;
    public final /* synthetic */ Object c;

    public l0(Object obj) {
        super(1);
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            throw new NoSuchElementException();
        }
        this.b = true;
        return this.c;
    }
}
