package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class h4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ h4(Runnable runnable) {
        this.a = runnable;
    }

    @Override // org.telegram.messenger.TelegramMediaSession.BrowseChildrenCallback
    public void onResult(List list) {
        TelegramMediaSession.lambda$ensureLoaded$2(this.a, list);
    }
}
