package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                yoVar.c0 = true;
                yoVar.b0();
                break;
            case 1:
                yo yoVar2 = this.b;
                yoVar2.X = yoVar2.getMessagesController().getChat(Long.valueOf(yoVar2.Z));
                yoVar2.Y();
                break;
            case 2:
                this.b.a0(false);
                break;
            case 3:
                yo yoVar3 = this.b;
                yoVar3.c0 = true;
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
