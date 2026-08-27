package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wu extends r41 {
    public final /* synthetic */ xu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(xu xuVar, String str) {
        super(str, (xz0) null);
        this.e = xuVar;
    }

    @Override // org.telegram.ui.Components.r41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        xu xuVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.e3) xuVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        cv cvVar = xuVar.x;
        messagesController.openByUserName(url, cvVar.c, 1);
        cvVar.Y();
        cvVar.dismiss();
    }
}
