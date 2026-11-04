package c4;

import b8.zb;
import g2.n0;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class j implements b4.e {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public h d;
    public long e;
    public long f;
    public long g;

    public j() {
        for (int i3 = 0; i3 < 10; i3++) {
            this.a.add(new h());
        }
        this.b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.b;
            a1.c cVar = new a1.c(this, 9);
            i iVar = new i();
            iVar.c = cVar;
            arrayDeque.add(iVar);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // j2.e
    public final void a(long j10) {
        this.g = j10;
    }

    @Override // b4.e
    public final void b(long j10) {
        this.e = j10;
    }

    @Override // j2.e
    public final Object d() {
        zb.p(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        h hVar = (h) arrayDeque.pollFirst();
        this.d = hVar;
        return hVar;
    }

    @Override // j2.e
    public final void e(Object obj) {
        b4.i iVar = (b4.i) obj;
        zb.f(iVar == this.d);
        h hVar = (h) iVar;
        if (!hVar.isEndOfStream()) {
            long j10 = hVar.e;
            if (j10 != Long.MIN_VALUE) {
                long j11 = this.g;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    hVar.clear();
                    this.a.add(hVar);
                    this.d = null;
                }
            }
        }
        long j12 = this.f;
        this.f = 1 + j12;
        hVar.s = j12;
        this.c.add(hVar);
        this.d = null;
    }

    public abstract android.support.v4.media.c f();

    @Override // j2.e
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            h hVar = (h) arrayDeque2.poll();
            String str = n0.a;
            hVar.clear();
            arrayDeque.add(hVar);
        }
        h hVar2 = this.d;
        if (hVar2 != null) {
            hVar2.clear();
            arrayDeque.add(hVar2);
            this.d = null;
        }
    }

    public abstract void g(h hVar);

    @Override // j2.e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b4.j c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            h hVar = (h) arrayDeque2.peek();
            String str = n0.a;
            if (hVar.e > this.e) {
                return null;
            }
            h hVar2 = (h) arrayDeque2.poll();
            boolean isEndOfStream = hVar2.isEndOfStream();
            ArrayDeque arrayDeque3 = this.a;
            if (isEndOfStream) {
                b4.j jVar = (b4.j) arrayDeque.pollFirst();
                jVar.addFlag(4);
                hVar2.clear();
                arrayDeque3.add(hVar2);
                return jVar;
            }
            g(hVar2);
            if (i()) {
                android.support.v4.media.c f10 = f();
                b4.j jVar2 = (b4.j) arrayDeque.pollFirst();
                long j10 = hVar2.e;
                jVar2.timeUs = j10;
                jVar2.a = f10;
                jVar2.b = j10;
                hVar2.clear();
                arrayDeque3.add(hVar2);
                return jVar2;
            }
            hVar2.clear();
            arrayDeque3.add(hVar2);
        }
    }

    public abstract boolean i();

    @Override // j2.e
    public void release() {
    }
}
