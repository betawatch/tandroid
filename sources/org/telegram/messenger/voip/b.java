package org.telegram.messenger.voip;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
