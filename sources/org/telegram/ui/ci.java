package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ci implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bo b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ ci(bo boVar, int i10, MessageObject messageObject) {
        this.b = boVar;
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
                bo boVar = this.b;
                org.telegram.ui.Components.vc.a0(boVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                boVar.Fa(messageObject);
                boVar.Ha(messageObject);
                break;
        }
    }

    public /* synthetic */ ci(bo boVar, MessageObject messageObject, int i10) {
        this.b = boVar;
        this.d = messageObject;
        this.c = i10;
    }
}
