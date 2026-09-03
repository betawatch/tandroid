package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class q9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ q9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
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
