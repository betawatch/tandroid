package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ long d;

    public /* synthetic */ w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.a = i10;
        this.b = voIPService;
        this.c = updates;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$startConferenceGroupCall$38(this.c, this.d);
                break;
            default:
                this.b.lambda$startConferenceGroupCall$46(this.c, this.d);
                break;
        }
    }
}
