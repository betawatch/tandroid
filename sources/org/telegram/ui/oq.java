package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr b;

    public /* synthetic */ oq(sr srVar, int i10) {
        this.a = i10;
        this.b = srVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            default:
                sr srVar = this.b;
                srVar.getMessagesController().loadFullChat(srVar.N, 0, true);
                break;
        }
    }
}
