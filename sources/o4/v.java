package o4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
