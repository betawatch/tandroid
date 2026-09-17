package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class lv extends l51 {
    public final /* synthetic */ mv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(mv mvVar, String str) {
        super(str, (n01) null);
        this.e = mvVar;
    }

    @Override // org.telegram.ui.Components.l51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        mv mvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.f3) mvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        rv rvVar = mvVar.x;
        messagesController.openByUserName(url, rvVar.c, 1);
        rvVar.Y();
        rvVar.dismiss();
    }
}
