package org.telegram.messenger.voip;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ GroupCallMessage b;

    public /* synthetic */ h(GroupCallMessage groupCallMessage, int i10) {
        this.a = i10;
        this.b = groupCallMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.notifyStateUpdate();
                break;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.b);
                break;
        }
    }
}
