package a4;

import e2.d0;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class k implements z3.e {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public i d;
    public long e;
    public long f;
    public long g;

    public k() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.a.add(new i());
        }
        this.b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.b;
            a1.c cVar = new a1.c(this, 1);
            j jVar = new j();
            jVar.c = cVar;
            arrayDeque.add(jVar);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // h2.e
    public final void a(long j3) {
        this.g = j3;
    }

    @Override // z3.e
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
        i iVar = (i) arrayDeque.pollFirst();
        this.d = iVar;
        return iVar;
    }

    @Override // h2.e
    public final void e(Object obj) {
        z3.i iVar = (z3.i) obj;
        e2.d.b(iVar == this.d);
        i iVar2 = (i) iVar;
        if (!iVar2.isEndOfStream()) {
            long j3 = iVar2.e;
            if (j3 != Long.MIN_VALUE) {
                long j10 = this.g;
                if (j10 != -9223372036854775807L && j3 < j10) {
                    iVar2.clear();
                    this.a.add(iVar2);
                    this.d = null;
                }
            }
        }
        long j11 = this.f;
        this.f = 1 + j11;
        iVar2.s = j11;
        this.c.add(iVar2);
        this.d = null;
    }

    public abstract l f();

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
            i iVar = (i) arrayDeque2.poll();
            String str = d0.a;
            iVar.clear();
            arrayDeque.add(iVar);
        }
        i iVar2 = this.d;
        if (iVar2 != null) {
            iVar2.clear();
            arrayDeque.add(iVar2);
            this.d = null;
        }
    }

    public abstract void g(i iVar);

    @Override // h2.e
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
            i iVar = (i) arrayDeque2.peek();
            String str = d0.a;
            if (iVar.e > this.e) {
                return null;
            }
            i iVar2 = (i) arrayDeque2.poll();
            boolean isEndOfStream = iVar2.isEndOfStream();
            ArrayDeque arrayDeque3 = this.a;
            if (isEndOfStream) {
                z3.j jVar = (z3.j) arrayDeque.pollFirst();
                jVar.addFlag(4);
                iVar2.clear();
                arrayDeque3.add(iVar2);
                return jVar;
            }
            g(iVar2);
            if (i()) {
                l f7 = f();
                z3.j jVar2 = (z3.j) arrayDeque.pollFirst();
                long j3 = iVar2.e;
                jVar2.timeUs = j3;
                jVar2.a = f7;
                jVar2.b = j3;
                iVar2.clear();
                arrayDeque3.add(iVar2);
                return jVar2;
            }
            iVar2.clear();
            arrayDeque3.add(iVar2);
        }
    }

    public abstract boolean i();

    @Override // h2.e
    public void release() {
    }
}
