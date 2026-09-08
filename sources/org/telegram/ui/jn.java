package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class jn implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ aj a;
    public final /* synthetic */ co b;
    public final /* synthetic */ on c;

    public jn(on onVar, aj ajVar, co coVar) {
        this.c = onVar;
        this.a = ajVar;
        this.b = coVar;
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
