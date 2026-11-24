// default package

import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class hs2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ConferenceCall b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ hs2(ConferenceCall conferenceCall, long j, TLObject tLObject, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = conferenceCall;
        this.c = j;
        this.d = tLObject;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.e;
        TLObject tLObject = this.d;
        long j = this.c;
        ConferenceCall conferenceCall = this.b;
        switch (b) {
            case 0:
                conferenceCall.lambda$pull_outbound$5(j, tLObject, tL_error);
                break;
            case 1:
                conferenceCall.lambda$kick$12(j, tLObject, tL_error);
                break;
            default:
                conferenceCall.lambda$updateParticipants$10(j, tLObject, tL_error);
                break;
        }
    }
}
