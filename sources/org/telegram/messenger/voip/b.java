package org.telegram.messenger.voip;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConferenceCall b;

    public /* synthetic */ b(ConferenceCall conferenceCall, int i10) {
        this.a = i10;
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
