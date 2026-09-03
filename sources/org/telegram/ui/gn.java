package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gn implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ yi a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ ln c;

    public gn(ln lnVar, yi yiVar, zn znVar) {
        this.c = lnVar;
        this.a = yiVar;
        this.b = znVar;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onMessagesLoaded(boolean z4) {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }
}
