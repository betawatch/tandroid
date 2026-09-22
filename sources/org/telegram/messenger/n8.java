package org.telegram.messenger;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class n8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ int c;

    public /* synthetic */ n8(MediaDataController mediaDataController, int i10, int i11) {
        this.a = i11;
        this.b = mediaDataController;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processLoadedStickers$103(this.c);
                break;
            default:
                this.b.lambda$fetchEmojiStatuses$231(this.c);
                break;
        }
    }
}
