// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
