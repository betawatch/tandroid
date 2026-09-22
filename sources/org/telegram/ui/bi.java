package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class bi implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ zn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ bi(zn znVar, int i10, MessageObject messageObject) {
        this.b = znVar;
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
                zn znVar = this.b;
                org.telegram.ui.Components.xc.a0(znVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                znVar.Fa(messageObject);
                znVar.Ha(messageObject);
                break;
        }
    }

    public /* synthetic */ bi(zn znVar, MessageObject messageObject, int i10) {
        this.b = znVar;
        this.d = messageObject;
        this.c = i10;
    }
}
