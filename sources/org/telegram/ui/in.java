package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class in implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ bj a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ nn c;

    public in(nn nnVar, bj bjVar, bo boVar) {
        this.c = nnVar;
        this.a = bjVar;
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
