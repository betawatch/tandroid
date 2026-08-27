package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo b;

    public /* synthetic */ mo(xo xoVar, int i10) {
        this.a = i10;
        this.b = xoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xo xoVar = this.b;
                xoVar.Y = true;
                xoVar.b0();
                break;
            case 1:
                xo xoVar2 = this.b;
                xoVar2.T = xoVar2.getMessagesController().getChat(Long.valueOf(xoVar2.V));
                xoVar2.Y();
                break;
            case 2:
                this.b.a0(false);
                break;
            case 3:
                xo xoVar3 = this.b;
                xoVar3.Y = true;
                if (xoVar3.a.length() > 0) {
                    xoVar3.W(xoVar3.a.getText().toString());
                }
                xoVar3.b0();
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
