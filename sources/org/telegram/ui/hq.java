package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr b;

    public /* synthetic */ hq(kr krVar, int i10) {
        this.a = i10;
        this.b = krVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s0();
                break;
            default:
                kr krVar = this.b;
                krVar.getMessagesController().loadFullChat(krVar.M, 0, true);
                break;
        }
    }
}
