package j4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d0 extends b0 {
    public d0(Object obj) {
        super(obj, -1L);
    }

    public final d0 b(Object obj) {
        b0 b0Var;
        if (this.a.equals(obj)) {
            b0Var = this;
        } else {
            long j10 = this.d;
            b0Var = new b0(this.b, this.c, this.e, j10, obj);
        }
        return new d0(b0Var);
    }

    public d0(Object obj, long j10, int i9) {
        super(-1, -1, i9, j10, obj);
    }
}
