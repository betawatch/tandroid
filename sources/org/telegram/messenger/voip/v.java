package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ long d;

    public /* synthetic */ v(VoIPService voIPService, TLRPC.Updates updates, long j3, int i7) {
        this.a = i7;
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
