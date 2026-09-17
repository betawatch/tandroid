package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ g4(Runnable runnable) {
        this.a = runnable;
    }

    @Override // org.telegram.messenger.TelegramMediaSession.BrowseChildrenCallback
    public void onResult(List list) {
        TelegramMediaSession.lambda$ensureLoaded$2(this.a, list);
    }
}
