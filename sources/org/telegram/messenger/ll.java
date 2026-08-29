package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class ll implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ll(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
        this.n = obj7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((TranslateController) this.c).lambda$translateStory$36((TL_stories.StoryItem) this.d, (String) this.b, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f, (TranslateController.StoryKey) this.h, (Runnable) this.n);
                break;
            case 1:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.c, (org.telegram.ui.Components.vc[]) this.d, (String) this.b, (String) this.e, (String) this.f, (String) this.h, (String) this.n);
                break;
            case 2:
                ((MediaDataController) this.c).lambda$loadHints$144((ArrayList) this.d, (ArrayList) this.b, (ArrayList) this.e, (ArrayList) this.f, (ArrayList) this.h, (ArrayList) this.n);
                break;
            case 3:
                ((MessagesController) this.c).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.d, (Context) this.b, (org.telegram.ui.ActionBar.c2) this.e, (TLRPC.TL_error) this.f, (org.telegram.ui.ActionBar.o2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.n);
                break;
            case 4:
                ((MessagesController) this.c).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.d, (Context) this.b, (org.telegram.ui.ActionBar.c2) this.e, (TLRPC.TL_error) this.f, (org.telegram.ui.ActionBar.o2) this.h, (TLRPC.TL_messages_migrateChat) this.n);
                break;
            default:
                ((SecretChatHelper) this.c).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.d, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.n, (String) this.b);
                break;
        }
    }

    public /* synthetic */ ll(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.a = 5;
        this.c = secretChatHelper;
        this.d = encryptedChat;
        this.e = decryptedMessage;
        this.f = message;
        this.h = inputEncryptedFile;
        this.n = messageObject;
        this.b = str;
    }
}
