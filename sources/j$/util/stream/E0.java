package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class E0 implements C0 {
    public final C0 a;
    public final C0 b;
    public final long c;

    @Override // j$.util.stream.C0
    public final int i() {
        return 2;
    }

    public E0(C0 c0, C0 c02) {
        this.a = c0;
        this.b = c02;
        this.c = c02.count() + c0.count();
    }

    @Override // j$.util.stream.C0
    public final C0 b(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.C0
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.C0
    public /* bridge */ /* synthetic */ B0 b(int i) {
        return (B0) b(i);
    }
}
