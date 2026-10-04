package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class fn implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ yi a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ kn c;

    public fn(kn knVar, yi yiVar, yn ynVar) {
        this.c = knVar;
        this.a = yiVar;
        this.b = ynVar;
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
