package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
/* loaded from: classes.dex */
public final /* synthetic */ class MediaDataController$$ExternalSyntheticLambda79 implements Runnable {
    public final /* synthetic */ MediaDataController f$0;
    public final /* synthetic */ TLObject f$1;

    public /* synthetic */ MediaDataController$$ExternalSyntheticLambda79(MediaDataController mediaDataController, TLObject tLObject) {
        this.f$0 = mediaDataController;
        this.f$1 = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$loadHints$112(this.f$1);
    }
}
