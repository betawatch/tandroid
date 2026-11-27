// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hn1 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ tu0 d;

    public /* synthetic */ hn1(byte b, tu0 tu0Var, zu1 zu1Var, String str) {
        this.a = b;
        this.b = zu1Var;
        this.c = str;
        this.d = tu0Var;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        tu0 tu0Var = this.d;
        String str = this.c;
        zu1 zu1Var = this.b;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        zu1Var.getClass();
        switch (b) {
            case 0:
                if (bool.booleanValue()) {
                    if (bool2.booleanValue()) {
                        zu1Var.getMessagesController().m(str, true);
                    }
                    tu0Var.run();
                    m01.o(zu1Var.getParentActivity(), str, false, null);
                    break;
                }
                break;
            default:
                if (bool.booleanValue()) {
                    if (bool2.booleanValue()) {
                        zu1Var.getMessagesController().m(str, false);
                    }
                    tu0Var.run();
                    zu1Var.getParentActivity();
                    m01.p(str);
                    break;
                }
                break;
        }
    }
}
