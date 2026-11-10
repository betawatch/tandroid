package org.telegram.messenger.voip;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ n0(VoIPService voIPService, int i7) {
        this.a = i7;
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
