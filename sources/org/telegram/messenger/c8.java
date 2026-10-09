package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class c8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c8(Object obj, Object obj2, long j3, long j10, int i10) {
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
                yh.s3 s3Var = (yh.s3) this.b;
                yh.s3.K0(this.c, this.d, (Utilities.Callback) this.e, tLObject, tL_error, s3Var);
                break;
        }
    }

    public /* synthetic */ c8(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.a = 1;
        this.b = mediaDataController;
        this.c = j3;
        this.d = j10;
        this.e = tL_channels_getMessages;
    }
}
