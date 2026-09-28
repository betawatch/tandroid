package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConferenceCall b;
    public final /* synthetic */ long c;

    public /* synthetic */ d(ConferenceCall conferenceCall, long j3, int i10) {
        this.a = i10;
        this.b = conferenceCall;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$updateParticipants$11(this.c, tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$pull_outbound$6(this.c, tLObject, tL_error);
                break;
            default:
                this.b.lambda$kick$13(this.c, tLObject, tL_error);
                break;
        }
    }
}
