package com.googlecode.mp4parser;

import java.io.Closeable;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class e implements f5.f, Iterator, Closeable {
    public static final d c = new d("eof ");
    public f5.b a;
    public ArrayList b;

    static {
        qc.c.a(e.class);
    }

    public final void a(f5.b bVar) {
        if (bVar != null) {
            this.b = new ArrayList(this.b);
            bVar.setParent(this);
            this.b.add(bVar);
        }
    }

    public final long b() {
        long j3 = 0;
        for (int i10 = 0; i10 < this.b.size(); i10++) {
            j3 += ((f5.b) this.b.get(i10)).getSize();
        }
        return j3;
    }

    public final void c(WritableByteChannel writableByteChannel) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f5.b) obj).getBox(writableByteChannel);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        f5.b bVar = this.a;
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
        f5.b bVar = this.a;
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
            sb2.append(((f5.b) this.b.get(i10)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }
}
