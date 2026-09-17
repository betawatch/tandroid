package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
