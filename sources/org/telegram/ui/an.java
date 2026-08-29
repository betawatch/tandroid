package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class an implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ ri a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ fn c;

    public an(fn fnVar, ri riVar, tn tnVar) {
        this.c = fnVar;
        this.a = riVar;
        this.b = tnVar;
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
