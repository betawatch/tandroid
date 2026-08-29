package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo b;

    public /* synthetic */ no(yo yoVar, int i10) {
        this.a = i10;
        this.b = yoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yo yoVar = this.b;
                yoVar.Y = true;
                yoVar.b0();
                break;
            case 1:
                yo yoVar2 = this.b;
                yoVar2.T = yoVar2.getMessagesController().getChat(Long.valueOf(yoVar2.V));
                yoVar2.Y();
                break;
            case 2:
                this.b.a0(false);
                break;
            case 3:
                yo yoVar3 = this.b;
                yoVar3.Y = true;
                if (yoVar3.a.length() > 0) {
                    yoVar3.W(yoVar3.a.getText().toString());
                }
                yoVar3.b0();
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
