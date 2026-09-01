package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class en implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ wi a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ jn c;

    public en(jn jnVar, wi wiVar, xn xnVar) {
        this.c = jnVar;
        this.a = wiVar;
        this.b = xnVar;
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
