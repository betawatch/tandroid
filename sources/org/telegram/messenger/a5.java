package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class a5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a5(Object obj, Object obj2, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ImageLoader.5) this.d).lambda$fileDidFailedLoad$6((String) this.e, this.b, this.c);
                break;
            case 1:
                ((MediaDataController) this.d).lambda$loadReactions$11((List) this.e, this.b, this.c);
                break;
            case 2:
                ((MediaDataController) this.d).lambda$putReactionsToCache$16((ArrayList) this.e, this.b, this.c);
                break;
            case 3:
                ((MessagesController) this.d).lambda$getDifference$349((TLRPC.updates_Difference) this.e, this.b, this.c);
                break;
            case 4:
                ((MessagesController.DialogPhotos) this.d).lambda$load$0((TLRPC.photos_Photos) this.e, this.b, this.c);
                break;
            case 5:
                ((MessagesController.DialogPhotos) this.d).lambda$load$2((TLRPC.messages_Messages) this.e, this.b, this.c);
                break;
            case 6:
                ((MessagesStorage) this.d).lambda$saveSecretParams$7(this.b, this.c, (byte[]) this.e);
                break;
            default:
                ((NotificationCenter) this.d).lambda$postNotificationDebounced$2(this.b, (Object[]) this.e, this.c);
                break;
        }
    }

    public /* synthetic */ a5(MessagesStorage messagesStorage, int i10, int i11, byte[] bArr) {
        this.a = 6;
        this.d = messagesStorage;
        this.b = i10;
        this.c = i11;
        this.e = bArr;
    }

    public /* synthetic */ a5(NotificationCenter notificationCenter, int i10, Object[] objArr, int i11) {
        this.a = 7;
        this.d = notificationCenter;
        this.b = i10;
        this.e = objArr;
        this.c = i11;
    }
}
