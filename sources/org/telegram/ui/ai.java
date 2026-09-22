package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bo b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ ai(bo boVar, int i10, MessageObject messageObject) {
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

    public /* synthetic */ ai(bo boVar, MessageObject messageObject, int i10) {
        this.b = boVar;
        this.d = messageObject;
        this.c = i10;
    }
}
