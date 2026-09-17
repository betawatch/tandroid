package org.telegram.messenger.voip;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ GroupCallMessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ GroupCallMessage d;

    public /* synthetic */ h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.a = i10;
        this.b = groupCallMessagesController;
        this.c = j3;
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
