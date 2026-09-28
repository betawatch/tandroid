package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ov extends b61 {
    public final /* synthetic */ pv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(pv pvVar, String str) {
        super(str, (d11) null);
        this.e = pvVar;
    }

    @Override // org.telegram.ui.Components.b61, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        pv pvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.e3) pvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        uv uvVar = pvVar.x;
        messagesController.openByUserName(url, uvVar.c, 1);
        uvVar.Y();
        uvVar.dismiss();
    }
}
