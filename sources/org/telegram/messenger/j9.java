package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class j9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
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
