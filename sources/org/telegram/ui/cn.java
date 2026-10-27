package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cn implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ vi a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ hn c;

    public cn(hn hnVar, vi viVar, wn wnVar) {
        this.c = hnVar;
        this.a = viVar;
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
