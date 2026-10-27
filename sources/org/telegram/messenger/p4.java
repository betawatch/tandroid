package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ p4(Runnable runnable) {
        this.a = runnable;
    }

    @Override // org.telegram.messenger.TelegramMediaSession.BrowseChildrenCallback
    public void onResult(List list) {
        TelegramMediaSession.lambda$ensureLoaded$2(this.a, list);
    }
}
