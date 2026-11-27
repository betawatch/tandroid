// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class db9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ pcc c;

    public /* synthetic */ db9(jxa jxaVar, boolean[] zArr, pcc pccVar) {
        this.a = (byte) 2;
        this.b = zArr;
        this.c = pccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pcc pccVar = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0] && pccVar != null) {
                    zArr[0] = true;
                    pccVar.a(Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                if (!zArr[0] && pccVar != null) {
                    zArr[0] = true;
                    pccVar.a(Boolean.TRUE);
                }
                hl.d3(new pg6((byte) 19), 220L);
                break;
            default:
                if (!zArr[0] && pccVar != null) {
                    pccVar.a("cancelled");
                    zArr[0] = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ db9(byte b, pcc pccVar, boolean[] zArr) {
        this.a = b;
        this.b = zArr;
        this.c = pccVar;
    }
}
