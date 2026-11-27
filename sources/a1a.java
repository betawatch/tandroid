// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class a1a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qy b;

    public /* synthetic */ a1a(qy qyVar, byte b) {
        this.a = b;
        this.b = qyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qy qyVar = this.b;
        switch (b) {
            case 0:
                hl.E3(((e0a) qyVar.g2).h);
                break;
            default:
                qyVar.requestFocus();
                break;
        }
    }
}
