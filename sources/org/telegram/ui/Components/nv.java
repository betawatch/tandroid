package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class nv extends l51 {
    public final /* synthetic */ ov e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(ov ovVar, String str) {
        super(str, (n01) null);
        this.e = ovVar;
    }

    @Override // org.telegram.ui.Components.l51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        ov ovVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.f3) ovVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        tv tvVar = ovVar.x;
        messagesController.openByUserName(url, tvVar.c, 1);
        tvVar.Y();
        tvVar.dismiss();
    }
}
