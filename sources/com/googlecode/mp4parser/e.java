package com.googlecode.mp4parser;

import java.io.Closeable;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class e implements q2.f, Iterator, Closeable {
    public static final d c = new d("eof ");
    public q2.b a;
    public ArrayList b;

    static {
        zb.c.a(e.class);
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
        for (int i10 = 0; i10 < this.b.size(); i10++) {
            j10 += ((q2.b) this.b.get(i10)).getSize();
        }
        return j10;
    }

    public final void c(WritableByteChannel writableByteChannel) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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
        for (int i10 = 0; i10 < this.b.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((q2.b) this.b.get(i10)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }
}
