package com.google.android.gms.internal.cast;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d0 extends t0 implements ListIterator {
    public final int b;
    public int c;
    public final f0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, int i10) {
        super(0);
        int size = f0Var.size();
        j7.t5.b(i10, size);
        this.b = size;
        this.c = i10;
        this.d = f0Var;
    }

    public final Object a(int i10) {
        return this.d.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.c;
        this.c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.c - 1;
        this.c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
