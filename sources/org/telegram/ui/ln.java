package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ln implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ ej a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ qn c;

    public ln(qn qnVar, ej ejVar, fo foVar) {
        this.c = qnVar;
        this.a = ejVar;
        this.b = foVar;
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
