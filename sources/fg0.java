// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
