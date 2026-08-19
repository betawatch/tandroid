package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class D0 implements B0 {
    public final B0 a;
    public final B0 b;
    public final long c;

    @Override // j$.util.stream.B0
    public final int i() {
        return 2;
    }

    public D0(B0 b0, B0 b02) {
        this.a = b0;
        this.b = b02;
        this.c = b02.count() + b0.count();
    }

    @Override // j$.util.stream.B0
    public final B0 b(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.B0
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.B0
    public /* bridge */ /* synthetic */ A0 b(int i) {
        return (A0) b(i);
    }
}
