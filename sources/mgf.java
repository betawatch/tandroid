// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mgf implements tgf {
    public final jdf a;
    public final dhf b;

    public mgf(dhf dhfVar, oef oefVar, jdf jdfVar) {
        this.b = dhfVar;
        this.a = jdfVar;
    }

    @Override // tgf
    public final void a(Object obj) {
        this.b.getClass();
        chf chfVar = ((vef) obj).zzc;
        if (chfVar.d) {
            chfVar.d = false;
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // tgf
    public final boolean b(vef vefVar, vef vefVar2) {
        this.b.getClass();
        return vefVar.zzc.equals(vefVar2.zzc);
    }

    @Override // tgf
    public final void c(Object obj, xdd xddVar) {
        ir2.u(obj);
        throw null;
    }

    @Override // tgf
    public final void d(Object obj, Object obj2) {
        ugf.o(this.b, obj, obj2);
    }

    @Override // tgf
    public final int e(vef vefVar) {
        this.b.getClass();
        chf chfVar = vefVar.zzc;
        int i = chfVar.c;
        if (i != -1) {
            return i;
        }
        chfVar.c = 0;
        return 0;
    }

    @Override // tgf
    public final int f(vef vefVar) {
        this.b.getClass();
        vefVar.zzc.getClass();
        return 506991;
    }

    @Override // tgf
    public final boolean g(Object obj) {
        ir2.u(obj);
        throw null;
    }

    @Override // tgf
    public final vef zzc() {
        jdf jdfVar = this.a;
        return jdfVar instanceof vef ? (vef) ((vef) jdfVar).h(4, null) : ((uef) ((vef) jdfVar).h(5, null)).b();
    }
}
