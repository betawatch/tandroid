package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class c7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ c7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
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
