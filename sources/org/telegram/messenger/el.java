package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class el implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ el(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = baseController;
        this.f = obj;
        this.e = j10;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((TranslateController) this.b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f, (TLObject) this.c, (TLRPC.TL_error) this.d, this.e);
                break;
            case 1:
                ((TranslateController) this.b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f, (TLObject) this.c, (TLRPC.TL_error) this.d, this.e);
                break;
            case 2:
                ((MessagesController) this.b).lambda$getSponsoredMessages$439((ArrayList) this.f, this.e, (MessagesController.SponsoredMessagesInfo) this.c, (Integer) this.d);
                break;
            case 3:
                ((MessagesController) this.b).lambda$getSavedReactionTags$485((TLObject) this.c, this.e, (TLRPC.messages_SavedReactionTags) this.f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                break;
            case 4:
                ((MessagesController) this.b).lambda$addUserToChat$306((TLRPC.Updates) this.f, (Utilities.Callback) this.c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                break;
            case 5:
                ((SendMessagesHelper) this.b).lambda$prepareImportHistory$109((HashMap) this.f, this.e, (SendMessagesHelper.ImportingHistory) this.c, (MessagesStorage.LongCallback) this.d);
                break;
            default:
                ((SendMessagesHelper) this.b).lambda$prepareImportHistory$110((ArrayList) this.f, this.e, (Uri) this.c, (MessagesStorage.LongCallback) this.d);
                break;
        }
    }

    public /* synthetic */ el(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.a = i10;
        this.b = baseController;
        this.f = obj;
        this.c = obj2;
        this.d = tLObject;
        this.e = j10;
    }

    public /* synthetic */ el(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.a = 3;
        this.b = messagesController;
        this.c = tLObject;
        this.e = j10;
        this.f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
