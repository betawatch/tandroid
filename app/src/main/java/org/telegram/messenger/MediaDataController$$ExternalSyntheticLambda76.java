package org.telegram.messenger;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final /* synthetic */ class MediaDataController$$ExternalSyntheticLambda76 implements Runnable {
    public final /* synthetic */ MediaDataController f$0;
    public final /* synthetic */ ArrayList f$1;
    public final /* synthetic */ ArrayList[] f$2;
    public final /* synthetic */ Runnable f$3;

    public /* synthetic */ MediaDataController$$ExternalSyntheticLambda76(MediaDataController mediaDataController, ArrayList arrayList, ArrayList[] arrayListArr, Runnable runnable) {
        this.f$0 = mediaDataController;
        this.f$1 = arrayList;
        this.f$2 = arrayListArr;
        this.f$3 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$fillWithAnimatedEmoji$181(this.f$1, this.f$2, this.f$3);
    }
}
