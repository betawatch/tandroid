package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ z6(MediaDataController mediaDataController, TLObject tLObject, int i10) {
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
