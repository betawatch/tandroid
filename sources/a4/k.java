package a4;

import e2.m0;
import java.util.ArrayDeque;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class k implements z3.f {
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
    public final void a(long j10) {
        this.g = j10;
    }

    @Override // z3.f
    public final void b(long j10) {
        this.e = j10;
    }

    @Override // h2.e
    public final Object d() {
        u6.p(this.d == null);
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
        z3.j jVar = (z3.j) obj;
        u6.g(jVar == this.d);
        i iVar = (i) jVar;
        if (!iVar.isEndOfStream()) {
            long j10 = iVar.e;
            if (j10 != Long.MIN_VALUE) {
                long j11 = this.g;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    iVar.clear();
                    this.a.add(iVar);
                    this.d = null;
                }
            }
        }
        long j12 = this.f;
        this.f = 1 + j12;
        iVar.s = j12;
        this.c.add(iVar);
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
            String str = m0.a;
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
            i iVar = (i) arrayDeque2.peek();
            String str = m0.a;
            if (iVar.e > this.e) {
                return null;
            }
            i iVar2 = (i) arrayDeque2.poll();
            boolean isEndOfStream = iVar2.isEndOfStream();
            ArrayDeque arrayDeque3 = this.a;
            if (isEndOfStream) {
                z3.k kVar = (z3.k) arrayDeque.pollFirst();
                kVar.addFlag(4);
                iVar2.clear();
                arrayDeque3.add(iVar2);
                return kVar;
            }
            g(iVar2);
            if (i()) {
                l f7 = f();
                z3.k kVar2 = (z3.k) arrayDeque.pollFirst();
                long j10 = iVar2.e;
                kVar2.timeUs = j10;
                kVar2.a = f7;
                kVar2.b = j10;
                iVar2.clear();
                arrayDeque3.add(iVar2);
                return kVar2;
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
