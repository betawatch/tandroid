package j$.util.stream;

/* loaded from: classes2.dex */
final class U2 extends X2 implements j$.util.function.m {
    final double[] c = new double[128];

    U2() {
    }

    @Override // j$.util.stream.X2
    final void a(Object obj, long j) {
        j$.util.function.m mVar = (j$.util.function.m) obj;
        for (int i = 0; i < j; i++) {
            mVar.accept(this.c[i]);
        }
    }

    @Override // j$.util.function.m
    public final void accept(double d) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = d;
    }

    @Override // j$.util.function.m
    public final /* synthetic */ j$.util.function.m k(j$.util.function.m mVar) {
        return j$.com.android.tools.r8.a.b(this, mVar);
    }
}
