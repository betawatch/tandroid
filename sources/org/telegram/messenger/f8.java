package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class f8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f8(Object obj, Object obj2, long j10, long j11, int i10) {
        this.a = i10;
        this.b = obj;
        this.e = obj2;
        this.c = j10;
        this.d = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.b).lambda$getMediaCounts$129((int[]) this.e, this.c, this.d, tLObject, tL_error);
                break;
            case 1:
                ((MediaDataController) this.b).lambda$loadPinnedMessageInternal$164(this.c, this.d, (TLRPC.TL_channels_getMessages) this.e, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.b).lambda$requestContactToken$479((Utilities.Callback) this.e, this.c, this.d, tLObject, tL_error);
                break;
            case 3:
                ((TopicsController) this.b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.e, this.c, this.d, tLObject, tL_error);
                break;
            default:
                zh.r3 r3Var = (zh.r3) this.b;
                zh.r3.K0(this.c, this.d, (Utilities.Callback) this.e, tLObject, tL_error, r3Var);
                break;
        }
    }

    public /* synthetic */ f8(MediaDataController mediaDataController, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.a = 1;
        this.b = mediaDataController;
        this.c = j10;
        this.d = j11;
        this.e = tL_channels_getMessages;
    }
}
