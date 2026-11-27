// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
