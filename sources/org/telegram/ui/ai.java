package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
