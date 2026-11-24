// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class llb implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ llb(boolean z, String str, byte b) {
        this.a = b;
        this.b = z;
        this.c = str;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        String str = this.c;
        boolean z = this.b;
        osc oscVar = (osc) obj;
        switch (b) {
            case 0:
                if (oscVar != null && z && cmb.Cm.add(str)) {
                    bmb bmbVar = cmb.I;
                    xlb xlbVar = bmbVar != null ? bmbVar.j0 : null;
                    if (xlbVar != null && str.equals(xlbVar.c)) {
                        cmb.s1(true);
                        break;
                    }
                }
                break;
            default:
                if (oscVar != null && z && cmb.Cm.add(str)) {
                    bmb bmbVar2 = cmb.I;
                    amb i = bmbVar2 != null ? bmbVar2.i(false) : null;
                    if (i != null && str.equals(i.o)) {
                        cmb.s1(true);
                        break;
                    }
                }
                break;
        }
    }
}
