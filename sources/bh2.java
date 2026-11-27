// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
