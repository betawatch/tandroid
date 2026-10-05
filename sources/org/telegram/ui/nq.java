package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr b;

    public /* synthetic */ nq(rr rrVar, int i10) {
        this.a = i10;
        this.b = rrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            default:
                rr rrVar = this.b;
                rrVar.getMessagesController().loadFullChat(rrVar.N, 0, true);
                break;
        }
    }
}
