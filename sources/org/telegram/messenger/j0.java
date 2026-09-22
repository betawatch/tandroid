package org.telegram.messenger;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BotForumHelper b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ j0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.a = i11;
        this.b = botForumHelper;
        this.c = j3;
        this.d = i10;
        this.e = j10;
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
