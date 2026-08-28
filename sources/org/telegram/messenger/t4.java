package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class t4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t4(int i9, int i10, Object obj, TLObject tLObject, boolean z10) {
        this.a = i10;
        this.d = obj;
        this.e = tLObject;
        this.b = z10;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ImageLoader.5) this.d).lambda$fileDidFailedUpload$4(this.c, (String) this.e, this.b);
                break;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.e, this.b, this.c);
                break;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.c, this.b, (Utilities.Callback) this.e);
                break;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.e, this.b, this.c);
                break;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$33(this.c, this.b, (Runnable) this.e);
                break;
        }
    }

    public /* synthetic */ t4(BaseController baseController, int i9, boolean z10, Object obj, int i10) {
        this.a = i10;
        this.d = baseController;
        this.c = i9;
        this.b = z10;
        this.e = obj;
    }

    public /* synthetic */ t4(ImageLoader.5 r22, int i9, String str, boolean z10) {
        this.a = 0;
        this.d = r22;
        this.c = i9;
        this.e = str;
        this.b = z10;
    }
}
