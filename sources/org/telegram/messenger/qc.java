package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class qc implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Utilities.Callback2 d;

    public /* synthetic */ qc(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i9) {
        this.a = i9;
        this.b = messagesController;
        this.c = j10;
        this.d = callback2;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.lambda$resolveCommunityAllJoinPendingRequests$250(this.c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                this.b.lambda$resolveCommunityJoinPendingRequest$249(this.c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                this.b.lambda$toggleCommunityParticipantBanned$248(this.c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
