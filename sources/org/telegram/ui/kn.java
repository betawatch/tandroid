package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kn implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ cj a;
    public final /* synthetic */ eo b;
    public final /* synthetic */ pn c;

    public kn(pn pnVar, cj cjVar, eo eoVar) {
        this.c = pnVar;
        this.a = cjVar;
        this.b = eoVar;
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
