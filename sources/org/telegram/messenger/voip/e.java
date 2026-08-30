package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConferenceCall b;
    public final /* synthetic */ long c;

    public /* synthetic */ e(ConferenceCall conferenceCall, long j10, int i10) {
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
