// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oqc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pqc b;

    public /* synthetic */ oqc(pqc pqcVar, byte b) {
        this.a = b;
        this.b = pqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pqc pqcVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new oqc(pqcVar, (byte) 1));
                break;
            default:
                pqcVar.a();
                break;
        }
    }
}
