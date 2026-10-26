package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConferenceCall b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ a(ConferenceCall conferenceCall, long j10, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = conferenceCall;
        this.c = j10;
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
