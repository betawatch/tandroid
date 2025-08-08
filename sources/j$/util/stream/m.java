package j$.util.stream;

/* loaded from: classes2.dex */
final class m extends Z1 {
    boolean b;
    Object c;

    @Override // j$.util.stream.Z1, j$.util.stream.d2
    public final void n(long j) {
        this.b = false;
        this.c = null;
        this.a.n(-1L);
    }

    @Override // j$.util.stream.Z1, j$.util.stream.d2
    public final void m() {
        this.b = false;
        this.c = null;
        this.a.m();
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        d2 d2Var = this.a;
        if (obj == null) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c = null;
            d2Var.r((d2) null);
            return;
        }
        Object obj2 = this.c;
        if (obj2 == null || !obj.equals(obj2)) {
            this.c = obj;
            d2Var.r((d2) obj);
        }
    }
}
