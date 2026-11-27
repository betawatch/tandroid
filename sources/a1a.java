// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
