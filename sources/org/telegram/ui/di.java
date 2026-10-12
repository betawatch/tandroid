package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class di implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ fo b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ di(fo foVar, int i10, MessageObject messageObject) {
        this.b = foVar;
        this.c = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n4 = null;
                this.d.messageOwner.replies.read_max_id = this.c;
                break;
            default:
                fo foVar = this.b;
                org.telegram.ui.Components.zc.a0(foVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                foVar.Ja(messageObject);
                foVar.La(messageObject);
                break;
        }
    }

    public /* synthetic */ di(fo foVar, MessageObject messageObject, int i10) {
        this.b = foVar;
        this.d = messageObject;
        this.c = i10;
    }
}
