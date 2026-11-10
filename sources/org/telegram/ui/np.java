package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class np implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rq b;

    public /* synthetic */ np(rq rqVar, int i7) {
        this.a = i7;
        this.b = rqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.w0();
                break;
            default:
                rq rqVar = this.b;
                rqVar.getMessagesController().V2(0, rqVar.M, true);
                break;
        }
    }
}
