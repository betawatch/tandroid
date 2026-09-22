package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class in implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ aj a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ nn c;

    public in(nn nnVar, aj ajVar, bo boVar) {
        this.c = nnVar;
        this.a = ajVar;
        this.b = boVar;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onMessagesLoaded(boolean z10) {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }
}
