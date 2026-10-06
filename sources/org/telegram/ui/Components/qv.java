package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class qv extends l61 {
    public final /* synthetic */ rv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(rv rvVar, String str) {
        super(str, (n11) null);
        this.e = rvVar;
    }

    @Override // org.telegram.ui.Components.l61, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        rv rvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.f3) rvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        wv wvVar = rvVar.x;
        messagesController.openByUserName(url, wvVar.c, 1);
        wvVar.X();
        wvVar.dismiss();
    }
}
