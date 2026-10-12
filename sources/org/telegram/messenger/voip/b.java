package org.telegram.messenger.voip;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
