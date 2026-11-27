// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class j25 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ icc b;

    public /* synthetic */ j25(icc iccVar, byte b) {
        this.a = b;
        this.b = iccVar;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                iccVar.a((c35) obj, (String) obj2);
                break;
            default:
                iccVar.a((Long) obj, (Boolean) obj2);
                break;
        }
    }
}
