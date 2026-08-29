package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                jrVar.getMessagesController().loadFullChat(jrVar.J, 0, true);
                break;
        }
    }
}
