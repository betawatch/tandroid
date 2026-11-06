package org.telegram.messenger.voip;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ GroupCallMessage b;

    public /* synthetic */ e(GroupCallMessage groupCallMessage, int i7) {
        this.a = i7;
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
