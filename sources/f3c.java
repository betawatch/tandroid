// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ icc b;
    public final /* synthetic */ String c;

    public /* synthetic */ f3c(icc iccVar, String str, byte b) {
        this.a = b;
        this.b = iccVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                iccVar.a(str, Boolean.FALSE);
                break;
            case 1:
                iccVar.a(null, str);
                break;
            case 2:
                iccVar.a(null, str);
                break;
            default:
                iccVar.a(null, str);
                break;
        }
    }
}
