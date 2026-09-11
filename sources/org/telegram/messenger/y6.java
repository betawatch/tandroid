package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class y6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y6(Object obj, Object obj2, long j3, long j10, int i10) {
        this.a = i10;
        this.b = obj;
        this.e = obj2;
        this.c = j3;
        this.d = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.b).lambda$loadPinnedMessageInternal$164(this.c, this.d, (TLRPC.TL_channels_getMessages) this.e, tLObject, tL_error);
                break;
            case 1:
                ((MediaDataController) this.b).lambda$getMediaCounts$129((int[]) this.e, this.c, this.d, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.b).lambda$requestContactToken$476((Utilities.Callback) this.e, this.c, this.d, tLObject, tL_error);
                break;
            case 3:
                ((TopicsController) this.b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.e, this.c, this.d, tLObject, tL_error);
                break;
            default:
                zh.w3 w3Var = (zh.w3) this.b;
                zh.w3.J0(this.c, this.d, (Utilities.Callback) this.e, tLObject, tL_error, w3Var);
                break;
        }
    }

    public /* synthetic */ y6(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.a = 0;
        this.b = mediaDataController;
        this.c = j3;
        this.d = j10;
        this.e = tL_channels_getMessages;
    }
}
