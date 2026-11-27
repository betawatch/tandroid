// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g7c implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o7c b;

    public /* synthetic */ g7c(o7c o7cVar, byte b) {
        this.a = b;
        this.b = o7cVar;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        o7c o7cVar = this.b;
        switch (b) {
            case 0:
                o7cVar.finishFragment();
                break;
            case 1:
                o7cVar.G0();
                o7cVar.finishFragment();
                break;
            case 2:
                o7cVar.S = "";
                o7cVar.J0(false);
                break;
            case 3:
                o7cVar.n0();
                break;
            default:
                o7cVar.t0();
                break;
        }
    }
}
