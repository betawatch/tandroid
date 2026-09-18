package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
