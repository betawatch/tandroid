package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
