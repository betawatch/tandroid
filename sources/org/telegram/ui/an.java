package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class an implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ si a;
    public final /* synthetic */ un b;
    public final /* synthetic */ fn c;

    public an(fn fnVar, si siVar, un unVar) {
        this.c = fnVar;
        this.a = siVar;
        this.b = unVar;
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
