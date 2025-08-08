package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
class t1 extends CountedCompleter {
    protected final F0 a;
    protected final int b;
    public final /* synthetic */ int c;
    private final Object d;

    public t1(F0 f0, Object obj, int i) {
        this.c = i;
        this.a = f0;
        this.b = 0;
        this.d = obj;
    }

    t1(t1 t1Var, F0 f0, int i, byte b) {
        super(t1Var);
        this.a = f0;
        this.b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        t1 t1Var = this;
        while (t1Var.a.p() != 0) {
            t1Var.setPendingCount(t1Var.a.p() - 1);
            int i = 0;
            int i2 = 0;
            while (i < t1Var.a.p() - 1) {
                t1 a = t1Var.a(i, t1Var.b + i2);
                i2 = (int) (i2 + a.a.count());
                a.fork();
                i++;
            }
            t1Var = t1Var.a(i, t1Var.b + i2);
        }
        switch (t1Var.c) {
            case 0:
                ((E0) t1Var.a).d(t1Var.d, t1Var.b);
                break;
            default:
                t1Var.a.i((Object[]) t1Var.d, t1Var.b);
                break;
        }
        t1Var.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(t1 t1Var, F0 f0, int i) {
        this(t1Var, f0, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) t1Var.d;
    }

    final t1 a(int i, int i2) {
        switch (this.c) {
            case 0:
                return new t1(this, ((E0) this.a).a(i), i2);
            default:
                return new t1(this, this.a.a(i), i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(t1 t1Var, E0 e0, int i) {
        this(t1Var, e0, i, (byte) 0);
        this.c = 0;
        this.d = t1Var.d;
    }
}
