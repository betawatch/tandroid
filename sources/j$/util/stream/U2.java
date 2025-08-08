package j$.util.stream;

/* loaded from: classes2.dex */
final class U2 extends W2 implements j$.util.function.G {
    final int[] c = new int[128];

    @Override // j$.util.function.G
    public final /* synthetic */ j$.util.function.G l(j$.util.function.G g) {
        return j$.com.android.tools.r8.a.b(this, g);
    }

    U2() {
    }

    @Override // j$.util.stream.W2
    public final void a(Object obj, long j) {
        j$.util.function.G g = (j$.util.function.G) obj;
        for (int i = 0; i < j; i++) {
            g.accept(this.c[i]);
        }
    }

    @Override // j$.util.function.G
    public final void accept(int i) {
        int i2 = this.b;
        this.b = i2 + 1;
        this.c[i2] = i;
    }
}
