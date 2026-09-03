package o4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
