package org.telegram.messenger;

import android.text.Spannable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w4(Object obj, int i9, int i10, Serializable serializable, int i11) {
        this.a = i11;
        this.e = obj;
        this.b = i9;
        this.c = i10;
        this.d = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ImageLoader.5) this.e).lambda$fileDidFailedLoad$6((String) this.d, this.b, this.c);
                break;
            case 1:
                CodeHighlighting.lambda$highlight$5((Spannable) this.e, this.b, this.c, (String) this.d);
                break;
            case 2:
                ((MediaDataController) this.e).lambda$loadReactions$11((List) this.d, this.b, this.c);
                break;
            case 3:
                ((MediaDataController) this.e).lambda$putReactionsToCache$16((ArrayList) this.d, this.b, this.c);
                break;
            case 4:
                ((MessagesController) this.e).lambda$getDifference$350((TLRPC.updates_Difference) this.d, this.b, this.c);
                break;
            case 5:
                ((MessagesController.DialogPhotos) this.e).lambda$load$0((TLRPC.photos_Photos) this.d, this.b, this.c);
                break;
            case 6:
                ((MessagesController.DialogPhotos) this.e).lambda$load$2((TLRPC.messages_Messages) this.d, this.b, this.c);
                break;
            case 7:
                ((MessagesStorage) this.e).lambda$saveSecretParams$7(this.b, this.c, (byte[]) this.d);
                break;
            case 8:
                ((NotificationCenter) this.e).lambda$postNotificationDebounced$2(this.b, (Object[]) this.d, this.c);
                break;
            default:
                ((SecretChatHelper) this.e).lambda$resendMessages$15(this.b, (TLRPC.EncryptedChat) this.d, this.c);
                break;
        }
    }

    public /* synthetic */ w4(Object obj, int i9, Object obj2, int i10, int i11) {
        this.a = i11;
        this.e = obj;
        this.b = i9;
        this.d = obj2;
        this.c = i10;
    }

    public /* synthetic */ w4(Object obj, Object obj2, int i9, int i10, int i11) {
        this.a = i11;
        this.e = obj;
        this.d = obj2;
        this.b = i9;
        this.c = i10;
    }
}
