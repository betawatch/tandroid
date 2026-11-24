// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fg0 implements eg0 {
    public final /* synthetic */ eha a;

    public fg0(eha ehaVar) {
        this.a = ehaVar;
    }

    @Override // eg0
    public final void a(ds2 ds2Var) {
        boolean c = ds2Var.c();
        eha ehaVar = this.a;
        if (c) {
            ehaVar.j(null, ehaVar.E);
            return;
        }
        v39 v39Var = ehaVar.u;
        if (v39Var != null) {
            ((fy4) v39Var.b).onConnectionFailed(ds2Var);
        }
    }
}
