package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class yc implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Utilities.Callback2 d;

    public /* synthetic */ yc(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = j10;
        this.d = callback2;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.lambda$resolveCommunityAllJoinPendingRequests$249(this.c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                this.b.lambda$resolveCommunityJoinPendingRequest$248(this.c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                this.b.lambda$toggleCommunityParticipantBanned$247(this.c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
