// default package

import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ks2 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ConferenceCall b;
    public final /* synthetic */ long c;

    public /* synthetic */ ks2(ConferenceCall conferenceCall, long j, byte b) {
        this.a = b;
        this.b = conferenceCall;
        this.c = j;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        long j = this.c;
        ConferenceCall conferenceCall = this.b;
        switch (b) {
            case 0:
                conferenceCall.lambda$updateParticipants$11(j, tLObject, tL_error);
                break;
            case 1:
                conferenceCall.lambda$pull_outbound$6(j, tLObject, tL_error);
                break;
            default:
                conferenceCall.lambda$kick$13(j, tLObject, tL_error);
                break;
        }
    }
}
