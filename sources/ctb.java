// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ctb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ktb b;

    public /* synthetic */ ctb(ktb ktbVar, byte b) {
        this.a = b;
        this.b = ktbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ktb ktbVar = this.b;
        switch (b) {
            case 0:
                ktbVar.b(false);
                break;
            case 1:
                ktbVar.c();
                break;
            default:
                ktbVar.b(false);
                break;
        }
    }
}
