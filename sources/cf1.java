// default package

import java.util.ArrayDeque;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class cf1 implements mcb {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public af1 d;
    public long e;
    public long f;
    public long g;

    public cf1() {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            this.a.add(new af1());
        }
        this.b = new ArrayDeque();
        while (true) {
            byte b = 2;
            if (i >= 2) {
                this.c = new ArrayDeque();
                this.g = -9223372036854775807L;
                return;
            }
            ArrayDeque arrayDeque = this.b;
            cd1 cd1Var = new cd1(this, b);
            bf1 bf1Var = new bf1();
            bf1Var.c = cd1Var;
            arrayDeque.add(bf1Var);
            i++;
        }
    }

    @Override // ga3
    public final void a(long j) {
        this.g = j;
    }

    @Override // mcb
    public final void b(long j) {
        this.e = j;
    }

    @Override // ga3
    public final Object d() {
        jte.p(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        af1 af1Var = (af1) arrayDeque.pollFirst();
        this.d = af1Var;
        return af1Var;
    }

    @Override // ga3
    public final void e(Object obj) {
        rcb rcbVar = (rcb) obj;
        jte.f(rcbVar == this.d);
        af1 af1Var = (af1) rcbVar;
        if (!af1Var.isEndOfStream()) {
            long j = af1Var.e;
            if (j != Long.MIN_VALUE) {
                long j2 = this.g;
                if (j2 != -9223372036854775807L && j < j2) {
                    af1Var.clear();
                    this.a.add(af1Var);
                    this.d = null;
                }
            }
        }
        long j3 = this.f;
        this.f = 1 + j3;
        af1Var.s = j3;
        this.c.add(af1Var);
        this.d = null;
    }

    public abstract sz4 f();

    @Override // ga3
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
            af1 af1Var = (af1) arrayDeque2.poll();
            String str = hac.a;
            af1Var.clear();
            arrayDeque.add(af1Var);
        }
        af1 af1Var2 = this.d;
        if (af1Var2 != null) {
            af1Var2.clear();
            arrayDeque.add(af1Var2);
            this.d = null;
        }
    }

    public abstract void g(af1 af1Var);

    @Override // ga3
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public scb c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            af1 af1Var = (af1) arrayDeque2.peek();
            String str = hac.a;
            if (af1Var.e > this.e) {
                return null;
            }
            af1 af1Var2 = (af1) arrayDeque2.poll();
            boolean isEndOfStream = af1Var2.isEndOfStream();
            ArrayDeque arrayDeque3 = this.a;
            if (isEndOfStream) {
                scb scbVar = (scb) arrayDeque.pollFirst();
                scbVar.addFlag(4);
                af1Var2.clear();
                arrayDeque3.add(af1Var2);
                return scbVar;
            }
            g(af1Var2);
            if (i()) {
                sz4 f = f();
                scb scbVar2 = (scb) arrayDeque.pollFirst();
                long j = af1Var2.e;
                scbVar2.timeUs = j;
                scbVar2.a = f;
                scbVar2.b = j;
                af1Var2.clear();
                arrayDeque3.add(af1Var2);
                return scbVar2;
            }
            af1Var2.clear();
            arrayDeque3.add(af1Var2);
        }
    }

    public abstract boolean i();

    @Override // ga3
    public void release() {
    }
}
