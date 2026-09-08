package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ co b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ ai(co coVar, int i10, MessageObject messageObject) {
        this.b = coVar;
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
                co coVar = this.b;
                org.telegram.ui.Components.yc.a0(coVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                coVar.Fa(messageObject);
                coVar.Ha(messageObject);
                break;
        }
    }

    public /* synthetic */ ai(co coVar, MessageObject messageObject, int i10) {
        this.b = coVar;
        this.d = messageObject;
        this.c = i10;
    }
}
