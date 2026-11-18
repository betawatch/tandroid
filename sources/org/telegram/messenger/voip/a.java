package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConferenceCall b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
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
