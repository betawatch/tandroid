package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                ((MessagesController) this.b).lambda$updateTimerProc$154(this.c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                break;
            case 4:
                ((MessagesController) this.b).lambda$reloadMentionsCountForChannel$220((TLRPC.InputPeer) this.d, this.c, tLObject, tL_error);
                break;
            case 5:
                ((MessagesController) this.b).lambda$getGroupCall$62(this.c, (Runnable) this.d, tLObject, tL_error);
                break;
            case 6:
                ((MessagesController) this.b).lambda$getSponsoredMessages$446(this.c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                break;
            case 7:
                ((MessagesController) this.b).lambda$loadUnknownChannel$331(this.c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                break;
            case 8:
                ((MessagesController) this.b).lambda$setChatReactions$477(this.c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.b).lambda$checkLastDialogMessage$226((TLRPC.Dialog) this.d, this.c, tLObject, tL_error);
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
