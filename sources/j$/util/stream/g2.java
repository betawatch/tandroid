package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class g2 implements e2 {
    public final e2 a;
    public final e2 b;
    public final long c;

    @Override // j$.util.stream.e2
    public final int h() {
        return 2;
    }

    public g2(e2 e2Var, e2 e2Var2) {
        this.a = e2Var;
        this.b = e2Var2;
        this.c = e2Var2.count() + e2Var.count();
    }

    @Override // j$.util.stream.e2
    public final e2 a(int i10) {
        if (i10 == 0) {
            return this.a;
        }
        if (i10 == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.e2
    public /* bridge */ /* synthetic */ d2 a(int i10) {
        return (d2) a(i10);
    }
}
