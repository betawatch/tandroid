package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
/* loaded from: classes.dex */
public final /* synthetic */ class MediaDataController$$ExternalSyntheticLambda140 implements Utilities.Callback {
    public final /* synthetic */ boolean[] f$0;
    public final /* synthetic */ ArrayList[] f$1;
    public final /* synthetic */ Runnable f$2;

    public /* synthetic */ MediaDataController$$ExternalSyntheticLambda140(boolean[] zArr, ArrayList[] arrayListArr, Runnable runnable) {
        this.f$0 = zArr;
        this.f$1 = arrayListArr;
        this.f$2 = runnable;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        MediaDataController.lambda$fillWithAnimatedEmoji$182(this.f$0, this.f$1, this.f$2, (ArrayList) obj);
    }
}
