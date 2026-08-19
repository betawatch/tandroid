package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public class p1 extends CountedCompleter {
    public final B0 a;
    public final int b;
    public final /* synthetic */ int c;
    public final Object d;

    public p1(B0 b0, Object obj, int i) {
        this.c = i;
        this.a = b0;
        this.b = 0;
        this.d = obj;
    }

    public p1(p1 p1Var, B0 b0, int i, byte b) {
        super(p1Var);
        this.a = b0;
        this.b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        p1 p1Var = this;
        while (p1Var.a.i() != 0) {
            p1Var.setPendingCount(p1Var.a.i() - 1);
            int i = 0;
            int i2 = 0;
            while (i < p1Var.a.i() - 1) {
                p1 a = p1Var.a(i, p1Var.b + i2);
                i2 = (int) (a.a.count() + i2);
                a.fork();
                i++;
            }
            p1Var = p1Var.a(i, p1Var.b + i2);
        }
        switch (p1Var.c) {
            case 0:
                ((A0) p1Var.a).j(p1Var.b, p1Var.d);
                break;
            default:
                p1Var.a.g((Object[]) p1Var.d, p1Var.b);
                break;
        }
        p1Var.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p1(p1 p1Var, B0 b0, int i) {
        this(p1Var, b0, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) p1Var.d;
    }

    public final p1 a(int i, int i2) {
        switch (this.c) {
            case 0:
                return new p1(this, ((A0) this.a).b(i), i2);
            default:
                return new p1(this, this.a.b(i), i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p1(p1 p1Var, A0 a0, int i) {
        this(p1Var, a0, i, (byte) 0);
        this.c = 0;
        this.d = p1Var.d;
    }
}
