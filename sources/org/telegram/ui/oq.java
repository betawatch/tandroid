package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
