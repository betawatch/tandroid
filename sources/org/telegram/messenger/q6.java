package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class q6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q6(Object obj, Object obj2, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaController.2) this.c).lambda$run$1((ByteBuffer) this.d, this.b);
                break;
            case 1:
                ((FileLoader) this.c).lambda$cancelFileUpload$2(this.b, (String) this.d);
                break;
            case 2:
                ((ImageLoader) this.c).lambda$cancelLoadingForImageReceiver$4(this.b, (ImageReceiver) this.d);
                break;
            case 3:
                ((MediaDataController) this.c).lambda$loadBotKeyboard$196((MessagesStorage.TopicKey) this.d, this.b);
                break;
            case 4:
                ((MediaDataController) this.c).lambda$buildShortcuts$143(this.b, (ArrayList) this.d);
                break;
            case 5:
                ((MessagesController) this.c).lambda$processDialogsUpdate$229((TLRPC.messages_Dialogs) this.d, this.b);
                break;
            case 6:
                ((MessagesStorage) this.c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.b);
                break;
            case 7:
                ((MessagesStorage) this.c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.b);
                break;
            case 8:
                ((MessagesStorage) this.c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.b);
                break;
            case 9:
                ((MessagesStorage) this.c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.b);
                break;
            default:
                ((MessagesStorage) this.c).lambda$deleteEphemeralMessages$206((a0.h) this.d, this.b);
                break;
        }
    }

    public /* synthetic */ q6(Object obj, boolean z4, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
        this.d = obj2;
    }
}
