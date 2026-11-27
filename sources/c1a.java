// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
