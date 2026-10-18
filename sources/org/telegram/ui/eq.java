package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
