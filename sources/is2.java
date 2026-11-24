// default package

import org.telegram.messenger.voip.ConferenceCall;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class is2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ConferenceCall b;

    public /* synthetic */ is2(ConferenceCall conferenceCall, byte b) {
        this.a = b;
        this.b = conferenceCall;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ConferenceCall conferenceCall = this.b;
        switch (b) {
            case 0:
                conferenceCall.lambda$checkParticipants$1();
                break;
            case 1:
                conferenceCall.lambda$checkEmojiHash$0();
                break;
            default:
                conferenceCall.poll();
                break;
        }
    }
}
