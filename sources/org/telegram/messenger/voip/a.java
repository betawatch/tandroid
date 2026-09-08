package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConferenceCall b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = conferenceCall;
        this.c = j3;
        this.d = tLObject;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$pull_outbound$5(this.c, this.d, this.e);
                break;
            case 1:
                this.b.lambda$kick$12(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$updateParticipants$10(this.c, this.d, this.e);
                break;
        }
    }
}
