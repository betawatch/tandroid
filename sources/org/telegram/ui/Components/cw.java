package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class cw extends t61 {
    public final /* synthetic */ dw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(dw dwVar, String str) {
        super(str, (t11) null);
        this.e = dwVar;
    }

    @Override // org.telegram.ui.Components.t61, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        dw dwVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.f3) dwVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        iw iwVar = dwVar.x;
        messagesController.openByUserName(url, iwVar.c, 1);
        iwVar.Z();
        iwVar.dismiss();
    }
}
