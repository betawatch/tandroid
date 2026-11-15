package org.telegram.messenger.voip;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConferenceCall b;

    public /* synthetic */ b(ConferenceCall conferenceCall, int i7) {
        this.a = i7;
        this.b = conferenceCall;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$checkParticipants$1();
                break;
            case 1:
                this.b.lambda$checkEmojiHash$0();
                break;
            default:
                this.b.poll();
                break;
        }
    }
}
