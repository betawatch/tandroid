package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
class x1 extends CountedCompleter {
    protected final I0 a;
    protected final int b;
    public final /* synthetic */ int c;
    private final Object d;

    public x1(I0 i0, Object obj, int i) {
        this.c = i;
        this.a = i0;
        this.b = 0;
        this.d = obj;
    }

    x1(x1 x1Var, I0 i0, int i, byte b) {
        super(x1Var);
        this.a = i0;
        this.b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        x1 x1Var = this;
        while (x1Var.a.q() != 0) {
            x1Var.setPendingCount(x1Var.a.q() - 1);
            int i = 0;
            int i2 = 0;
            while (i < x1Var.a.q() - 1) {
                x1 a = x1Var.a(i, x1Var.b + i2);
                i2 = (int) (i2 + a.a.count());
                a.fork();
                i++;
            }
            x1Var = x1Var.a(i, x1Var.b + i2);
        }
        switch (x1Var.c) {
            case 0:
                ((H0) x1Var.a).r(x1Var.b, x1Var.d);
                break;
            default:
                x1Var.a.i((Object[]) x1Var.d, x1Var.b);
                break;
        }
        x1Var.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x1(x1 x1Var, I0 i0, int i) {
        this(x1Var, i0, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) x1Var.d;
    }

    final x1 a(int i, int i2) {
        switch (this.c) {
            case 0:
                return new x1(this, ((H0) this.a).b(i), i2);
            default:
                return new x1(this, this.a.b(i), i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x1(x1 x1Var, H0 h0, int i) {
        this(x1Var, h0, i, (byte) 0);
        this.c = 0;
        this.d = x1Var.d;
    }
}
