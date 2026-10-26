package org.telegram.messenger.voip;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ int c;

    public /* synthetic */ x(VoIPService voIPService, int i10, int i11) {
        this.a = i11;
        this.b = voIPService;
        this.c = i10;
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
