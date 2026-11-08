package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
