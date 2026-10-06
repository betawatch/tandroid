package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
