package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr b;

    public /* synthetic */ eq(jr jrVar, int i10) {
        this.a = i10;
        this.b = jrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            default:
                jr jrVar = this.b;
                jrVar.getMessagesController().loadFullChat(jrVar.N, 0, true);
                break;
        }
    }
}
