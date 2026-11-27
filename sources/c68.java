// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c68 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w9b b;

    public /* synthetic */ c68(w9b w9bVar, byte b) {
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
