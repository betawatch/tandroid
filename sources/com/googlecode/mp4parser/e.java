package com.googlecode.mp4parser;

import java.io.Closeable;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class e implements q2.f, Iterator, Closeable {
    public static final d c = new d("eof ");
    public q2.b a;
    public ArrayList b;

    static {
        yb.c.a(e.class);
    }

    public final void a(q2.b bVar) {
        if (bVar != null) {
            this.b = new ArrayList(this.b);
            bVar.setParent(this);
            this.b.add(bVar);
        }
    }

    public final long b() {
        long j10 = 0;
        for (int i9 = 0; i9 < this.b.size(); i9++) {
            j10 += ((q2.b) this.b.get(i9)).getSize();
        }
        return j10;
    }

    public final void c(WritableByteChannel writableByteChannel) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((q2.b) obj).getBox(writableByteChannel);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        q2.b bVar = this.a;
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
        q2.b bVar = this.a;
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
        for (int i9 = 0; i9 < this.b.size(); i9++) {
            if (i9 > 0) {
                sb2.append(";");
            }
            sb2.append(((q2.b) this.b.get(i9)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }
}
