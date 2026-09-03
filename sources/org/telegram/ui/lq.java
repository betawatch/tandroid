package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;

    public /* synthetic */ lq(qr qrVar, int i10) {
        this.a = i10;
        this.b = qrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            default:
                qr qrVar = this.b;
                qrVar.getMessagesController().loadFullChat(qrVar.K, 0, true);
                break;
        }
    }
}
