package org.telegram.messenger.voip;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ int c;

    public /* synthetic */ b0(VoIPService voIPService, int i10, int i11) {
        this.a = i11;
        this.b = voIPService;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onSignalBarCountChanged$121(this.c);
                break;
            case 1:
                this.b.lambda$startConferenceGroupCall$36(this.c);
                break;
            case 2:
                this.b.lambda$onConnectionStateChanged$118(this.c);
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
