package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr b;

    public /* synthetic */ jq(pr prVar, int i10) {
        this.a = i10;
        this.b = prVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.w0();
                break;
            default:
                pr prVar = this.b;
                prVar.getMessagesController().T2(0, prVar.M, true);
                break;
        }
    }
}
