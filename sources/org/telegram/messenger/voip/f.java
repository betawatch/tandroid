package org.telegram.messenger.voip;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ GroupCallMessage b;

    public /* synthetic */ f(GroupCallMessage groupCallMessage, int i7) {
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
