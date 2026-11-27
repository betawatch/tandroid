// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class afa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cfa b;

    public /* synthetic */ afa(cfa cfaVar, byte b) {
        this.a = b;
        this.b = cfaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        cfa cfaVar = this.b;
        switch (b) {
            case 0:
                cfaVar.post(new afa(cfaVar, b2));
                break;
            default:
                cfaVar.c0.N0 = true;
                cfaVar.I.clear();
                cfaVar.J.clear();
                cfaVar.K.clear();
                cfaVar.invalidate();
                break;
        }
    }
}
