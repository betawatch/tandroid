package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nq b;

    public /* synthetic */ jp(nq nqVar, int i3) {
        this.a = i3;
        this.b = nqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.w0();
                break;
            default:
                nq nqVar = this.b;
                nqVar.getMessagesController().V2(0, nqVar.N, true);
                break;
        }
    }
}
