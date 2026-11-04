package com.googlecode.mp4parser;

import java.io.Closeable;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class e implements h5.f, Iterator, Closeable {
    public static final d c = new d("eof ");
    public h5.b a;
    public ArrayList b;

    static {
        mc.c.a(e.class);
    }

    public final void a(h5.b bVar) {
        if (bVar != null) {
            this.b = new ArrayList(this.b);
            bVar.setParent(this);
            this.b.add(bVar);
        }
    }

    public final long b() {
        long j10 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            j10 += ((h5.b) this.b.get(i3)).getSize();
        }
        return j10;
    }

    public final void c(WritableByteChannel writableByteChannel) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((h5.b) obj).getBox(writableByteChannel);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        h5.b bVar = this.a;
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
        h5.b bVar = this.a;
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
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            if (i3 > 0) {
                sb2.append(";");
            }
            sb2.append(((h5.b) this.b.get(i3)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }
}
