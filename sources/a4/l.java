package a4;

import e2.d0;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class l implements z3.f {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public j d;
    public long e;
    public long f;
    public long g;

    public l() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.a.add(new j());
        }
        this.b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.b;
            a1.c cVar = new a1.c(this, 1);
            k kVar = new k();
            kVar.c = cVar;
            arrayDeque.add(kVar);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // h2.e
    public final void a(long j3) {
        this.g = j3;
    }

    @Override // z3.f
    public final void b(long j3) {
        this.e = j3;
    }

    @Override // h2.e
    public final Object d() {
        e2.d.g(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        j jVar = (j) arrayDeque.pollFirst();
        this.d = jVar;
        return jVar;
    }

    @Override // h2.e
    public final void e(Object obj) {
        z3.j jVar = (z3.j) obj;
        e2.d.b(jVar == this.d);
        j jVar2 = (j) jVar;
        if (!jVar2.isEndOfStream()) {
            long j3 = jVar2.e;
            if (j3 != Long.MIN_VALUE) {
                long j10 = this.g;
                if (j10 != -9223372036854775807L && j3 < j10) {
                    jVar2.clear();
                    this.a.add(jVar2);
                    this.d = null;
                }
            }
        }
        long j11 = this.f;
        this.f = 1 + j11;
        jVar2.s = j11;
        this.c.add(jVar2);
        this.d = null;
    }

    public abstract m f();

    @Override // h2.e
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
            j jVar = (j) arrayDeque2.poll();
            String str = d0.a;
            jVar.clear();
            arrayDeque.add(jVar);
        }
        j jVar2 = this.d;
        if (jVar2 != null) {
            jVar2.clear();
            arrayDeque.add(jVar2);
            this.d = null;
        }
    }

    public abstract void g(j jVar);

    @Override // h2.e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public z3.k c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            j jVar = (j) arrayDeque2.peek();
            String str = d0.a;
            if (jVar.e > this.e) {
                return null;
            }
            j jVar2 = (j) arrayDeque2.poll();
            boolean isEndOfStream = jVar2.isEndOfStream();
            ArrayDeque arrayDeque3 = this.a;
            if (isEndOfStream) {
                z3.k kVar = (z3.k) arrayDeque.pollFirst();
                kVar.addFlag(4);
                jVar2.clear();
                arrayDeque3.add(jVar2);
                return kVar;
            }
            g(jVar2);
            if (i()) {
                m f7 = f();
                z3.k kVar2 = (z3.k) arrayDeque.pollFirst();
                long j3 = jVar2.e;
                kVar2.timeUs = j3;
                kVar2.a = f7;
                kVar2.b = j3;
                jVar2.clear();
                arrayDeque3.add(jVar2);
                return kVar2;
            }
            jVar2.clear();
            arrayDeque3.add(jVar2);
        }
    }

    public abstract boolean i();

    @Override // h2.e
    public void release() {
    }
}
