package j$.util.stream;

/* loaded from: classes2.dex */
abstract class I0 implements G0 {
    protected final G0 a;
    protected final G0 b;
    private final long c;

    I0(G0 g0, G0 g02) {
        this.a = g0;
        this.b = g02;
        this.c = g0.count() + g02.count();
    }

    @Override // j$.util.stream.G0
    public /* bridge */ /* synthetic */ F0 a(int i) {
        return (F0) a(i);
    }

    @Override // j$.util.stream.G0
    public final G0 a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.G0
    public final int p() {
        return 2;
    }
}
