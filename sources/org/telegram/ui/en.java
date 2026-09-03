package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
