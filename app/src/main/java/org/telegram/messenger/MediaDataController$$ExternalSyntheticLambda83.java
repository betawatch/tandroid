package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
/* loaded from: classes.dex */
public final /* synthetic */ class MediaDataController$$ExternalSyntheticLambda83 implements Runnable {
    public final /* synthetic */ MediaDataController f$0;
    public final /* synthetic */ TLObject f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ MediaDataController$$ExternalSyntheticLambda83(MediaDataController mediaDataController, TLObject tLObject, boolean z, long j) {
        this.f$0 = mediaDataController;
        this.f$1 = tLObject;
        this.f$2 = z;
        this.f$3 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$loadFeaturedStickers$41(this.f$1, this.f$2, this.f$3);
    }
}
