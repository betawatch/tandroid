// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class jvc implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ lvc b;
    public final /* synthetic */ kvc c;
    public final /* synthetic */ avc d;

    public /* synthetic */ jvc(lvc lvcVar, avc avcVar, kvc kvcVar) {
        this.b = lvcVar;
        this.d = avcVar;
        this.c = kvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        avc avcVar = this.d;
        kvc kvcVar = this.c;
        lvc lvcVar = this.b;
        switch (b) {
            case 0:
                if (avcVar == null) {
                    if (kvcVar.e == null) {
                        lvcVar.e(kvcVar);
                        break;
                    } else {
                        lvcVar.c(kvcVar);
                        break;
                    }
                } else {
                    lvcVar.a(kvcVar, avcVar);
                    break;
                }
            default:
                lvcVar.a(kvcVar, avcVar);
                break;
        }
    }

    public /* synthetic */ jvc(lvc lvcVar, kvc kvcVar, avc avcVar) {
        this.b = lvcVar;
        this.c = kvcVar;
        this.d = avcVar;
    }
}
