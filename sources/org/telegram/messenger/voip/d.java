package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConferenceCall b;
    public final /* synthetic */ long c;

    public /* synthetic */ d(ConferenceCall conferenceCall, long j10, int i9) {
        this.a = i9;
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
