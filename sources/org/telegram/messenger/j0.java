package org.telegram.messenger;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
