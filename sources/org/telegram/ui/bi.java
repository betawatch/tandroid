package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
