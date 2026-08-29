package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ tn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ ph(tn tnVar, int i10, MessageObject messageObject) {
        this.b = tnVar;
        this.c = i10;
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
                tn tnVar = this.b;
                org.telegram.ui.Components.tc.a0(tnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                tnVar.Fa(messageObject);
                tnVar.Ha(messageObject);
                break;
        }
    }

    public /* synthetic */ ph(tn tnVar, MessageObject messageObject, int i10) {
        this.b = tnVar;
        this.d = messageObject;
        this.c = i10;
    }
}
