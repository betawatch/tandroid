package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ci implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ eo b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ ci(eo eoVar, int i10, MessageObject messageObject) {
        this.b = eoVar;
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
                eo eoVar = this.b;
                org.telegram.ui.Components.wc.a0(eoVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                eoVar.Fa(messageObject);
                eoVar.Ha(messageObject);
                break;
        }
    }

    public /* synthetic */ ci(eo eoVar, MessageObject messageObject, int i10) {
        this.b = eoVar;
        this.d = messageObject;
        this.c = i10;
    }
}
