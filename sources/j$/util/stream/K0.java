package j$.util.stream;

/* loaded from: classes2.dex */
abstract class K0 implements I0 {
    protected final I0 a;
    protected final I0 b;
    private final long c;

    @Override // j$.util.stream.I0
    public final int q() {
        return 2;
    }

    K0(I0 i0, I0 i02) {
        this.a = i0;
        this.b = i02;
        this.c = i0.count() + i02.count();
    }

    @Override // j$.util.stream.I0
    public final I0 b(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.I0
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.I0
    public /* bridge */ /* synthetic */ H0 b(int i) {
        return (H0) b(i);
    }
}
