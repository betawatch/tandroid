package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;

    public /* synthetic */ eq(lr lrVar, int i10) {
        this.a = i10;
        this.b = lrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            default:
                lr lrVar = this.b;
                lrVar.getMessagesController().loadFullChat(lrVar.J, 0, true);
                break;
        }
    }
}
