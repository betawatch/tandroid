package org.telegram.messenger;
/* loaded from: classes.dex */
public final /* synthetic */ class MediaDataController$$ExternalSyntheticLambda116 implements Runnable {
    public final /* synthetic */ MediaDataController f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ MediaDataController$$ExternalSyntheticLambda116(MediaDataController mediaDataController, boolean z, long j) {
        this.f$0 = mediaDataController;
        this.f$1 = z;
        this.f$2 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$markFeaturedStickersByIdAsRead$51(this.f$1, this.f$2);
    }
}
