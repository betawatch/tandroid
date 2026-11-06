package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
