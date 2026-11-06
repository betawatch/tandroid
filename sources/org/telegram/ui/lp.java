package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oq b;

    public /* synthetic */ lp(oq oqVar, int i7) {
        this.a = i7;
        this.b = oqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.w0();
                break;
            default:
                oq oqVar = this.b;
                oqVar.getMessagesController().V2(0, oqVar.M, true);
                break;
        }
    }
}
