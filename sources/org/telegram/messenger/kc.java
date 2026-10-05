package org.telegram.messenger;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
