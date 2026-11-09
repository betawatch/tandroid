package org.telegram.messenger.voip;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ int c;

    public /* synthetic */ y(VoIPService voIPService, int i7, int i10) {
        this.a = i10;
        this.b = voIPService;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onSignalBarCountChanged$122(this.c);
                break;
            case 1:
                this.b.lambda$onConnectionStateChanged$119(this.c);
                break;
            case 2:
                this.b.lambda$startConferenceGroupCall$36(this.c);
                break;
            case 3:
                this.b.lambda$startGroupCall$25(this.c);
                break;
            case 4:
                this.b.lambda$createGroupInstance$72(this.c);
                break;
            case 5:
                this.b.lambda$startScreenCapture$57(this.c);
                break;
            default:
                this.b.lambda$updateConnectionState$81(this.c);
                break;
        }
    }
}
