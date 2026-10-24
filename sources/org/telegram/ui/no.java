package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                yoVar.d0 = true;
                yoVar.c0();
                break;
            case 1:
                yo yoVar2 = this.b;
                yoVar2.Y = yoVar2.getMessagesController().getChat(Long.valueOf(yoVar2.a0));
                yoVar2.Z();
                break;
            case 2:
                this.b.b0(false);
                break;
            case 3:
                yo yoVar3 = this.b;
                yoVar3.d0 = true;
                if (yoVar3.a.length() > 0) {
                    yoVar3.X(yoVar3.a.getText().toString());
                }
                yoVar3.c0();
                break;
            case 4:
                this.b.Z();
                break;
            default:
                this.b.b0(true);
                break;
        }
    }
}
