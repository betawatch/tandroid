package j$.util.stream;

/* loaded from: classes2.dex */
final class G extends J implements b2 {
    @Override // j$.util.function.G
    public final /* synthetic */ j$.util.function.G l(j$.util.function.G g) {
        return j$.com.android.tools.r8.a.b(this, g);
    }

    @Override // j$.util.stream.J, j$.util.stream.d2
    public final void accept(int i) {
        r(Integer.valueOf(i));
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return j$.util.k.d(((Integer) this.b).intValue());
        }
        return null;
    }
}
