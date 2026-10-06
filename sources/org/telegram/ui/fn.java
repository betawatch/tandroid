package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
