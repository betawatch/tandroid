package org.telegram.messenger.voip;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ GroupCallMessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ GroupCallMessage d;

    public /* synthetic */ f(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i7) {
        this.a = i7;
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
