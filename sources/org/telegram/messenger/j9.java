package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i9) {
        this.a = i9;
        this.b = mediaDataController;
        this.c = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$fetchStickerSetInternal$41(this.c, this.d);
                break;
            default:
                this.b.lambda$verifyAnimatedStickerMessageInternal$69(this.c, this.d);
                break;
        }
    }
}
