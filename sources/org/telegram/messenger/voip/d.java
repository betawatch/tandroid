package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConferenceCall b;
    public final /* synthetic */ long c;

    public /* synthetic */ d(ConferenceCall conferenceCall, long j10, int i10) {
        this.a = i10;
        this.b = conferenceCall;
        this.c = j10;
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
