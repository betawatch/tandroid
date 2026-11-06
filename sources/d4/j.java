package d4;

import a8.ia;
import h2.m0;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class j implements c4.e {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public h d;
    public long e;
    public long f;
    public long g;

    public j() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.a.add(new h());
        }
        this.b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.b;
            a1.c cVar = new a1.c(this, 24);
            i iVar = new i();
            iVar.c = cVar;
            arrayDeque.add(iVar);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // k2.e
    public final void a(long j3) {
        this.g = j3;
    }

    @Override // c4.e
    public final void b(long j3) {
        this.e = j3;
    }

    @Override // k2.e
    public final Object d() {
        ia.p(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        h hVar = (h) arrayDeque.pollFirst();
        this.d = hVar;
        return hVar;
    }

    @Override // k2.e
    public final void e(Object obj) {
        c4.i iVar = (c4.i) obj;
        ia.f(iVar == this.d);
        h hVar = (h) iVar;
        if (!hVar.isEndOfStream()) {
            long j3 = hVar.e;
            if (j3 != Long.MIN_VALUE) {
                long j10 = this.g;
                if (j10 != -9223372036854775807L && j3 < j10) {
                    hVar.clear();
                    this.a.add(hVar);
                    this.d = null;
                }
            }
        }
        long j11 = this.f;
        this.f = 1 + j11;
        hVar.s = j11;
        this.c.add(hVar);
        this.d = null;
    }

    public abstract d6.i f();

    @Override // k2.e
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
            String str = m0.a;
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

    @Override // k2.e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public c4.j c() {
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
            String str = m0.a;
            if (hVar.e > this.e) {
                return null;
            }
            h hVar2 = (h) arrayDeque2.poll();
            boolean isEndOfStream = hVar2.isEndOfStream();
            ArrayDeque arrayDeque3 = this.a;
            if (isEndOfStream) {
                c4.j jVar = (c4.j) arrayDeque.pollFirst();
                jVar.addFlag(4);
                hVar2.clear();
                arrayDeque3.add(hVar2);
                return jVar;
            }
            g(hVar2);
            if (i()) {
                d6.i f10 = f();
                c4.j jVar2 = (c4.j) arrayDeque.pollFirst();
                long j3 = hVar2.e;
                jVar2.timeUs = j3;
                jVar2.a = f10;
                jVar2.b = j3;
                hVar2.clear();
                arrayDeque3.add(hVar2);
                return jVar2;
            }
            hVar2.clear();
            arrayDeque3.add(hVar2);
        }
    }

    public abstract boolean i();

    @Override // k2.e
    public void release() {
    }
}
