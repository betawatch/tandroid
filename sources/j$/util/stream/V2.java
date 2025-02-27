package j$.util.stream;

/* loaded from: classes2.dex */
final class V2 extends X2 implements j$.util.function.E {
    final int[] c = new int[128];

    V2() {
    }

    @Override // j$.util.stream.X2
    public final void a(Object obj, long j) {
        j$.util.function.E e = (j$.util.function.E) obj;
        for (int i = 0; i < j; i++) {
            e.accept(this.c[i]);
        }
    }

    @Override // j$.util.function.E
    public final void accept(int i) {
        int i2 = this.b;
        this.b = i2 + 1;
        this.c[i2] = i;
    }

    @Override // j$.util.function.E
    public final /* synthetic */ j$.util.function.E l(j$.util.function.E e) {
        return j$.com.android.tools.r8.a.c(this, e);
    }
}
