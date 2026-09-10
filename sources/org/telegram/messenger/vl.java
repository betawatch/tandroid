package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class vl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ vl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = baseController;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((TranslateController) this.b).lambda$translateStory$36((TL_stories.StoryItem) this.c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f, (TranslateController.StoryKey) this.h, (Runnable) this.n);
                break;
            case 1:
                ((MediaDataController) this.b).lambda$loadHints$144((ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f, (ArrayList) this.h, (ArrayList) this.n);
                break;
            case 2:
                ((MessagesController) this.b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.c, (Context) this.d, (org.telegram.ui.ActionBar.d2) this.e, (TLRPC.TL_error) this.f, (org.telegram.ui.ActionBar.p2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.n);
                break;
            case 3:
                ((MessagesController) this.b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.c, (Context) this.d, (org.telegram.ui.ActionBar.d2) this.e, (TLRPC.TL_error) this.f, (org.telegram.ui.ActionBar.p2) this.h, (TLRPC.TL_messages_migrateChat) this.n);
                break;
            default:
                ((SecretChatHelper) this.b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.n, (String) this.d);
                break;
        }
    }

    public /* synthetic */ vl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.a = 4;
        this.b = secretChatHelper;
        this.c = encryptedChat;
        this.e = decryptedMessage;
        this.f = message;
        this.h = inputEncryptedFile;
        this.n = messageObject;
        this.d = str;
    }
}
