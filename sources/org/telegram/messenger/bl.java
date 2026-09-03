package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class bl implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bl(BaseController baseController, long j10, Object obj, int i10) {
        this.a = i10;
        this.b = baseController;
        this.c = j10;
        this.d = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((TranslateController) this.b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.c, tLObject, tL_error);
                break;
            case 1:
                ((TranslateController) this.b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.c, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.b).lambda$loadPinnedMessageInternal$165(this.c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.b).lambda$updateTimerProc$155(this.c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                break;
            case 4:
                ((MessagesController) this.b).lambda$reloadMentionsCountForChannel$221((TLRPC.InputPeer) this.d, this.c, tLObject, tL_error);
                break;
            case 5:
                ((MessagesController) this.b).lambda$getGroupCall$63(this.c, (Runnable) this.d, tLObject, tL_error);
                break;
            case 6:
                ((MessagesController) this.b).lambda$getSponsoredMessages$440(this.c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                break;
            case 7:
                ((MessagesController) this.b).lambda$loadUnknownChannel$330(this.c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                break;
            case 8:
                ((MessagesController) this.b).lambda$setChatReactions$471(this.c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.b).lambda$checkLastDialogMessage$227((TLRPC.Dialog) this.d, this.c, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ bl(BaseController baseController, Object obj, long j10, int i10) {
        this.a = i10;
        this.b = baseController;
        this.d = obj;
        this.c = j10;
    }
}
