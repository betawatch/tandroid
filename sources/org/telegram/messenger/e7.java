package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$checkPremiumGiftStickers$75(this.c);
                break;
            case 1:
                this.b.lambda$loadReactions$13(this.c);
                break;
            case 2:
                this.b.lambda$checkTonGiftStickers$77(this.c);
                break;
            case 3:
                this.b.lambda$checkDefaultTopicIcons$81(this.c);
                break;
            case 4:
                this.b.lambda$clearRecentStickers$18(this.c);
                break;
            default:
                this.b.lambda$checkGenericAnimations$79(this.c);
                break;
        }
    }
}
