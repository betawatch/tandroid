// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kjb implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ kjb(boolean z, String str, byte b) {
        this.a = b;
        this.b = z;
        this.c = str;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        String str = this.c;
        boolean z = this.b;
        mqc mqcVar = (mqc) obj;
        switch (b) {
            case 0:
                if (mqcVar != null && z && bkb.Cm.add(str)) {
                    akb akbVar = bkb.I;
                    vjb vjbVar = akbVar != null ? akbVar.j0 : null;
                    if (vjbVar != null && str.equals(vjbVar.c)) {
                        bkb.s1(true);
                        break;
                    }
                }
                break;
            default:
                if (mqcVar != null && z && bkb.Cm.add(str)) {
                    akb akbVar2 = bkb.I;
                    zjb i = akbVar2 != null ? akbVar2.i(false) : null;
                    if (i != null && str.equals(i.o)) {
                        bkb.s1(true);
                        break;
                    }
                }
                break;
        }
    }
}
