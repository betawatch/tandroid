package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class pv extends b61 {
    public final /* synthetic */ qv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(qv qvVar, String str) {
        super(str, (d11) null);
        this.e = qvVar;
    }

    @Override // org.telegram.ui.Components.b61, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        qv qvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.e3) qvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        vv vvVar = qvVar.x;
        messagesController.openByUserName(url, vvVar.c, 1);
        vvVar.Y();
        vvVar.dismiss();
    }
}
