package j$.util.stream;

/* loaded from: classes2.dex */
final class V2 extends W2 implements j$.util.function.Y {
    final long[] c = new long[128];

    @Override // j$.util.function.Y
    public final /* synthetic */ j$.util.function.Y f(j$.util.function.Y y) {
        return j$.com.android.tools.r8.a.c(this, y);
    }

    V2() {
    }

    @Override // j$.util.stream.W2
    public final void a(Object obj, long j) {
        j$.util.function.Y y = (j$.util.function.Y) obj;
        for (int i = 0; i < j; i++) {
            y.accept(this.c[i]);
        }
    }

    @Override // j$.util.function.Y
    public final void accept(long j) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = j;
    }
}
