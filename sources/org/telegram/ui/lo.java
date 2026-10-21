package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo b;

    public /* synthetic */ lo(wo woVar, int i10) {
        this.a = i10;
        this.b = woVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wo woVar = this.b;
                woVar.c0 = true;
                woVar.b0();
                break;
            case 1:
                wo woVar2 = this.b;
                woVar2.X = woVar2.getMessagesController().getChat(Long.valueOf(woVar2.Z));
                woVar2.Y();
                break;
            case 2:
                this.b.a0(false);
                break;
            case 3:
                wo woVar3 = this.b;
                woVar3.c0 = true;
                if (woVar3.a.length() > 0) {
                    woVar3.W(woVar3.a.getText().toString());
                }
                woVar3.b0();
                break;
            case 4:
                this.b.Y();
                break;
            default:
                this.b.a0(true);
                break;
        }
    }
}
