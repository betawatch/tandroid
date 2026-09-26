package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class cl implements MessagesStorage.IntCallback {
    public final /* synthetic */ wn a;

    public cl(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        this.a.G9(i10);
    }
}
