package com.googlecode.mp4parser;

import java.io.Closeable;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class e implements i5.f, Iterator, Closeable {
    public static final d c = new d("eof ");
    public i5.b a;
    public ArrayList b;

    static {
        pc.c.a(e.class);
    }

    public final void a(i5.b bVar) {
        if (bVar != null) {
            this.b = new ArrayList(this.b);
            bVar.setParent(this);
            this.b.add(bVar);
        }
    }

    public final long b() {
        long j3 = 0;
        for (int i7 = 0; i7 < this.b.size(); i7++) {
            j3 += ((i5.b) this.b.get(i7)).getSize();
        }
        return j3;
    }

    public final void c(WritableByteChannel writableByteChannel) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((i5.b) obj).getBox(writableByteChannel);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        i5.b bVar = this.a;
        d dVar = c;
        if (bVar == dVar) {
            return false;
        }
        if (bVar != null) {
            return true;
        }
        try {
            if (bVar == null || bVar == dVar) {
                this.a = dVar;
                throw new NoSuchElementException();
            }
            this.a = bVar;
            return true;
        } catch (NoSuchElementException unused) {
            this.a = dVar;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        i5.b bVar = this.a;
        d dVar = c;
        if (bVar == null || bVar == dVar) {
            this.a = dVar;
            throw new NoSuchElementException();
        }
        this.a = null;
        return bVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i7 = 0; i7 < this.b.size(); i7++) {
            if (i7 > 0) {
                sb2.append(";");
            }
            sb2.append(((i5.b) this.b.get(i7)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }
}
