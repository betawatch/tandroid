// default package

import java.util.ArrayDeque;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class de1 implements ieb {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public be1 d;
    public long e;
    public long f;
    public long g;

    public de1() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new be1());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            rd1 rd1Var = new rd1((Object) this, (byte) 1);
            ce1 ce1Var = new ce1();
            ce1Var.c = rd1Var;
            arrayDeque.add(ce1Var);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // n93
    public final void a(long j) {
        this.g = j;
    }

    @Override // ieb
    public final void b(long j) {
        this.e = j;
    }

    @Override // n93
    public final Object d() {
        yve.p(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        be1 be1Var = (be1) arrayDeque.pollFirst();
        this.d = be1Var;
        return be1Var;
    }

    @Override // n93
    public final void e(Object obj) {
        neb nebVar = (neb) obj;
        yve.f(nebVar == this.d);
        be1 be1Var = (be1) nebVar;
        if (!be1Var.isEndOfStream()) {
            long j = be1Var.e;
            if (j != Long.MIN_VALUE) {
                long j2 = this.g;
                if (j2 != -9223372036854775807L && j < j2) {
                    be1Var.clear();
                    this.a.add(be1Var);
                    this.d = null;
                }
            }
        }
        long j3 = this.f;
        this.f = 1 + j3;
        be1Var.s = j3;
        this.c.add(be1Var);
        this.d = null;
    }

    public abstract wz4 f();

    @Override // n93
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
            be1 be1Var = (be1) arrayDeque2.poll();
            String str = gcc.a;
            be1Var.clear();
            arrayDeque.add(be1Var);
        }
        be1 be1Var2 = this.d;
        if (be1Var2 != null) {
            be1Var2.clear();
            arrayDeque.add(be1Var2);
            this.d = null;
        }
    }

    public abstract void g(be1 be1Var);

    @Override // n93
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public oeb c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            be1 be1Var = (be1) arrayDeque2.peek();
            String str = gcc.a;
            if (be1Var.e > this.e) {
                return null;
            }
            be1 be1Var2 = (be1) arrayDeque2.poll();
            boolean isEndOfStream = be1Var2.isEndOfStream();
            ArrayDeque arrayDeque3 = this.a;
            if (isEndOfStream) {
                oeb oebVar = (oeb) arrayDeque.pollFirst();
                oebVar.addFlag(4);
                be1Var2.clear();
                arrayDeque3.add(be1Var2);
                return oebVar;
            }
            g(be1Var2);
            if (i()) {
                wz4 f = f();
                oeb oebVar2 = (oeb) arrayDeque.pollFirst();
                long j = be1Var2.e;
                oebVar2.timeUs = j;
                oebVar2.a = f;
                oebVar2.b = j;
                be1Var2.clear();
                arrayDeque3.add(be1Var2);
                return oebVar2;
            }
            be1Var2.clear();
            arrayDeque3.add(be1Var2);
        }
    }

    public abstract boolean i();

    @Override // n93
    public void release() {
    }
}
