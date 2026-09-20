package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
