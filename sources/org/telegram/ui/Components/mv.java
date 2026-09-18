package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class mv extends n51 {
    public final /* synthetic */ nv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(nv nvVar, String str) {
        super(str, (p01) null);
        this.e = nvVar;
    }

    @Override // org.telegram.ui.Components.n51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        nv nvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.g3) nvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        sv svVar = nvVar.x;
        messagesController.openByUserName(url, svVar.c, 1);
        svVar.Y();
        svVar.dismiss();
    }
}
