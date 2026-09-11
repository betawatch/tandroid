package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
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
