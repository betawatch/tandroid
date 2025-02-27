package j$.util.stream;

/* loaded from: classes2.dex */
final class W2 extends X2 implements j$.util.function.T {
    final long[] c = new long[128];

    W2() {
    }

    @Override // j$.util.stream.X2
    public final void a(Object obj, long j) {
        j$.util.function.T t = (j$.util.function.T) obj;
        for (int i = 0; i < j; i++) {
            t.accept(this.c[i]);
        }
    }

    @Override // j$.util.function.T
    public final void accept(long j) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = j;
    }

    @Override // j$.util.function.T
    public final /* synthetic */ j$.util.function.T f(j$.util.function.T t) {
        return j$.com.android.tools.r8.a.d(this, t);
    }
}
