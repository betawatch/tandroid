// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class on2 implements ff7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ id b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ fn7 e;

    public /* synthetic */ on2(fn7 fn7Var, id idVar, long j, boolean z, byte b) {
        this.a = b;
        this.e = fn7Var;
        this.b = idVar;
        this.c = j;
        this.d = z;
    }

    @Override // ff7
    public final void run(long j) {
        byte b = this.a;
        boolean z = this.d;
        long j2 = this.c;
        id idVar = this.b;
        fn7 fn7Var = this.e;
        switch (b) {
            case 0:
                qn2 qn2Var = (qn2) fn7Var;
                idVar.dismiss();
                if (j != 0) {
                    qn2Var.b = -j;
                    qn2Var.c = qn2Var.getMessagesController().M0(Long.valueOf(j));
                    qn2Var.Z(j2, z);
                    break;
                }
                break;
            default:
                xo2 xo2Var = (xo2) fn7Var;
                idVar.dismiss();
                if (j != 0) {
                    xo2Var.G0(uc7.s1(xo2Var.a).M0(Long.valueOf(j)), j2, z);
                    break;
                }
                break;
        }
    }
}
