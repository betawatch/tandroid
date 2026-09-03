package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class y7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y7(BaseController baseController, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = baseController;
        this.c = obj;
        this.d = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.b).lambda$addRecentSticker$21(this.c, (TLRPC.TL_messages_faveSticker) this.d, tLObject, tL_error);
                break;
            case 1:
                ((MediaDataController) this.b).lambda$addRecentSticker$22(this.c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.b).lambda$createChat$258((org.telegram.ui.ActionBar.p2) this.c, (TLRPC.TL_messages_createChat) this.d, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.b).lambda$createChat$261((org.telegram.ui.ActionBar.p2) this.c, (TLRPC.TL_channels_createChannel) this.d, tLObject, tL_error);
                break;
            case 4:
                ((MessagesController) this.b).lambda$saveGif$146(this.c, (TLRPC.TL_messages_saveGif) this.d, tLObject, tL_error);
                break;
            case 5:
                ((MessagesController) this.b).lambda$unpinAllMessages$129((TLRPC.Chat) this.c, (TLRPC.User) this.d, tLObject, tL_error);
                break;
            case 6:
                ((MessagesController) this.b).lambda$saveRecentSticker$147(this.c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                break;
            case 7:
                ((MessagesController) this.b).lambda$toggleChatJoinToSend$280((Runnable) this.c, (Runnable) this.d, tLObject, tL_error);
                break;
            case 8:
                ((MessagesController) this.b).lambda$loadChannelParticipants$149((Long) this.c, (Utilities.Callback) this.d, tLObject, tL_error);
                break;
            case 9:
                ((MessagesController) this.b).lambda$updateChatAbout$290((TLRPC.ChatFull) this.c, (String) this.d, tLObject, tL_error);
                break;
            case 10:
                ((SendMessagesHelper) this.b).lambda$performSendDelayedMessage$58((SendMessagesHelper.DelayedMessage) this.c, (String) this.d, tLObject, tL_error);
                break;
            case 11:
                ((SendMessagesHelper) this.b).lambda$sendNotificationCallback$29((String) this.c, (List) this.d, tLObject, tL_error);
                break;
            default:
                ((SendMessagesHelper) this.b).lambda$editMessage$21((org.telegram.ui.ActionBar.p2) this.c, (TLRPC.TL_messages_editMessage) this.d, tLObject, tL_error);
                break;
        }
    }
}
