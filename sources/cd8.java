// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class cd8 extends sm4 {
    public final znb f;

    public cd8(aob aobVar) {
        super(aobVar);
        this.f = new znb();
    }

    @Override // sm4, aob
    public final xnb f(int i, xnb xnbVar, boolean z) {
        aob aobVar = this.e;
        xnb f = aobVar.f(i, xnbVar, z);
        if (!aobVar.m(f.c, this.f, 0L).a()) {
            f.f = true;
            return f;
        }
        Object obj = xnbVar.a;
        Object obj2 = xnbVar.b;
        int i2 = xnbVar.c;
        long j = xnbVar.d;
        long j2 = xnbVar.e;
        da daVar = da.c;
        f.h(obj, obj2, i2, j, j2, true);
        return f;
    }
}
