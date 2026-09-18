package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class gn implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ zi a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ ln c;

    public gn(ln lnVar, zi ziVar, zn znVar) {
        this.c = lnVar;
        this.a = ziVar;
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
