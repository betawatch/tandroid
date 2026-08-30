package o4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class v extends u {
    public v(Object obj, long j10, int i10) {
        super(-1, -1, i10, j10, obj);
    }

    public final v b(Object obj) {
        u uVar;
        if (this.a.equals(obj)) {
            uVar = this;
        } else {
            long j10 = this.d;
            uVar = new u(this.b, this.c, this.e, j10, obj);
        }
        return new v(uVar);
    }
}
