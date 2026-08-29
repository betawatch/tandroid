package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class wc implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Utilities.Callback2 d;

    public /* synthetic */ wc(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.a = i10;
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
