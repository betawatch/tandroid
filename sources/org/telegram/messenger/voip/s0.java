package org.telegram.messenger.voip;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ s0(VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = voIPService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.destroyConverting();
                break;
            case 1:
                this.b.lambda$updateConnectionState$82();
                break;
            default:
                this.b.lambda$onConnectionStateChanged$118();
                break;
        }
    }
}
