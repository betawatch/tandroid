package gb;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class w0 implements ib.b {
    public final /* synthetic */ int a;
    public final ib.c b;
    public final ib.c c;

    public /* synthetic */ w0(ib.c cVar, ib.c cVar2, int i7) {
        this.a = i7;
        this.b = cVar;
        this.c = cVar2;
    }

    @Override // fd.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new v0((j1) this.b.get(), (k1) this.c.get());
            default:
                return new jb.l((jb.q) this.b.get(), (jb.q) this.c.get());
        }
    }
}
