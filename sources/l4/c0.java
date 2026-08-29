package l4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c0 extends a0 {
    public c0(Object obj) {
        super(obj, -1L);
    }

    public final c0 b(Object obj) {
        a0 a0Var;
        if (this.a.equals(obj)) {
            a0Var = this;
        } else {
            long j10 = this.d;
            a0Var = new a0(this.b, this.c, this.e, j10, obj);
        }
        return new c0(a0Var);
    }

    public c0(Object obj, long j10, int i10) {
        super(-1, -1, i10, j10, obj);
    }
}
