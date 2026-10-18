package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class vk implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vk(BaseController baseController, long j10, Object obj, int i10) {
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
                ((MessagesController) this.b).lambda$getSponsoredMessages$443(this.c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                break;
            case 7:
                ((MessagesController) this.b).lambda$loadUnknownChannel$329(this.c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                break;
            case 8:
                ((MessagesController) this.b).lambda$setChatReactions$474(this.c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.b).lambda$checkLastDialogMessage$226((TLRPC.Dialog) this.d, this.c, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ vk(BaseController baseController, Object obj, long j10, int i10) {
        this.a = i10;
        this.b = baseController;
        this.d = obj;
        this.c = j10;
    }
}
