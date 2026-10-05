package org.telegram.messenger;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class a8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ int c;

    public /* synthetic */ a8(MediaDataController mediaDataController, int i10, int i11) {
        this.a = i11;
        this.b = mediaDataController;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$fetchEmojiStatuses$232(this.c);
                break;
            default:
                this.b.lambda$processLoadedStickers$103(this.c);
                break;
        }
    }
}
