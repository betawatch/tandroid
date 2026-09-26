package org.telegram.messenger;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class kc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ kc(int i10, boolean[] zArr) {
        this.a = i10;
        this.b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.b);
                break;
            default:
                MessagesController.lambda$openApp$497(this.b);
                break;
        }
    }
}
