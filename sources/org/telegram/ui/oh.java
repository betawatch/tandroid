package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ qn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ oh(qn qnVar, int i9, MessageObject messageObject) {
        this.b = qnVar;
        this.c = i9;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.j4 = null;
                this.d.messageOwner.replies.read_max_id = this.c;
                break;
            default:
                qn qnVar = this.b;
                org.telegram.ui.Components.oc.a0(qnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                qnVar.Fa(messageObject);
                qnVar.Ha(messageObject);
                break;
        }
    }

    public /* synthetic */ oh(qn qnVar, MessageObject messageObject, int i9) {
        this.b = qnVar;
        this.d = messageObject;
        this.c = i9;
    }
}
