package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
