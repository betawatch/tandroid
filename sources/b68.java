// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class b68 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w9b b;

    public /* synthetic */ b68(w9b w9bVar, byte b) {
        this.a = b;
        this.b = w9bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        w9b w9bVar = this.b;
        switch (b) {
            case 0:
                w9bVar.dismiss();
                break;
            case 1:
                w9bVar.dismiss();
                break;
            default:
                w9bVar.onBackPressed();
                break;
        }
    }
}
