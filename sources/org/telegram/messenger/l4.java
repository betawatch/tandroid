package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class l4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ l4(Runnable runnable) {
        this.a = runnable;
    }

    @Override // org.telegram.messenger.TelegramMediaSession.BrowseChildrenCallback
    public void onResult(List list) {
        TelegramMediaSession.lambda$ensureLoaded$2(this.a, list);
    }
}
