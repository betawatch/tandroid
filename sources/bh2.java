// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bh2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ch2 b;

    public /* synthetic */ bh2(ch2 ch2Var, byte b) {
        this.a = b;
        this.b = ch2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ch2 ch2Var = this.b;
        switch (b) {
            case 0:
                wa waVar = ch2Var.a;
                if (waVar != null) {
                    waVar.g3.O(true);
                    break;
                }
                break;
            default:
                wa waVar2 = ch2Var.a;
                if (waVar2 != null) {
                    waVar2.g3.O(true);
                    break;
                }
                break;
        }
    }
}
