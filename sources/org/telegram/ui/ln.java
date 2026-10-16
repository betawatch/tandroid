package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
