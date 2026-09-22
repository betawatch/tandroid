package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gn implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ aj a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ ln c;

    public gn(ln lnVar, aj ajVar, zn znVar) {
        this.c = lnVar;
        this.a = ajVar;
        this.b = znVar;
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
