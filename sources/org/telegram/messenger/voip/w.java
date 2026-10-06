package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
