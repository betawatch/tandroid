package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
class u1 extends CountedCompleter {
    protected final G0 a;
    protected final int b;
    public final /* synthetic */ int c;
    private final Object d;

    public u1(G0 g0, Object obj, int i) {
        this.c = i;
        this.a = g0;
        this.b = 0;
        this.d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u1(u1 u1Var, F0 f0, int i) {
        this(u1Var, f0, i, (byte) 0);
        this.c = 0;
        this.d = u1Var.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u1(u1 u1Var, G0 g0, int i) {
        this(u1Var, g0, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) u1Var.d;
    }

    u1(u1 u1Var, G0 g0, int i, byte b) {
        super(u1Var);
        this.a = g0;
        this.b = i;
    }

    final void a() {
        switch (this.c) {
            case 0:
                ((F0) this.a).d(this.d, this.b);
                break;
            default:
                this.a.i((Object[]) this.d, this.b);
                break;
        }
    }

    final u1 b(int i, int i2) {
        switch (this.c) {
            case 0:
                return new u1(this, ((F0) this.a).a(i), i2);
            default:
                return new u1(this, this.a.a(i), i2);
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        u1 u1Var = this;
        while (u1Var.a.p() != 0) {
            u1Var.setPendingCount(u1Var.a.p() - 1);
            int i = 0;
            int i2 = 0;
            while (i < u1Var.a.p() - 1) {
                u1 b = u1Var.b(i, u1Var.b + i2);
                i2 = (int) (i2 + b.a.count());
                b.fork();
                i++;
            }
            u1Var = u1Var.b(i, u1Var.b + i2);
        }
        u1Var.a();
        u1Var.propagateCompletion();
    }
}
