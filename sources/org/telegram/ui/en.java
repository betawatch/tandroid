package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class en implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ xi a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ jn c;

    public en(jn jnVar, xi xiVar, xn xnVar) {
        this.c = jnVar;
        this.a = xiVar;
        this.b = xnVar;
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
