package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BotForumHelper b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ n0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.a = i11;
        this.b = botForumHelper;
        this.c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onBotForumDraftUpdate$1(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$onBotForumDraftUpdate$0(this.c, this.d, this.e);
                break;
        }
    }
}
