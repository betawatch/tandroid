package a4;

import e2.d0;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class l implements z3.e {
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
            kVar.n = cVar;
            arrayDeque.add(kVar);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // h2.d
    public final void a(long j3) {
        this.g = j3;
    }

    @Override // z3.e
    public final void b(long j3) {
        this.e = j3;
    }

    @Override // h2.d
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

    @Override // h2.d
    public final void e(z3.i iVar) {
        e2.d.b(iVar == this.d);
        j jVar = (j) iVar;
        if (!jVar.c(4)) {
            long j3 = jVar.h;
            if (j3 != Long.MIN_VALUE) {
                long j10 = this.g;
                if (j10 != -9223372036854775807L && j3 < j10) {
                    jVar.i();
                    this.a.add(jVar);
                    this.d = null;
                }
            }
        }
        long j11 = this.f;
        this.f = 1 + j11;
        jVar.w = j11;
        this.c.add(jVar);
        this.d = null;
    }

    public abstract m f();

    @Override // h2.d
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
            jVar.i();
            arrayDeque.add(jVar);
        }
        j jVar2 = this.d;
        if (jVar2 != null) {
            jVar2.i();
            arrayDeque.add(jVar2);
            this.d = null;
        }
    }

    public abstract void g(j jVar);

    @Override // h2.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public z3.j c() {
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
            if (jVar.h > this.e) {
                return null;
            }
            j jVar2 = (j) arrayDeque2.poll();
            boolean c10 = jVar2.c(4);
            ArrayDeque arrayDeque3 = this.a;
            if (c10) {
                z3.j jVar3 = (z3.j) arrayDeque.pollFirst();
                jVar3.a(4);
                jVar2.i();
                arrayDeque3.add(jVar2);
                return jVar3;
            }
            g(jVar2);
            if (i()) {
                m f7 = f();
                z3.j jVar4 = (z3.j) arrayDeque.pollFirst();
                long j3 = jVar2.h;
                jVar4.c = j3;
                jVar4.f = f7;
                jVar4.h = j3;
                jVar2.i();
                arrayDeque3.add(jVar2);
                return jVar4;
            }
            jVar2.i();
            arrayDeque3.add(jVar2);
        }
    }

    public abstract boolean i();

    @Override // h2.d
    public void release() {
    }
}
