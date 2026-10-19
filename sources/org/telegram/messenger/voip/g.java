package org.telegram.messenger.voip;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
