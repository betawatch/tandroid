package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ g7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
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
