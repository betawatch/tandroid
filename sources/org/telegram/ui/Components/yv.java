package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class yv extends p61 {
    public final /* synthetic */ zv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(zv zvVar, String str) {
        super(str, (p11) null);
        this.e = zvVar;
    }

    @Override // org.telegram.ui.Components.p61, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        zv zvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.e3) zvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        ew ewVar = zvVar.x;
        messagesController.openByUserName(url, ewVar.c, 1);
        ewVar.Z();
        ewVar.dismiss();
    }
}
