// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
