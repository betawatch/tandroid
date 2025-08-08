package j$.util.stream;

/* loaded from: classes2.dex */
final class T2 extends W2 implements j$.util.function.l {
    final double[] c = new double[128];

    @Override // j$.util.function.l
    public final /* synthetic */ j$.util.function.l k(j$.util.function.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    T2() {
    }

    @Override // j$.util.stream.W2
    final void a(Object obj, long j) {
        j$.util.function.l lVar = (j$.util.function.l) obj;
        for (int i = 0; i < j; i++) {
            lVar.accept(this.c[i]);
        }
    }

    @Override // j$.util.function.l
    public final void accept(double d) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = d;
    }
}
