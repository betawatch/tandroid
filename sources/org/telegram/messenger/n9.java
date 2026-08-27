package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ n9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.a = i10;
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
