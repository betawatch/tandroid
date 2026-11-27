// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
