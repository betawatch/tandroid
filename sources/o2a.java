// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class o2a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t2a b;

    public /* synthetic */ o2a(t2a t2aVar, byte b) {
        this.a = b;
        this.b = t2aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        t2a t2aVar = this.b;
        switch (b) {
            case 0:
                t2aVar.e1(true);
                break;
            case 1:
                t2aVar.j1(true, false);
                break;
            case 2:
                t2aVar.Z0();
                break;
            case 3:
                t2aVar.j1(true, false);
                break;
            case 4:
                t2aVar.j1(true, false);
                break;
            case 5:
                t2aVar.j1(true, false);
                break;
            case 6:
                t2aVar.Z1.clear();
                t2aVar.a2.clear();
                t2aVar.dismiss();
                break;
            default:
                t2aVar.dismiss();
                break;
        }
    }
}
