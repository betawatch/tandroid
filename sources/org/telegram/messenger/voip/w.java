package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
