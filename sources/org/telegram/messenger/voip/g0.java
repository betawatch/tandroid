package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
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
