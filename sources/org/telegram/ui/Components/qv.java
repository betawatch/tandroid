package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qv extends z51 {
    public final /* synthetic */ rv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(rv rvVar, String str) {
        super(str, (b11) null);
        this.e = rvVar;
    }

    @Override // org.telegram.ui.Components.z51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        rv rvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.h3) rvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        wv wvVar = rvVar.x;
        messagesController.openByUserName(url, wvVar.c, 1);
        wvVar.Y();
        wvVar.dismiss();
    }
}
