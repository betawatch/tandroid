package jh;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b2(Object obj, Object obj2, long j10, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = j10;
        this.c = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                h5.J0(this.b, this.c, (h5) this.d, (Utilities.Callback) this.e, tLObject, tL_error);
                break;
            case 1:
                ((MediaDataController) this.d).lambda$loadPinnedMessageInternal$164(this.b, this.c, (TLRPC.TL_channels_getMessages) this.e, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.d).lambda$getMediaCounts$129((int[]) this.e, this.b, this.c, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.d).lambda$requestContactToken$476((Utilities.Callback) this.e, this.b, this.c, tLObject, tL_error);
                break;
            default:
                ((TopicsController) this.d).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.e, this.b, this.c, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ b2(MediaDataController mediaDataController, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.a = 1;
        this.d = mediaDataController;
        this.b = j10;
        this.c = j11;
        this.e = tL_channels_getMessages;
    }
}
