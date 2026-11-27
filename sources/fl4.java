// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fl4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ znb b;

    public /* synthetic */ fl4(znb znbVar, byte b) {
        this.a = b;
        this.b = znbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        znb znbVar = this.b;
        switch (b) {
            case 0:
                jn7.e().k(jn7.w4, znbVar, Boolean.TRUE, null, -1);
                break;
            default:
                znbVar.r();
                break;
        }
    }
}
