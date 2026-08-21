package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public class q1 extends CountedCompleter {
    public final C0 a;
    public final int b;
    public final /* synthetic */ int c;
    public final Object d;

    public q1(C0 c0, Object obj, int i) {
        this.c = i;
        this.a = c0;
        this.b = 0;
        this.d = obj;
    }

    public q1(q1 q1Var, C0 c0, int i, byte b) {
        super(q1Var);
        this.a = c0;
        this.b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        q1 q1Var = this;
        while (q1Var.a.i() != 0) {
            q1Var.setPendingCount(q1Var.a.i() - 1);
            int i = 0;
            int i2 = 0;
            while (i < q1Var.a.i() - 1) {
                q1 a = q1Var.a(i, q1Var.b + i2);
                i2 = (int) (a.a.count() + i2);
                a.fork();
                i++;
            }
            q1Var = q1Var.a(i, q1Var.b + i2);
        }
        switch (q1Var.c) {
            case 0:
                ((B0) q1Var.a).j(q1Var.b, q1Var.d);
                break;
            default:
                q1Var.a.g((Object[]) q1Var.d, q1Var.b);
                break;
        }
        q1Var.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q1(q1 q1Var, C0 c0, int i) {
        this(q1Var, c0, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) q1Var.d;
    }

    public final q1 a(int i, int i2) {
        switch (this.c) {
            case 0:
                return new q1(this, ((B0) this.a).b(i), i2);
            default:
                return new q1(this, this.a.b(i), i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q1(q1 q1Var, B0 b0, int i) {
        this(q1Var, b0, i, (byte) 0);
        this.c = 0;
        this.d = q1Var.d;
    }
}
