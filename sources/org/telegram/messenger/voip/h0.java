package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ h0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = voIPService;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$startGroupCall$28(this.c);
                break;
            case 1:
                this.b.lambda$startGroupCall$22(this.c);
                break;
            default:
                this.b.lambda$startScreenCapture$59(this.c);
                break;
        }
    }
}
