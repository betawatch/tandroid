package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ int c;

    public /* synthetic */ k8(MediaDataController mediaDataController, int i9, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = i9;
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
