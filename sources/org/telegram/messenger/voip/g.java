package org.telegram.messenger.voip;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ GroupCallMessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ GroupCallMessage d;

    public /* synthetic */ g(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.a = i10;
        this.b = groupCallMessagesController;
        this.c = j10;
        this.d = groupCallMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdate$0(this.c, this.d);
                break;
            case 1:
                this.b.lambda$processUpdate$1(this.c, this.d);
                break;
            default:
                this.b.lambda$processUpdate$2(this.c, this.d);
                break;
        }
    }
}
