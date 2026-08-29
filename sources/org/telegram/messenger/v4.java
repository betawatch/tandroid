package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class v4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.a = i11;
        this.d = obj;
        this.e = tLObject;
        this.b = z10;
        this.c = i10;
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

    public /* synthetic */ v4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.a = i11;
        this.d = baseController;
        this.c = i10;
        this.b = z10;
        this.e = obj;
    }

    public /* synthetic */ v4(ImageLoader.5 r22, int i10, String str, boolean z10) {
        this.a = 0;
        this.d = r22;
        this.c = i10;
        this.e = str;
        this.b = z10;
    }
}
