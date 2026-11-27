// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c1a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d1a b;

    public /* synthetic */ c1a(d1a d1aVar, byte b) {
        this.a = b;
        this.b = d1aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d1a d1aVar = this.b;
        switch (b) {
            case 0:
                d1aVar.dismiss();
                break;
            default:
                d1aVar.b();
                break;
        }
    }
}
