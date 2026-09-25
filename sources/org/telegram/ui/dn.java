package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class dn implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ xi a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ in c;

    public dn(in inVar, xi xiVar, wn wnVar) {
        this.c = inVar;
        this.a = xiVar;
        this.b = wnVar;
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
