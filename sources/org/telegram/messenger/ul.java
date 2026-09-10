package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class ul implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ul(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = baseController;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((TranslateController) this.b).lambda$translateStory$38((TL_stories.StoryItem) this.c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f, (TLRPC.TL_textWithEntities) this.g, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.b).lambda$convertToGigaGroup$270((Context) this.c, (org.telegram.ui.ActionBar.d2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.p2) this.f, (TLRPC.TL_channels_convertToGigagroup) this.g, tLObject, tL_error);
                break;
            default:
                ((SecretChatHelper) this.b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f, (MessageObject) this.g, (String) this.d, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ ul(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.a = 2;
        this.b = secretChatHelper;
        this.c = decryptedMessage;
        this.e = encryptedChat;
        this.f = message;
        this.g = messageObject;
        this.d = str;
    }
}
