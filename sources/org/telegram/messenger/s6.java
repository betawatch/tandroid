package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class s6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ s6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.b = z10;
        this.e = photoSize;
        this.f = messageObject;
        this.h = photo;
        this.c = z11;
        this.n = document;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f, (TLRPC.Photo) this.h, this.c, (TLRPC.Document) this.n);
                break;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.e, (ArrayList) this.f, this.b, this.c, (ArrayList[]) this.h, (Runnable) this.n);
                break;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f, (org.telegram.ui.ActionBar.o2) this.h, (TLObject) this.n, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ s6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f = arrayList;
        this.b = z10;
        this.c = z11;
        this.h = arrayListArr;
        this.n = runnable;
    }

    public /* synthetic */ s6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f = tL_error;
        this.h = o2Var;
        this.n = tLObject;
        this.b = z10;
        this.c = z11;
    }
}
