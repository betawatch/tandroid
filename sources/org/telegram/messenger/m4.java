package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class m4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ m4(Runnable runnable) {
        this.a = runnable;
    }

    @Override // org.telegram.messenger.TelegramMediaSession.BrowseChildrenCallback
    public void onResult(List list) {
        TelegramMediaSession.lambda$ensureLoaded$2(this.a, list);
    }
}
